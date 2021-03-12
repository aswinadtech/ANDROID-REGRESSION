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


	
		
	
	
		@Test(priority = 6, enabled = true)
		@Description("Verify Hourly interstials Details ad call amazon bid id")
		public void Verify_Hourly_interstitial_Details_ad_call_amazon_bid_id() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Hourly Interstitial Details ad call amazon bid id ====================");

			System.out.println("****** Hourly Interstitial Details ad call amazon bid id validation Started");
			logStep("****** Hourly Interstitial Details ad call amazon bid id validation Started");
			CharlesFunctions.createXMLFileForCharlesSessionFile();
			Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly(Interstitial)", true);
		}
		
		
	
	
	
}

	

