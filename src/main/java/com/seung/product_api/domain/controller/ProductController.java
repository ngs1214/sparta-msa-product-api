package com.seung.product_api.domain.controller;

import com.seung.product_api.common.api.ApiResponse;
import com.seung.product_api.domain.entity.Product;
import com.seung.product_api.domain.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
@Tag(name = "Product API", description = "상품 관련 API")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    @Operation(summary = "제품리스트조회", description = "제품리스트조회")
    public ApiResponse<List<Product>> findAll() {
        return ApiResponse.success(productService.findAll());
    }

    @GetMapping("{id}")
    public ApiResponse<Product> getProduct(@PathVariable("id") Long id) {
        return ApiResponse.success(productService.findById(id));
    }

    @PostMapping("")
    @Operation(summary = "테스트", description = "테스트 진행")
    public ApiResponse<String> save(@RequestBody Product product) {
        productService.save(product);
        return ApiResponse.success("ok");
    }
}
