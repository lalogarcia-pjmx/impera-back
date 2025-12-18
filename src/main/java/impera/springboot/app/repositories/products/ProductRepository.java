package impera.springboot.app.repositories.products;

import java.util.List;

import impera.springboot.app.models.Product;

public interface ProductRepository {
    List<Product> findAll();

    Product findById(Long id);
}
