package one.digitalinnnovation.productcatalog.repository;

import one.digitalinnnovation.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
