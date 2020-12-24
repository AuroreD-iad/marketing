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

WebUI.callTestCase(findTestCase('site_public/france/02-customer_account/010-create_account--need_katalon_testing_permission'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('https://preprod-pub.mail.iadholding.com/#/')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://preprod-pub.mail.iadholding.com/#/')

WebUI.click(findTestObject('maildev_elements/00-alerte_votre_connexion_pas_privee/btn_parametres_avances'))

WebUI.click(findTestObject('maildev_elements/00-alerte_votre_connexion_pas_privee/link_continuer_vers_site'))

WebUI.click(findTestObject('maildev_elements/mail_create_account/email_recu_create                                                                                                 astesttest.fr'))

WebUI.verifyElementText(findTestObject('maildev_elements/mail_create_account/titre_mail_bienvenue'), 'Bienvenue sur IAD France !')

WebUI.verifyElementText(findTestObject('maildev_elements/mail_create_account/p_bonjour'), 'Bonjour,')

WebUI.verifyElementText(findTestObject('maildev_elements/mail_create_account/p1_vous_venez_creer_espace_perso'), 'Vous venez de créer un espace personnel sur notre site et nous vous en remercions.')

WebUI.verifyElementText(findTestObject('maildev_elements/mail_create_account/p2_pour_valider_inscritpion'), 'Pour valider votre inscription, cliquez ici :')

not_run: WebUI.rightClick(findTestObject('maildev_elements/mail_create_account/btn_valider_inscription'))

not_run: WebUI.verifyElementText(findTestObject('maildev_elements/mail_create_account/p3_vous_pouvez_acceder_services'), 
    'Vous pouvez désormais accéder à nos services :\n - La création d\'alertes pour être automatiquement informé par mail de l\'arrivée d\'un bien répondant à vos critères. Vous pourrez définir vous-même la fréquence de ces emails\n - L\'enregistrement de vos biens favoris pour les retrouver en quelques clics lors de vos prochaines visites et être alerté en cas de baisse de prix')

not_run: WebUI.verifyElementText(findTestObject('maildev_elements/mail_create_account/signature_a_bientot'), 'A bientôt sur www.iadfrance.fr\n L\'équipe IAD France.')

not_run: WebUI.verifyElementText(findTestObject('maildev_elements/mail_create_account/adresse_iad_france'), 'IAD FRANCE\n CARRÉ HAUSSMANN III\n ALLÉE DE LA FERME DE VARÂTRE\n 77127 LIEUSAINT\n FRANCE')

WebUI.click(findTestObject('maildev_elements/mail_create_account/btn_valider_inscription'))

WebUI.setText(findTestObject('site_public/france/02-menu/001-creer_un_compte/004-page_valid_create_account/input_email'), 
    'create_account@quality.fr')

WebUI.setEncryptedText(findTestObject('site_public/france/02-menu/001-creer_un_compte/004-page_valid_create_account/input_pwd'), 
    'R2dZ4hvJ2ugmSF41W9Lwpw==')

WebUI.click(findTestObject('site_public/france/02-menu/001-creer_un_compte/004-page_valid_create_account/btn_connexion'))

WebUI.acceptAlert()

WebUI.acceptAlert()

