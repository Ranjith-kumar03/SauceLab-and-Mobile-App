package demo.sauce.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
 
public class SauceLab_Test {
 
	public static final String USERNAME = "Ranjith-kumar03";
	  public static final String ACCESS_KEY = "17e48f95-f18e-4615-98bc-9b986e9482b0";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  @Test
  public static void Sauce_Test() throws Exception 
  
  {
 
    
    DesiredCapabilities capabilities = new DesiredCapabilities();
    
   

    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");

    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

    capabilities.setCapability(MobileCapabilityType.APP, "sauce-storage:ApiDemos-debug.apk");

    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");


    
    
//    capabilities.setCapability("platformName", "Android");
//    capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
//    capabilities.setCapability("platformVersion", "4.4");
//    capabilities.setCapability("MobileCapabilityType.APP","sause-storage:ApiDemos-debug.APK");
//    //“sauce-storage:ApiDemos-debug.apk”
//    //capabilities.setCapability("app", "http://saucelabs.com/example_files/ContactManager.apk");
//    capabilities.setCapability("deviceOrientation", "portrait");
//    capabilities.setCapability("appiumVersion", "1.5.3");
//    //caps.setCapability("appPackage","com.nitroxenon.terrarium");
//    //caps.setCapability("appActivity","com.nitroxenon.terrarium.ui.activity.HomeActivity");
    
    AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL(URL), capabilities);
 
    /**
     * Goes to Sauce Lab's guinea-pig page and prints title
     */
 
   
 
    driver.quit();
  }
}
