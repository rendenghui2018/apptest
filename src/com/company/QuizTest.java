package com.company;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

public class QuizTest extends Page {

    /**
     *  点击显示上一条
     * @throws InterruptedException
     */
    @Test
    public void PreQuestion() throws InterruptedException{
        //gongsi
        driver.findElementById("com.android.mms:id/action_compose_new").click();// 点击上一个按钮
        Thread.sleep(2000);
        driver.findElementById("com.android.mms:id/embedded_text_editor").sendKeys("test");//输入发送信息
        Thread.sleep(2000);
        driver.findElementById("com.android.mms:id/recipients_editor").sendKeys("123333");//输入手机号
        Thread.sleep(2000);
        driver.findElementById("com.android.mms:id/send_button_sms").click();
        Thread.sleep(2000);
        driver.findElementById("android:id/button1").click();

        TouchAction ta = new TouchAction(driver);
        WebElement el = driver.findElementByXPath("//*[@resource-id='com.android.mms:id/msg_list_item_send' and @index='2']");
        ta.longPress(el,5000).release().perform();//长按10s
        Thread.sleep(2000);
       // driver.findElementByName("Delete").click();
        driver.findElementByXPath("//*[@class=android.widget.LinearLayout' and @index='4' ]/[@class='android.widget.RelativeLayout']/[@resource-id='android:id/title']").click();


       // driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[6]").

        //  driver.findElementByAccessibilityId("action_compose_new").click();
        Thread.sleep(2000);
        //suse
        // driver.findElementById("com.example.androidunittest:id/btnLog").click();//点击下一个按钮
        Thread.sleep(2000);
        //  String tips = driver.findElementById("com.example.quizactivity:id/question_text_view").getText();
        //  Assert.assertEquals(tips, "The Suez Canal connects the Red Sea and the Indian Ocean.");
        Thread.sleep(2000);
    }

    @Test
     public void test1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test");
        Reporter.log("testestet");
     }
}
