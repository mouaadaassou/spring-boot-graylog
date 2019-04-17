package io.nodom.hibernatemappings.mapper;


import io.nodom.hibernatemappings.dto.ProductDTO;
import io.nodom.hibernatemappings.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<ProductDTO> productToProductDTO(List<Product> product);
}
