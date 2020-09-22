package ru.pronichev.market.conrollers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.pronichev.market.entities.Product;
import ru.pronichev.market.exceptions.ResourceNotFoundException;
import ru.pronichev.market.services.ProductService;

import javax.persistence.PersistenceContext;

@Controller
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @GetMapping
    public String showAllProducts(Model model,
                                  @RequestParam(defaultValue = "1", name = "p") Integer page,
                                  @RequestParam(defaultValue = "-1", name = "max") Integer max,
                                  @RequestParam(defaultValue = "0", name = "min") Integer min
                                  ) {
        if (page < 1) {
            page = 1;
        }
        if (min < 0) {
            min = 0;
        }
        if (max < 0) {
            max = Integer.MAX_VALUE;
        }
        model.addAttribute("products", productService.findByPriceBetween(page - 1, 5, min, max));
        return "products";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Product getOneProductById(@PathVariable Long id) {
        return productService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product with id: " + id + " doesn't exists"));
    }
}
