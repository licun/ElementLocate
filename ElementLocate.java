package Locate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
findElement() 该方法返回基于指定查询条件的webElement对象
findElements() 该方法返回指定查询条件的WebElement的对象集合
*/
public class ElementLocate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.get("http://www.51.com");
		//webelement类提供了诸多方法，在我们开发脚本过程中如何选择最可靠，效率最高的方法，使用id，name是首选
		//By id
		WebElement elementId = dr.findElement(By.id("passport_51_user"));
		System.out.println(elementId.getAttribute("title"));
		//By name
		WebElement elementName = dr.findElement(By.name("passport_51_user"));
		//By classname		
		WebElement elementClassname = dr.findElement(By.className("username"));
		System.out.println(elementClassname.getTagName());
		//定位多个元素
		List<WebElement> element = dr.findElements(By.tagName("input"));
		for (WebElement e : element){
			System.out.println(e.getAttribute("id"));
		}
		/*
		dr.findElement(By.cssSelector("标签名[属性名^='xxx']"));  匹配属性值以xxx开头的元素
		dr.findElement(By.cssSelector("标签名[属性名$='xxx']"));  匹配属性值以xxx结尾的元素
		dr.findElement(By.cssSelector("标签名[属性名^='xxx']"));  匹配属性值包含xxx的元素
		*/
		//结合id来定位，driver.findElement(By.cssSelector("input#username"))
		WebElement elementCss = dr.findElement(By.cssSelector("#passport_51_user"));
		
	}
}
