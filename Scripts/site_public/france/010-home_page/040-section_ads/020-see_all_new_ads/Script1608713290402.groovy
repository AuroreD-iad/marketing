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

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/02-dernieres_annonces/btn_voir_toutes_dernieres_annonces'))

not_run: WebUI.click(findTestObject('site_public/france/01-home_page/00-cookies_didomi/btn_accept_cookies'))

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/02-section_ads/02-dernieres_annonces/voir_toutes_les_dernieres_annonces/div_contenant_resultats'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/02-section_ads/02-dernieres_annonces/voir_toutes_les_dernieres_annonces/select_de_tri_plus_recents'), 
    0)

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/02-dernieres_annonces/voir_toutes_les_dernieres_annonces/btn_page_2'))

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/02-dernieres_annonces/voir_toutes_les_dernieres_annonces/btn_page_prev'))

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/02-dernieres_annonces/voir_toutes_les_dernieres_annonces/btn_page_next_page1'))

//il faudrait ici tester la cohérence du nombre d'nanonces réel et du nombre d'annonce affiché dans la div en haut de page
WebUI.closeBrowser()

