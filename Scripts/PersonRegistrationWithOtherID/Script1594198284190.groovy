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

WebUI.navigateToUrl('http://54.169.247.250:85/Identity/Account/Login?ReturnUrl=%2Fhome%2FDashboard')

WebUI.setText(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS  Log in/input_v10_InputUserName'), 
    'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/p_People And Organizations'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/a_New Person'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input_Role_IsOwner'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input_Livestock Owner_IsBreedingPartner'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/div_Name'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input__Name'))

WebUI.setText(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input_81'), 'Daw Wint Nandar Htet')

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input_NRC_IdType'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input_Tail_OtherId'))

WebUI.setText(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input_22'), 'MMA00005')

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input__ContactNo'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input__ContactNo'))

WebUI.setText(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input_0'), '09776636373')

WebUI.setText(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/textarea_163'), 'No-78, Shwe War St, Chaung Phyar Road')

WebUI.scrollToElement(findTestObject('PersonRegistrationWithOtherID/Page_LIMS/span__select2-selection select2-selection--single'), 
    2)

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/span__select2-selection select2-selection--single'))

WebUI.focus(findTestObject('PersonRegistrationWithOtherID/Page_LIMS/li_'))

WebUI.rightClick(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/li_'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/span_Town_select2-selection select2-selecti_a6d44a'))

WebUI.rightClick(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/li__1'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/span_Ward_select2-selection select2-selecti_0c08ed'))

WebUI.rightClick(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/li__1_2'))

WebUI.click(findTestObject('Object Repository/PersonRegistrationWithOtherID/Page_LIMS/input_Village_btn_save_view'))

