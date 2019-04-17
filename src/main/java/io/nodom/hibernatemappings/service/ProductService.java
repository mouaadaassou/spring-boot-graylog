package io.nodom.hibernatemappings.service;

import io.nodom.hibernatemappings.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    public List<ProductDTO> findAllProducts();
}
