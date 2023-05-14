package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.plaf.basic.BasicToolBarSeparatorUI;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-12 22:32
 **/
public class Demo1 {
    public static void main (String[] args) {
        //fun1();
        //fun2();
        //fun3();
        //fun4();
    //    fun5();
        //fun6();
//        fun7();
        fun8();

    }
    public static void fun8(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
        String url = webDriver.getCurrentUrl();
        String title = webDriver.getTitle();
        if(url.equals("https://www.baidu.com/") && title.equals("百度一下，你就知道")){
            System.out.println("测试通过");
        }else{
            System.out.println("测试不通过");
        }

    }

    public static void fun7(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
        String str = webDriver.findElement(By.cssSelector("#su")).getAttribute("value");
        if(str.equals("百度一下")){
            System.out.println("测试通过");
        }else {
            System.out.println("测试不通过");
        }
    }

    //获取内容吧
    public static void fun6(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("软件测试");
        webDriver.findElement(By.cssSelector("#su")).click();
        List<WebElement> elements = webDriver.findElements(By.cssSelector("a #em"));
        for(int i = 0;i < elements.size(); i++){
            if(!(elements.get(i).equals("测试") || elements.get(i).equals("软件"))){
                System.out.println("测试不通过！！" + elements.get(i));
                return ;
            }
        }
        System.out.println("测试通过！！！");
    }

    public static void fun5(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("软件测试");
        webDriver.findElement(By.cssSelector("#su")).click();
        webDriver.findElement(By.cssSelector("#kw")).clear();
    }

    //介绍一下submit
    public static void fun4(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("软件测试");
        //submit只能应用于form标签内的内容 将内容提交到form中指定的地址
        //但是 如果在非form标签中使用的话会抛出异常
        webDriver.findElement(By.cssSelector("#su")).submit();
    }

    //打开网页并搜索软件测试并且测试当前网页中的内容是否符合预期
    public static void fun3(){
        //创建连接
        ChromeOptions options = new ChromeOptions();
        //设置可以访问所有的网页
        options.addArguments("--remote-allow-origins=*");
        //创建出一个网页
        WebDriver webDriver = new ChromeDriver(options);
        //设置要打开的网页
        webDriver.get("https://www.baidu.com");
        WebElement element = webDriver.findElement(By.cssSelector("#kw"));
        //将输入框中输入内容
        element.sendKeys("软件测试");
        //找到百度一下按钮 并且按下
        webDriver.findElement(By.cssSelector("#su")).click();
        //找到当前页面中的所有text文本
        List<WebElement> elements = webDriver.findElements(By.cssSelector("a em"));
        for(int i = 0;i < elements.size(); i++){
            if((elements.get(i).equals("软件") || elements.get(i).equals("测试"))){
                System.out.println("测试不通过!!!" + elements.get(i));
                return ;
            }
        }
        System.out.println("测试通过!!!");
    }
    //打开网页搜索软件测试并且删除搜索框中的内容
    public static void fun2(){
        //创建连接
        ChromeOptions options = new ChromeOptions();
        //设置可以访问所有的网页
        options.addArguments("--remote-allow-origins=*");
        //创建出一个网页
        WebDriver webDriver = new ChromeDriver(options);
        //设置要打开的网页
        webDriver.get("https://www.baidu.com");
        //找到kw输入框栏并创建对象
        WebElement element = webDriver.findElement(By.cssSelector("#kw"));
        //输入进输入框内容
        element.sendKeys("软件测试");
        //找到su按钮对象
        WebElement element1 = webDriver.findElement(By.cssSelector("#su"));
        //点击
        element1.click();
        //删除输入框中的内容
        webDriver.findElement(By.cssSelector("#kw")).clear();
    }

    //打开一个网页并且搜索软件测试并搜索
    public static void fun1(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
    }
}
