package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util {

	 public static String TakingScreenshot(WebDriver driver, String screenshotname) throws IOException {
	        File screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String destinationPath = "./screenshots/" + screenshotname + ".png";
	        FileUtils.copyFile(screenshotfile, new File(destinationPath));
	        return destinationPath;
}}