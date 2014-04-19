package disenio2014.service;

import java.io.Serializable;
import java.util.List;

import disenio2014.domain.Product;

public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}
