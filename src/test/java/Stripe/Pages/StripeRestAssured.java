package Stripe.Pages;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class StripeRestAssured {
    @Test(priority = 0)
    public void toVerifyUserIsAbleToCreateUserUsingPostRequest() {
        baseURI = "https://api.stripe.com";

        given()
                .header("Authorization", "Bearer " + "sk_test_51M02VOSFTP1f8SJrNGFzIUABw5dGARllD7z9KysIdsYphaIJ53XgtmxSqmrjK8MsBLV76cT1KVHQEiT56lentF9O00hNquioIz")
                .header("Accept", "application/json")
                .when()
                .post("/v1/customers")
                .then()
                .log().all();
    }

    @Test(priority = 1)
    public void toVerifyUserIsAbleToListCustomersUsingGetRequest() {
        baseURI = "https://api.stripe.com";

        given()
                .header("Authorization", "Bearer " + "sk_test_51M02VOSFTP1f8SJrNGFzIUABw5dGARllD7z9KysIdsYphaIJ53XgtmxSqmrjK8MsBLV76cT1KVHQEiT56lentF9O00hNquioIz")
                .header("Accept", "application/json")
                .when()
                .get("/v1/customers")
                .then()
                .log().all();
    }

    @Test(priority = 2)
    public void toVerifyUserIsAbleToDeleteCustomerUsingDeleteRequest() {
        baseURI = "https://api.stripe.com";

        given()
                .header("Authorization", "Bearer " + "sk_test_51M02VOSFTP1f8SJrNGFzIUABw5dGARllD7z9KysIdsYphaIJ53XgtmxSqmrjK8MsBLV76cT1KVHQEiT56lentF9O00hNquioIz")
                .header("Accept", "application/json")
                .when()
                .delete("/v1/customers/cus_9BoKyB2Km2T7TE")
                .then()
                .log().all();
    }
}