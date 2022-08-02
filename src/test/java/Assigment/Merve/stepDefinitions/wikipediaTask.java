package Assigment.Merve.stepDefinitions;

import Assigment.Merve.pages.wikipediaPage;
import Assigment.Merve.utils.BrowserUtil;
import Assigment.Merve.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class wikipediaTask {

    wikipediaPage wikiPage = new wikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");

    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String name) {
        BrowserUtil.wait(1);
        wikiPage.searchBox.sendKeys(name);

    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        BrowserUtil.wait(1);
        wikiPage.searchButton.click();

    }

    @Then("User sees {string} in the main header")
    public void userSeesInTheMainHeader(String name) {
        BrowserUtil.wait(1);
        String actual = wikiPage.mainHeader.getText();
        String expectedHeader = name;

        System.out.println("actual header = " + actual);
        System.out.println("expectedHeader = " + expectedHeader);

        Assert.assertTrue(actual.equals(expectedHeader));


        //Closing Browser
        Driver.closeDriver();
    }


}
