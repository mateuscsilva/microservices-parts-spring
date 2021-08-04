package one.digitalinnnovation.productcatalog.controller;

import one.digitalinnnovation.productcatalog.model.Product;
import one.digitalinnnovation.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    Product create(@RequestBody Product product){
        return  productRepository.save(product);
    }

    @GetMapping("/{id}")
    Product findById(@PathVariable Long id){
        return  productRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }
}
