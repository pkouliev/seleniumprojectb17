package test.day11_page_object_model;

import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

import java.util.TreeMap;

public class ActionsPracticesWithPageObj {

/*
TC	#15:Hover Test
1.Go to	http://practice.cybertekschool.com/hovers
2.Hover	over to	first image
3.Assert:a.“name: user1” is	displayed
4.Hover	over to	second	image
5.Assert: a.“name:	user2” is displayed
6.Hover	over to	third image
7.Confirm: a.“name: user3” is di
*/

@Test
//1->
    public void Tc15_hover_over_test()throws InterruptedException{
    Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
    HoversPage hoversPage = new HoversPage();
    Actions actions = new Actions(Driver.getDriver());


    //2. Hover over to first image

    //3. Assert:
    //a. “name: user1” is displayed
    Thread.sleep(3000);

    actions.moveToElement(hoversPage.img1).perform();

    Assert.assertTrue(hoversPage.user1.isDisplayed());

    //4. Hover over to second image

    Thread.sleep(3000);

    actions.moveToElement(hoversPage.img2).perform();

    Assert.assertTrue(hoversPage.user2.isDisplayed());

    //6->
    actions.moveToElement(hoversPage.img3).perform();
    Assert.assertTrue(hoversPage.user3.isDisplayed());

}





}
