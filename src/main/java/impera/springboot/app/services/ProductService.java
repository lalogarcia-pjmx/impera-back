package impera.springboot.app.services;

import java.util.List;

import impera.springboot.app.models.Product;

public interface ProductService {
    
    List<Product> findAll();

    Product findById(Long id);
}
