package StepDefs;

import amazonImplementation.Product;
import amazonImplementation.Search;
import com.sun.tools.javac.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {

     Product product;
     Search search;
    @Given("I have search field on amazon page")
    public void i_have_search_field_on_amazon_page() {
        System.out.println("Step1: I am on search page");

    }

    @When("I searched for a product with name {string} and price {int}")
    public void i_searched_for_a_product_with_name_and_price(String ProductName, Integer price) {
        System.out.println("Step2: Search with product  name : " +ProductName+" and price : "+price );

        product = new Product(ProductName, price);

    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String ProductName) {
        System.out.println("Step3: Product with name : "+ProductName+" is displayed");

        search = new Search();
        String name = search.displayProduct(product);
        System.out.println("searched product is : "+ name);
    }
}
