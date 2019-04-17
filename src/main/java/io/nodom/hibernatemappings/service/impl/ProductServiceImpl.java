package io.nodom.hibernatemappings.service.impl;

import io.nodom.hibernatemappings.dto.ProductDTO;
import io.nodom.hibernatemappings.mapper.ProductMapper;
import io.nodom.hibernatemappings.repository.ProductRepository;
import io.nodom.hibernatemappings.service.ProductService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper = Mappers.getMapper(ProductMapper.class);


    ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> findAllProducts() {
        return this.productMapper.productToProductDTO(this.productRepository.findAll());
    }
}
