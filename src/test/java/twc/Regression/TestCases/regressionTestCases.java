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
	// public static CharlesProxy proxy;
	public File configFile;
	public CharlesProxy proxy;

	
	
	
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
		Thread.sleep(20000);
		AppiumFunctions.gettingApkVersion() ;
		Thread.sleep(5000);
		attachScreen();
	}
	
     
	
		@Test(priority = 200, enabled = true)
		@Title("Verifying amazon interstitial Slot Id for hourly details preload ad call")
		public void Smoke_Test_amazon_slotid_Hourly_Intertstitial_preload_adcall() throws Exception {
			System.out.println("================= Verify amazon interstitial slot id for  Hourly details preroll adcall test case Started =========================");
			//AppiumFunctions.gettingApkVersion();
			logStep(" Verifying preload amazon intertstitial slot id for  hourly details");	
			AppiumFunctions.Kill_Launch_App();
			this.proxy.getXml();
			Functions.get_Interstitial_aaxcal_Hourly();
			System.out.println("================= Verify amazon interstitial slot id for  Hourly details preroll adcall test case  End =========================");
		}
		
		
		
		@Test(priority = 201, enabled = true)
		@Title("Verifying amazon intertstitial Slot Id for maps details prerold ad call")
		public void Smoke_Test_amazon_slotId_mapsdetails_Interstitial_preload_adcall() throws Exception {
			System.out.println(
					"================= Verifying amazon intertstitial Slot Id for maps details preload adcal test case Started =========================");

			logStep(" Verifying amazon intertstitial Slot Id for maps details preload ad cal");
			Functions.get_Interstitial_aaxcal_map_details();
			System.out
					.println("================= Verifying amazon intertstitial Slot Id for maps details preload ad cal test csase End =========================");

		}
		
		
		@Test(priority = 202, enabled = true)
		@Title("Verifying amazon intertstitial Slot Id for daily details preload ad call")
		public void Smoke_Test_amazon_slotId_Dailydetails_Intertstitial_preload_adcall() throws Exception {
			System.out.println(
					"================= Verify amazon intertstitial slot id for Daily details  preload adcall test case Started =========================");
			logStep("Verify amazon intertstitial slot id for Daily details  preload adcall");
			Functions.get_Intertstitial_aaxcal_Daily1();
			System.out.println(
					"================= Verify amazon intertstitial slot id for Daily details  preload adcall test case  End =========================");
		}
		
		
		@Test(priority = 203, enabled = true)
		@Title("Verifying amazon intertstitial Slot Id for video details preload ad call")
		public void Smoke_Test_amazon_slotId_Videodetails_Intertstitial_preload_adcall() throws Exception {
			System.out.println(
					"================= Verify amazon intertstitial slot id for Video details  preload adcall test case Started =========================");
			logStep("Verify amazon intertstitial slot id for Video details  preload adcall");
			Functions.get_Intertstitial_aaxcal_video_details() ;
			System.out.println(
					"================= Verify amazon intertstitial slot id for Video details  preload adcall test case  End =========================");
		}
		
		
		
	
				
	}
	

	

