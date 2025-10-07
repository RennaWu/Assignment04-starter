/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment04;

import java.util.*;

/**
 *
 * @author jiaenxu
 * 
 * DO NOT MODIFY THE CODE HERE
 */

public class ProductCatalog {
    private List<Product> productList;

    ProductCatalog() {
        this.productList = new ArrayList<>();
    }

    void addNewProduct(Product p) {
        productList.add(p);
    }

    List<Product> getProductList() {
        return productList;
    }
}
