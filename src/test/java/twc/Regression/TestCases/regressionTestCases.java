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

	

	/*#############################################*/
	  
	@Test(priority = 1001, enabled = true)
	@Title("Verifying daily integrated details ad call iu value")
	public void Smoke_Test_Verify_DailyDetails_Integratedadcall_iu() throws Exception {
		System.out.println("================= Verifying daily detials integrated ad call test case Started =========================");	
		System.out.println("Verifying daily details integrated ad call test case Started");

	}
	
	
	@Test(priority = 1002, enabled = true)
	@Title("Verifying daily details integrated ad call size")
	public void Smoke_Test_Verify_DailyDetails_Integratedadcall_Size() throws Exception {
		System.out.println("================= Verifying daily detials integrated ad call size test case Started =========================");	
	
		
		System.out.println("================= Verifying daily detials integrated ad call size test case End =========================");
	}
	
	
	
	
	@Test(priority = 1003, enabled = true)
	@Title("Verifying daily  integrated details ad call response and IM ad loading on screen")
	public void Smoke_Test_Verify_DailyDetails_Response_and_IM_ad_loading_on_screen() throws Exception {
		System.out.println("================= Verifying dailetials integrated daily details ad call response test case Started =========================");	
	
		
		System.out.println("================= Verifying daily detials integrated daily details ad call response test case  End =========================");
	}
	
	@Test(priority = 1004, enabled = true)
	@Title("Verifying daily  integrated details FG  assest call URL")
	public void Smoke_Test_Verify_DailyIntegratedDetails_FG_Assest_URL() throws Exception {
		System.out.println("================= Verifying daily detials integrated FG assest url  test case Started =========================");	

		
		System.out.println("================= Verifying daily detials integrated FG assest url test case End =========================");
	}
	
	
	@Test(priority = 1005, enabled = true)
	@Title("Verifying daily  integrated details BG assest  call URL")
	public void Smoke_Test_Verify_DailyIntegratedDetails_BG_Assest_URL() throws Exception {
		System.out.println("================= Verifying daily detials integrated BG assest url  test case Started =========================");	

		
		System.out.println("================= Verifying daily detials integrated BG assest url  test case End =========================");
	}
  
  
	
	@Test(priority = 1001, enabled = true)
	@Title("Verifying daily integrated details  video ad call iu value")
	public void Smoke_Test_Verify_DailyDetails_IntegratedVideoadcall_iu() throws Exception {
		System.out.println("================= Verifying daily detials integrated ad call test case Started =========================");	
		System.out.println("Verifying daily details integrated ad call test case Started");
	
		
		System.out.println("================= Verifying daily detials integrated ad call test case End =========================");
	}
	
	
	@Test(priority = 1002, enabled = true)
	@Title("Verifying daily details integrated video ad call size")
	public void Smoke_Test_Verify_DailyDetails_IntegratedVideoadcall_Size() throws Exception {
		System.out.println("================= Verifying daily detials integrated ad call size test case Started =========================");	
		
	
		System.out.println("================= Verifying daily detials integrated ad call size test case End =========================");
	}
	
	
	
	
	@Test(priority = 1003, enabled = true)
	@Title("Verifying daily  integrated details video ad call response and IM ad loading on screen")
	public void Smoke_Test_Verify_DailyDetails_Response_and_IM_Videoad_loading_on_screen() throws Exception {
		System.out.println("================= Verifying dailetials integrated daily details ad call response test case Started =========================");	

		
		System.out.println("================= Verifying daily detials integrated daily details ad call response test case  End =========================");
	}
	
	@Test(priority = 1004, enabled = true)
	@Title("Verifying daily  integrated video FG  assest call URL")
	public void Smoke_Test_Verify_DailyIntegratedVideo_FG_Assest_URL() throws Exception {
		System.out.println("================= Verifying daily detials integrated FG assest url  test case Started =========================");	
		
		
		System.out.println("================= Verifying daily detials integrated FG assest url test case End =========================");
	}
	
	
	@Test(priority = 1005, enabled = true)
	@Title("Verifying daily  integrated video BG assest  call URL")
	public void Smoke_Test_Verify_DailyIntegratedVideo_BG_Assest_URL() throws Exception {
		System.out.println("================= Verifying daily detials integrated BG assest url  test case Started =========================");	
		
		System.out.println("================= Verifying daily detials integrated BG assest url  test case End =========================");
	}

	
	
	@Test(priority = 2000, enabled = true)
	@Title("Verifying watson Flu card iu value")
	public void Smoke_Test_Verify_watson_FluCard_iu() throws Exception {
		System.out.println("================= Verifying watson flu card iu value   test case Started =========================");	

		System.out.println("================= Verifying watson flu card iu value  test case End =========================");
	}
	
	
	@Test(priority = 2016, enabled = true)
	@Title("Verifying  WM Flu ad call size")
	public void Smoke_Test_Verify_Size_WM_Flu_Card_adcall() throws Exception {
		System.out.println("================= Validate WM Flu_Ad_Size test case Started =========================");	

		System.out.println("================= Validate WM Flu_Ad_Size test caseEnd =========================");
	} 
	
	@Test(priority = 2022, enabled = true)
	@Title("Verifying  weekAhead card ad call response")
	public void Smoke_Test_Verify_response__WMFlu_adcall() throws Exception {
		System.out.println("================= Validate Week_Ahead card ad call response test case Started =========================");	
		
		System.out.println("================= Validate Week_Ahead card ad call response test case End =========================");
	}
	
	@Test(priority = 2032, enabled = true)
	@Title("Verifying WM Flu card ad call pos_Custom param")
	public void Smoke_Test_WM_Flu_pos_Custom_param() throws Exception {
		System.out.println("================= Validate WM Flu card ad call pos custom param test case Started =========================");	

		System.out.println("================= Validate WM Flu  card ad call pos custom param test case End =========================");
	} 
	
	
	
	@Test(priority = 2004, enabled = true)
	@Title("Verifying watson Allergy card iu value")
	public void Smoke_Test_Verify_Weekendcard_iu() throws Exception {
		System.out.println("================= Verifying Weekend card iu value   test case Started =========================");	

		System.out.println("================= Verifying Weekend  card iu value  test case End =========================");
	}
	
	@Test(priority = 2020, enabled = true)
	@Title("Verifying  WM Allergy card ad call response")
	public void Smoke_Test_Verify_response_WM_Allergy_Card_adcall() throws Exception {
		System.out.println("================= Validate WM Allergy card ad call response test case Started =========================");	

		System.out.println("================= Validate WM Allergy card ad call response test case End =========================");
	}
	
	
	@Test(priority = 2014, enabled = true)
	@Title("Verifying  WM Allergy ad call size")
	public void Smoke_Test_Verify_Size_WM_Allergy_Card_adcall() throws Exception {
		System.out.println("================= Validate WM Allergy_Ad_Size test case Started =========================");	
	
		System.out.println("================= Validate WM Allergy_Ad_Size test caseEnd =========================");
	}
	@Test(priority = 2030, enabled = true)
	@Title("Verifying WM allergy card ad call pos_Custom param")
	public void Smoke_Test_WM_Allergy_pos_Custom_param() throws Exception {
		System.out.println("================= Validate WM Allergy card ad call pos custom param test case Started =========================");	
		
		System.out.println("================= Validate WM Allergy card ad call pos custom param test case End =========================");
	}
	
	
	@Test(priority = 2002, enabled = true)
	@Title("Verifying watson weekend card iu value")
	public void Smoke_Test_Verify_watson_AllergyCard_iu() throws Exception {
		System.out.println("================= Verifying watson Allergy card iu value   test case Started =========================");	
	
		System.out.println("================= Verifying Allergy  card iu value  test case End =========================");
	}
	
	@Test(priority = 2010, enabled = true)
	@Title("Verifying  Weekend cardad call size")
	public void Smoke_Test_Verify_Size_Weekend_Card_adcall() throws Exception {
		System.out.println("================= Validate Weekend_Ad_Size test case Started =========================");	
	
		System.out.println("================= Validate Weekend_Ad_Size test caseEnd =========================");
	}
	

	
	@Test(priority = 2024, enabled = true)
	@Title("Verifying  weekend card ad call response")
	public void Smoke_Test_Verify_response__Weekend_Card_adcall() throws Exception {
		System.out.println("================= Validate Weekend card ad call response test case Started =========================");	

		System.out.println("================= Validate Weekend card ad call response test case End =========================");
	}
	
	@Test(priority = 2026, enabled = true)
	@Title("Verifying Weekend card ad call pos_Custom param")
	public void Smoke_Test_Weekend_pos_Custom_param() throws Exception {
		System.out.println("================= Validate Weekend card ad call pos custom param test case Started =========================");	

		System.out.println("================= Validate Weekend card ad call pos custom param test case End =========================");
	}
	
	
	
	
	
	@Test(priority = 2008, enabled = true)
	@Title("Verifying  WeekAhead card iu value")
	public void Smoke_Test_Verify_Weekend_Card_iu() throws Exception {
		System.out.println("================= Verifying Weekend card iu value   test case Started =========================");	
	
		System.out.println("================= Verifying Weekend  card iu value  test case End =========================");
	}
	
	@Test(priority = 2012, enabled = true)
	@Title("Verifying  Week Ahead ad call size")
	public void Smoke_Test_Verify_Size_WeekAhead_Card_adcall() throws Exception {
		System.out.println("================= Validate WeekAhead _Ad_Size test case Started =========================");	
	
		System.out.println("================= Validate WeekAhead_Ad_Size test caseEnd =========================");
	}
	
	
	@Test(priority = 2022, enabled = true)
	@Title("Verifying  weekAhead card ad call response")
	public void Smoke_Test_Verify_response__WeekAhead_Card_adcall() throws Exception {
		System.out.println("================= Validate Week_Ahead card ad call response test case Started =========================");	

		System.out.println("================= Validate Week_Ahead card ad call response test case End =========================");
	}
	
	@Test(priority = 2028, enabled = true)
	@Title("Verifying WeekAhead card ad call pos_Custom param")
	public void Smoke_Test_WeekAhead_pos_Custom_param() throws Exception {
		System.out.println("================= Validate WeekAhead card ad call pos custom param test case Started =========================");	
	
		System.out.println("================= Validate WeekAhe card ad call pos custom param test case End =========================");
	}
	
		
	
		@BeforeTest(alwaysRun = true)
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
			Thread.sleep(25000);
			AppiumFunctions. ClickonIUnderstand();
			Thread.sleep(10000);
			AppiumFunctions.gettingApkVersion();
			Thread.sleep(5000);
		//	CustomParamFunctions.get_fhic_floc_value();    
			AppiumFunctions.SwipeUp_Counter_custparam(15);
			Thread.sleep(15000);
			AppiumFunctions.click_hourly_element();
			 Thread.sleep(5000);
			AppiumFunctions.click_daily_element();
		//	 AppiumFunctions.closeInterstailads();
				this.proxy.getXml();
				
				
		}
		
		// video ad call custum parameters
		/*@Test(priority = 1)
		@Title("Verify custom parameter cmsid")
		public void C344257_Verify_Video_Url_Parameter_cmsid() throws Exception {
			System.out.println("================= Custom Parameter Cmsid Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("cmsid");
			System.out.println("================= Custom Parameter Cmsid Verfication End =========================");
		}

		@Test(priority = 2)
		@Title("Verify custom parameter ttid")
		public void C344258_Verify_Video_Url_Parameter_ttid() throws Exception {
			System.out.println("================= Custom Parameter Ttid Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("ttid");
			System.out.println("================= Custom Parameter Ttid Verfication End =========================");
		}

		@Test(priority = 3)
		@Title("Verify custom parameter lnid")
		public void C344260_Verify_Video_Url_Parameter_lnid() throws Exception {
			System.out.println("================= Custom Parameter Lnid Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("lnid");
			System.out.println("================= Custom Parameter Lnid Verfication End =========================");
		}

		@Test(priority = 4)
		@Title("Verify custom parameter vid")
		public void C344259_Verify_Video_Url_Parameter_vid() throws Exception {
			System.out.println("================= Custom Parameter Vid Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("vid");
			System.out.println("================= Custom Parameter Vid Verfication End =========================");
		}

		@Test(priority = 5)
		@Title("Verify video ad call custom parameter iu")
		public void C344261_Verify_Video_Url_Parameter_iu() throws Exception {
			System.out.println("================= Custom Parameter IU Verfication Started =========================");
			Custom_Parameters_Verification.verify_video_custom_parameters("iu");
			System.out.println("================= Custom Parameter IU Verfication End =========================");
		}

		@Test(priority = 6)
		@Title("Verify Description_url for video call")
		public void C344261_Verify_DescriptionURL_Video() throws Exception {
			System.out.println("================= Verify description URL for video call Started =========================");
			Custom_Parameters_Verification.verify_video_request("description_url");
			System.out.println("================= Verify description URL for video call  End =========================");
		}

		@Test(priority = 7)
		@Title("Verify Content_url for video call")
		public void C344261_Verify_ContentURL_Video() throws Exception {
			System.out.println("================= Verify Content URL for video call Started =========================");
			Custom_Parameters_Verification.verify_video_request("content_url");
			System.out.println("================= Verify Content URL for video call  End =========================");
		}*/

		// Not null
		@Test(priority = 21)
		@Title("Verify custom parameter adid")
		public void C333213_Verify_cust_param_adid() throws Exception {
			System.out.println("================= Custom Parameter adid Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("adid");
			System.out.println("================= Custom Parameter adid Verfication End =========================");
		}

		@Test(priority = 22)
		@Title("Verify custom parameter aid")
		public void C333213_Verify_cust_param_aid() throws Exception {
			System.out.println("================= Custom Parameter Aid Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("aid");
			System.out.println("================= Custom Parameter Aid Verfication End =========================");
		}
		
		@Test(priority = 21)
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

		@Test(priority = 25)
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

	@Test(priority = 27)
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


		
		@Test(priority = 33)
		@Title("Verify custom parameter tf")
		public void C658716_Verify_cust_param_tf() throws Exception {
			System.out.println("================= Custom Parameter Tf Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tf");
			System.out.println("================= Custom Parameter Tf Verfication End =========================");
		}



		
		
	//Hard code values

		@Test(priority = 40)
		@Title("Verify custom parameter lang")
		public void C658711_Verify_cust_param_lang() throws Exception {
			System.out.println("================= Custom Parameter Lang Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("lang");
			System.out.println("================= Custom Parameter Lang Verfication End =========================");
		}

		@Test(priority = 41)
		@Title("Verify custom parameter plat")
		public void C658712_Verify_cust_param_plat() throws Exception {
			System.out.println("================= Custom Parameter Plat Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("plat");
			System.out.println("================= Custom Parameter Plat Verfication End =========================");
		}

		@Test(priority = 42)
		@Title("Verify custom parameter pos")
		public void C333218_Verify_cust_param_pos() throws Exception {
			System.out.println("================= Custom Parameter Pos Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("pos");
			System.out.println("================= Custom Parameter Pos Verfication End =========================");
		}

		@Test(priority = 43)
		@Title("Verify custom parameter tile")
		public void C333205_Verify_cust_param_tile() throws Exception {
			System.out.println("================= Custom Parameter Tile Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tile");
			System.out.println("================= Custom Parameter Tile Verfication End =========================");
		}

		
		
		
		
		

		// turbo call values
		@Test(priority = 60)
		@Title("Verify custom parameter cnd")
		public void C333216_Verify_cust_param_cnd() throws Exception {
			System.out.println("================= Custom Parameter Cnd Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("cnd");

			System.out.println("================= Custom Parameter Cnd Verfication End =========================");
		}

		@Test(priority = 61)
		@Title("Verify custom parameter ct")
		public void C333212_Verify_cust_param_ct() throws Exception {
			System.out.println("================= Custom Parameter Ct Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("ct");
			System.out.println("================= Custom Parameter Ct Verfication End =========================");
		}

		@Test(priority = 62)
		@Title("Verify custom parameter dma")
		public void C333203_Verify_cust_param_dma() throws Exception {
			System.out.println("================= Custom Parameter Dma Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("dma");
			System.out.println("================= Custom Parameter Dma Verfication End =========================");
		}

		@Test(priority = 63)
		@Title("Verify custom parameter dynght")
		public void C628160_Verify_Parameter_DyNght() throws Exception {
			System.out.println("================= Custom Parameter DayNight Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("dynght");
			System.out.println("================= Custom Parameter DayNight Verfication End =========================");
		}

		@Test(priority = 64)
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

		@Test(priority = 67)
		@Title("Verify custom parameter tmp")
		public void C333208_Verify_cust_param_tmp() throws Exception {
			System.out.println("================= Custom Parameter Tmp Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tmp");
			System.out.println("================= Custom Parameter Tmp Verfication End =========================");
		}

		@Test(priority = 68)
		@Title("Verify custom parameter tmpr")
		public void C333217_Verify_cust_param_tmpr() throws Exception {
			System.out.println("================= Custom Parameter Tmpr Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tmpr");
			System.out.println("================= Custom Parameter Tmpr Verfication End =========================");
		}

		@Test(priority = 69)
		@Title("Verify custom parameter tmpc")
		public void C333239_Verify_cust_param_tmpc() throws Exception {
			System.out.println("================= Custom Parameter Tmpc Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("tmpc");
			System.out.println("================= Custom Parameter Tmpc Verfication End =========================");
		}

		@Test(priority = 70)
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

		@Test(priority = 74)
		@Title("Verify custom parameter wind")
		public void C333221_Verify_cust_param_wind() throws Exception {
			System.out.println("================= Custom Parameter Wind Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("wind");
			System.out.println("================= Custom Parameter Wind Verfication End =========================");
		}

		@Test(priority = 75)
		@Title("Verify custom parameter uv")
		public void C333224_Verify_cust_param_uv() throws Exception {
			System.out.println("================= Custom Parameter Uv Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("uv");
			System.out.println("================= Custom Parameter Uv Verfication End =========================");
		}

		@Test(priority = 76)
		@Title("Verify custom parameter fltmpc")
		public void C333232_Verify_cust_param_fltmpc() throws Exception {
			System.out.println("================= Custom Parameter fltmpc Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("fltmpc");
			System.out.println("================= Custom Parameter fltmpc Verfication End =========================");
		}

		
		
		// wfxtg call

		@Test(priority = 90)
		@Title("Verify custom parameter wfxtg")
		public void C333228_Verify_cust_param_wfxtg() throws Exception {
			System.out.println("================= Custom Parameter Wfxtg Verfication Started =========================");
			Custom_Parameters_Verification.parameters_Verification("wfxtg");
			System.out.println("================= Custom Parameter Wfxtg Verfication End =========================");
		}

		
		
		
		
		
		
	}
	

	

