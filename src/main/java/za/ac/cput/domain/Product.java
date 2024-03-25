package za.ac.cput.domain;

/*
 *Product:java
 *Product: Model Class
 * Author: Zachariah Matsimella
 * Date: 21 March 2024
 */

public class Product {
    private String productID;
    private String categoryID;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String reviewID;
    private String imageID;

    public Product() {

    }

    private Product(Builder builder){
        this.productID = builder.productID;
        this.categoryID = builder.categoryID;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.stock = builder.stock;
        this.reviewID = builder.reviewID;
        this.imageID = builder.imageID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", ProductID: " + productID +
                ", CategoryID: " + categoryID +
                ", Name: '" + name + '\'' +
                ", Description: '" + description + '\'' +
                ", Price: " + price +
                ", Stock: " + stock +
                ", ReviewID: " + reviewID +
                ", ImageID: " + imageID +
                '}';
    }

    public static class Builder{
        private String productID;
        private String categoryID;
        private String name;
        private String description;
        private double price;
        private int stock;
        private String reviewID;
        private String imageID;

        public Builder setProductID(String productID){
            this.productID = productID;
            return this;
        }

        public Builder setCategoryID(String categoryID){
            this.categoryID = categoryID;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setDescription(String description){
            this.description = description;
            return this;
        }

        public Builder setPrice(double price){
            this.price = price;
            return this;
        }

        public Builder setStock(int stock){
            this.stock = stock;
            return this;
        }

        public Builder setReviewID(String reviewID){
            this.reviewID = reviewID;
            return this;
        }

        public Builder setImageID(String imageID){
            this.imageID = imageID;
            return this;
        }
        public Builder copy(Product product){
            this.productID = product.productID;
            this.categoryID = product.categoryID;
            this.name = product.name;
            this.description = product.description;
            this.price = product.price;
            this.stock = product.stock;
            this.reviewID = product.reviewID;
            this.imageID = product.imageID;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }
}
