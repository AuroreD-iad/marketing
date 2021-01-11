import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

CustomKeywords.'site_public.open_home_page.accept_cookies'()

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/000-header_full_menu'), 0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/h1_achetez_louez_vendez'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/btn_recherche'), 0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/02-section_ads/00-elements_generiques/h2_nos_derniere_annonces_immo'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/02-section_ads/00-elements_generiques/a_onglet_a_vendre'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/02-section_ads/00-elements_generiques/a_onglet_louer'), 
    0)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_a_vendre/button_previous_not_clickable'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/02-section_ads/02-dernieres_annonces/btn_voir_toutes_dernieres_annonces'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/02-section_ads/03-coups_de_coeur/btn_voir_coup_de_coeur'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/03-section_engagement/btn_voir_avis'), 0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/06-section_footer/01-partie_liens_iad/div_vente_liste_villes'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/06-section_footer/03-partie_liens_info/div_liens_info'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/06-section_footer/02-partie_reseaux_sociaux/p_suivez_nous'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/06-section_footer/00-footer'), 0)

WebUI.closeBrowser()

