package co.com.hyunseda.market.service;


import java.util.List;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean saveProduct(String name, String description, String category) {
        Product newProduct = new Product();
        newProduct.setName(name);
        newProduct.setDescription(description);
        newProduct.setCategory(category);
        return !newProduct.getName().isEmpty() && productRepository.save(newProduct);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id);
    }
    
    public Product findProductByName(String name) {
        return productRepository.findByName(name);
    }
    
    public Product findProductByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public boolean deleteProduct(Long id) {
        return productRepository.delete(id);
    }

    public boolean editProduct(Long productId, Product prod) {
        return prod != null && !prod.getName().isEmpty() && productRepository.update(productId, prod);
    }
}

