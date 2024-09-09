/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.hyunseda.market.service;

import java.util.List;

/**
 *
 * @author FABIAN G
 */
public interface IProductRepository {
    boolean save(Product product);
    List<Product> findAll();
    Product findById(Long id);
    Product findByName(String name);
    Product findByCategory(String category);
    boolean update(Long id, Product product);
    boolean delete(Long id);
}
