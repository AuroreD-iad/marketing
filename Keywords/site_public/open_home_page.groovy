package site_public

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class open_home_page {
	/**
	 * ouvrir la page d'accueil en validant l'acceptation des cookies
	 */
	@Keyword
	def accept_cookies() {
		WebUI.navigateToUrl(GlobalVariable.home_page)
		WebUI.maximizeWindow()
		WebUI.waitForPageLoad(0)
		/** 
		 * condition si un bouton sur les cookies est présent alors cliquer sur accepter
		 */
		if (WebUI.verifyElementVisible(findTestObject('site_public/france/01-home_page/00-cookies_didomi/btn_accept_cookies'))){
			WebUI.click(findTestObject('site_public/france/01-home_page/00-cookies_didomi/btn_accept_cookies'))
		}
	}
}
