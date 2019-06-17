package com.company;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

public class QuizTest extends Page {

    /**
     *  安卓自带的发送短信息，删除发送的信息
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

        //长按某个元素
        TouchAction ta = new TouchAction(driver);
        WebElement el = driver.findElementByXPath("//*[@resource-id='com.android.mms:id/msg_list_item_send' and @index='1']");
        ta.longPress(el,5000).release().perform();//长按10s
        Thread.sleep(2000);
       // driver.findElementByName("Delete").click();
        //使用xpath方式层级定位方式 5是个数
       // driver.findElementByXPath("//*[@resource-id='android:id/select_dialog_listview']/android.widget.LinearLayout[5]").click();
       //使用元素的层级定位方式
        WebElement delete=driver.findElementById("android:id/select_dialog_listview");
        List<WebElement> deletes=delete.findElements(By.className("android.widget.LinearLayout"));
        deletes.get(4).click();
        Thread.sleep(1000);
        //点击的删除的按钮
        driver.findElementById("android:id/button1").click();

       // WebElement element = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.oupeng.mini.android:id/search_engine_title");


        // driver.findElementByAccessibilityId("action_compose_new").click();
        Thread.sleep(2000);

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
