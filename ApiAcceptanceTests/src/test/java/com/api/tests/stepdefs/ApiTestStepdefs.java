package com.api.tests.stepdefs;

import com.api.tests.Objects.Network;
import com.api.tests.Objects.Root;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import org.junit.Assert;

public class ApiTestStepdefs {

    private static String api;
    Root root = new Root();

    @Given("^I have an api \"([^\"]*)\"$")
    public void i_have_an_api(String api) {
        this.api = api;
    }

    @When("^I send request to the api$")
    public void i_send_request_to_the_api() {
        root = RestAssured.given()
                .when()
                .get(api)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(Root.class);
    }

    @Then("^I should see in the response that city of Frankfurt is in Germany$")
    public void i_should_see_in_the_response_that_city_of_Frankfurt_is_in_Germany() {
        for(Network network: root.networks) {
            if(network.location.city.equals("Frankfurt")) {
                Assert.assertTrue("Frankfurt is not in Germany", network.location.country.equals("DE"));
            }
        }
    }

    @Then("^return their corresponded latitude and longitude$")
    public void return_their_corresponded_latitude_and_longitude() {
        for(Network network: root.networks) {
            if(network.location.city.equals("Frankfurt")) {
                System.out.println("Frankfurt city longitude: " + network.location.latitude);
                System.out.println("Frankfurt city longitude: " + network.location.longitude);
            }
        }
    }
}
