package twc.Regression.TestCases;

import java.io.File;

import org.openqa.selenium.internal.Killable;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import twc.Regression.HandleWithCharles.CharlesProxy;

//import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Regression.CustomParamValidation.CustomParamFunctions;
import twc.Regression.CustomParamValidation.validate_CustomParameter;
import twc.Regression.Driver.Drivers;
import twc.Regression.General.Functions;
import twc.Regression.General.TwcAndroidBaseTest;
import twc.Regression.HandleWithAppium.AppiumFunctions;
import twc.Regression.HandleWithCharles.CharlesFunctions;
import twc.Regression.ReadDataFromFile.read_excel_data;
import twc.Regression.utils.DeleteFiles;

public class regressionTestCases extends TwcAndroidBaseTest {
	
	public static String CurrentWifiName=null;
	
	private static final String CONFIG_FILE_PATH = "charles_common.config";

	private static final String BN_SEVERE1_CONFIG_FILE_PATH = "BNSevere1charles_common.config";
	private static final String BN_SEVERE2_CONFIG_FILE_PATH = "BNSevere2charles_common.config";
	private static final String CRITEO_CONFIG_FILE_PATH = "Criteocharles_common.config";
	private static final String CRITEO_NONUS_CONFIG_FILE_PATH = "CriteoNonUScharles_common.config";
	// public static CharlesProxy proxy;
	public File configFile;
	private CharlesProxy proxy;




	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws Exception {	
		this.configFile = this.charlesGeneralConfigFile(CONFIG_FILE_PATH);
		proxy = new CharlesProxy("localhost", 8333, CONFIG_FILE_PATH);
		proxy.startCharlesProxyWithUI();
		proxy.disableRewriting();
	    proxy.stopRecording();
		proxy.disableMapLocal();
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.LaunchAppWithFullReset();
		//Thread.sleep(20000);
		//AppiumFunctions.gettingApkVersion() ;
		Thread.sleep(5000);
		attachScreen();
	}

	  ////Interstail ads/////
	  
	  @Test(priority =1, enabled = true)
	  @Title("Verifying Hourly  details Interstal ads") 
	  public void Smoke_Test_Verify_Hourlydetails_interstial_ads() throws Exception {
	 System.out.println( "================= Verifying Hourly details Interstal ads test case  Started =========================");
	 //Functions.settheTimer(); // Functions.enable_QA_Usergroup(); //
	//  AppiumFunctions.Kill_Launch_App(); //AppiumFunctions.Kill_launch();
	 // Thread.sleep(20000);
//	 Ad.resetApp();
	 // Thread.sleep(20000);
	/*  AppiumFunctions.clickONNext();
	  AppiumFunctions. ClickonIUnderstand();
	  AppiumFunctions.clickOnAllow();*/
		proxy.clearCharlesSession();
	//  Thread.sleep(250000);
	  AppiumFunctions.click_hourly_element();
		attachScreen();
	  Functions.wiatfor5secindetails();
       this.proxy.getXml(); 
	  Functions.Verify_hourly_detailpage_interstitial_adcall();
	  Functions.click_home_element();
		attachScreen();
	//  Ad.runAppInBackground(10);
	  Functions.handleInterstailadss();
	  Functions.closeInterstailadss();
	 Functions.settheTimer();
		proxy.clearCharlesSession();
	 // CharlesFunctions.startSessionBrowserData();
	  AppiumFunctions.click_hourly_element();
		attachScreen();
	  Functions.wiatfor5secindetails();
      this.proxy.getXml(); 
	  Functions.Verify_hourly_detailpage_interstitial_adcall1();
	/*  Functions.click_home_element(); 
	  Functions.handleInterstailads();
	 Functions.closeInterstailads();*/
	  
	  }
	  
	  
	  /*amazon interstitial slot id verification test cases*/
		
		@Test(priority = 2, enabled = true)
		@Title("Verifying amazon interstitial Slot Id for hourly details preload ad call")
		public void Smoke_Test_amazon_slotid_Hourly_Intertstitial_preload_adcall() throws Exception {
			System.out.println("================= Verify amazon interstitial slot id for  Hourly details preroll adcall test case Started =========================");
			//AppiumFunctions.gettingApkVersion();
			logStep(" Verifying preload amazon intertstitial slot id for  hourly details");	
		//	AppiumFunctions.Kill_Launch_App();
			System.out.println("Launching the app with full reset");
			Ad.resetApp();
			Thread.sleep(3000);
			logStep("Clicking on Next button");
			Thread.sleep(2000);
			logStep("Clicking on I Understand button");
			Thread.sleep(2000);
			logStep("Clicking on While using the app");
			Thread.sleep(5000);
			this.proxy.getXml();
			Functions.get_Interstitial_aaxcal_Hourly();
			System.out.println("================= Verify amazon interstitial slot id for  Hourly details preroll adcall test case  End =========================");
		}
		
		
		
		@Test(priority = 3, enabled = true)
		@Title("Verifying amazon intertstitial Slot Id for maps details prerold ad call")
		public void Smoke_Test_amazon_slotId_mapsdetails_Interstitial_preload_adcall() throws Exception {
			System.out.println(
					"================= Verifying amazon intertstitial Slot Id for maps details preload adcal test case Started =========================");

			logStep(" Verifying amazon intertstitial Slot Id for maps details preload ad cal");
			Functions.get_Interstitial_aaxcal_map_details();
			System.out
					.println("================= Verifying amazon intertstitial Slot Id for maps details preload ad cal test csase End =========================");

		}
		
		
		@Test(priority = 4, enabled = true)
		@Title("Verifying amazon intertstitial Slot Id for daily details preload ad call")
		public void Smoke_Test_amazon_slotId_Dailydetails_Intertstitial_preload_adcall() throws Exception {
			System.out.println(
					"================= Verify amazon intertstitial slot id for Daily details  preload adcall test case Started =========================");
			logStep("Verify amazon intertstitial slot id for Daily details  preload adcall");
			Functions.get_Intertstitial_aaxcal_Daily1();
			Thread.sleep(80000);
			System.out.println(
					"================= Verify amazon intertstitial slot id for Daily details  preload adcall test case  End =========================");
		}
		
		
		@Test(priority = 5, enabled = true)
		@Title("Verifying amazon intertstitial Slot Id for video details preload ad call")
		public void Smoke_Test_amazon_slotId_Videodetails_Intertstitial_preload_adcall() throws Exception {
			System.out.println(
					"================= Verify amazon intertstitial slot id for Video details  preload adcall test case Started =========================");
			logStep("Verify amazon intertstitial slot id for Video details  preload adcall");
			Functions.get_Intertstitial_aaxcal_video_details() ;
			System.out.println(
					"================= Verify amazon intertstitial slot id for Video details  preload adcall test case  End =========================");
		}
		
		

		@Test(priority = 6, enabled = true)
		@Title("Verifying amazon intertstitial Slot Id for maps details nomal ad call")
		public void Smoke_Test_amazon_slotId_mapsdetails_Interstitial_normal_adcall() throws Exception {
			System.out.println(
					"================= Verifying amazon intertstitial Slot Id for maps details normal adcal test case Started =========================");

			logStep(" Verifying amazon intertstitial Slot Id for maps details normal ad cal");
			proxy.clearCharlesSession();
			AppiumFunctions.clickOnMaps();
			this.proxy.getXml();
			Functions.get_Interstitial_aaxcal_map_details();
			System.out
					.println("================= Verifying amazon intertstitial Slot Id for maps details normal ad cal test csase End =========================");

		}

		
		
		@Test(priority = 7, enabled = true)
		@Description("Verify Hourly Details ad call amazon bid id")
		public void Verify_Hourly_Details_ad_call_amazon_bid_id() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Hourly Details ad call amazon bid id ====================");
			
			AppiumFunctions.click_hourly_element();
			attachScreen();
			System.out.println("****** Hourly Details ad call amazon bid id validation Started");
			logStep("****** Hourly Details ad call amazon bid id validation Started");
			Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly", true);
		}
		
		
		
	
	
	
}

	

