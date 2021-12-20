package seleniumDemo;
import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserLaunch_TestNG {
	
	static String testCaseResult;
	static String expectedResult;
	static String actualResult;
	static int result = 0;
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpBrowser() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/DHIRAJ/Desktop/BE Projects/STQA/Calculator/calculator_html.html");
	}
		//*********2 digit addition**************
	
	@Test
	public void twoDigitAddition() throws InterruptedException, NumberFormatException, IOException {
		
	
		Thread.sleep(700);
		driver.findElement(By.id("1")).click();
		Thread.sleep(700);
		driver.findElement(By.id("+")).click();
		Thread.sleep(700);
		driver.findElement(By.id("2")).click();
		Thread.sleep(700);
		driver.findElement(By.id("eval")).click();
		Thread.sleep(700);
		testCaseResult = "Fail";
		expectedResult = "3";
		actualResult = driver.findElement(By.id("result")).getAttribute("value");
		if(expectedResult.equals(actualResult)) {
			testCaseResult = "Pass";
		}
		System.out.println("Test Case 1 | Operation: 2 digit Addition | test data: 1 + 2 |"
				+ " Expected result: "+expectedResult+" | Actual Result: " 
				+ actualResult + "| Result : "+ testCaseResult);
	}
		
		//*********3 digit addition**************
	@Test
	public void threeDigitAddition() throws InterruptedException, NumberFormatException, IOException {
		driver.findElement(By.id("c")).click();
		
				Thread.sleep(700);
				driver.findElement(By.id("9")).click();
				Thread.sleep(700);
				driver.findElement(By.id("+")).click();
				Thread.sleep(700);
				driver.findElement(By.id("1")).click();
				Thread.sleep(700);
				driver.findElement(By.id("+")).click();
				Thread.sleep(700);
				driver.findElement(By.id("4")).click();
				Thread.sleep(700);
				driver.findElement(By.id("eval")).click();
				Thread.sleep(700);
				testCaseResult = "Fail";
				expectedResult = "14";
				actualResult = driver.findElement(By.id("result")).getAttribute("value");
				if(expectedResult.equals(actualResult)) {
					testCaseResult = "Pass";
				}
				System.out.println("Test Case 2 | Operation: 3 digit Addition | test data: 9+1+4 |"
						+ " Expected result: "+expectedResult+" | Actual Result: " 
						+ actualResult + "| Result : "+ testCaseResult);
	}
		
//***************Subtraction of positive integers*****************
	@Test
	public void SubtractionOfPositiveIntegers() throws InterruptedException, NumberFormatException, IOException {
		driver.findElement(By.id("c")).click();
		
		
		Thread.sleep(700);
		driver.findElement(By.id("1")).click();
		driver.findElement(By.id("0")).click();
		driver.findElement(By.id("0")).click();
		Thread.sleep(700);
		driver.findElement(By.id("-")).click();
		Thread.sleep(700);
		driver.findElement(By.id("5")).click();
		driver.findElement(By.id("0")).click();
		Thread.sleep(700);
		driver.findElement(By.id("eval")).click();
		Thread.sleep(700);
		testCaseResult = "Fail";
		expectedResult = "50";
		actualResult = driver.findElement(By.id("result")).getAttribute("value");
		if(expectedResult.equals(actualResult)) {
			testCaseResult = "Pass";
		}
		System.out.println("Test Case 3 | Operation: Substraction +ve int | test data: 100 - 50 |"
				+ " Expected result: " +expectedResult+"  | Actual Result: " 
				+ actualResult + "| Result : "+ testCaseResult);
	}
		

//***************Subtraction of negative integers*****************
	@Test
	public void SubtractionOfNigativeIntegers() throws InterruptedException, NumberFormatException, IOException {
				driver.findElement(By.id("c")).click();
				
				
				Thread.sleep(700);
				driver.findElement(By.id("-")).click();
				driver.findElement(By.id("1")).click();
				driver.findElement(By.id("0")).click();
				Thread.sleep(700);
				driver.findElement(By.id("-")).click();
				Thread.sleep(700);
				driver.findElement(By.id("5")).click();
				driver.findElement(By.id("0")).click();
				Thread.sleep(700);
				driver.findElement(By.id("eval")).click();
				Thread.sleep(700);
				testCaseResult = "Fail";
				expectedResult = "-60";
				actualResult = driver.findElement(By.id("result")).getAttribute("value");
				if(expectedResult.equals(actualResult)) {
					testCaseResult = "Pass";
				}
				System.out.println("Test Case 4 | Operation: Substraction | test data: -10 - 50 |"
						+ " Expected result: " +expectedResult+"  | Actual Result: " 
						+ actualResult + "| Result : "+ testCaseResult);
	}
				
//***************Addition of one positive and one negative integer*****************
	@Test
	public void PositveNegativeAddition() throws InterruptedException, NumberFormatException, IOException {

				
				driver.findElement(By.id("c")).click();
				
				
				Thread.sleep(700);
				driver.findElement(By.id("1")).click();
				driver.findElement(By.id("0")).click();
				driver.findElement(By.id("0")).click();
				Thread.sleep(700);;
				driver.findElement(By.id("+")).click();
				Thread.sleep(700);
				driver.findElement(By.id("-")).click();
				driver.findElement(By.id("1")).click();
				driver.findElement(By.id("0")).click();
				Thread.sleep(700);
				driver.findElement(By.id("eval")).click();
				Thread.sleep(700);
				testCaseResult = "Fail";
				expectedResult = "90";
				actualResult = driver.findElement(By.id("result")).getAttribute("value");
				if(expectedResult.equals(actualResult)) {
					testCaseResult = "Pass";
				}
				System.out.println("Test Case 5 | Operation: Addition +ve -ve | test data: 100 + -10 |"
						+ " Expected result: " +expectedResult+"  | Actual Result: " 
						+ actualResult + "| Result : "+ testCaseResult);
	}
		
//***************+ve Multiplication*****************		
	@Test
	public void PositveMultiplication() throws InterruptedException, NumberFormatException, IOException {

		driver.findElement(By.id("c")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("1")).click();
		driver.findElement(By.id("0")).click();
		Thread.sleep(700);
		driver.findElement(By.id("*")).click();
		Thread.sleep(700);
		driver.findElement(By.id("5")).click();
		driver.findElement(By.id("0")).click();
		Thread.sleep(700);
		driver.findElement(By.id("eval")).click();
		Thread.sleep(700);
		testCaseResult = "Fail";
		expectedResult = "500";
		actualResult = driver.findElement(By.id("result")).getAttribute("value");
		if(expectedResult.equals(actualResult)) {
			testCaseResult = "Pass";
		}
		System.out.println("Test Case 6 | Operation: +ve multiplication | test data: 10 * 50 |"
				+ " Expected result: " +expectedResult+"  | Actual Result: " 
				+ actualResult + "| Result : "+ testCaseResult);
	}
		
		
//***************-ve Multiplication*****************		
		
	@Test
	public void negativeMultiplication() throws InterruptedException, NumberFormatException, IOException {

				driver.findElement(By.id("c")).click();
				
				
				Thread.sleep(1000);
				driver.findElement(By.id("-")).click();
				driver.findElement(By.id("1")).click();
				driver.findElement(By.id("0")).click();
				Thread.sleep(400);
				driver.findElement(By.id("*")).click();
				Thread.sleep(400);
				driver.findElement(By.id("5")).click();
				driver.findElement(By.id("0")).click();
				Thread.sleep(400);
				driver.findElement(By.id("eval")).click();
				Thread.sleep(400);
				testCaseResult = "Fail";
				expectedResult = "-500";
				actualResult = driver.findElement(By.id("result")).getAttribute("value");
				if(expectedResult.equals(actualResult)) {
					testCaseResult = "Pass";
				}
				System.out.println("Test Case 7 | Operation: -ve multiplication | test data: -10 * 50 |"
						+ " Expected result: " +expectedResult+"  | Actual Result: " 
						+ actualResult + "| Result : "+ testCaseResult);
	}
				
				
				
//**********Data from test dataset************
/*	@Test
	public void testingFromDataset() throws InterruptedException, NumberFormatException, IOException {

				
				
				File file = new File("C:\\Users\\DHIRAJ\\Desktop\\BE Projects\\STQA\\Calculator\\calsitestdataset.txt");
				 
		        
		        BufferedReader br = new BufferedReader(new FileReader(file));
		        
		        String num1="";
		        String op = "";
		        String num2 = "";
		        int count = 8;
		        String operation = "";
		 
		        
		        while ((num1 = br.readLine()) != null) {
		        	op = br.readLine();
		        	num2 = br.readLine();
		        	
		        	switch(op) {
		        	
		        	case "+":
		        		result = Integer.parseInt(num1)+Integer.parseInt(num2);
		        		operation = "Addition";
		        		break;
		        		
		        	case "-":
		        		result = Integer.parseInt(num1)-Integer.parseInt(num2);
		        		operation = "Subtraction";
		        		break;
		        		
		        	case "*":
		        		result = Integer.parseInt(num1)*Integer.parseInt(num2);
		        		operation = "Multiplication";
		        		break;
		        		
		        	case "/":
		        		result = Integer.parseInt(num1)/Integer.parseInt(num2);
		        		operation = "Division";
		        		break;
		        	}
		        	
		        	driver.findElement(By.id("c")).click();
		        	
		            driver.findElement(By.id(num1)).click();
		            Thread.sleep(300);
		            driver.findElement(By.id(op)).click();
		            Thread.sleep(300);
		            driver.findElement(By.id(num2)).click();
		            Thread.sleep(300);
		            driver.findElement(By.id("eval")).click();
		    		Thread.sleep(500);
		    		
		    		testCaseResult = "Fail";
		    		expectedResult = Integer.toString(result);
		    		actualResult = driver.findElement(By.id("result")).getAttribute("value");
		    		
		    		if(expectedResult.equals(actualResult)) {
		    			testCaseResult = "Pass";
		    		}
		    		
		    		System.out.println("Test Case "+ count +" | Operation: " + operation + " | test data: "+ num1 +" "+ op +" " + num2+" |"
		    				+ " Expected result: " +expectedResult+"  | Actual Result: " 
		    				+ actualResult + "| Result : "+ testCaseResult);
		        	
		        	
		        	count++;		
		        }
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		
		
		driver.close();
		
		driver.quit();
	}*/
		

	
	
}//class
















/*int count1 = 0;
if(choice == 1) {
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	//driver.findElement(By.id("email")).click();
	String user_id = "";
	String password = "";
	int count = 0;
	
	File file = new File("C:\\Users\\Adarsh\\Desktop\\testdataset.txt");
 
        
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        
        while ((user_id = br.readLine()) != null) {
        	password = br.readLine();
        	
        	driver.findElement(By.id("email")).clear();		         
			driver.findElement(By.id("email")).sendKeys(user_id);
			
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			Thread.sleep(1000);
			String at = driver.getTitle();
			String et = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			if(et.equalsIgnoreCase(at)) {
				count++;
			}
			
			count1++;
        }
	
}
else if(choice == 2) {
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	
	String user_id = "";
	String password = "";
	int count = 0;
	
	File file = new File("C:\\Users\\Adarsh\\Desktop\\testdataset.txt");
 
        
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        
        while ((user_id = br.readLine()) != null) {
        	password = br.readLine();
        	
        	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        	driver.findElement(By.id("ap_email")).sendKeys(user_id);
        	driver.findElement(By.id("continue")).click();
        	driver.findElement(By.id("ap_password")).sendKeys(password);
        	driver.findElement(By.id("signInSubmit")).click();
        	
        	driver.findElement(By.id("ap_change_login_claim")).click();
			Thread.sleep(1000);
			
        }
        
        br.close();
}

System.out.println(count1 + "/14 Test cases passed");
Thread.sleep(3000);*/