
package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.service.ProductRepository;
import co.com.hyunseda.market.service.ProductService;

/**
 *
 * @author Libardo Pantoja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);
        
        GUIProducts instance = new GUIProducts(productService);
        instance.setVisible(true);
    }
    
}
