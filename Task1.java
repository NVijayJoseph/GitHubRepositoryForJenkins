public class Task1 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
		
		WebElement element = driver.findElement(By.xpath("(//input[@placeholder='Search for Products, Brands and More' and @name='q'])[1]"));
		
		element.sendKeys("OnePlus Nord (Gray Onyx, 64 GB) (6 GB RAM)", Keys.ENTER);
		
		WebElement element2 = driver.findElement(By.xpath("//div[text()='OnePlus Nord (Gray Onyx, 64 GB)']"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(element2).perform();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);

		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		String windowHandle1 = driver.getWindowHandle();
		System.out.println(windowHandle1);
		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handles : windowHandles) {
			driver.switchTo().window(handles);
			System.out.println(handles);
		}
		Thread.sleep(5000);
	
		String windowHandle2 = driver.getWindowHandle();
		System.out.println(windowHandle2);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		WebElement element3 = driver.findElement(By.xpath("//div[text()='All details']"));
		
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='All details']")));
		
		//Thread.sleep(5000);
		
		je.executeScript("arguments[0].scrollIntoView(true)",element3);
		
		//je.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(5000);
		
		boolean displayed = element3.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = element3.isEnabled();
		System.out.println(enabled);
		
		if(displayed == true) {
			if(enabled == true) {
				element3.click();
			}	
		}
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Warranty']")).click();
		
		Thread.sleep(5000);
		
		WebElement element4 = driver.findElement(By.xpath("//div[text()='Questions and Answers']"));
		
		
		je.executeScript("arguments[0].scrollIntoView(true)",element4);
		
		element4.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		System.out.println("Done");
		
		
		
		
		
		
		
		
		
	}

}
