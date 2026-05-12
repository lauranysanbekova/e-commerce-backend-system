package kz.laura.ecommercebackendsystem.controller;

import kz.laura.ecommercebackendsystem.entity.LauraNysanbekProduct;
import kz.laura.ecommercebackendsystem.repository.LauraNysanbekProductRepository;
import kz.laura.ecommercebackendsystem.service.LauraNysanbekProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class LauraNysanbekProductController {

    private final LauraNysanbekProductService productService;

    private final LauraNysanbekProductRepository productRepository;

    @GetMapping
    public Page<LauraNysanbekProduct> getProducts(

            @RequestParam(defaultValue = "0") int page,

            @RequestParam(defaultValue = "5") int size,

            @RequestParam(defaultValue = "id") String sortBy,

            @RequestParam(required = false) String keyword
    ) {

        return productService.getProducts(
                page,
                size,
                sortBy,
                keyword
        );
    }

    @PostMapping
    public LauraNysanbekProduct createProduct(
            @RequestBody LauraNysanbekProduct product) {

        return productRepository.save(product);
    }
}