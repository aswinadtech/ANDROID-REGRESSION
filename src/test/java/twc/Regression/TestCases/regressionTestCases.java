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



		
//@Test(priority = 1, enabled = true)
//	@Description("Enable optout of sale for Criteo SDK Validation")
//	public void verify_enabling_optout_of_sale_for_Criteo_SDK() throws Exception {
	/*	System.out.println("==============================================");
		System.out.println("****** Navigating to Privacy Card to enable optout ");
		logStep("Navigating to Privacy Card to enable optout ");
		proxy.clearCharlesSession();
		//AppiumFunctions.LaunchAppWithFullReset();
		//  AppiumFunctions.SwipeUp_Counter_privacy(25);
		System.out.println("****** Enable optout feature ");
		logStep("Enable optout feature ");
		//  Functions.selecting_opt_out_mode(); 
		proxy.getXml();
		proxy.clearCharlesSession();
		System.out.println("Kill and Launching the app after optout is selected");
		logStep("Kill and Launching the app after optout is selected");
	//	 AppiumFunctions.Kill_Launch_App();  
		// AppiumFunctions.Kill_Launch_App();  
		proxy.clearCharlesSession();
		// AppiumFunctions.Kill_Launch_App();  
		Thread.sleep(5000);
		proxy.getXml();*/
	//	CharlesFunctions.createXMLFileForCharlesSessionFile();

	//}
	
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
AppiumFunctions.enterRequiredUserGroup("criteo");
Ad.runAppInBackground(30);
//Ad.launchApp();
AppiumFunctions.Kill_Launch_App();
AppiumFunctions.ClickonIUnderstand();
AppiumFunctions.enablingBranch("criteo");
Ad.runAppInBackground(30);
AppiumFunctions.Kill_Launch_App();
AppiumFunctions.enablingResponsiveMode();
Ad.runAppInBackground(30);
AppiumFunctions.Kill_Launch_App();
AppiumFunctions.Kill_Launch_App();
AppiumFunctions.Kill_Launch_App();
proxy.clearCharlesSession();
AppiumFunctions.Kill_Launch_App();
AppiumFunctions.Kill_Launch_App();
Thread.sleep(15000);
AppiumFunctions.enter_requiredLocation("New York City");
Thread.sleep(15000);
AppiumFunctions.clickOnAlertsbell();
Thread.sleep(5000);
AppiumFunctions.clickOnBackArrowElement();
Thread.sleep(10000);
AppiumFunctions.SwipeUp_Counter_feedcards(35);
AppiumFunctions.click_hourly_element();
attachScreen();
Thread.sleep(5000);
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	AppiumFunctions.Swipe_feed();
	attachScreen();
	Thread.sleep(5000);
	AppiumFunctions.clickdailydetails();
	//AppiumFunctions.Kill_Launch_App();
	Thread.sleep(10000);
	//AppiumFunctions.clickdailydetails();
	//Thread.sleep(5000);
	attachScreen();
	
	 AppiumFunctions.clickdailymaps();
		attachScreen();
		Thread.sleep(20000);

		Thread.sleep(5000);

  // AppiumFunctions.gettingApkVersion() ;
Thread.sleep(15000);
		this.proxy.getXml();
		CharlesFunctions.createXMLFileForCharlesSessionFile();
	}
	
	
/* =======================================all feed ad calls test cases started======================================================================================*/
	
	/*@Test(priority = 0, enabled = true)
	@Title("Verifying Home screen marquee ad call on FTL")
	public void Smoke_Test_CaseVerify_Homescreen_marquee_adCall_FTL() throws Exception {
		System.out.println(
				"================= verifying iu value for home screen marquee test case started =========================");	
		System.out.println("going to all detail and content pages");
		logStep("going to all detail and content pages");
		//AppiumFunctions.LaunchAppWithFullReset();
		Thread.sleep(10000);
		AppiumFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
	AppiumFunctions.SwipeUp_Counter_feedcards(35);

		this.proxy.getXml();
		CharlesFunctions.archive_folder("Charles");
		CharlesFunctions.createXMLFileForCharlesSessionFile();
	//	Functions.finding_Homescreen_marquee_iu_value();
		System.out.println(
				"================= verifying iu value for home screen marquee test case End =========================");
	}*/
	
	
	
	
	@Test(priority = 0, enabled = true)
	@Description("Verify homescreen hourly ad call amazon bid id")
	public void Verify_homescreen_hourly_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== homescreen hourly ad call amazon bid id ====================");

		System.out.println("****** homescreen hourly ad call amazon bid id validation Started");
		logStep("****** homescreen hourly ad call amazon bid id validation Started");
		CharlesFunctions.createXMLFileForCharlesSessionFile();
		Functions.validate_aax_bid_value_with_gampad_bid_value("Pulltorefresh", true);
		//Functions.verifyAAX_SlotId("Pulltorefresh");
	}
	
	
	@Test(priority = 1, enabled = true)
	@Description("Verify Feed1 ad call amazon bid id")
	public void Verify_Feed1_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed1 ad call amazon bid id ====================");

		System.out.println("****** Feed1 ad call amazon bid id validation Started");
		logStep("****** Feed1 ad call amazon bid id validation Started");
	  Functions.validate_aax_bid_value_with_gampad_bid_value("Feed1", true);
		//Functions.verifyAAX_SlotId("Feed1");
	}
	
	
	
	@Test(priority = 2, enabled = true)
	@Description("Verify Feed2 ad call amazon bid id")
	public void Verify_Feed2_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed2 ad call amazon bid id ====================");
		System.out.println("****** Feed2 ad call amazon bid id validation Started");
		logStep("****** Feed2 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Feed2", true);
	}
	
	@Test(priority = 3, enabled = true)
	@Description("Verify Feed3 ad call amazon bid id")
	public void Verify_Feed3_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed3 ad call amazon bid id ====================");

		System.out.println("****** Feed3 ad call amazon bid id validation Started");
		logStep("****** Feed3 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Feed3", true);
	}
	
	
	@Test(priority = 4, enabled = true)
	@Description("Verify Feed4 ad call amazon bid id")
	public void Verify_Feed4_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed4 ad call amazon bid id ====================");

		System.out.println("****** Feed4 ad call amazon bid id validation Started");
		logStep("****** Feed4 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Feed4", true);
	}
	
	
	
	
	@Test(priority = 5, enabled = true)
	@Description("Verify Hourly Details ad call amazon bid id")
	public void Verify_Hourly_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly Details ad call amazon bid id ====================");

		System.out.println("****** Hourly Details ad call amazon bid id validation Started");
		logStep("****** Hourly Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly", true);
	}
	
	
	@Test(priority = 6, enabled = true)
	@Description("Verify Hourly interstials Details ad call amazon bid id")
	public void Verify_Hourly_interstitial_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly Interstitial Details ad call amazon bid id ====================");

		System.out.println("****** Hourly Interstitial Details ad call amazon bid id validation Started");
		logStep("****** Hourly Interstitial Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly(Interstitial)", true);
	}
	
	@Test(priority = 7, enabled = true)
	@Description("Verify Hourly1 Details ad call amazon bid id")
	public void Verify_Hourly1_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly1 Details ad call amazon bid id ====================");

		System.out.println("****** Hourly1 Details ad call amazon bid id validation Started");
		logStep("****** Hourly1 Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly1", true);
	}
	
	
	@Test(priority = 8, enabled = true)
	@Description("Verify Hourly2 Details ad call amazon bid id")
	public void Verify_Hourly2_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly2 Details ad call amazon bid id ====================");

		System.out.println("****** Hourly2 Details ad call amazon bid id validation Started");
		logStep("****** Hourly2 Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly2", true);
	}
	
	@Test(priority = 9, enabled = true)
	@Description("Verify Hourly3 Details ad call amazon bid id")
	public void Verify_Hourly3_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly3 Details ad call amazon bid id ====================");

		System.out.println("****** Hourly1 Details ad call amazon bid id validation Started");
		logStep("****** Hourly3 Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly3", true);
	}
	
	
	
	
	@Test(priority = 10, enabled = true)
	@Description("Verify Daily Details ad call amazon bid id")
	public void Verify_Daily_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Daily Details ad call amazon bid id ====================");

		System.out.println("****** Daily Details ad call amazon bid id validation Started");
		logStep("****** Daily Details ad call amazon bid id validation Started");
Functions.validate_aax_bid_value_with_gampad_bid_value("Daily(10day)", true);
	}
	
	
	@Test(priority = 11, enabled = true)
	@Description("Verify Daily Details  Interstials ad call amazon bid id")
	public void Verify_Daily_Details_Interstitial_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Daily Details Interstitial ad call amazon bid id ====================");

		System.out.println("****** Daily Details Interstitial ad call amazon bid id validation Started");
		logStep("****** Daily Details  Interstitial ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Daily(10day Interstitial)", true);
	}

	@Test(priority = 12, enabled = true)
	@Description("Verify Map Details ad call amazon bid id")
	public void Verify_Map_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Map Details ad call amazon bid id ====================");

		System.out.println("****** Map Details ad call amazon bid id validation Started");
		logStep("****** Map Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Map", true);
	}
	
	
	
	@Test(priority = 13, enabled = true)
	@Description("Verify Map Details ad call amazon bid id")
	public void Verify_Map_Details_Interstitial_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Map Details Interstitial ad call amazon bid id ====================");

		System.out.println("****** Map Details Interstitial ad call amazon bid id validation Started");
		logStep("****** Map Details  Interstitial ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Map(Interstitial)", true);
	}
	
	
	@Test(priority = 14, enabled = true)
	@Description("Verify Today Details ad call amazon bid id")
	public void Verify_Today_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Today Details ad call amazon bid id ====================");

		System.out.println("****** Today Details ad call amazon bid id validation Started");
		logStep("****** Today Details ad call amazon bid id validation Started");
	Functions.validate_aax_bid_value_with_gampad_bid_value("Today", true);
	}
	
	
	
	@Test(priority = 15, enabled = true)
	@Description("Verify AQ Details ad call amazon bid id")
	public void Verify_AQ_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== AQ Details ad call amazon bid id ====================");

		System.out.println("****** AQ Details ad call amazon bid id validation Started");
		logStep("****** AQ Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Air Quality(Content)", true);
	}
	
	
	
	
	@Test(priority = 16, enabled = true)
	@Description("Verify amazon aax AlertCenter ad call")
	public void Verify_amazon_aax_AlertCenter_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax AlertCenter ad call ====================");

		System.out.println("****** amazon aax AlertCenter ad call validation Started");
		logStep("****** amazon aax AlertCenter ad call validation Started");

		// Functions.verifyAAX_SlotId("Smoke", "Daily(10day)");
		Functions.verifyAAX_SlotId("MyAlerts");

	}

	@Test(priority = 17, enabled = true)
	@Description("Verify AlertCenter ad call amazon bid id")
	public void Verify_AlertCenter_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== AlertCenter ad call amazon bid id ====================");

		System.out.println("****** AlertCenter ad call amazon bid id validation Started");
		logStep("****** AlertCenter ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("MyAlerts", true);

	}
	
	
	
	


	@Test(priority = 19, enabled = true)
	@Description("Verify Health Boat & Beach Details ad call amazon bid id")
	public void Verify_Health_BoatAndBeach_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Health Boat & Beach Details ad call amazon bid id ====================");

		System.out.println("****** Health Boat & Beach Details ad call amazon bid id validation Started");
		logStep("****** Health Boat & Beach Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Health(boatAndBeach)", true);
	}

	
	


	@Test(priority = 21, enabled = true)
	@Description("Verify Health Running Details ad call amazon bid id")
	public void Verify_Health_Running_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Health Running Details ad call amazon bid id ====================");

		System.out.println("****** Health Running Details ad call amazon bid id validation Started");
		logStep("****** Health Running Details ad call amazon bid id validation Started");
		CharlesFunctions.archive_folder("Charles");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Health(goRun)", true);
	}
	
	
	
	
	
	@Test(priority = 22, enabled = true)
	@Description("Verify amazon video bid id's")
	public void Verify_amazon_video_adcall_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon video ad call bid id's ====================");

		System.out.println("****** amazon video ad call bid id validation Started");
		logStep("****** amazon video ad call bid id validation Started");
		proxy.clearCharlesSession();
		AppiumFunctions.Kill_launch();
		Functions.load_amazon_bid_values_from_aaxCalls("PreRollVideo", true);
		proxy.clearCharlesSession();
		Appium
		this.proxy.getXml();
		CharlesFunctions.createXMLFileForCharlesSessionFile();
	Functions.get_iu_value_of_Feedcall("PreRollVideo");
Functions.validate_aax_bid_value_with_gampad_bid_value("PreRollVideo", false);
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
}

	

