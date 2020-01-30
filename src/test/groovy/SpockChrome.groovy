import spock.lang.Specification

import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");
//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//def browser=new Browser(driver:new FirefoxDriver())
def browser=new Browser(driver:new ChromeDriver())
browser.go("https://sandbox-beta.airmiles.ca/")

//class SampleTest extends Specification {
//
//
//    def "this is my business need" () {
//        when:
//        Map map = new HashMap();
//
//        then:
//        map.size() == 0
//    }
//}

