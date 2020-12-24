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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.click(findTestObject('site_public/france/02-menu/001-creer_un_compte/000-menu_btn_user/menu_icone_user'))

WebUI.click(findTestObject('site_public/france/02-menu/001-creer_un_compte/000-menu_btn_user/li_creer_compte'))

//création d'un compte avec un email set par défaut à l'aide d'un time stamp + fin de l'adresse type @quality.com
not_run: WebUI.click(findTestObject('ITA - Site public Italie/03 - Creation de compte/ITA_li_onglet_create_account'))

String ts = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('site_public/france/02-menu/001-creer_un_compte/001-pop_up/input_email_create'), ts + '@quality.com')

WebUI.setEncryptedText(findTestObject('site_public/france/02-menu/001-creer_un_compte/001-pop_up/input_pwd_create'), 'o+tS4OuGt32nW2fw4d97xA==')

WebUI.setEncryptedText(findTestObject('site_public/france/02-menu/001-creer_un_compte/001-pop_up/input_pwd_confirm'), 'o+tS4OuGt32nW2fw4d97xA==')

WebUI.click(findTestObject('site_public/france/02-menu/001-creer_un_compte/001-pop_up/check_cgu'))

WebUI.click(findTestObject('site_public/france/02-menu/001-creer_un_compte/001-pop_up/check_register_newsletter'))

WebUI.click(findTestObject('site_public/france/02-menu/001-creer_un_compte/001-pop_up/check_partnaires_offers'))

WebUI.click(findTestObject('site_public/france/02-menu/001-creer_un_compte/001-pop_up/check_partnaires_offers'))

WebUI.click(findTestObject('site_public/france/02-menu/001-creer_un_compte/001-pop_up/check_register_newsletter'))

'ici le delay est ajouté pour que je fassemanuellement la validation du captcha, il faut ajouter une autorisation pour Katalon pour qu\'elle se fasse sans human'
WebUI.delay(400)

WebUI.click(findTestObject('site_public/france/02-menu/001-creer_un_compte/001-pop_up/btn_s_inscrire'))

WebUI.verifyElementPresent(findTestObject('site_public/france/02-menu/001-creer_un_compte/002-page_validation_create_account/p_validation_envoi_mail_create_account'), 
    0)

not_run: WebUI.closeBrowser()

