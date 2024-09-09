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
public interface ICategoryRepository {
    boolean save(Category category);
    List<Category> findAll();
    Category findById(Long id);
    boolean update(Long id, Category cat);
    boolean delete(Long id);
}
