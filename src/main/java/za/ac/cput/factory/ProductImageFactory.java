package za.ac.cput.factory;

import za.ac.cput.domain.ProductImage;
import java.sql.Blob;

public class ProductImageFactory {
    public static ProductImage createProductImage(int imageID, int productID, Blob image){
        ProductImage productImage = new ProductImage.Builder().setImageID(imageID)
                .setProductID(productID)
                .setImage(image)
                .build();
        return productImage;
    }
}
