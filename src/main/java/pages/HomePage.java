package pages;

import driver.DriverManager;
import lombok.extern.log4j.Log4j2;
import report.Report;
import support.Verifications;
import org.openqa.selenium.By;

@Log4j2
public class HomePage extends DriverManager implements CommonTestingType {

    private By lblBemVindo = By.xpath("/html/body/div[2]/div[4]/span[1]/center/div[1]/div/a/img");

    @Override
    public boolean isPresent() {
        Report.TakeScreenShot();
        return Verifications.verifyElementIsVisible(lblBemVindo);
    }
}
