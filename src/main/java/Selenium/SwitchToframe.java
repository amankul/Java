package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.NoSuchElementException;


public class SwitchToframe   {
    public static void main(String[] args) throws NoSuchElementException {

        int indexOfFrame=0;

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("version", "75");
        caps.setCapability("pageLoadStrategy","eager");

        // desired cap are key value pairs to set browser properties

        WebDriverManager.firefoxdriver().setup();

        // saves on downloading drivers and giving paths. By def works on latest
        // can also specify version e.g. Webdrivermanager.chromedriver(). version(2.36).setup()

        WebDriver driver = new FirefoxDriver(caps);

        long start = System.currentTimeMillis();
        driver.get("http://demo.guru99.com/test/guru99home/");
        long end = System.currentTimeMillis();

        System.out.println("Page load time " + (end - start));


        /* If page loading takes long time due to images, css, js etc
        Normal - html + subresources  18s
        Eager - faster html parsed 8s
        None - Fastest only html 19 ms
         */

        driver.manage().window().maximize();
        int size = driver.findElements(By.tagName("iframe")).size();      // iframes are html pages inside pages.Used for ad units.

        System.out.println("******** No of iframes *******"  + size);


        driver.quit();

 /*



	for(int i=0; i<=size; i++){
	    driver.switchTo().frame(i);                                           // switch to frame by index. frames are subsections on web
	    int total=driver.findElements(By.xpath("html/body/a/img")).size();
		if (total == 1)
        {
            indexOfFrame = i;
            break;
        }


	 }

        System.out.println("******** frame we want *******"  + indexOfFrame);

        driver.switchTo().frame(0);




        System.out.println("********We are switched to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();

        driver.switchTo().defaultContent();                          //switching back from the iframe to parent



        //Clicking the element in line with Advertisement
        System.out.println("*********We are done***************");

        driver.close();


        */
    }
}







