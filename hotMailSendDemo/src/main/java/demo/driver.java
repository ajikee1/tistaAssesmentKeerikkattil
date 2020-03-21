package demo;

//@date:04/01/2018
//@author:Ajith K
//updated:11/01/2019

public class driver {

	public static void main(String[] args) throws InterruptedException {
		
		helper help = new helper();
		
		help.createWebDriver();
		help.openUrl("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1581118272&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d2c3efb01-bae7-1bdb-c272-dd129e3e7274&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");

		//UserNamePage
		help.enterText(help.getBy("name", "loginfmt") , "ajithtest@outlook.com");
		help.click( help.getBy("xpath", "//input[@value='Next']"));
		
		//passWordPage
		help.wait(help.getBy("name", "passwd"));
		help.enterText(help.getBy("name", "passwd") , "Zbxwaqu8");
		help.click(help.getBy("xpath", "//input[@value='Sign in']"));
		
		//if the stay signed in page shows up. Doesn't show up all the time
		Thread.sleep(3000);
		Boolean ifStaySignedIn = help.isPresent(help.getBy("name", "DontShowAgain"));
		if(ifStaySignedIn == true)
		{
			help.wait(help.getBy("name", "DontShowAgain"));
			help.click(help.getBy("name", "DontShowAgain"));
			
			help.click(help.getBy("id", "idSIButton9"));
		}
		
		//newMessageButton
		help.wait(help.getBy("xpath", "//*[@id=\"id__3\"]"));
		help.click(help.getBy("xpath", "//*[@id=\"id__3\"]"));

		//addSubject
		help.wait(help.getBy("id", "subjectLine0"));
		help.enterText(help.getBy("id", "subjectLine0") , "demoTest");
		 
				
		//addRecepient
		help.enterText(help.getBy("xpath", "//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/input") , "ajith@yopmail.com");

		//addMessageBody
		help.enterText(help.getBy("xpath", "//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[2]/div[1]") , "This is a test email");
				
		//sendMailButton
		help.click(help.getBy("xpath", "//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[3]/div[2]/div[1]/button[1]"));

		Thread.sleep(3000);
		help.closeDriver();
		
	}

}
