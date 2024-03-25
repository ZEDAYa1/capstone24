package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer = new Customer();
    @Test
    void getCustomerId() {
        int cutomerId = 0001223;
        int customerID2 = cutomerId;
        customer = new Customer.Builder().setCustomerId(cutomerId).build();

        assertEquals(cutomerId, customer.getCustomerId());
        assertEquals(customerID2,cutomerId);
        System.out.println("Test get Customer Id values \n" + customer.getCustomerId()+
                "\n"+ cutomerId +"\n" + customerID2);
    }




    @Test
    void testToString() {
        Customer.Builder builder = new Customer.Builder();
        builder.setCustomerId(1);
        builder.setUserID(178);
        builder.setprivelages("orange level");

        Customer customer1 = builder.build();


        String stringRepresentation = customer1.toString();

        assertNotNull(stringRepresentation);
        assertTrue(stringRepresentation.contains("range"));
        System.out.println("Test toString(): " + stringRepresentation);

    }
}