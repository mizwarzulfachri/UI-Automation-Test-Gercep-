import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class case2 extends base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementById("com.example.gercep1:id/ke_daftar").click();
		driver.findElementById("com.example.gercep1:id/reg_nama").sendKeys("mack1");
		driver.findElementById("com.example.gercep1:id/reg_email").sendKeys("mack1@gmail.com");
		driver.findElementByAccessibilityId("Masukan password lagi").sendKeys("123");
		
		driver.findElementById("com.example.gercep1:id/daftar").click();
		driver.findElementById("com.example.gercep1:id/password").sendKeys("123");
		driver.findElementById("com.example.gercep1:id/email").sendKeys("mack1@gmail.com");
		driver.findElementById("com.example.gercep1:id/masuk").click();
		
		driver.findElementById("com.example.gercep1:id/out").click();
		driver.findElementById("android:id/button1").click();
		
	}
}
