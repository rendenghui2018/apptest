package susetest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class quizTest extends page {

    /**
     *  点击显示上一条
     * @throws InterruptedException
     */
    @Test
    public void PreQuestion() throws InterruptedException{

        //suse
         driver.findElementById("com.android.messaging:id/start_new_conversation_button").click();//点击下一个按钮
        Thread.sleep(2000);
        driver.findElementById("com.android.messaging:id/recipient_text_view").sendKeys("12323");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@class='android.widget.TextView' and @index='1']" ).click();
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
