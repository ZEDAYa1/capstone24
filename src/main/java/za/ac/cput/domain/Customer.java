package za.ac.cput.domain;

/*
 *Customer:java
 *Customer: Model Class
 * Author: Rethabile Ntsekhe (220455430)
 * Date: 25 / March/2024
 */

public class Customer {
    private int customerId;
    private String privelages;
    private int userID;

    public Customer() {

    }

    private Customer(Builder builder) {
        this.customerId = builder.customerId;
        this.privelages = builder.privelages;
        this.userID = builder.userID;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getPrivelages() {
        return privelages;
    }

    public void setPrivelages(String privelages){
        this.privelages = privelages;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "ID: " + customerId +
                ", Privelages: '" + privelages + '\'' +
                ", User ID: " + userID +
                '}';
    }

    public static class Builder{
        private int customerId;
        private String privelages;
        private int userID;

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setprivelages(String privelages) {
            this.privelages = privelages;
            return this;
        }

        public Builder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        /*
         *so this method below takes the elements into the builder nested class
         * and creates a copy
         */
        public Customer.Builder copy(Customer customer) {
            this.customerId = customer.customerId;
            this.privelages = customer.privelages;
            this.userID = customer.userID;
            return this;
        }
        public Customer build(){
            Customer customer = new Customer(this);
            return customer;
        }
    }
}
