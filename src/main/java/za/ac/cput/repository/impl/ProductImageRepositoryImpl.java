package za.ac.cput.repository.impl;

import za.ac.cput.domain.ProductImage;
import za.ac.cput.repository.IProductImageRepository;
import za.ac.cput.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductImageRepositoryImpl implements IProductImageRepository {

    private static IProductImageRepository repository;

    private List<ProductImage> productImageList;

    private ProductImageRepositoryImpl(){
        productImageList = new ArrayList<ProductImage>();
    }

    public static IProductImageRepository getRepository(){
        if(repository == null){
            repository = new ProductImageRepositoryImpl();
        }
        return repository;
    }
    public ProductImage create(ProductImage productImage) {
        boolean success = productImageList.add(productImage);
        if(success)
            return  productImage;
        return null;
    }

    public ProductImage read(String id) {
        for(ProductImage p: productImageList){
            if(p.getImageID().equals(id));
                return p;
        }
        return null;
    }

    public ProductImage update(ProductImage productImage) {
        String productImageID = productImage.getImageID();
        if(delete(productImageID)){
            if(productImageList.add(productImage))
                return productImage;
            else
                return null;
        }
        return null;
    }

    public boolean delete(String id) {
        ProductImage productImageToDelete = read(id);

        if(productImageToDelete == null)
            return false;

        return (productImageList.remove(productImageToDelete));
    }

    public List<ProductImage> getAll() {
        return null;
    }
}
