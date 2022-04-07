import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
     public void f() {
        System.setProperty("webdriver.chrome.marionette","‪E:/chromedriver_win32/chromedriver.exe");

        //指定谷歌浏览器位置
        System.setProperty("webdriver.chrome.bin", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");

        //定义驱动对象为 ChromeDriver 对象
         WebDriver driver = new ChromeDriver();

        //打开网址
        driver.get("http://www.baidu.com/");

        //浏览器窗口最大化
        driver.manage().window().maximize();

        //定位输入框元素
        WebElement txtbox = driver.findElement(By.id("kw"));

        //在百度输入框输入文本
        txtbox.sendKeys("csdn");

        //定位"百度一下"按钮元素
        WebElement btn = driver.findElement(By.id("su"));
        //点击按钮
        btn.click();
        //获取title和URL地址并输入到控制台

        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title+":"+url);

        //关闭
        driver.close();

    }

}
