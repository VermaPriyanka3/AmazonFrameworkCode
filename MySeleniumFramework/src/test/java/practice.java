
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import com.amazon.utilities.BaseClass;

public class practice extends BaseClass{
	static WebDriver driver ; 
	public static void main(String[] args) {
		DesiredCapabilities SSLCertificate = DesiredCapabilities.chrome();
		SSLCertificate.acceptInsecureCerts();
		SSLCertificate.acceptInsecureCerts();
		SSLCertificate.acceptInsecureCerts();

		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);

		Wait wait = new FluentWait<WebDriver>(driver)
				.withTimeout(45, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
				
				
				
				
				


	}

}
