package disenio2014.service;

import java.util.List;

import disenio2014.domain.Product;
import disenio2014.repository.ProductDao;

public class SimpleProductManager implements ProductManager {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8844245945512813968L;

	private ProductDao productDao;

	public List<Product> getProducts() {
		return productDao.getProductList();
	}

	public void increasePrice(int percentage) {
		List<Product> products = productDao.getProductList();
		if (products != null) {
			for (Product product : products) {
				double newPrice = product.getPrice().doubleValue()
						* (100 + percentage) / 100;
                product.setPrice(newPrice);
				productDao.saveProduct(product);
			}
		}

	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
}
