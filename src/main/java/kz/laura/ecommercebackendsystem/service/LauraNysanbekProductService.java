package kz.laura.ecommercebackendsystem.service;

import kz.laura.ecommercebackendsystem.entity.LauraNysanbekProduct;
import kz.laura.ecommercebackendsystem.repository.LauraNysanbekProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LauraNysanbekProductService {

    private final LauraNysanbekProductRepository productRepository;

    public Page<LauraNysanbekProduct> getProducts(
            int page,
            int size,
            String sortBy,
            String keyword
    ) {

        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by(sortBy)
        );

        if (keyword != null && !keyword.isEmpty()) {

            return new PageImpl<>(
                    productRepository.findByNameContainingIgnoreCase(keyword),
                    pageable,
                    productRepository.findByNameContainingIgnoreCase(keyword).size()
            );
        }

        return productRepository.findAll(pageable);
    }
}