package za.ac.cput.domain;

import java.sql.Blob;

public class ProductImage {
    private String imageID;
    private String productID;
    private Blob image;

    public ProductImage() {

    }

    private ProductImage(Builder builder){
        this.imageID = builder.imageID;
        this.productID = builder.productID;
        this.image = builder.image;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "imageID=" + imageID +
                ", productID=" + productID +
                ", image=" + image +
                '}';
    }

    public static class Builder{
        private String imageID;
        private String productID;
        private Blob image;

        public Builder setImageID(String imageID){
            this.imageID = imageID;
            return this;
        }

        public Builder setProductID(String productID){
            this.productID = productID;
            return this;
        }

        public Builder setImage(Blob image){
            this.image = image;
            return this;
        }

        public Builder copy(ProductImage productImage){
            this.imageID = productImage.imageID;
            this.productID = productImage.productID;
            this.image = productImage.image;
            return this;
        }

        public ProductImage build(){
            return new ProductImage(this);
        }
    }
}
