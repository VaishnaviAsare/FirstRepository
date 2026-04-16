package HomeStepsDefination;

import io.cucumber.java.en.*;

 class LoginSteps {

    String username;
    String password;

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        System.out.println("User is on the login page");
    }

    @When("the user enters username {string} and password {string}")
    public void userEntersCredentials(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Entering username: " + username + " and password: " + password);
    }

    @Then("the user should be logged in successfully")
    public void userLoggedInSuccessfully() {
        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login Successful!");
        } else {
            throw new AssertionError("Expected successful login but failed!");
        }
    }

    @Then("the user should see an error message")
    public void userSeesErrorMessage() {
        if (!password.equals("admin123")) {
            System.out.println("Error: Invalid credentials!");
        } else {
            throw new AssertionError("Expected error but login was successful!");
        }
    }
}