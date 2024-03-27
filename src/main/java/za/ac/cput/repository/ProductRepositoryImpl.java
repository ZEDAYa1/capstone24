package za.ac.cput.repository.impl;
/*
 *Product:java
 *Product: ProductRepositoryImpl Class
 * Author: Zachariah Matsimella
 * Date: 21 March 2024
 */

import za.ac.cput.domain.Product;
import za.ac.cput.repository.IProductRepository;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {

    private static IProductRepository repository = null;

    private List<Product> productList;

    private ProductRepositoryImpl(){
        productList = new ArrayList<Product>();
    }

    public static IProductRepository getRepository(){
        if(repository == null){
            repository = new ProductRepositoryImpl();
        }
        return repository;
    }

    public Product create(Product product) {
        boolean success = productList.add(product);
        if(success)
            return  product;
        return null;
    }

    public Product read(String id) {
        for(Product p: productList){
            if(p.getProductID().equals(id))
                return p;
        }
        return null;
    }

    public Product update(Product product) {
        String productID = product.getProductID();
        if(delete(productID)){
            if(productList.add(product))
                return product;
            else
                return null;
        }
        return null;
    }

    public boolean delete(String id) {
        Product productToDelete = read(id);

        if(productToDelete == null)
            return  false;

        return (productList.remove(productToDelete));
    }

    public List<Product> getAll() {
        return null;
    }
}