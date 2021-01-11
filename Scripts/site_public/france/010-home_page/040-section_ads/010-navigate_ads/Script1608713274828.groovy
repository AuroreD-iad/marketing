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

WebUI.delay(3)

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_louer/a_onglet_louer'))

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_a_vendre/a_onglet_vendre'))

WebUI.delay(1)

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_a_vendre/btn_next'))

WebUI.delay(1)

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_a_vendre/btn_next'))

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_a_vendre/btn_prev'))

WebUI.delay(1)

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_a_vendre/btn_prev'))

WebUI.delay(1)

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_louer/a_onglet_louer'))

WebUI.delay(1)

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_louer/button_next'))

WebUI.delay(1)

WebUI.click(findTestObject('site_public/france/01-home_page/02-section_ads/01-boutons_navigation/onglet_louer/button_previous'))

WebUI.delay(1)

WebUI.closeBrowser()

