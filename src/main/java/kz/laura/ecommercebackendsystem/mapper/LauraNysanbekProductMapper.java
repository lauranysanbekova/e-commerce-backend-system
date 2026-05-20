package kz.laura.ecommercebackendsystem.mapper;

import kz.laura.ecommercebackendsystem.dto.LauraNysanbekProductDto;
import kz.laura.ecommercebackendsystem.entity.LauraNysanbekProduct;
import org.springframework.stereotype.Component;

@Component
public class LauraNysanbekProductMapper {

    public LauraNysanbekProductDto toDto(
            LauraNysanbekProduct product) {

        LauraNysanbekProductDto dto =
                new LauraNysanbekProductDto();

        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());

        return dto;
    }
}