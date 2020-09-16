package com.geekbrains.spring.context.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart c1 = context.getBean(Cart.class);
        Cart c2 = context.getBean(Cart.class);
        System.out.println(c1 == c2);

        ProductRepository rep1 = context.getBean(ProductRepository.class);
        ProductRepository rep2 = context.getBean(ProductRepository.class);

        System.out.println(rep1 == rep2);

        System.out.println(c1.addProduct(4));
        System.out.println(c2.addProduct(7));

        context.close();
    }
}
