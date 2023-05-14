/**
 * @Author: 冰激凌
 * @Date: 2023-05-12 19:47
 **/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void test1(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
        WebElement element  = webDriver.findElement(By.cssSelector("#kw"));
        element.sendKeys("hello");
        System.out.println(element.getText());
    }
    public static void main(String[] args) {
        test1();
//        ChromeOptions options = new ChromeOptions();
//        //允许所有请求
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver webDriver = new ChromeDriver(options);
//        //打开百度的首页
//        webDriver.get("https://www.baidu.com");
////        WebElement element = webDriver.findElement(By.cssSelector(".s_ipt"));
//        WebElement element = webDriver.findElement(By.xpath("//form/div/span[1])"));
//        element.sendKeys("软件测试");
    }
}
