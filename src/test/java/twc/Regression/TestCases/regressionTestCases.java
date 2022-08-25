package twc.Regression.TestCases;

import java.io.File;

import org.openqa.selenium.internal.Killable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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



		

	/**
	 * @throws Exception This Script Validate NextGen IM Ad and its parameters
	 */
	@Test(priority = 3010, enabled = true)
	@Title("Validating NextGen IM Static Ad when app in test mode")
	public void Validate_NextGenIM_StaticAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad in test mode");
		logStep("Validating NextGen IM Static Ad in test mode ");
		Assert.fail("IM ad not displyed on UI");

	}
	
	/**
	 * This Script Validate NextGen IM Ad response
	 * @throws Exception
	 */
	@Test(priority = 602, enabled = true)
	@Title("Validating NextGen IM Static Ad response when app in test mode")
	public void Validate_NextGenIM_StaticAd_response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad response in test mode");
		logStep("Validating NextGen IM Static Ad response in test mode ");



	}
	
	
	/**
	 * This Script Validate NextGen IM Ad and its parameters
	 * @throws Exception
	 */

	@Test(priority = 603, enabled = true)

	@Title("Validating NextGen IM Static Ad BackGround Asset Call")
	public void Validate_NextGenIM_StaticAd_bgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad BG Asset Call");
		logStep("Validating NextGen IM Static Ad BG Asset Call ");

		Assert.fail("Charles response doesn't contains NextGenIM Static Asset Call: /cl/im/apps/test/nextgen-static/bg-fade-500x800%403x.jpg");
	}
	
	/**
	 * This Script Validate NextGen IM Ad and its parameters
	 * @throws Exception
	 */

	@Test(priority = 604, enabled = true)
	@Title("Validating NextGen IM Static Ad ForeGround Asset Call")
	public void Validate_NextGenIM_StaticAd_fgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad FG Asset Call");
		logStep("Validating NextGen IM Static Ad FG Asset Call ");
		Assert.fail("Charles response doesn't contains NextGenIM Static Asset Call: /cl/im/apps/test/nextgen-static/fg-360x180@3x.png");

	}
	
	@Test(priority = 605, enabled = true)
	@Title("Validating NextGen IM Static Ad sz parameter")
	public void Validate_NextGenIM_StaticAd_Size() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad sz parameter in charles");
		logStep("Validating NextGen IM Static Ad sz parameter in charles ");
		

	}
	
	
	@Test(priority = 611, enabled = true)
	@Title("Validating NextGen IM Video Ad and its Parameters when app in test mode")
	public void Validate_NextGenIM_VideoAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad in test mode");
		logStep("Validating NextGen IM Video Ad in test mode ");
		

	}
	
	@Test(priority = 612, enabled = true)
	@Title("Validating NextGen IM Video Ad response when app in test mode")
	public void Validate_NextGenIM_VideoAd_response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad response in test mode");
		logStep("Validating NextGen IM Video Ad response in test mode ");


	}
	
	/**
	 * This Script Validate NextGen IM Ad and its parameters
	 * @throws Exception
	 */
	@Test(priority = 613, enabled = true)
	@Title("Validating NextGen IM Video Ad BackGround Asset Call")
	public void Validate_NextGenIM_VideoAd_bgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad BG Asset Call");
		logStep("Validating NextGen IM Video Ad BG Asset Call ");
	
		Assert.fail("Charles response doesn't contains NextGenIM Video Asset Call: /cl/im/apps/test/nextgen-video/bg-fade-gridlines-500x800%402x.mp4");
	}
	
	/**
	 *This Script Validate NextGen IM Ad and its parameters Video
	 *ad will not be having only fg asset call always, it has
	 *only bg asset call hence commenting
	 *@throws Exception 
	 */
	
	  @Test(priority = 614, enabled = true)	 
	  @Title("Validating NextGen IM Video Ad ForeGround Asset Call") 
	  public void Validate_NextGenIM_VideoAd_fgAssetCall() throws Exception {
	  System.out.println("==============================================");
	  System.out.println("****** Validating NextGen IM Video Ad FG Asset Call");
	  logStep("Validating NextGen IM Video Ad FG Asset Call ");  

	  
	  }
	  
		@Test(priority = 615, enabled = true)
		@Title("Validating NextGen IM Video Ad sz parameter")
		public void Validate_NextGenIM_VideoAd_Size() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating NextGen IM Video Ad sz parameter in charles");
			logStep("Validating NextGen IM Video Ad sz parameter in charles ");
			

		}
	 
		
		/**
		 *This Script Validate Integrated Daily Details Ad Call and its response
		 * @throws Exception 
		 */
		@Test(priority = 701, enabled = true)
		@Title("Validating IDD Ad when app in test mode")
		public void Validate_IDD_Ad() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating IDD Ad in test mode");
			logStep("Validating IDD Ad in test mode ");
	    
		
		}
		
		@Test(priority = 702, enabled = true)
		@Title("Validating IDD Ad response")
		public void Validate_IDD_Ad_response() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating IDD Ad response");
			logStep("Validating IDD Ad response");
			

		}
		
		/**
		 * This Script Validate IDD Ad and its parameters
		 * @throws Exception 
		 */

		@Test(priority = 703, enabled = true)
		@Title("Validating IDD Static Ad BackGround Asset Call")
		public void Validate_IDD_StaticAd_bgAssetCall() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating IDD Static Ad BG Asset Call");
			logStep("Validating IDD Static Ad BG Asset Call ");
			

		}
	
		@Test(priority = 705, enabled = true)
		@Title("Validating IDD Ad sz parameter")
		public void Validate_IDD_Ad_Size() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating IDD Ad sz parameter in charles");
			logStep("Validating IDD Ad sz parameter in charles ");


		}
		
		/**
		 * This Script Validate Integrated Feed Card Static Ad Call and its response
		 * @throws Exception                 
		 */
		@Test(priority = 751, enabled = true)
		@Title("Validating Integrated Feed Card Static Ad i.e. Feed1 Card when app in test mode")
		public void Validate_Integrated_FeedCard_StaticAd() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Integrated Feed Card Static Ad in test mode");
			logStep("Validating Integrated Feed Card Static Ad in test mode ");
		}
		
		@Test(priority = 752, enabled = true)
		@Title("Validating Integrated Feed Card Static Ad response")
		public void Validate_Integrated_FeedCard_StaticAd_response() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Integrated Feed Card Static Ad response");
			logStep("Validating Integrated Feed Card Static Ad response");
			
		}
		
		/**
		 * This Script Validate Integrated Feed Card Static Ad and its parameters
		 * @throws Exception                
		 */

		@Test(priority = 753, enabled = true)
		@Title("Validating Integrated Feed Card Static Ad BackGround Asset Call")
		public void Validate_Integrated_FeedCard_StaticAd_bgAssetCall() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Integrated Feed Card Static Ad BG Asset Call");
			logStep("Validating Integrated Feed Card Static Ad BG Asset Call ");
			
	
		}


		

		/**
		 * This Script Validate Integrated Feed Card Static Ad and its parameters
		 * @throws Exception              
		 */
		@Test(priority = 754, enabled = true)
		@Title("Validating Integrated Feed Card Static Ad ForeGround Asset Call")
		public void Validate_Integrated_FeedCard_StaticAd_fgAssetCall() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Integrated Feed Card Static Ad FG Asset Call");
			logStep("Validating Integrated Feed Card Static Ad FG Asset Call ");
		

		}
		
		
		@Test(priority = 755, enabled = true)
		@Title("Validating Integrated Feed Card Static Ad sz parameter")
		public void Validate_Integrated_FeedCard_StaticAd_Size() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Integrated Feed Card Static Ad sz parameter in charles");
			logStep("Validating Integrated Feed Card Static Ad sz parameter in charles ");
	
		}
		
		/**
		 * This Script Validate Integrated Feed Card Video Ad Call and its response
		 * @throws Exception          
		 */
		@Test(priority = 761, enabled = true)
		@Title("Validating Integrated Feed Card Video Ad i.e. Feed1 Card when app in test mode")
		public void Validate_Integrated_FeedCard_VideoAd() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Integrated Feed Card Video Ad in test mode");
			logStep("Validating Integrated Feed Card Video Ad in test mode ");
			
		}
		
		
		@Test(priority = 762, enabled = true)
		@Title("Validating Integrated Feed Card Video Ad response")
		public void Validate_Integrated_FeedCard_VideoAd_response() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Integrated Feed Card Video Ad response");
			logStep("Validating Integrated Feed Card Video Ad response");
		

		}
		
		/**
		 * This Script Validate Integrated Feed Card Video Ad and its parameters
		 * @throws Exception            
		 */

		@Test(priority = 763, enabled = true)
		@Title("Validating Integrated Feed Card Video Ad BackGround Asset Call")
		public void Validate_Integrated_FeedCard_VideoAd_bgAssetCall() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Integrated Feed Card Video Ad BG Asset Call");
			logStep("Validating Integrated Feed Card Video Ad BG Asset Call ");
			
		}
		
		@Test(priority = 765, enabled = true)
		@Title("Validating Integrated Feed Card Video Ad sz parameter")
		public void Validate_Integrated_FeedCard_VideoAd_Size() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Integrated Feed Card Video Ad sz parameter in charles");
			logStep("Validating Integrated Feed Card Video Ad sz parameter in charles ");

			

		}
		
		
		/**
		 * This Script Enable preconfiguration for spotlight cards i.e. Flu, Allergy, Week Ahead, Weekend
		 * @throws Exception    
		 */
		@Test(priority = 901, enabled = true)
		@Title("Enabling Preconfiguration for Watson Moment and Planning Moment Cards")
		public void enable_PreConfiguration_for_WatsonAndPlanningMomentCards() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Enable Preconfiguration for Watson Moment and Planning Moment Cards");
			logStep("Enable Preconfiguration for Watson Moment and Planning Moment Cards ");

			}
		
		
		@Test(priority = 902, enabled = true)
		@Title("Verify Week Ahead ad call iu")
		public void Verify_Week_Ahead_AdCall() throws Exception {
			System.out.println("==============================================");		
			System.out.println("****** Week Ahead Adcall verification test case Started");
			logStep("****** Week Ahead Adcall verification test case Started");
	
		}
		
		/**
		 * This method validates pos custom parameter of Week Ahead call
		 */
		@Test(priority = 903, enabled = true)
		@Title("Validating 'pos' custom parameter of Week Ahead call ")
		public void Validate_Week_Ahead_pos_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating pos custom parameter of Week Ahead call");
			logStep("Validating pos custom parameter of Week Ahead call ");

		}
		
		
		@Test(priority = 904, enabled = true)
		@Title("Validating Week Ahead call Ad sz parameter")
		public void Validate_Week_Ahead_Ad_Size() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Week Ahead call Ad sz parameter in charles");
			logStep("Validating Week Ahead call Ad sz parameter in charles ");
		

		}
		
		@Test(priority = 911, enabled = true)
		@Title("Verify Weekend ad call iu")
		public void Verify_Weekend_AdCall() throws Exception {
			System.out.println("==============================================");
					System.out.println("****** Weekend Adcall verification test case Started");

		}
		
		/**
		 * This method validates pos custom parameter of Weekend call
		 */
		@Test(priority = 912, enabled = true)
		@Title("Validating 'pos' custom parameter of Weekend call ")
		public void Validate_Weekend_pos_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating pos custom parameter of Weekend call");
			logStep("Validating pos custom parameter of Weekend call ");
		
		}
		
		
		@Test(priority = 913, enabled = true)
		@Title("Validating Weekend call Ad sz parameter")
		public void Validate_Weekend_Ad_Size() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Weekend call Ad sz parameter in charles");
			logStep("Validating Weekend call Ad sz parameter in charles ");

		}
		
		@Test(priority = 921, enabled = true)
		@Title("Verify WM Flu ad call iu")
		public void Verify_WMFlu_AdCall() throws Exception {
			System.out.println("==============================================");		
			System.out.println("****** WM Flu Adcall verification test case Started");
			logStep("****** WM Flu Adcall verification test case Started");

		}
		
		/**
		 * This method validates pos custom parameter of WM Flu call
		 */
		@Test(priority = 922, enabled = true)
		@Title("Validating 'pos' custom parameter of WM Flu call ")
		public void Validate_WMFlu_pos_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating pos custom parameter of WM Flu call");
			logStep("Validating pos custom parameter of WM Flu call ");
			

		}
		
		@Test(priority = 923, enabled = true)
		@Title("Validating WM Flu call Ad sz parameter")
		public void Validate_WMFlu_Ad_Size() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating WM Flu call Ad sz parameter in charles");
			logStep("Validating WM Flu call Ad sz parameter in charles ");
	
		}

		@Test(priority = 931, enabled = true)
		@Title("Verify WM Allergy ad call iu")
		public void Verify_WMAllergy_AdCall() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** WM Allergy Adcall verification test case Started");
			logStep("****** WM Allergy Adcall verification test case Started");
			
		}
		
		/**
		 * This method validates pos custom parameter of WM Allergy call
		 */
		@Test(priority = 932, enabled = true)
		@Title("Validating 'pos' custom parameter of WM Allergy call ")
		public void Validate_WMAllergy_pos_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating pos custom parameter of WM Allergy call");
			logStep("Validating pos custom parameter of WM Allergy call ");
    		
		}

		@Test(priority = 933, enabled = true)
		@Title("Validating WM Allergy call Ad sz parameter")
		public void Validate_WMAllergy_Ad_Size() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating WM Allergy call Ad sz parameter in charles");
			logStep("Validating WM Allergy call Ad sz parameter in charles ");
		

		}
		
		@Test(priority = 350, enabled = true)
		@Title("Enabling Preconfiguration for Severe1 Breaking News Card")
		public void enable_PreConfiguration_for_servere1_BreakingNewsCard() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Enable Preconfiguration for Severe1 Breaking News Card");
			logStep("Enable Preconfiguration for Severe1 Breaking News Card");
		
		
		}

		
		@Test(priority = 351, enabled = true)
		@Title("Verify BreakingNews Severe1 ad call iu")
		public void Verify_BreakingNews_Severe1_AdCall() throws Exception {
			System.out.println("==============================================");			
			System.out.println("****** Breaking News Severe1 Adcall verification test case Started");
			logStep("****** Breaking News Severe1 Adcall verification test case Started");		
		
		}
	
		
		/**
		 * This method validates bn custom parameter of Breaking News Severe1 call
		 */
		@Test(priority = 352, enabled = true)
		@Title("Validating 'bn' custom parameter of BreakingNews Severe1 call ")
		public void Validate_BreakingNews_Severe1_bn_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating bn custom parameter of Breaking News Severe1 call");
			logStep("Validating bn custom parameter of Breaking News Severe1 call ");
		

		}
		
		/**
		 * This method validates pos custom parameter of Breaking News Severe1 call
		 */
		@Test(priority = 353, enabled = true)
		@Title("Validating 'pos' custom parameter of BreakingNews Severe1 call ")
		public void Validate_BreakingNews_Severe1_pos_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating pos custom parameter of Breaking News Severe1 call");
			logStep("Validating pos custom parameter of Breaking News Severe1 call ");
		

		}
		
		@Test(priority = 361, enabled = true)
		@Title("Verify BreakingNews Severe1 Video1 ad call iu")
		public void Verify_BreakingNews_Video1_Severe1_AdCall() throws Exception {
			System.out.println("==============================================");		
			System.out.println("****** Breaking News Severe1 Video1 Adcall verification test case Started");
			logStep("****** Breaking News Severe1 Video1 Adcall verification test case Started");
		
		

		}
		
		/**
		 * This method validates bn custom parameter of Breaking News Severe1 Video1
		 * call
		 */
		@Test(priority = 362, enabled = true)
		@Title("Validating 'bn' custom parameter of BreakingNews Severe1 Video1 call ")
		public void Validate_BreakingNews_Video1_Severe1_bn_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating bn custom parameter of Breaking News Severe1 Video1 call");
			logStep("Validating bn custom parameter of Breaking News Severe1 Video1 call ");
			

		}
		/**
		 * This method validates ref custom parameter of Breaking News Severe1 Video1
		 * call
		 */
		@Test(priority = 363, enabled = true)
		@Title("Validating 'ref' custom parameter of BreakingNews Severe1 Video1 call ")
		public void Validate_BreakingNews_Video1_Severe1_ref_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ref custom parameter of Breaking News Severe1 Video1 call");
			logStep("Validating ref custom parameter of Breaking News Severe1 Video1 call ");
		
		}
		
		
		@Test(priority = 375, enabled = true)
		@Title("Enabling Preconfiguration for Severe2 Breaking News Card")
		public void enable_PreConfiguration_for_servere2_BreakingNewsCard() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Enable Preconfiguration for Severe2 Breaking News Card");
			logStep("Enable Preconfiguration for Severe2 Breaking News Card");
			
		}
		
		@Test(priority = 376, enabled = true)
		@Title("Verify BreakingNews Severe2 ad call iu")
		public void Verify_BreakingNews_Severe2_AdCall() throws Exception {
			System.out.println("==============================================");	
			System.out.println("****** Breaking News Severe2 Adcall verification test case Started");

		}

		/**
		 * This method validates bn custom parameter of Breaking News Severe2 call
		 */
		@Test(priority = 377, enabled = true)
		@Title("Validating 'bn' custom parameter of BreakingNews Severe2 call ")
		public void Validate_BreakingNews_Severe2_bn_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating bn custom parameter of Breaking News Severe2 call");
			logStep("Validating bn custom parameter of Breaking News Severe2 call ");
		
		}
		
		/**
		 * This method validates pos custom parameter of Breaking News Severe2 call
		 */
		@Test(priority = 378, enabled = true)
		@Title("Validating 'pos' custom parameter of BreakingNews Severe2 call ")
		public void Validate_BreakingNews_Severe2_pos_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating pos custom parameter of Breaking News Severe2 call");
			logStep("Validating pos custom parameter of Breaking News Severe2 call ");
			
		}
		
		
		@Test(priority = 381, enabled = true)
		@Title("Verify BreakingNews Severe2 Video1 ad call iu")
		public void Verify_BreakingNews_Video1_Severe2_AdCall() throws Exception {
			System.out.println("==============================================");	
			System.out.println("****** Breaking News Severe2 Video1 Adcall verification test case Started");
			logStep("****** Breaking News Severe2 Video1 Adcall verification test case Started");

		}

		/**
		 * This method validates bn custom parameter of Breaking News Severe2 Video1
		 * call
		 */
		@Test(priority = 382, enabled = true)
		@Title("Validating 'bn' custom parameter of BreakingNews Severe2 Video1 call ")
		public void Validate_BreakingNews_Video1_Severe2_bn_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating bn custom parameter of Breaking News Severe2 Video1 call");
			logStep("Validating bn custom parameter of Breaking News Severe2 Video1 call ");
			int hourInSecond = 3600;
			try {
		        Thread.sleep(1000 * 60 * 60);
		    } catch (InterruptedException ex) {}
		}
		
		/**
		 * This method validates ref custom parameter of Breaking News Severe1 Video1
		 * call
		 */
		@Test(priority = 383, enabled = true)
		@Title("Validating 'ref' custom parameter of BreakingNews Severe2 Video1 call ")
		public void Validate_BreakingNews_Video1_Severe2_ref_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ref custom parameter of Breaking News Severe2 Video1 call");
			logStep("Validating ref custom parameter of Breaking News Severe2 Video1 call ");
			try {
		        Thread.sleep(1000 * 60 * 60);
		    } catch (InterruptedException ex) {}

		}

		@Test(priority = 801, enabled = true)
		@Title("Verify Entry Interstitial Ads of Boat and Beach card")
		public void Verify_interstitial_ad_BoatandBeach() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Entry Interstitial Ad Verification of Hourly Tab====================");

			try {
		        Thread.sleep(1000 * 60 * 60);
		    } catch (InterruptedException ex) {}

		}
			
		@Test(priority = 802, enabled = true)
		@Title("Verify Exit Interstitial Ads of Daily Tab")
		public void Verify_interstitial_ads_dailyTab() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Exit Interstitial Ad Verification of Daily Tab====================");

			System.out.println("****** Exit Interstitial Ad validation of Daily Tab Started");
			logStep("Exit Interstitial Ad validation of Daily Tab Started ");
			try {
		        Thread.sleep(1000 * 60 * 60);
		    } catch (InterruptedException ex) {}
		}

		@Test(priority = 803, enabled = true)
		@Title("Verify Exit Interstitial Ads of Radar Tab")
		public void Verify_interstitial_ads_radarTab() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Exit Interstitial Ad Verification of Radar Tab====================");

			System.out.println("****** Exit Interstitial Ad validation of Radar Tab Started");
			logStep("Exit Interstitial Ad validation of Radar Tab Started ");
		
		}

		@Test(priority = 804, enabled = true)
		@Title("Verify Exit Interstitial Ads of Video Tab")
		public void Verify_interstitial_ads_videoTab() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Exit Interstitial Ad Verification of Video Tab====================");

			System.out.println("****** Exit Interstitial Ad validation of Video Tab Started");
			logStep("Exit Interstitial Ad validation of Video Tab Started ");
			
		}
		
		
		@Test(priority = 51, enabled = true)
		@Title("Verify amazon aax homescreen Adhesive preload ad call")
		public void Verify_amazon_aax_preload_homescreen_adhesive_adcall() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== amazon aax homescreen adhesive preload ad call ====================");

			System.out.println("****** amazon aax homescreen adhesive preload ad call validation Started");
			logStep("****** amazon aax homescreen adhesive preload ad call validation Started");

;

		}
		 
		@Test(priority = 52, enabled = true)
		@Title("Verify amazon aax Feed1 preload ad call")
		public void Verify_amazon_aax_preload_feed1_adcall() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== amazon aax feed1 preload ad call ====================");

			System.out.println("****** amazon aax feed1 preload ad call validation Started");
			logStep("****** amazon aax feed1 preload ad call validation Started");



		}

		@Test(priority = 53, enabled = true)
		@Title("Verify amazon aax Feed2 preload ad call")
		public void Verify_amazon_aax_preload_feed2_adcall() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== amazon aax feed2 preload ad call ====================");

			System.out.println("****** amazon aax feed2 preload ad call validation Started");
			logStep("****** amazon aax feed2 preload ad call validation Started");


		}

		@Test(priority = 54, enabled = true)
		@Title("Verify amazon aax Feed3 preload ad call")
		public void Verify_amazon_aax_preload_feed3_adcall() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== amazon aax feed3 preload ad call ====================");

			System.out.println("****** amazon aax feed3 preload ad call validation Started");
			logStep("****** amazon aax feed3 preload ad call validation Started");



		}

		@Test(priority = 55, enabled = true)
		@Title("Verify amazon aax Feed4 preload ad call")
		public void Verify_amazon_aax_preload_feed4_adcall() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== amazon aax feed4 preload ad call ====================");

			System.out.println("****** amazon aax feed4 preload ad call validation Started");
			logStep("****** amazon aax feed4 preload ad call validation Started");

		

		}

		@Test(priority = 57, enabled = true)
		@Title("Verify amazon aax PreRollVideo preload ad call")
		public void Verify_amazon_aax_preload_PreRollVideo_adcall() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== amazon PreRollVideo preload ad call ====================");

			System.out.println("****** amazon aax PreRollVideo preload ad call validation Started");
			logStep("****** amazon aax PreRollVideo preload ad call validation Started");


		}

		@Test(priority = 58, enabled = true)
		@Title("Verify amazon aax map details preload ad call")
		public void Verify_amazon_aax_preload_map_details_adcall() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== amazon aax map details preload ad call ====================");

			System.out.println("****** amazon aax Map details preload ad call validation Started");
			logStep("****** amazon aax Map details preload ad call validation Started");

		

		}

		@Test(priority = 59, enabled = true)
		@Title("Verify amazon aax Daily Details preload ad call")
		public void Verify_amazon_aax_preload_Daily_details_adcall() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== amazon aax Daily Details preload ad call ====================");

			System.out.println("****** amazon aax Daily Details preload ad call validation Started");
			logStep("****** amazon aax Daily Details preload ad call validation Started");

		

		}

		@Test(priority = 60, enabled = true)
		@Title("Verify amazon aax Hourly Details preload ad call")
		public void Verify_amazon_aax_preload_Hourly_details_adcall() throws Exception {
			System.out.println("==============================================");
			System.out
					.println("=========================== amazon aax Hourly Details preload ad call ====================");

			System.out.println("****** amazon aax Hourly Details preload ad call validation Started");
			logStep("****** amazon aax Hourly Details preload ad call validation Started");


		}
		
		@Test(priority = 65, enabled = true)
		@Title("Validating 'adsdk' parameter of Amazon aax call ")
		public void Validate_Amazon_SDK_adsdk_parameter() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Amazon SDK version i.e. 'adsdk' parameter of Amazon aax call");
			logStep("****** Validating Amazon SDK version i.e. 'adsdk' parameter of Amazon aax call");
		
		}

		@Test(priority = 70, enabled = true)
		@Title("Validating Google Mobile Ads SDK version of gampad call ")
		public void Validate_GMA_SDK_version() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Google Mobile Ads SDK Version i.e. 'js' parameter of gampad call");
			logStep("Validating Google Mobile Ads SDK Version i.e. 'js' parameter of gampad call");

		

		}
		
		@Test(priority = 75, enabled = true)
		@Title("Verify Criteo SDK inapp v2 call")
		public void Verify_Criteo_SDK_inapp_v2_Call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK inapp/v2 call ====================");

			System.out.println("****** Criteo SDK inapp/v2 call validation Started");
			logStep("****** Criteo SDK inapp/v2 call validation Started");



		}

		@Test(priority = 76, enabled = true)
		@Title("Verify Criteo SDK config app call")
		public void Verify_Criteo_SDK_config_app_Call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK config/app call ====================");

			System.out.println("****** Criteo SDK config/app call validation Started");
			logStep("****** Criteo SDK config/app call validation Started");



		}

		@Test(priority = 77, enabled = true)
		@Title("Validating 'cpId' parameter of Criteo SDK config app call ")
		public void Validate_Criteo_SDK_config_app_Call_cpId_parameter() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating 'cpId' parameter of Criteo SDK config app call");
			logStep("****** Validating 'cpId' parameter of Criteo SDK config app call");
			

		}

		@Test(priority = 78, enabled = true)
		@Title("Validating 'bundleId' parameter of Criteo SDK config app call ")
		public void Validate_Criteo_SDK_config_app_Call_bundleId_parameter() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating 'bundleId' parameter of Criteo SDK config app call");
			logStep("****** Validating 'bundleId' parameter of Criteo SDK config app call");
			

		}

		@Test(priority = 79, enabled = true)
		@Title("Validating 'sdkVersion' parameter of Criteo SDK config app call ")
		public void Validate_Criteo_SDK_config_app_Call_sdkVersion_parameter() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
			logStep("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
		
		}

		/**
		 * This method validates Criteo Bidder API (invapp v2) call response code
		 */
		@Test(priority = 81, enabled = true)
		@Title("Validating Criteo Bidder API (invapp v2) call response code")
		public void Validate_Criteo_SDK_Bidder_API_Call_Response_Code() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Criteo Bidder API (invapp v2) Call Response Code");
			logStep("****** Validating Criteo Bidder API (invapp v2) Call Response Code");
		
		}

		/**
		 * This method validates Initialization API (config app) call response code
		 */
		@Test(priority = 82, enabled = true)
		@Title("Validating Criteo Initialization API (config app) call response code")
		public void Validate_Criteo_SDK_Initialization_API_Call_Response_Code() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating Criteo Initialization API (config app) Call Response Code");
			logStep("****** Validating Criteo Initialization API (config app) Call Response Code");
			
		}

		/**
		 * This method validates Initialization API (config app) call response parameter
		 * 'csmEnabled'
		 */
		@Test(priority = 83, enabled = true)
		@Title("Validating Criteo Initialization API (config app) call response parameter 'csmEnabled' value")
		public void Validate_Criteo_SDK_Initialization_API_Call_Response_Parameter_csmEnabled() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"****** Validating csmEnabled parameter value in Criteo Initialization API (config app) Call Response");
			logStep("****** Validating csmEnabled parameter value in Criteo Initialization API (config app) Call Response");
			
		}

		/**
		 * This method validates Initialization API (config app) call response parameter
		 * 'liveBiddingEnabled'
		 */
		@Test(priority = 84, enabled = true)
		@Title("Validating Criteo Initialization API (config app) call response parameter 'liveBiddingEnabled' value")
		public void Validate_Criteo_SDK_Initialization_API_Call_Response_Parameter_liveBiddingEnabled() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"****** Validating liveBiddingEnabled parameter value in Criteo Initialization API (config app) Call Response");
			logStep("****** Validating liveBiddingEnabled parameter value in Criteo Initialization API (config app) Call Response");
		
		}
		
		/*
		 * This method validates plat custom parameter of Marquee call
		 */
		@Test(priority = 700, enabled = true)
		@Title("Validating 'plat' custom parameter of Marquee call ")
		public void Validate_Marquee_plat_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating plat custom parameter of Marquee call");
			logStep("Validating plat custom parameter of Marquee call ");
		

		}

		/*
		 * This method validates plat custom parameter of Feed1 call
		 */
		@Test(priority = 702, enabled = true)
		@Title("Validating 'plat' custom parameter of Feed1 call ")
		public void Validate_Feed1_plat_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating plat custom parameter of Feed1 call");
			logStep("Validating plat custom parameter of Feed1 call ");
		

		}

		/*
		 * This method validates plat custom parameter of Hourly details call
		 */
		@Test(priority = 704, enabled = true)
		@Title("Validating 'plat' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_plat_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating plat custom parameter of Hourly details call");
			logStep("Validating plat custom parameter of Hourly details call ");
			

		}



		/*
		 * This method validates pos custom parameter of Marquee call
		 */
		@Test(priority = 706, enabled = true)
		@Title("Validating 'pos' custom parameter of Marquee call ")
		public void Validate_Marquee_pos_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating pos custom parameter of Marquee call");
			logStep("Validating pos custom parameter of Marquee call ");
			CharlesFunctions.createXMLFileForCharlesSessionFile();


		}

		/*
		 * This method validates pos custom parameter of Feed1 call
		 */
		@Test(priority = 708, enabled = true)
		@Title("Validating 'pos' custom parameter of Feed1 call ")
		public void Validate_Feed1_pos_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating pos custom parameter of Feed1 call");
			logStep("Validating pos custom parameter of Feed1 call ");
		

		}

		/*
		 * This method validates pos custom parameter of Hourly details call
		 */
		@Test(priority = 710, enabled = true)
		@Title("Validating 'pos' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_pos_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating pos custom parameter of Hourly details call");
			logStep("Validating pos custom parameter of Hourly details call ");
	

		}



		/*
		 * This method validates tile custom parameter of Marquee call
		 */
		@Test(priority = 706, enabled = true)
		@Title("Validating 'tile' custom parameter of Marquee call ")
		public void Validate_Marquee_tile_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tile custom parameter of Marquee call");
			logStep("Validating tile custom parameter of Marquee call ");
	

		}

		/*
		 * This method validates tile custom parameter of Feed1 call
		 */
		@Test(priority = 708, enabled = true)
		@Title("Validating 'tile' custom parameter of Feed1 call ")
		public void Validate_Feed1_tile_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tile custom parameter of Feed1 call");
			logStep("Validating tile custom parameter of Feed1 call ");


		}

		/*
		 * This method validates tile custom parameter of Hourly details call
		 */
		@Test(priority = 710, enabled = true)
		@Title("Validating 'tile' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_tile_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tile custom parameter of Hourly details call");
			logStep("Validating tile custom parameter of Hourly details call ");


		}




		/*
		 * This method validates sod custom parameter of HomeScreen Today Call
		 */
		@Test(priority = 712, enabled = true)
		@Title("Validating 'sod' custom parameter of marquee hour Call")
		public void validate_HomeScreen_marquee_sod_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating sod custom parameter of HomeScreen marqueeay call");
			logStep("Validating sod custom parameter of HomeScreen marquee call");

		}

		/*
		 * This method validates sod custom parameter of Feed1 call
		 */
		@Test(priority = 714, enabled = true)
		@Title("Validating 'sod' custom parameter of Feed1 call ")
		public void Validate_Feed1_sod_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating sod custom parameter of Feed1 call");
			logStep("Validating sod custom parameter of Feed1 call ");


		}

		/*
		 * This method validates sod custom parameter of Hourly details call
		 */
		@Test(priority = 716, enabled = true)
		@Title("Validating 'sod' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_sod_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating sod custom parameter of Hourly Details call");
			logStep("Validating sod custom parameter of Hourly Details call ");
		

		}


		/*
		 * This method validates lang custom parameter of Marquee call
		 */
		@Test(priority = 718, enabled = true)
		@Title("Validating 'lang' custom parameter of Marquee call ")
		public void Validate_Marquee_lang_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating lang custom parameter of Marquee call");
			logStep("Validating lang custom parameter of Marquee call ");
		

		}

		/*
		 * This method validates lang custom parameter of Feed1 call
		 */
		@Test(priority = 720, enabled = true)
		@Title("Validating 'lang' custom parameter of Feed1 call ")
		public void Validate_Feed1_lang_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating lang custom parameter of Feed1 call");
			logStep("Validating lang custom parameter of Feed1 call ");
			

		}

		/*
		 * This method validates lang custom parameter of Hourly details call
		 */
		@Test(priority = 722, enabled = true)
		@Title("Validating 'lang' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_lang_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating lang custom parameter of Hourly details call");
			logStep("Validating lang custom parameter of Hourly details call ");
			

		}




		/*
		 * This method validates DayNight custom parameter of Hourly details call
		 */
		@Test(priority = 726, enabled = true)
		@Title("Validating 'tf' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_tf_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tf custom parameter of Hourly details call");
			logStep("Validating tf custom parameter of Hourly details call ");


		}


		/*
		 * This method validates DayNight custom parameter of Marquee call
		 */
		@Test(priority = 734, enabled = true)
		@Title("Validating 'adid' custom parameter of Marquee call ")
		public void Validate_Marquee_adid_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating adid custom parameter of Marquee call");
			logStep("Validating adid custom parameter of Marquee call ");

			

		}


		/*
		 * This method validates DayNight custom parameter of Feed1 call
		 */
		@Test(priority = 736, enabled = true)
		@Title("Validating 'adid' custom parameter of Feed1 call ")
		public void Validate_Feed1_adid_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating adid custom parameter of Feed1 call");
			logStep("Validating adid custom parameter of Feed1 call ");
			

		}

		/*
		 * This method validates DayNight custom parameter of Hourly details call
		 */
		@Test(priority = 738, enabled = true)
		@Title("Validating 'adid' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_adid_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating adid custom parameter of Hourly details call");
			logStep("Validating adid custom parameter of Hourly details call ");
		

		}



		/*
		 * This method validates DayNight custom parameter of Marquee call
		 */
		@Test(priority = 740, enabled = true)
		@Title("Validating 'aid' custom parameter of Marquee call ")
		public void Validate_Marquee_aid_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating aid custom parameter of Marquee call");
			logStep("Validating aid custom parameter of Marquee call ");

	

		}


		/*
		 * This method validates DayNight custom parameter of Feed1 call
		 */
		@Test(priority = 742, enabled = true)
		@Title("Validating 'aid' custom parameter of Feed1 call ")
		public void Validate_Feed1_aid_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating adid custom parameter of Feed1 call");
			logStep("Validating adid custom parameter of Feed1 call ");
	

		}

		/*
		 * This method validates DayNight custom parameter of Hourly details call
		 */
		@Test(priority = 746, enabled = true)
		@Title("Validating 'adid' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_aid_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating adid custom parameter of Hourly details call");
			logStep("Validating adid custom parameter of Hourly details call ");


		}




		/*
		 * This method validates ltv custom parameter of Marquee call
		 */
		@Test(priority = 748, enabled = true)
		@Title("Validating 'ltv' custom parameter of Marquee call ")
		public void Validate_Marquee_ltv_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ltv custom parameter of Marquee call");
			logStep("Validating ltv custom parameter of Marquee call ");

			

		}


		/*
		 * This method validates DayNight custom parameter of Feed1 call
		 */
		@Test(priority = 750, enabled = true)
		@Title("Validating 'ltv' custom parameter of Feed1 call ")
		public void Validate_Feed1_ltv_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ltv custom parameter of Feed1 call");
			logStep("Validating ltv custom parameter of Feed1 call ");
		

		}

		/*
		 * This method validates DayNight custom parameter of Hourly details call
		 */
		@Test(priority = 752, enabled = true)
		@Title("Validating 'ltv' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_ltv_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ltv custom parameter of Hourly details call");
			logStep("Validating ltv custom parameter of Hourly details call ");


		}



		/*
		 * This method validates ord custom parameter of Marquee call
		 */
		@Test(priority = 754, enabled = true)
		@Title("Validating 'ord' custom parameter of Marquee call ")
		public void Validate_Marquee_ord_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ord custom parameter of Marquee call");
			logStep("Validating ord custom parameter of Marquee call ");

			

		}


		/*
		 * This method validates DayNight custom parameter of Feed1 call
		 */
		@Test(priority = 756, enabled = true)
		@Title("Validating 'ord' custom parameter of Feed1 call ")
		public void Validate_Feed1_ord_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ord custom parameter of Feed1 call");
			logStep("Validating ord custom parameter of Feed1 call ");
		

		}

		/*
		 * This method validates DayNight custom parameter of Hourly details call
		 */
		@Test(priority = 758, enabled = true)
		@Title("Validating 'ord' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_ord_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ord custom parameter of Hourly details call");
			logStep("Validating ord custom parameter of Hourly details call ");
			

		}

		/*
		 * This method validates ord custom parameter of Marquee call
		 */
		@Test(priority = 760, enabled = true)
		@Title("Validating 'ver' custom parameter of Marquee call ")
		public void Validate_Marquee_ver_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ver custom parameter of Marquee call");
			logStep("Validating ver custom parameter of Marquee call ");

			

		}


		/*
		 * This method validates DayNight custom parameter of Feed1 call
		 */
		@Test(priority = 762, enabled = true)
		@Title("Validating 'ver' custom parameter of Feed1 call ")
		public void Validate_Feed1_ver_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ver custom parameter of Feed1 call");
			logStep("Validating ver custom parameter of Feed1 call ");
		

		}

		/*
		 * This method validates DayNight custom parameter of Hourly details call
		 */
		@Test(priority = 764, enabled = true)
		@Title("Validating 'ver' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_ver_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ver custom parameter of Hourly details call");
			logStep("Validating ver custom parameter of Hourly details call ");
		

		}


		/*
		 * This method validates ord custom parameter of Marquee call
		 */
		@Test(priority = 766, enabled = true)
		@Title("Validating 'slotName' custom parameter of Marquee call ")
		public void Validate_Marquee_slotName_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating slotName custom parameter of Marquee call");
			logStep("Validating slotName custom parameter of Marquee call ");

		

		}



		@Test(priority = 768, enabled = true)
		@Title("Validating 'slotName' custom parameter of Feed1 call ")
		public void Validate_Feed1_slotName_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating slotName custom parameter of Feed1 call");
			logStep("Validating slotName custom parameter of Feed1 call ");


		}

		/*
		 * This method validates DayNight custom parameter of Hourly details call
		 */
		@Test(priority = 770, enabled = true)
		@Title("Validating 'slotName' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_slotName_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating slotName custom parameter of slotName details call");
			logStep("Validating slotName custom parameter of Hourly details call ");
	

		}

		/*
		 * This method validates ord custom parameter of Marquee call
		 */
		@Test(priority = 768, enabled = true)
		@Title("Validating 'im' custom parameter of Marquee call ")
		public void Validate_Marquee_im_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating im custom parameter of Marquee call");
			logStep("Validating im custom parameter of Marquee call ");

		

		}




		/*
		 * This method validates cnd custom parameter of Marquee call
		 */
		@Test(priority = 770, enabled = true)
		@Title("Validating 'cnd' custom parameter of Marquee call ")
		public void Validate_Marquee_cnd_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating cnd custom parameter of Marquee call");
			logStep("Validating cnd custom parameter of Marquee call ");
	

		}

		/*
		 * This method validates cnd custom parameter of Feed1 call
		 */
		@Test(priority = 772, enabled = true)
		@Title("Validating 'cnd' custom parameter of Feed1 call ")
		public void Validate_Feed1_cnd_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating cnd custom parameter of Feed1 call");
			logStep("Validating cnd custom parameter of Feed1 call ");


		}


		/*
		 * This method validates cnd custom parameter of Hourly details call
		 */
		 @Test(priority = 774, enabled = true)
		@Title("Validating 'cnd' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_cnd_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating cnd custom parameter of Hourly details call");
			logStep("Validating cnd custom parameter of Hourly details call ");
		

		}




		/*
		 * This method validates dma custom parameter of Marquee call
		 */
		@Test(priority = 776, enabled = true)
		@Title("Validating 'dma' custom parameter of Marquee call ")
		public void Validate_Marquee_dma_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating dma custom parameter of Marquee call");
			logStep("Validating dma custom parameter of Marquee call ");
		

		}

		/*
		 * This method validates dma custom parameter of Feed1 call
		 */
		@Test(priority = 778, enabled = true)
		@Title("Validating 'dma' custom parameter of Feed1 call ")
		public void Validate_Feed1_dma_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating dma custom parameter of Feed1 call");
			logStep("Validating dma custom parameter of Feed1 call ");
		

		}

		/*
		 * This method validates dma custom parameter of Hourly details call
		 */
		@Test(priority = 780, enabled = true)
		@Title("Validating 'dma' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_dma_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating dma custom parameter of Hourly details call");
			logStep("Validating dma custom parameter of Hourly details call ");
		

		}




		/*
		 * This method validates tmpc custom parameter of Marquee call
		 */
		@Test(priority = 782, enabled = true)
		@Title("Validating 'tmpc' custom parameter of Marquee call ")
		public void Validate_Marquee_tmpc_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tmpc custom parameter of Marquee call");
			logStep("Validating tmpc custom parameter of Marquee call ");
		

		}

		/*
		 * This method validates tmpc custom parameter of Feed1 call
		 */
		@Test(priority = 784, enabled = true)
		@Title("Validating 'tmpc' custom parameter of Feed1 call ")
		public void Validate_Feed1_tmpc_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tmpc custom parameter of Feed1 call");
			logStep("Validating tmpc custom parameter of Feed1 call ");


		}

		/*
		 * This method validates tmpc custom parameter of Hourly details call
		 */
		@Test(priority = 786, enabled = true)
		@Title("Validating 'tmpc' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_tmpc_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tmpc custom parameter of Hourly details call");
			logStep("Validating tmpc custom parameter of Hourly details call ");
	

		}



		/*
		 * This method validates ct custom parameter of Marquee call
		 */
		@Test(priority = 788, enabled = true)
		@Title("Validating 'ct' custom parameter of Marquee call ")
		public void Validate_Marquee_ct_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ct custom parameter of Marquee call");
			logStep("Validating ct custom parameter of Marquee call ");
			

		}

		/*
		 * This method validates ct custom parameter of Feed1 call
		 */
		@Test(priority = 780, enabled = true)
		@Title("Validating 'ct' custom parameter of Feed1 call ")
		public void Validate_Feed1_ct_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ct custom parameter of Feed1 call");
			logStep("Validating ct custom parameter of Feed1 call ");
		

		}


		/*
		 * This method validates ct custom parameter of Hourly details call
		 */
		@Test(priority = 782, enabled = true)
		@Title("Validating 'ct' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_ct_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating ct custom parameter of Hourly details call");
			logStep("Validating ct custom parameter of Hourly details call ");
		

		}



		/*
		 * This method validates locale custom parameter of Marquee call
		 */
		@Test(priority = 786, enabled = true)
		@Title("Validating 'locale' custom parameter of Marquee call ")
		public void Validate_Marquee_locale_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating locale custom parameter of Marquee call");
			logStep("Validating locale custom parameter of Marquee call ");
		

		}

		/*
		 * This method validates locale custom parameter of Feed1 call
		 */
		@Test(priority = 788, enabled = true)
		@Title("Validating 'locale' custom parameter of Feed1 call ")
		public void Validate_Feed1_locale_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating locale custom parameter of Feed1 call");
			logStep("Validating locale custom parameter of Feed1 call ");
	

		}

		/*
		 * This method validates locale custom parameter of Hourly details call
		 */
		@Test(priority = 790, enabled = true)
		@Title("Validating 'locale' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_locale_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating locale custom parameter of Hourly details call");
			logStep("Validating locale custom parameter of Hourly details call ");
		

		}

		/*
		 * This method validates zip custom parameter of Marquee call
		 */
		@Test(priority = 792, enabled = true)
		@Title("Validating 'zip' custom parameter of Marquee call ")
		public void Validate_Marquee_zip_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating zip custom parameter of Marquee call");
			logStep("Validating zip custom parameter of Marquee call ");
	

		}

		/*
		 * This method validates zip custom parameter of Feed1 call
		 */
		@Test(priority = 794, enabled = true)
		@Title("Validating 'zip' custom parameter of Feed1 call ")
		public void Validate_Feed1_zip_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating zip custom parameter of Feed1 call");
			logStep("Validating zip custom parameter of Feed1 call ");


		}

		/*
		 * This method validates zip custom parameter of Hourly details call
		 */
		@Test(priority = 796, enabled = true)
		@Title("Validating 'zip' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_zip_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating zip custom parameter of Hourly details call");
			logStep("Validating zip custom parameter of Hourly details call ");


		}


		/*
		 * This method validates tmp custom parameter of Marquee call
		 */
		@Test(priority = 798, enabled = true)
		@Title("Validating 'tmp' custom parameter of Marquee call ")
		public void Validate_Marquee_tmp_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tmp custom parameter of Marquee call");
			logStep("Validating tmp custom parameter of Marquee call ");
			

		}

		/*
		 * This method validates tmp custom parameter of Feed1 call
		 */
		@Test(priority = 800, enabled = true)
		@Title("Validating 'tmp' custom parameter of Feed1 call ")
		public void Validate_Feed1_tmp_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tmp custom parameter of Feed1 call");
			logStep("Validating tmp custom parameter of Feed1 call ");
		

		}

		/*
		 * This method validates tmp custom parameter of Hourly details call
		 */
		@Test(priority = 802, enabled = true)
		@Title("Validating 'tmp' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_tmp_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tmp custom parameter of Hourly details call");
			logStep("Validating tmp custom parameter of Hourly details call ");
	

		}

		/*
		 * This method validates tmpr custom parameter of Marquee call
		 */
		@Test(priority = 804, enabled = true)
		@Title("Validating 'tmpr' custom parameter of Marquee call ")
		public void Validate_Marquee_tmpr_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tmpr custom parameter of Marquee call");
			

		}

		/*
		 * This method validates tmpr custom parameter of Feed1 call
		 */
		@Test(priority = 806, enabled = true)
		@Title("Validating 'tmpr' custom parameter of Feed1 call ")
		public void Validate_Feed1_tmpr_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tmpr custom parameter of Feed1 call");


		}

		/*
		 * This method validates tmpr custom parameter of Hourly details call
		 */
		@Test(priority = 808, enabled = true)
		@Title("Validating 'tmpr' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_tmpr_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating tmpr custom parameter of Hourly details call");
			logStep("Validating tmpr custom parameter of Hourly details call ");


		}


		/*
		 * This method validates dynght custom parameter of Marquee call
		 */
		@Test(priority = 810, enabled = true)
		@Title("Validating 'dynght' custom parameter of Marquee call ")
		public void Validate_Marquee_dynght_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating dynght custom parameter of Marquee call");
			logStep("Validating dynght custom parameter of Marquee call ");
			

		}

		/*
		 * This method validates dynght custom parameter of Feed1 call
		 */
		@Test(priority = 812, enabled = true)
		@Title("Validating 'dynght' custom parameter of Feed1 call ")
		public void Validate_Feed1_dynght_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating dynght custom parameter of Feed1 call");
			logStep("Validating dynght custom parameter of Feed1 call ");


		}

		/*
		 * This method validates dynght custom parameter of Hourly details call
		 */
		@Test(priority = 814, enabled = true)
		@Title("Validating 'dynght' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_dynght_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating dynght custom parameter of Hourly details call");
			logStep("Validating dynght custom parameter of Hourly details call ");
	

		}



		/*
		 * This method validates st custom parameter of Marquee call
		 */
		@Test(priority = 816, enabled = true)
		@Title("Validating 'st' custom parameter of Marquee call ")
		public void Validate_Marquee_st_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating st custom parameter of Marquee call");
			logStep("Validating st custom parameter of Marquee call ");
		

		}

		/*
		 * This method validates st custom parameter of Feed1 call
		 */
		@Test(priority = 818, enabled = true)
		@Title("Validating 'st' custom parameter of Feed1 call ")
		public void Validate_Feed1_st_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating st custom parameter of Feed1 call");
			logStep("Validating st custom parameter of Feed1 call ");
			

		}

		/*
		 * This method validates st custom parameter of Hourly details call
		 */
		@Test(priority = 820, enabled = true)
		@Title("Validating 'st' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_st_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating st custom parameter of Hourly details call");
			logStep("Validating st custom parameter of Hourly details call ");
		

		}
					@Test(priority = 822, enabled = true)
		@Title("Validating 'mr' custom parameter of Marquee call ")
		public void Validate_Marquee_mr_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating mr custom parameter of Marquee call");
			logStep("Validating mr custom parameter of Marquee call ");

	

		}


		@Test(priority = 824, enabled = true)
		@Title("Validating 'mr' custom parameter of Feed1 call ")
		public void Validate_Feed1_mr_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating mr custom parameter of Feed1 call");
			logStep("Validating mr custom parameter of Feed1 call ");
		

		}


		@Test(priority = 826, enabled = true)
		@Title("Validating 'mr' custom parameter of Hourly details call ")
		public void Validate_HourlyDetails_mr_Custom_param() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating mr custom parameter of Hourly details call");
			logStep("Validating mr custom parameter of Hourly details call");

			

		}
	
	
	@Test(priority = 1000, enabled = true)
	@Description("Validating Tapability Of HomeScreen Sticky Test Ad when app in test mode")
	public void Validate_TapabilityOfHomeScreenStickyTestAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Tapability Of HomeScreen Sticky Test Ad in test mode");
		
		
	}
	
	@Test(priority = 1002, enabled = true)
	@Description("Validating Tapability Of Daily Nav Tab Test Ad when app in test mode")
	public void Validate_TapabilityOfDailyNavTabTestAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Tapability Of Daily Nav Tab Test Ad in test mode");
		logStep("Validating Tapability Of Daily Nav Tab Test Ad in test mode");
	
		
	}
	
		@Test(priority = 1004, enabled = true)
	@Description("Validating Tapability Of Radar Nav Tab Test Ad when app in test mode")
	public void Validate_TapabilityOfRadarNavTabTestAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Tapability Of Radar Nav Tab Test Ad in test mode");
		logStep("Validating Tapability Of Radar Nav Tab Test Ad in test mode");
Assert.fail("not able to click the ad on the UI");
		
		
	}


	@Test(priority = 1006, enabled = true)
	@Description("Validating Tapability Of Hourly Nav Tab Test Ad when app in test mode")
	public void Validate_TapabilityOfHourlyavTabTestAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Tapability Of Hourly Nav Tab Test Ad in test mode");
		logStep("Validating Tapability Of Hourly Nav Tab Test Ad in test mode");
		Assert.fail("not able to click the ad on the UI");
	
		
	}
	
	
	
	
	
	
	
	

	


	@Test(priority = 805, enabled = true)
	@Description("Verify Entry Interstitial Ads of Hourly Details Banner from Planning Card")
	public void Verify_interstitial_ads_hourlyDetailsBanner_fromPlanningCard() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Entry Interstitial Ad Verification of Hourly Details Banner from Planning Card====================");

		System.out
				.println("****** Entry Interstitial Ad validation of Hourly Details Banner from Planning Card Started");
		logStep("Exit Interstitial Ad validation of Hourly Details Banner from Planning Card Started ");
	

	}

	@Test(priority = 806, enabled = true)
	@Description("Verify Exit Interstitial Ads of Daily Details Banner from Planning Card")
	public void Verify_interstitial_ads_dailyDetailsBanner_fromPlanningCard() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Exit Interstitial Ad Verification of Daily Details Banner from Planning Card====================");

		System.out.println("****** Exit Interstitial Ad validation of Daily Details Banner from Planning Card Started");
		logStep("Exit Interstitial Ad validation of Daily Details Banner from Planning Card Started ");

	}

	@Test(priority = 807, enabled = true)
	@Description("Verify Exit Interstitial Ads of Daily Card")
	public void Verify_interstitial_ads_dailyCard() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Exit Interstitial Ad Verification of Daily Card====================");

		System.out.println("****** Exit Interstitial Ad validation of Daily Card Started");
		logStep("Exit Interstitial Ad validation of Daily Card Started ");
	
		
	}

	
	
	@Test(priority = 808, enabled = true)
	@Description("Verify Exit Interstitial Ads of Map Card")
	public void Verify_interstitial_ads_mapCard() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Exit Interstitial Ad Verification of Map Card====================");

		System.out.println("****** Exit Interstitial Ad validation of Map Card Started");
		logStep("Exit Interstitial Ad validation of Map Card Started ");
		
	}
	




	


	

	@Test(priority = 923, enabled = true)
	@Description("Validating WM Flu call Ad sz parameter")
	public void Validate_WMFlu_Ad_Siize() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating WM Flu call Ad sz parameter in charles");
		logStep("Validating WM Flu call Ad sz parameter in charles ");



	}

	@Test(priority = 924, enabled = true)
	@Description("Validating WM Flu call Response")
	public void Validate_WMFlu_Call_Response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating WM Flu call response in charles");
		logStep("Validating WM Flu call response in charles ");



	}

	

	

	

	@Test(priority = 934, enabled = true)
	@Description("Validating WM Allergy call Response")
	public void Validate_WMAllergy_Call_Response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating WM Allergy call response in charles");
		logStep("Validating WM Allergy call response in charles ");



	}
	
	@Test(priority = 950, enabled = true)
	@Description("Validating Safety And Preparedness call Response")
	public void Validate_SafetyAndPreparednessCard_Call_Response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating SafetyAndPreparednessCard call response in charles");
		logStep("Validating SafetyAndPreparednessCard call response in charles ");

	

	}
	
	
	/**
	 * This method validate the 'mr' custom parameter of Homescreen sticky ad when kill and launch the app
	 * @throws Exception
	 */
	@Test(priority = 975, enabled = true)
	@Description("Verify 'mr' custom parameter of Homescreen sticky ad when kill and launch the app")
	public void Verify_HomeScreen_Sticky_Ad_mr_Custom_Parameter_When_Kill_And_Launch() throws Exception {
		System.out.println("==============================================");

	
						
		}
		
	
	
	
	/**
	 * This method validate the 'mr' custom parameter of Homescreen sticky ad on interaction With PlanningCard
	 * @throws Exception
	 */
	@Test(priority = 976, enabled = true)
	@Description("Verify 'mr' custom parameter of Homescreen sticky ad on interaction With PlanningCard")
	public void Verify_HomeScreen_Sticky_Ad_mr_Custom_Parameter_On_Interaction_With_PlanningCard() throws Exception {
		System.out.println("==============================================");

		System.out.println("****** Verifying mr custom parameter of Homescreen sticky ad call on interaction With PlanningCard");
		
	}
	
	
	/**
	 * This Script Enable preconfiguration for PreRoll Video Beacon
	 * @throws Exception
	 */
	@Test(priority = 1010, enabled = true)
	@Description("Enabling Preconfiguration for PreRoll Video Beacon")
	public void enable_PreConfiguration_for_PreRoll_Video_Beacon() throws Exception {
	
	}
	
	@Test(priority = 1011, enabled = true)
	@Description("Verify PreRoll Video Beacon")
	public void Verify_PreRoll_Video_Beacon() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== PreRoll Video Beacon ====================");

		System.out.println("****** PreRoll Video Beacon validation Started");
		logStep("****** PreRoll Video Beacon validation Started");

	

	}
	
	@Test(priority = 1020, enabled = true)
	@Description("Enabling Preconfiguration of Map Local to get Severe Insight Card")
	public void enable_PreConfiguration_of_mapLocal_For_Severe_Insight_Card() throws Exception {
		
		
	}
	
	@Test(priority = 1021, enabled = true)
	@Description("Verify Severe Insight Text On Hourly Nav Tab")
	public void Verify_Severe_Insight_Text_On_Hourly_Nav_Tab() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Severe Insight Text On Hourly Nav Tab ====================");

		System.out.println("****** Severe Insight Text On Hourly Nav Tab validation Started");
		logStep("****** Severe Insight Text On Hourly Nav Tab validation Started");
	

	}
	
	@Test(priority = 1022, enabled = true)
	@Description("Verify Severe Insight Text On Daily Nav Tab")
	public void Verify_Severe_Insight_Text_On_Daily_Nav_Tab() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Severe Insight Text On Daily Nav Tab ====================");

		System.out.println("****** Severe Insight Text On Daily Nav Tab validation Started");
		logStep("****** Severe Insight Text On Daily Nav Tab validation Started");


	}
	
	
	
	@Test(priority = 1030, enabled = true)
	@Description("Enabling Preconfiguration of Map Local for Interstitials Verification during Severe Tornado Warning")
	public void enable_PreConfiguration_of_mapLocal_For_Interstitials_verification_during_Tornado_Warning() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Enable Preconfiguration of Map Local for Interstitials Verification during severe Tornado Warning");
		logStep("Enable Preconfiguration of Map Local for Interstitials Verification during severe Tornado Warning");
	
	}
	
	@Test(priority = 1031, enabled = true)
	@Description("Verify Interstitial ad call iu during Severe Tornado Warning")
	public void Verify_Interstitial_AdCall_during_Severe_Tornado_Warning() throws Exception {
		System.out.println("==============================================");
		System.out.println("===========================Interstitial Adcall iu====================");
		
		System.out.println("****** Interstitial Adcall verification Started during Severe Tornado Warning");
		logStep("****** Interstitial Adcall verification Started during Severe Tornado Warning");
		//Utils.verifyPubadCal("Smoke", "Interstitials", false);
	}
	
	@Test(priority = 1035, enabled = true)
	@Description("Enabling Preconfiguration of Map Local for Interstitials Verification during Heat Advisory")
	public void enable_PreConfiguration_of_mapLocal_For_Interstitials_verification_during_Heat_Advisory() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Enable Preconfiguration of Map Local for Interstitials Verification during Heat Advisory");
		logStep("Enable Preconfiguration of Map Local for Interstitials Verification during Heat Advisory");
		
	}
	
	@Test(priority = 1036, enabled = true)
	@Description("Verify Interstitial ad call iu during Heat Advisory")
	public void Verify_Interstitial_AdCall_during_Heat_Advisory() throws Exception {
		System.out.println("==============================================");
		System.out.println("===========================Interstitial Adcall iu====================");
		
		System.out.println("****** Interstitial Adcall verification Started during Heat Advisory");
		logStep("****** Interstitial Adcall verification Started during Heat Advisory");
	//	Utils.verifyPubadCal("Smoke", "Interstitials", true);
		logStep("****** Interstitial Adcall verification Started during Heat Advisory");
	}
	
	/**
	 * LogIn to the App
	 * @throws Exception
	 */
	@Test(priority = 1075, enabled = true)
	@Description("Verify Ads With UPSX LogIn")
	public void verifyAdsWithUPSXLogIn() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** UPSX LogIn test Started");
		logStep("****** UPSX LogIn test Started");
	
	}
	
	/**
	 * This method verifies Lotame call 
	 * @throws Exception
	 */
	@Test(priority = 1076, enabled = true)
	@Description("Lotame Call verification")
	public void Verify_Lotame_Call_When_UPSX_LogIn() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** bcp.crwdcntrl.net Call test case Started");
		logStep("****** bcp.crwdcntrl.net Call test case Started");
		//Utils.verifyAPICal("Smoke", "Lotame", true);
	}

	/**
	 * This method verifies FACTUAL call
	 * @throws Exception
	 */
	@Test(priority = 1077, enabled = true)
	@Description("Factual Call verification")
	public void Verify_LocationWFXTriggers_Call_When_UPSX_LogIn() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** location.wfxtriggers.com Call test case Started");
		logStep("location.wfxtriggers.com Call test case Started");
	//	Utils.verifyAPICal("Smoke", "LocationWFX", false);
	}
	
	/**
	 * This method verifies WFXTriggers call
	 * @throws Exception
	 */
	@Test(priority = 1078, enabled = true)
	@Description("WFXTrigger Call verification")
	public void Verify_WFXTriggers_Call_When_UPSX_LogIn() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** triggers.wfxtriggers.com Call test case Started");
		logStep("****** triggers.wfxtriggers.com Call test case Started");
	//	Utils.verifyAPICal("Smoke", "WFXTrigger", true);
	}
	
	/**
	 * This method verifies Amazon call
	 * @throws Exception
	 */
	@Test(priority = 1079, enabled = true)
	@Description("Amazon aax call verification")
	public void Verify_Amazon_Call_When_UPSX_LogIn() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** amazon-adsystem.com Call test case Started");
		logStep("****** amazon-adsystem.com Call test case Started");
		//Utils.verify_Amazon_aax_call("Smoke", "Amazon", true);
	}
	
	/**
	 * This method verifies Criteo Initialization API call
	 * @throws Exception
	 */
	@Test(priority = 1080, enabled = true)
	@Description("Verify Criteo SDK inapp v2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_When_UPSX_LogIn() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK inapp/v2 call ====================");
		System.out.println("****** Criteo SDK inapp/v2 call validation Started");
		logStep("****** Criteo SDK inapp/v2 call validation Started");
		//Utils.verifyCriteo_inapp_v2_Call("Smoke", "Criteo", true);
	}
	
	/**
	 * This method verifies Criteo Bidder API call
	 * @throws Exception
	 */
	@Test(priority = 1081, enabled = true)
	@Description("Verify Criteo SDK config app call")
	public void Verify_Criteo_SDK_config_app_Call_When_UPSX_LogIn() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK config/app call ====================");
		System.out.println("****** Criteo SDK config/app call validation Started");
		logStep("****** Criteo SDK config/app call validation Started");
		//Utils.verifyCriteo_config_app_Call("Smoke", "Criteo", true);
	}

	/**
	 * This method verifies NextGen IM gampad call
	 * @throws Exception
	 */
	@Test(priority = 1082, enabled = true)
	@Description("Verify Gampad Ad Call")
	public void Verify_Gampad_call_When_UPSX_LogIn() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Gampad Call verification test case Started");
		logStep("****** Gampad Call verification test case Started");
		//Utils.verify_Gampad_adcall("Smoke", "Gampad", true);
	}
	
	/**
	 * LogOut from the App
	 * @throws Exception
	 */
	@Test(priority = 2000, enabled = true)
	@Description("Verify Ads With UPSX LogOut")
	public void verifyAdsWithUPSXLogOut() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** UPSX LogOut test Started");
		logStep("****** UPSX LogOut test Started");
	}
	
	/**
	 * This method verifies Lotame call 
	 * @throws Exception
	 */
	@Test(priority = 2001, enabled = true)
	@Description("Lotame Call verification")
	public void Verify_Lotame_Call_When_UPSX_LogOut() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** bcp.crwdcntrl.net Call test case Started");
		logStep("****** bcp.crwdcntrl.net Call test case Started");
	//	Utils.verifyAPICal("Smoke", "Lotame", true);
	}

	/**
	 * This method verifies FACTUAL call
	 * @throws Exception
	 */
	@Test(priority = 2002, enabled = true)
	@Description("Factual Call verification")
	public void Verify_LocationWFXTriggers_Call_When_UPSX_LogOut() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** location.wfxtriggers.com Call test case Started");
		logStep("location.wfxtriggers.com Call test case Started");
		//Utils.verifyAPICal("Smoke", "LocationWFX", false);
	}
	
	/**
	 * This method verifies WFXTriggers call
	 * @throws Exception
	 */
	@Test(priority = 2003, enabled = true)
	@Description("WFXTrigger Call verification")
	public void Verify_WFXTriggers_Call_When_UPSX_LogOut() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** triggers.wfxtriggers.com Call test case Started");
		logStep("****** triggers.wfxtriggers.com Call test case Started");
		//Utils.verifyAPICal("Smoke", "WFXTrigger", true);
	}
	
	/**
	 * This method verifies Amazon call
	 * @throws Exception
	 */
	@Test(priority = 2004, enabled = true)
	@Description("Amazon aax call verification")
	public void Verify_Amazon_Call_When_UPSX_LogOut() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** amazon-adsystem.com Call test case Started");
		logStep("****** amazon-adsystem.com Call test case Started");
		//Utils.verify_Amazon_aax_call("Smoke", "Amazon", true);
	}
	
	/**
	 * This method verifies Criteo Initialization API call
	 * @throws Exception
	 */
	@Test(priority = 2005, enabled = true)
	@Description("Verify Criteo SDK inapp v2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_When_UPSX_LogOut() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK inapp/v2 call ====================");
		System.out.println("****** Criteo SDK inapp/v2 call validation Started");
		logStep("****** Criteo SDK inapp/v2 call validation Started");
		//Utils.verifyCriteo_inapp_v2_Call("Smoke", "Criteo", true);
	}
	
	/**
	 * This method verifies Criteo Bidder API call
	 * @throws Exception
	 */
	@Test(priority = 2006, enabled = true)
	@Description("Verify Criteo SDK config app call")
	public void Verify_Criteo_SDK_config_app_Call_When_UPSX_LogOut() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK config/app call ====================");
		System.out.println("****** Criteo SDK config/app call validation Started");
		logStep("****** Criteo SDK config/app call validation Started");
		//Utils.verifyCriteo_config_app_Call("Smoke", "Criteo", true);
	}

	/**
	 * This method verifies NextGen IM gampad call
	 * @throws Exception
	 */
	@Test(priority = 2007, enabled = true)
	@Description("Verify Gampad Ad Call")
	public void Verify_Gampad_call_When_UPSX_LogOut() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Gampad Call verification test case Started");
		logStep("****** Gampad Call verification test case Started");
		//Utils.verify_Gampad_adcall("Smoke", "Gampad", true);
	}

	
	
	

	
	
	
	

	
	
	
}

	

