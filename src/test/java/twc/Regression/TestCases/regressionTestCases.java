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
//AppiumFunctions.Kill_Launch_App();
Thread.sleep(15000);
		AppiumFunctions.gettingApkVersion();
AppiumFunctions.enter_requiredLocation("New York City");
Thread.sleep(15000);
//AppiumFunctions.clickOnAlertsbell();
//Thread.sleep(5000);
//AppiumFunctions.clickOnBackArrowElement();
//Thread.sleep(10000);
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
	Thread.sleep(15000);
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
	
	
	

	@Test(priority = 12, enabled = true)
	@Description("Verify Map Details ad call amazon bid id")
	public void Verify_Map_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Map Details ad call amazon bid id ====================");

		System.out.println("****** Map Details ad call amazon bid id validation Started");
		logStep("****** Map Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Map", true);
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

		@Test(priority = 20, enabled = true)
	@Description("Verify amazon aax Seasonal Hub Details ad call")
	public void Verify_amazon_aax_SeasonalHub_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax Seasonal Hub Details ad call ====================");

		System.out.println("****** amazon aax Seasonal Hub Details ad call validation Started");
		logStep("****** amazon aax Seasonal Hub Details ad call validation Started");

		// Functions.verifyAAX_SlotId("Smoke", "Daily(10day)");
		Functions.validate_aax_bid_value_with_gampad_bid_value("SeasonalHub(Details)", true);

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
	
	
	
	

	
	
	@Test(priority = 101, enabled = true)
	@Description("Verify Criteo SDK inapp v2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK inapp/v2 call ====================");

		System.out.println("****** Criteo SDK inapp/v2 call validation Started");
		logStep("****** Criteo SDK inapp/v2 call validation Started");

	Functions.verifyCriteo_inapp_v2_Call("Criteo");
	//Functions.verifyCriteo_inapp_v2_Call("Criteo", false);

	}
	
	
	
	@Test(priority = 102, enabled = true)
	@Description("Verify Criteo SDK config app call")
	public void Verify_Criteo_SDK_config_app_Call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK config/app call ====================");

		System.out.println("****** Criteo SDK config/app call validation Started");
		logStep("****** Criteo SDK config/app call validation Started");

	Functions.verifyCriteo_config_app_Call( "Criteo");

	//Functions.verifyCriteo_config_app_Call("Criteo", false);
	}
	
	@Test(priority = 103, enabled = true)
	@Description("Validating 'cpId' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_cpId_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'cpId' parameter of Criteo SDK config app call");
		logStep("****** Validating 'cpId' parameter of Criteo SDK config app call");
		Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "cpId", "B-051673");

	}
	@Test(priority = 104, enabled = true)
	@Description("Validating 'bundleId' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_bundleId_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'bundleId' parameter of Criteo SDK config app call");
		logStep("****** Validating 'bundleId' parameter of Criteo SDK config app call");
		Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "bundleId", "com.weather.Weather");

	}
	
	@Test(priority = 105, enabled = true)
	@Description("Validating 'sdkVersion' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_sdkVersion_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
		logStep("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
		Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "sdkVersion", "3.10.1");

	}
	
	
	
	
	
	@Test(priority = 106, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with homescreen hourly call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_homescreen_hourly_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  homescreen hourly call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call cpm parameter with  homescreen hourly call validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with homescreen hourly call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Pulltorefresh", "cpm",true);
	}

	@Test(priority = 107, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with homescreen hourly call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_homescreen_hourly_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with homescreen hourly call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call size parameter with homescreen hourly call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with homescreen hourly call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Pulltorefresh", "size",true);
	}

	@Test(priority = 108, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with homescreen today call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_homescreen_hourly_gampad_call()
			throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with homescreen hourly call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with homescreen hourly call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with homescreen hourly call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Pulltorefresh","displayUrl", true);
	}

	
	
	
	

	

	
	@Test(priority = 109, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed1 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed1_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed1 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed1 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed1 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "cpm", true);
	}

	@Test(priority = 110, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed1 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed1_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed1 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed1 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed1 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "size", true);
	}

	@Test(priority = 111, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed1 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed1_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed1 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed1 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed1 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "displayUrl",true);
	}
	
	
	
	
	
	@Test(priority = 112, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed2_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed2 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed2 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed2 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed2", "cpm", true);
	}

	@Test(priority = 113, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed2_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed2 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed2 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed2 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed2", "size", true);
	}

	@Test(priority = 114, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed2_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed2 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed2 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed2 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed2", "displayUrl",true);
	}
	
	
	@Test(priority = 115, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed3 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed3_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed3 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed3 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed3 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed3", "cpm", true);
	}

	@Test(priority = 116, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed3 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed3_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed3 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed3 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed3 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed3", "size", true);
	}

	@Test(priority = 117, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed3 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed3_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed3 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed3 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed3 call validation Started");
		AppiumFunctions.clickOnVideotab();
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed3", "displayUrl",true);
	}

	
	
	
	@Test(priority = 118, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed4 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed4_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed4 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed4 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed4 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Feed4", "cpm", true);
	}

	@Test(priority = 119, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed4 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed4_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed4 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed4 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed4 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed4", "size", true);
	}

	@Test(priority = 120, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed4 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed4_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed4 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed4 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed4 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed4", "displayUrl",true);
	}
	
	
	
	@Test(priority = 121, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed5 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed5_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed5 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed5 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed5 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Feed5", "cpm", true);
	}

	@Test(priority = 122, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed5 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed5_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed5 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed5 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed5 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Feed5", "size", true);
	}

	@Test(priority = 123, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed5 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed5_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed5 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed5 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed5 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed5", "displayUrl",true);
	}
	
	
	
	@Test(priority = 124, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK invapp v2 call cpm parameter ====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly Details validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly Details validation Started");
	
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "cpm", true);
	}
	
	@Test(priority = 126, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly Details validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter of Hourly Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "size", true);
	}
	@Test(priority = 127, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly_details_gampad_call()
			throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly Details validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly Details validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "displayUrl",true);
	}
	
	
	
	
	
	
	
	
	
	@Test(priority = 128, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Map Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_map_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK invapp v2 call cpm parameter ====================");
		System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Map Details validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter of Map Details validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Map", "cpm", true);
	}
	
	
	@Test(priority = 129, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Map Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_map_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter of Map Details validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter of Map Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Map", "size", true);
	}
	

	@Test(priority = 130, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Map Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_map_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Map Details validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Map Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Map", "displayUrl", true);
	}
	
	
	@Test(priority = 131, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Daily Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_daily_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with Daily details call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with Daily Details call validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");
	//	Functions.verifyingdailydetailiuu();
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Daily(10day)", "cpm",true);
	}

	@Test(priority = 132, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with daily Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_daily_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Daily details call====================");

		System.out
				.println("****** Criteo SDK invapp v2 call size parameter with Daily details call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Daily details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Daily(10day)", "size",true);
	}

	@Test(priority = 133, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Daily Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_daily_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Daily details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with Daily details call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Daily details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Daily(10day)","displayUrl", true);
	}
	
	
	
	
	
	@Test(priority = 134, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Today Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_today_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with Today details call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Today", "cpm", true);
	}

	@Test(priority = 135, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Today Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_today_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Today details call====================");

		System.out
				.println("****** Criteo SDK invapp v2 call size parameter with Today details call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Today details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Today", "size", true);
	}

	@Test(priority = 136, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Today Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_today_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Today details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with Today details call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Today details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Today", "displayUrl",true);
	}

	
	
	
	
	
	@Test(priority = 137, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with AQ Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_aq_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with aq details call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with aq details call validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with aq details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Air Quality(Content)","cpm", true);
	}

	@Test(priority = 138, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with AQ Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_aq_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with aq details call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with aq details call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with aq details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Air Quality(Content)", "size", true);
	}

	@Test(priority = 139, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with AQ Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_aq_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with aq details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with aq details call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with aq details call validation Started");
			CharlesFunctions.archive_folder("Charles");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Air Quality(Content)","displayUrl", true);
	}
	
	
	
	
	
	@Test(priority = 140, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Seasonal Hub Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_SeasonalHub_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with Seasonal Hub details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call cpm parameter with Seasonal Hub details call validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Seasonal Hub details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("SeasonalHub(Details)", "cpm", true);
	}

	@Test(priority = 141, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Seasonal Hub Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_SeasonalHub_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Seasonal Hub details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call size parameter with Seasonal Hub details call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Seasonal Hub details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("SeasonalHub(Details)","size", true);
	}

	@Test(priority = 142, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Seasonal Hub Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_SeasonalHub_details_gampad_call()
			throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Seasonal Hub details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with Seasonal Hub details call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Seasonal Hub details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("SeasonalHub(Details)","displayUrl", true);
	}

	
	

	@Test(priority = 143, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with boatAndBeach Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_boatAndBeach_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with boatAndBeach Details call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter of boatAndBeach Details validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter of boatAndBeach Details validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(boatAndBeach)","cpm", true);
	}

	@Test(priority = 144, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with boatAndBeach Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_boatAndBeach_details_gampad_call()
			throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with boatAndBeach Details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call size parameter with boatAndBeach Details call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with boatAndBeach Details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(boatAndBeach)","size", true);
	}

	@Test(priority = 145, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with boatAndBeach Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_boatAndBeach_details_gampad_call()
			throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with boatAndBeach Details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with boatAndBeach Details call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with boatAndBeach Details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Health(boatAndBeach)","displayUrl", true);
	}


	
	@Test(priority = 146, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Running Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Running_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with Running Details call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Running Details validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter of Running Details validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Health(goRun)", "cpm",true);
	}

	@Test(priority = 148, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Running Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Running_details_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Running Details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call size parameter with Running Details call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Running Details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(goRun)", "size",true);
	}

	@Test(priority = 149, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Running Details call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Running_details_gampad_call()
			throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Running Details call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with Running Details call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Running Details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(goRun)","displayUrl", true);
	}
	
	
	
	
	
	
	
	
		// video ad call custum parameters
	/*@Test(priority = 1000)
		@Title("Verify custom parameter cmsid")
		public void C344257_Verify_Video_Url_Parameter_cmsid() throws Exception {
			System.out.println("================= Custom Parameter Cmsid Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("cmsid");
			System.out.println("================= Custom Parameter Cmsid Verfication End =========================");
		}

		@Test(priority = 1003)
		@Title("Verify custom parameter ttid")
		public void C344258_Verify_Video_Url_Parameter_ttid() throws Exception {
			System.out.println("================= Custom Parameter Ttid Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("ttid");
			System.out.println("================= Custom Parameter Ttid Verfication End =========================");
		}

		@Test(priority = 1006)
		@Title("Verify custom parameter lnid")
		public void C344260_Verify_Video_Url_Parameter_lnid() throws Exception {
			System.out.println("================= Custom Parameter Lnid Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("lnid");
			System.out.println("================= Custom Parameter Lnid Verfication End =========================");
		}

		@Test(priority = 1009)
		@Title("Verify custom parameter vid")
		public void C344259_Verify_Video_Url_Parameter_vid() throws Exception {
			System.out.println("================= Custom Parameter Vid Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("vid");
			System.out.println("================= Custom Parameter Vid Verfication End =========================");
		}

		@Test(priority = 1010)
		@Title("Verify video ad call custom parameter iu")
		public void C344261_Verify_Video_Url_Parameter_iu() throws Exception {
			System.out.println("================= Custom Parameter IU Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("iu");
			System.out.println("================= Custom Parameter IU Verfication End =========================");
		}

		@Test(priority = 1013)
		@Title("Verify Description_url for video call")
		public void C344261_Verify_DescriptionURL_Video() throws Exception {
			System.out.println("================= Verify description URL for video call Started =========================");
			Custom_Parameters_Verification.verify_video_request("description_url");
			System.out.println("================= Verify description URL for video call  End =========================");
		}

		@Test(priority = 1016)
		@Title("Verify Content_url for video call")
		public void C344261_Verify_ContentURL_Video() throws Exception {
			System.out.println("================= Verify Content URL for video call Started =========================");
			Custom_Parameters_Verification.verify_video_request("content_url");
			System.out.println("================= Verify Content URL for video call  End =========================");
		}*/

		// Not null
		@Test(priority = 1019)
		@Title("Verify custom parameter adid")
		public void C333213_Verify_cust_param_adid() throws Exception {
			
			
			System.out.println("================= Custom Parameter adid Verfication Started =========================");
			
			//proxy.clearCharlesSession();
			Ad.resetApp();
                       Thread.sleep(10000);
			AppiumFunctions.Kill_Launch_App();
			Thread.sleep(10000);
			//AppiumFunctions.LaunchAppWithFullReset();
			AppiumFunctions.Kill_Launch_App();
			  Thread.sleep(10000);
			proxy.clearCharlesSession();
			AppiumFunctions.Kill_Launch_App();
			  Thread.sleep(10000);
			AppiumFunctions.SwipeUp_Counter_custparam(6);
                       Thread.sleep(15000);
			AppiumFunctions.click_hourly_element();
			 Thread.sleep(5000);
			AppiumFunctions.click_daily_element();
			 Thread.sleep(10000);
				AppiumFunctions.clickOnVideotab();
			Thread.sleep(10000);
		      this.proxy.getXml();
			Custom_Parameters_Verification.parameters_Verification("adid");
			System.out.println("================= Custom Parameter adid Verfication End =========================");
		}

		@Test(priority = 1021)
		@Title("Verify custom parameter aid")
		public void C333213_Verify_cust_param_aid() throws Exception {
			System.out.println("================= Custom Parameter Aid Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("aid");
			System.out.println("================= Custom Parameter Aid Verfication End =========================");
		}
		
		@Test(priority = 1023)
		@Title("Verify custom parameter ltv")
		public void C333213_Verify_cust_param_ltv() throws Exception {
			System.out.println("================= Custom Parameter adid Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("ltv");
			System.out.println("================= Custom Parameter adid Verfication End =========================");
		}
		/*@Test(priority = 22)
		@Title("Verify custom parameter env")
		public void C333244_Verify_cust_param_env() throws Exception {
			System.out.println("================= Custom Parameter env Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("env");
			System.out.println("================= Custom Parameter env Verfication End =========================");
		}*/


		/*@Test(priority = 23)
		@Title("Verify custom parameter st")
		public void C333219_Verify_cust_param_st() throws Exception {
			System.out.println("================= Custom Parameter St Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("st");
			System.out.println("================= Custom Parameter St Verfication End =========================");
		}*/

		@Test(priority = 1026)
		@Title("Verify custom parameter ord")
		public void C333200_Verify_cust_param_ord() throws Exception {
			System.out.println("================= Custom Parameter ORD Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("ord");
			System.out.println("================= Custom Parameter ORD Verfication End =========================");
		}

		/*@Test(priority = 26)
		@Title("Verify custom parameter rmid")
		public void C333204_Verify_cust_param_rmid() throws Exception {
			System.out.println("================= Custom Parameter Rmid Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("rmid");
			System.out.println("================= Custom Parameter Rmid Verfication End =========================");
		}*/

	@Test(priority = 1029)
		@Title("Verify custom parameter ver")
		public void C333219_Verify_cust_param_ver() throws Exception {
			System.out.println("================= Custom Parameter Ver Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("ver");
			System.out.println("================= Custom Parameter Ver Verfication End =========================");
		}
		

		 /* @Test(priority=29)  
		  @Title("Verify custom parameter ftl") 
		  public void C333215_Verify_cust_param_ftl() throws Exception{ 
			  System.out.println("================= Custom Parameter Ftl Verfication Started =========================" );
		  Custom_Parameters_Verification.parameters_Verification("ftl"); 
		  System.out. println("================= Custom Parameter Ftl Verfication End =========================");  
		  }
		  @Test(priority=30)
		  @Title("Verify custom parameter g") 
		  public void C333236_Verify_cust_param_g()  throws Exception{ 
		 System.out. println("================= Custom Parameter G Verfication Started =========================");
		 Custom_Parameters_Verification.parameters_Verification("g"); 
		 System.out.println("================= Custom Parameter G Verfication End =========================" );
		 }*/


		
		@Test(priority = 1031)
		@Title("Verify custom parameter tf")
		public void C658716_Verify_cust_param_tf() throws Exception {
			System.out.println("================= Custom Parameter Tf Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tf");
			System.out.println("================= Custom Parameter Tf Verfication End =========================");
		}



		
		
	//Hard code values

		@Test(priority = 1033)
		@Title("Verify custom parameter lang")
		public void C658711_Verify_cust_param_lang() throws Exception {
			System.out.println("================= Custom Parameter Lang Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("lang");
			System.out.println("================= Custom Parameter Lang Verfication End =========================");
		}

		@Test(priority = 1036)
		@Title("Verify custom parameter plat")
		public void C658712_Verify_cust_param_plat() throws Exception {
			System.out.println("================= Custom Parameter Plat Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("plat");
			System.out.println("================= Custom Parameter Plat Verfication End =========================");
		}

		@Test(priority = 1039)
		@Title("Verify custom parameter pos")
		public void C333218_Verify_cust_param_pos() throws Exception {
			System.out.println("================= Custom Parameter Pos Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("pos");
			System.out.println("================= Custom Parameter Pos Verfication End =========================");
		}

		@Test(priority = 1041)
		@Title("Verify custom parameter tile")
		public void C333205_Verify_cust_param_tile() throws Exception {
			System.out.println("================= Custom Parameter Tile Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tile");
			System.out.println("================= Custom Parameter Tile Verfication End =========================");
		}

		
		
		
		
		

		// turbo call values
		/*@Test(priority = 60)
		@Title("Verify custom parameter cnd")
		public void C333216_Verify_cust_param_cnd() throws Exception {
			System.out.println("================= Custom Parameter Cnd Verfication Started =========================");
			//Custom_Parameters_Verification.parameters_Verification("cnd");

			System.out.println("================= Custom Parameter Cnd Verfication End =========================");
		}*/

		@Test(priority = 1043)
		@Title("Verify custom parameter ct")
		public void C333212_Verify_cust_param_ct() throws Exception {
			System.out.println("================= Custom Parameter Ct Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("ct");
			System.out.println("================= Custom Parameter Ct Verfication End =========================");
		}

		@Test(priority = 1046)
		@Title("Verify custom parameter dma")
		public void C333203_Verify_cust_param_dma() throws Exception {
			System.out.println("================= Custom Parameter Dma Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("dma");
			System.out.println("================= Custom Parameter Dma Verfication End =========================");
		}

		@Test(priority = 1049)
		@Title("Verify custom parameter dynght")
		public void C628160_Verify_Parameter_DyNght() throws Exception {
			System.out.println("================= Custom Parameter DayNight Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("dynght");
			System.out.println("================= Custom Parameter DayNight Verfication End =========================");
		}

		@Test(priority = 1051)
		@Title("Verify custom parameter cc")
		public void C333209_Verify_cust_param_cc() throws Exception {
			System.out.println("================= Custom Parameter Cc Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("cc");
			System.out.println("================= Custom Parameter Cc Verfication End =========================");
		}

		/*@Test(priority = 65)
		@Title("Verify custom parameter fhic")
		public void C333232_Verify_cust_param_fhic() throws Exception {
			System.out.println("================= Custom Parameter Fhic Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("fhic");
			System.out.println("================= Custom Parameter Fhic Verfication End =========================");
		}*/

		/*@Test(priority = 66)
		@Title("Verify custom parameter floc")
		public void C333238_Verify_cust_param_floc() throws Exception {
			System.out.println("================= Custom Parameter Floc Verfication Started =========================");
		//	Custom_Parameters_Verification.parameters_Verification("floc");
			System.out.println("================= Custom Parameter Floc Verfication End =========================");
		}*/

		@Test(priority = 1054)
		@Title("Verify custom parameter tmp")
		public void C333208_Verify_cust_param_tmp() throws Exception {
			System.out.println("================= Custom Parameter Tmp Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tmp");
			System.out.println("================= Custom Parameter Tmp Verfication End =========================");
		}

		@Test(priority = 1057)
		@Title("Verify custom parameter tmpr")
		public void C333217_Verify_cust_param_tmpr() throws Exception {
			System.out.println("================= Custom Parameter Tmpr Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tmpr");
			System.out.println("================= Custom Parameter Tmpr Verfication End =========================");
		}

		@Test(priority = 1059)
		@Title("Verify custom parameter tmpc")
		public void C333239_Verify_cust_param_tmpc() throws Exception {
			System.out.println("================= Custom Parameter Tmpc Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tmpc");
			System.out.println("================= Custom Parameter Tmpc Verfication End =========================");
		}

		@Test(priority = 1061)
		@Title("Verify custom parameter zip from  turbo api")
		public void C333202_Verify_cust_param_zip() throws Exception {
			System.out.println(
					"================= Custom Parameter Zip Verfication  from turbo call Started =========================");
			Custom_Parameters_Verification.parameters_Verification("zip");

			System.out.println(
					"================= Custom Parameter Zip Verfication  from turbo call End =========================");
		}
		
		/*@Test(priority=73) 
		  @Title("Verify custom parameter hmid") 
	public void  C333207_Verify_cust_param_hmid() throws Exception{ 
		  System.out.println("================= Custom Parameter Hmid Verfication Started =========================");
		  Custom_Parameters_Verification.parameters_Verification("hmid"); 
		  System.out.println("================= Custom Parameters Hmid Verfication End =========================" );
		  }*/

		@Test(priority = 1063)
		@Title("Verify custom parameter wind")
		public void C333221_Verify_cust_param_wind() throws Exception {
			System.out.println("================= Custom Parameter Wind Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("wind");
			System.out.println("================= Custom Parameter Wind Verfication End =========================");
		}

		@Test(priority = 1065)
		@Title("Verify custom parameter uv")
		public void C333224_Verify_cust_param_uv() throws Exception {
			System.out.println("================= Custom Parameter Uv Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("uv");
			System.out.println("================= Custom Parameter Uv Verfication End =========================");
		}

		@Test(priority = 1069)
		@Title("Verify custom parameter fltmpc")
		public void C333232_Verify_cust_param_fltmpc() throws Exception {
			System.out.println("================= Custom Parameter fltmpc Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("fltmpc");
			System.out.println("================= Custom Parameter fltmpc Verfication End =========================");
		}

	
		
		
		
		@Test(priority = 1073)
		@Title("Verify custom parameter wfxtg")
		public void C333228_Verify_cust_param_wfxtg() throws Exception {
			System.out.println("================= Custom Parameter Wfxtg Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("wfxtg");
			System.out.println("================= Custom Parameter Wfxtg Verfication End =========================");
			
		}
	
	
		  @Test(priority =1076, enabled = true) 
	  @Title("Verifying IM Cust param value for home screen marquee ad all" )
	  public void Smoke_Test_Verifying_IM_Cust_Param_homescreen_marquee_adCall() throws Exception {
		 System.out.println("================= Verifying IM CUST_PARAM value for home screen marquee call  started =========================");
		 Functions.validate_IM_Cust_param_homescreenmarquee();
		 System.out.println("================= Verifying SOD CUST_PARAM value for home screen IM call  End =========================");
		 }
	  
	  
	  @Test(priority = 1079, enabled = true) 
	  @Title("Verifying SlotName Cust param value for home screen marquee ad all" )
	  public void Smoke_Test_Verifying_SlotName_Cust_Param_homescreen_marquee_adCall() throws Exception {
		 System.out.println("================= Verifying SlotName CUST_PARAM value for home screen marquee call  started =========================");
		 Functions.validate_SlotName_Cust_param_homescreenmarquee();
		 System.out.println("================= Verifying SlotName  CUST_PARAM value for home screen IM call  End =========================");
		 }
	  
	  @Test(priority = 1081, enabled = true) 
	  @Title("Verifying SlotName Cust param value for home screen hourly ad all" )
	  public void Smoke_Test_Verifying_SlotName_Cust_Param_homescreen_hourly_adCall() throws Exception {
		 System.out.println("================= Verifying SlotName CUST_PARAM value for home screen hourly call  started =========================");
		 Functions.validate_SlotName_Cust_param_homescreenhourly();
		 System.out.println("================= Verifying SlotName  CUST_PARAM value for home screen hourly call  End =========================");
		 }
	
	  @Test(priority = 1085, enabled = true) 
	  @Title("Verifying SlotName Cust param value for feed_1 ad all" )
	  public void Smoke_Test_Verifying_SlotName_Cust_Param_feed_1_adCall() throws Exception {
		 System.out.println("================= Verifying SlotName CUST_PARAM value for feed_1 ad call  started =========================");
		 Functions.validate_SlotName_Cust_param_feed1();
		  CharlesFunctions.archive_folder("Charles");
		 System.out.println("================= Verifying SlotName  CUST_PARAM value for feed_1 ad  call  End =========================");
		 }
	
	
	
		@Test(priority = 3000, enabled = true)
	@Title("Verifying daily integrated details ad call iu value")
	public void Smoke_Test_Verify_DailyDetails_Integratedadcall_iu() throws Exception {
		System.out.println("================= Verifying daily detials integrated ad call test case Started =========================");	
		System.out.println("Verifying daily details integrated ad call test case Started");
		//logStep("Verifying daily details integrated ad call test case started");
		Thread.sleep(5000);
		Ad.resetApp();
		Thread.sleep(10000);
		AppiumFunctions.enterRequiredUserGroup("AdsTestAdUnitOnly");
		Ad.runAppInBackground(10);
		//Ad.launchApp();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.ClickonIUnderstand();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.enablingResponsiveMode();
		Ad.runAppInBackground(10);
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		AppiumFunctions.click_daily_element();
		proxy.clearCharlesSession();	
		AppiumFunctions.enter_requiredLocation("30124");
		Thread.sleep(10000);
		this.proxy.getXml();
		 Functions.verifyingdailydetailiu();
		
		System.out.println("================= Verifying daily detials integrated ad call test case End =========================");
	}
	
	
	@Test(priority = 3002, enabled = true)
	@Title("Verifying daily details integrated ad call size")
	public void Smoke_Test_Verify_DailyDetails_Integratedadcall_Size() throws Exception {
		System.out.println("================= Verifying daily detials integrated ad call size test case Started =========================");	
		 Functions.validate_Size_dailydetails_integratedad();
		
		System.out.println("================= Verifying daily detials integrated ad call size test case End =========================");
	}
	
	
	
	
	@Test(priority = 3004, enabled = true)
	@Title("Verifying daily  integrated details ad call response")
	public void Smoke_Test_Verify_IDD_DailyDetails_Response() throws Exception {
		System.out.println("================= Verifying dailetials integrated daily details ad call response test case Started =========================");	
	
		Functions.dailydetailsintegrated_adcall_response();
		System.out.println("================= Verifying daily detials integrated daily details ad call response test case  End =========================");
	}
	
	@Test(priority = 3006, enabled = true)
	@Title("Verifying daily  integrated details FG  assest call URL")
	public void Smoke_Test_Verify_DailyIntegratedDetails_FG_Assest_URL() throws Exception {
		System.out.println("================= Verifying daily detials integrated FG assest url  test case Started =========================");	
		  Functions. validate_FG_adcall_IDD();
		
		System.out.println("================= Verifying daily detials integrated FG assest url test case End =========================");
	}
	
	
	@Test(priority = 3008, enabled = true)
	@Title("Verifying daily  integrated details BG assest  call URL")
	public void Smoke_Test_Verify_DailyIntegratedDetails_BG_Assest_URL() throws Exception {
		System.out.println("================= Verifying daily detials integrated BG assest url  test case Started =========================");	
		CharlesFunctions.archive_folder("Charles");
		Functions.validate_BG_adcall_IDD();
		
		System.out.println("================= Verifying daily detials integrated BG assest url  test case End =========================");
	}
	









	
	
	/**
	 * @throws Exception This Script Validate NextGen IM Ad and its parameters
	 */
	@Test(priority = 3010, enabled = true)
	@Description("Validating NextGen IM Static Ad when app in test mode")
	public void Validate_NextGenIM_StaticAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad in test mode");
		logStep("Validating NextGen IM Static Ad in test mode ");
		Ad.resetApp();
		Thread.sleep(15000);
		AppiumFunctions.enterRequiredUserGroup("AdsTestAdUnitOnly");
		Ad.runAppInBackground(10);
		//Ad.launchApp();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.ClickonIUnderstand();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.enablingResponsiveMode();
		Ad.runAppInBackground(10);
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();	
		AppiumFunctions.enter_requiredLocation("30124");
		Thread.sleep(15000);
		this.proxy.getXml();
		Functions.finding_Homescreen_marquee_iu();
		
		
		
	}

	/**
	 * @throws Exception This Script Validate NextGen IM Ad response
	 */
	@Test(priority = 3012, enabled = true)
	@Description("Validating NextGen IM Static Ad response when app in test mode")
	public void Validate_NextGenIM_StaticAd_response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad response in test mode");
		logStep("Validating NextGen IM Static Ad response in test mode ");
		Functions.NextGenIm_adcall_response();
		

	}

	/**
	 * @throws Exception This Script Validate NextGen IM Ad and its parameters
	 */

	@Test(priority = 3014, enabled = true)

	@Description("Validating NextGen IM Static Ad BackGround Asset Call")
	public void Validate_NextGenIM_StaticAd_bgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad BG Asset Call");
		logStep("Validating NextGen IM Static Ad BG Asset Call ");
		Functions.validate_BG_adcall_NextGenIM();
		
		

	}

	/**
	 * @throws Exception This Script Validate NextGen IM Ad and its parameters
	 */

	@Test(priority = 3016, enabled = true)
	@Description("Validating NextGen IM Static Ad ForeGround Asset Call")
	public void Validate_NextGenIM_StaticAd_fgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad FG Asset Call");
		logStep("Validating NextGen IM Static Ad FG Asset Call ");
		  Functions.validate_FG_adcall_NextImad() ;

	}

	@Test(priority = 3018, enabled = true)
	@Description("Validating NextGen IM Static Ad sz parameter")
	public void Validate_NextGenIM_StaticAd_Size() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad sz parameter in charles");
		logStep("Validating NextGen IM Static Ad sz parameter in charles ");
		 	CharlesFunctions.archive_folder("Charles");
		Functions.validate_Size_iNextGenIM();
	
		
       
	}
	
	
	

	@Test(priority = 3020, enabled = true)
	@Description("Validating NextGen IM Video Ad and its Parameters when app in test mode")
	public void Validate_NextGenIM_VideoAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad in test mode");
		logStep("Validating NextGen IM Video Ad in test mode ");
		System.out.println("****** Validating NextGen IM Static Ad in test mode");
		logStep("Validating NextGen IM Static Ad in test mode ");
		Ad.resetApp();
		Thread.sleep(15000);
		AppiumFunctions.enterRequiredUserGroup("AdsTestAdUnitOnly");
		Ad.runAppInBackground(10);
		//Ad.launchApp();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.ClickonIUnderstand();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.enablingResponsiveMode();
		Ad.runAppInBackground(10);
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();	
		AppiumFunctions.enter_requiredLocation("73645");
		Thread.sleep(15000);
		this.proxy.getXml();
		Functions.finding_Homescreen_marquee_iu();

	}

	@Test(priority = 3022, enabled = true)
	@Description("Validating NextGen IM Video Ad response when app in test mode")
	public void Validate_NextGenIM_VideoAd_response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad response in test mode");
		logStep("Validating NextGen IM Video Ad response in test mode ");
		Functions.NextGenIm_adcall_response();

	}

	/**
	 * @throws Exception This Script Validate NextGen IM Ad and its parameters
	 */
	@Test(priority = 3024, enabled = true)
	@Description("Validating NextGen IM Video Ad BackGround Asset Call")
	public void Validate_NextGenIM_VideoAd_bgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad BG Asset Call");
		logStep("Validating NextGen IM Video Ad BG Asset Call ");
		Functions.validate_BG_adcall_NextGenIM_video();

	}

	/**
	 * @throws Exception This Script Validate NextGen IM Ad and its parameters Video
	 *                   ad will not be having only fg asset call always, it has
	 *                   only bg asset call hence commenting
	 */
	
	  @Test(priority = 3026, enabled = true)
	  @Description("Validating NextGen IM Video Ad ForeGround Asset Call")
	  public void Validate_NextGenIM_VideoAd_fgAssetCall() throws Exception {
	 System.out.println("==============================================");
	 System.out.println("****** Validating NextGen IM Video Ad FG Asset Call");
	 logStep("Validating NextGen IM Video Ad FG Asset Call ");	  	
	  Functions.validate_FG_adcall_NextImad_video();
	 
	 
	  }
	 

	@Test(priority = 3028, enabled = true)
	@Description("Validating NextGen IM Video Ad sz parameter")
	public void Validate_NextGenIM_VideoAd_Size() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad sz parameter in charles");
		logStep("Validating NextGen IM Video Ad sz parameter in charles ");
		CharlesFunctions.archive_folder("Charles");
		 Functions.validate_Size_iNextGenIM();

	}
	

	
	
	

	
	
	
}

	

