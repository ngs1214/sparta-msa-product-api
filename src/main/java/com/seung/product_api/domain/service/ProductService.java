package com.seung.product_api.domain.service;

import com.seung.product_api.common.api.ServiceException;
import com.seung.product_api.common.api.ServiceExceptionCode;
import com.seung.product_api.domain.entity.Product;
import com.seung.product_api.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(()->new ServiceException(ServiceExceptionCode.NOT_FOUND_PRODUCT));
    }
    public void save(Product product) {
        productRepository.save(product);

    }
}
