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



		@Test(priority = 1, enabled = true)
	@Title("Verifying watson Flu card iu value")
	public void Smoke_Test_Verify_watson_FluCard_iu() throws Exception {
		System.out.println("================= Verifying watson flu card iu value   test case Started =========================");	
	   	this.configFile = this.charlesGeneralConfigFile(CONFIG_FILE_PATH);
		proxy = new CharlesProxy("localhost", 8333, CONFIG_FILE_PATH);
		proxy.startCharlesProxyWithUI();
		proxy.disableRewriting();
	    proxy.stopRecording();
		proxy.disableMapLocal();
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.LaunchAppWithFullReset();
		Ad.resetApp();
	     AppiumFunctions.ClickonIUnderstand();
	     AppiumFunctions.clickOnAllow();
		AppiumFunctions.enterRequiredUserGroup("allergy");
		Ad.runAppInBackground(30);
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.enablingBranch("WM cards");
		Ad.runAppInBackground(30);
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.enablingResponsiveMode();
		Ad.runAppInBackground(30);
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.Kill_Launch_App();
		AppiumFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		//AppiumFunctions.SwipeUp_Counter_watsoncards(50);
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
		this.proxy.getXml();
		Functions.Verify_watsonFlucard_iu();
		System.out.println("================= Verifying watson flu card iu value  test case End =========================");
	}
	
	
	@Test(priority = 2, enabled = true)
	@Title("Verifying  WM Flu ad call size")
	public void Smoke_Test_Verify_Size_WM_Flu_Card_adcall() throws Exception {
		System.out.println("================= Validate WM Flu_Ad_Size test case Started =========================");	
		Functions.validate_Size_WMFlu();
		System.out.println("================= Validate WM Flu_Ad_Size test caseEnd =========================");
	} 
	
	@Test(priority = 3, enabled = true)
	@Title("Verifying WM Flu card ad call pos_Custom param")
	public void Smoke_Test_WM_Flu_pos_Custom_param() throws Exception {
		System.out.println("================= Validate WM Flu card ad call pos custom param test case Started =========================");	
		Functions.validate_pos_Cust_param_WM_Flu();
		System.out.println("================= Validate WM Flu  card ad call pos custom param test case End =========================");
	} 

	
	
	
	
	
	
	
}

	

