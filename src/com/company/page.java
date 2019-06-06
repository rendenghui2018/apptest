package com.company;

import org.testng.annotations.Test;

public class page  extends  QuizTest{

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


        //  driver.findElementByAccessibilityId("action_compose_new").click();
        Thread.sleep(2000);
        //suse
        // driver.findElementById("com.example.androidunittest:id/btnLog").click();//点击下一个按钮
        Thread.sleep(2000);
        //  String tips = driver.findElementById("com.example.quizactivity:id/question_text_view").getText();
        //  Assert.assertEquals(tips, "The Suez Canal connects the Red Sea and the Indian Ocean.");
        Thread.sleep(2000);
    }

}
