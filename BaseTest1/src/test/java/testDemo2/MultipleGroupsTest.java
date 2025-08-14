package testDemo2;

import org.testng.annotations.Test;

public class MultipleGroupsTest {

    @Test(groups = "login")
    public void loginWithValidCredentials() {
        System.out.println("Login successful");
    }

    @Test(groups = {"login", "cart"})
    public void loginWithInvalidCredentials() {
        System.out.println("Invalid login handled");
    }

    @Test(groups = "cart")
    public void addProductToCart() {
        System.out.println("Product added to cart");
    }

    @Test(groups = "payment")
    public void processPayment() {
        System.out.println("Payment processed successfully");
    }

    // This test depends on multiple groups
    @Test(dependsOnGroups = {"login", "cart", "payment"})
    public void placeOrder() {
        System.out.println("Order placed after login, cart, and payment");
    }
}