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

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/00-type_recherche_vente_location/select_type_recherche_titre_acheter'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/00-type_recherche_vente_location/li_louer'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/00-type_recherche_vente_location/select_type_recherche_titre_louer'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/00-type_recherche_vente_location/li_acheter'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/00-type_recherche_vente_location/select_type_recherche_titre_acheter'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/btn_plus_criteres'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/select_type_bien'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/li_type_appartement'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/li_type_maison'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/li_type_maison'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/li_type_garage'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/li_type_batiment'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/li_type_bureau'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/li_type_terrain'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/select_type_bien'))

WebUI.verifyElementText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/01-type_bien/select_type_bien'), 
    '6 Type(s) de bien')

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/02-nb_room/select_nb_pieces'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/02-nb_room/li_room_1'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/02-nb_room/li_room_2'))

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/02-nb_room/li_room_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/02-nb_room/li_room_4'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/02-nb_room/li_room_5'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/li_bedroom_6_more'), 
    0)

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/02-nb_room/select_titre_2_pieces'))

WebUI.verifyElementText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/02-nb_room/select_nb_pieces'), 
    '1 pièce , 2 pièces')

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/select_nb_chambres'))

WebUI.check(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/li_bedroom_1'))

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/li_bedroom_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/li_bedroom_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/li_bedroom_4'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/li_bedroom_5'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/li_bedroom_6_more'), 
    0)

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/select_titre_1chbre'))

WebUI.verifyElementText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/03-nb_bedroom/select_titre_1chbre'), 
    '1 chambre')

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/04-etendre_recherche/select_etendre_recherche'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/04-etendre_recherche/li_15km'))

WebUI.verifyElementText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/04-etendre_recherche/select_etendre_recherche'), 
    '15 km')

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/select_dpe'))

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/li_note_dpe_a'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/li_note_dpe_b'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/li_note_dpe_c'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/li_note_dpe_d'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/li_note_dpe_e'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/li_note_dpe_f'), 
    0)

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/li_note_dpe_g'), 
    0)

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/li_note_dpe_a'))

WebUI.verifyElementText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/05-dpe/select_dpe'), 
    'A')

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/06-type_mandat/select_type_mandat'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/06-type_mandat/li_mandat_exclusif'))

WebUI.verifyElementText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/06-type_mandat/select_type_mandat'), 
    'Exclusif')

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/07-num_mandat/input_num_mandat'), 
    0)

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/select_tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/li_tag_exclusivite'))

WebUI.verifyElementText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/select_tag'), 
    'Exclusivité')

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/li_tag_coup_de_coeur'), 
    0)

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/li_tag_nouveau'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/li_tag_baisse_prix'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/li_tag_sous_compromis'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/li_tag_neuf'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/li_tag_prestige'))

WebUI.verifyElementText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/10-tag/select_tag'), 
    '6 Tag(s)')

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/09-price/dropdown_prix_min_max'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/09-price/input_min_price'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/09-price/input_max_price'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/08-surface/dropdown_surface_min_max'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/08-surface/input_surface_min'))

WebUI.setText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/08-surface/input_surface_min'), 
    '30')

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/08-surface/input_surface_max'))

WebUI.setText(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/11-input_where/input_saisie_localisation'), 
    'pari')

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/11-input_where/li_paris'))

WebUI.click(findTestObject('site_public/france/01-home_page/01-section_search/01-search_bar/button_recherche'))

WebUI.verifyElementPresent(findTestObject('site_public/france/01-home_page/01-section_search/resultats_recherche/div_resultat_recherche'), 
    0)

WebUI.closeBrowser()

