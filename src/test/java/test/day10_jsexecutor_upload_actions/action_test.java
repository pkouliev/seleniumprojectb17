package test.day10_jsexecutor_upload_actions;

import Utilities.Driver;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class action_test {
/*
TC	#15:Hover Test
1.Go to	http://practice.cybertekschool.com/hovers
2.Hover	over to	first image
3.Assert: a.“name:user1” is	displayed
4.Hover	over to	second	image
5.Assert: a.“name:	user2”	is	displayed
6.Hover	over to	third image
7.Confirm:	a.“name: user3”	is di
 */

    @Test
    public void hover_over_test1()throws InterruptedException{
        Driver.getDriver().get("http://www.amazon.com");
        //1- Create the instance of Actions class
       //2- Pass the current driver instance
        Actions actions= new Actions(Driver.getDriver());

       //3- Locate the web element to hover over
        WebElement languageOption=Driver.getDriver().findElement(By.id("icp-nav-flyout"));

        Thread.sleep(3000);
        //4- Using actions, hover over to the Language options
        actions.moveToElement(languageOption).perform();
    }

    @Test
    public void tc15_hover_test()throws InterruptedException{
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        //we need to locate images and texts
        WebElement img1=Driver.getDriver().findElement(By.xpath("//div[@class='figure'][1]"));
        WebElement img2=Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        WebElement img3=Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));

        //we need to create instance of Actions
        WebElement user1=Driver.getDriver().  findElement(By.xpath("//h5[.='user1']"));
        WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[.='user2']"));
        WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[.='user3']"));
        //Use the instance to do
        //We need to create instance of actions
        Actions actions=new Actions(Driver.getDriver());
        Assert.assertTrue(user1.isDisplayed());
        Thread.sleep(2000);

        Actions actions2=new Actions(Driver.getDriver());
        Assert.assertTrue(user2.isDisplayed());
        Thread.sleep(2000);

        Actions actions3=new Actions(Driver.getDriver());
        Assert.assertTrue(user3.isDisplayed());

    }





    }

