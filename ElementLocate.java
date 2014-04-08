package Locate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
findElement() �÷������ػ���ָ����ѯ������webElement����
findElements() �÷�������ָ����ѯ������WebElement�Ķ��󼯺�
*/
public class ElementLocate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.get("http://www.51.com");
		//webelement���ṩ����෽���������ǿ����ű����������ѡ����ɿ���Ч����ߵķ�����ʹ��id��name����ѡ
		//By id
		WebElement elementId = dr.findElement(By.id("passport_51_user"));
		System.out.println(elementId.getAttribute("title"));
		//By name
		WebElement elementName = dr.findElement(By.name("passport_51_user"));
		//By classname		
		WebElement elementClassname = dr.findElement(By.className("username"));
		System.out.println(elementClassname.getTagName());
		//��λ���Ԫ��
		List<WebElement> element = dr.findElements(By.tagName("input"));
		for (WebElement e : element){
			System.out.println(e.getAttribute("id"));
		}
		/*
		dr.findElement(By.cssSelector("��ǩ��[������^='xxx']"));  ƥ������ֵ��xxx��ͷ��Ԫ��
		dr.findElement(By.cssSelector("��ǩ��[������$='xxx']"));  ƥ������ֵ��xxx��β��Ԫ��
		dr.findElement(By.cssSelector("��ǩ��[������^='xxx']"));  ƥ������ֵ����xxx��Ԫ��
		*/
		//���id����λ��driver.findElement(By.cssSelector("input#username"))
		WebElement elementCss = dr.findElement(By.cssSelector("#passport_51_user"));
		
	}
}
