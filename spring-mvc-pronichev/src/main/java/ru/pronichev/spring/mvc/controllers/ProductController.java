package ru.pronichev.spring.mvc.controllers;
/*
 * Контролел управления страницами с продуктами
 *
 * @author Aleksei Pronichev
 * 19.09.2020
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.pronichev.spring.mvc.model.Product;
import ru.pronichev.spring.mvc.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public String getAllProducts(Model model) {
        model.addAttribute("frontProducts", service.getAll());
        return "all_products";
    }

    @PostMapping("/add")
    public String addNewProduct(@ModelAttribute Product product) {
        service.save(product);
        return "redirect:/products/all";
    }
}
