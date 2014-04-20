package disenio2014.repository;

import java.util.List;

import disenio2014.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}
