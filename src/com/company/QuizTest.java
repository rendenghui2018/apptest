package com.company;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;


public class QuizTest {

    public AppiumDriver driver;
    private boolean isInstall = false;

    public void startRecord () throws IOException{
      //  Runtime rc = Runtime.getRuntime();
       // rc.exec("cmd.exe /E:/Android/sdk/platform-tools adb shell screenrecord /sdcard/runCase.mp4");//录制屏幕运行视频
    }

    /**
     *  开始启动
     * @throws IOException
     */
    @Before
    public void setUp() throws IOException{
        // 启动appium gongsi
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "192.168.250.101:5555");//指定测试机
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");// 指定测试平台
        capabilities.setCapability("platformVersion", "4.3");//平台版本*/

        // 配置测试apk
        capabilities.setCapability("appPackage", "com.android.mms");//测试的包
        capabilities.setCapability("appActivity", "com.android.mms.ui.ConversationList");//测试的activity
        capabilities.setCapability("sessionoverride", true);//每次启动时覆盖session，否则第二次后运行会报错不能新建session
        capabilities.setCapability("unicodekeyboard", true);//设置键盘
        capabilities.setCapability("resetkeyboard", false); //设置默认键盘为appium的键盘
        //driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       /* // 启动appium suse
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "192.168.67.101:5555");//指定测试机
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");// 指定测试平台
        capabilities.setCapability("platformVersion", "7.0");//平台版本

              // 配置测试apk
        capabilities.setCapability("appPackage", "com.example.androidunittest");//测试的包
        capabilities.setCapability("appActivity", "com.example.androidunittest.MainActivity");//测试的activity
        capabilities.setCapability("sessionoverride", true);//每次启动时覆盖session，否则第二次后运行会报错不能新建session
        capabilities.setCapability("unicodekeyboard", true);//设置键盘
        capabilities.setCapability("resetkeyboard", false); //设置默认键盘为appium的键盘
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

       /* // 安装APK,如果真机设备已经安装，则不需要重新安装
        if (isInstall){
            File classpathRoot = new File(System.getProperty("user.dir"));
            File appDir = new File(classpathRoot,"apps");
            File app = new File(appDir,"QuizActivity.apk");
            capabilities.setCapability("app", app.getAbsolutePath());
        }
        startRecord();*/

    }

    /**
     *  点击显示上一条
     * @throws InterruptedException
     */
    @Test
    public void PreQuestion() throws InterruptedException{
        Thread.sleep(2000);
       driver.findElementById("com.android.mms:id/action_compose_new").click();// 点击上一个按钮
      //  driver.findElementByAccessibilityId("action_compose_new").click();
        Thread.sleep(2000);
       /* driver.findElementById("com.example.quizactivity:id/next_button").click();//点击下一个按钮
        Thread.sleep(2000);
        String tips = driver.findElementById("com.example.quizactivity:id/question_text_view").getText();
        Assert.assertEquals(tips, "The Suez Canal connects the Red Sea and the Indian Ocean.");
        Thread.sleep(2000);*/
    }


    /*
     * 结束启动
     */
    @After
    public void tearDown(){
        driver.quit();
    }

}