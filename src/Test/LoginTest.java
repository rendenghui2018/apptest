package Test;

import Pages.page;
import io.appium.java_client.TouchAction;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.Set;


public class LoginTest extends page {
    /**
     * 点击显示上一条
     *
     * @throws InterruptedException
     */
    @Test
    public void PreQuestion() throws InterruptedException {
       // driver.switchTo("android.webkit.WebView");

        //driver.context("NATIVE_APP_com.hrsoft.hcm");
        int width=driver.manage().window().getSize().width;
        int height=driver.manage().window().getSize().height;
        int y1 =height*3/4; //上滑的开始点，从y1开始也就是屏幕的四分之三处
         int y2 =height*1/4;// 上滑的结束点，到y2结束也就是屏幕的四分之一处
        TouchAction tAction =new TouchAction(driver);
        tAction.press(width/2,y1).waitAction(200).moveTo(width/2,y2).release().perform();
        Thread.sleep(1000);
        driver.findElementByAccessibilityId("Views").click();
        tAction.press(width/2,y1).waitAction(200).moveTo(width/2,y2).release().perform();
        tAction.press(width/2,y1).waitAction(200).moveTo(width/2,y2).release().perform();
        driver.findElementByAccessibilityId("WebView").click();
        Thread.sleep(2000);
        Set contextNames = driver.getContextHandles();
        for (Object contextName:contextNames) {
            System.out.println(contextName); // 用于返回被测app是NATIVE_APP还是WEBVIEW，如果两者都有就是混合型App
        }
        Thread.sleep(2000);
        //driver.context("WEBVIEW_com.example.android.apis");
       // driver.switchTo().window("WEBVIEW_io.appium.android.apis");
        driver.switchTo().window("WEBVIEW_io.appium.android.apis");


       // driver.context("WEBVIEW_io.appium.android.apis");


/*

        driver.switchTo().window("NATIVE_APP");

        driver.findElementById("OauthCode").sendKeys("200100");
        driver.findElementById("account").sendKeys("hr2");
        driver.findElementById("password").sendKeys("stalent");
        driver.findElementById("login").click();*/

    }


    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test");
        Reporter.log("testestet");
    }
}
