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

WebUI.navigateToUrl('http://54.169.247.250:85/')

WebUI.setText(findTestObject('Object Repository/FarmRegistration/Page_LIMS  Log in/input_v10_InputUserName'), 'HNDA')

WebUI.setEncryptedText(findTestObject('Object Repository/FarmRegistration/Page_LIMS  Log in/input_v10_InputPassword'), 'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/FarmRegistration/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/FarmRegistration/Page_LIMS/a_Farms'))

WebUI.click(findTestObject('Object Repository/FarmRegistration/Page_LIMS/a_New Farm'))

WebUI.click(findTestObject('Object Repository/FarmRegistration/Page_LIMS/span_Select'))

WebUI.rightClick(findTestObject('FarmRegistration/Page_LIMS/li_ ()'))

WebUI.click(findTestObject('Object Repository/FarmRegistration/Page_LIMS/span_Select_1'))

WebUI.rightClick(findTestObject('FarmRegistration/Page_LIMS/li_ - Copy'))

WebUI.click(findTestObject('Object Repository/FarmRegistration/Page_LIMS/span_Select Owner'))

WebUI.rightClick(findTestObject('FarmRegistration/Page_LIMS/li_Daw Theint Thinzar Han - ()'))

WebUI.click(findTestObject('Object Repository/FarmRegistration/Page_LIMS/input__Name'))

WebUI.setText(findTestObject('Object Repository/FarmRegistration/Page_LIMS/input_82'), 'Joe Phyu Cattle Farm')

WebUI.setText(findTestObject('Object Repository/FarmRegistration/Page_LIMS/textarea_Online Map Link_OnlineMapLink'), 'https://www.guru99.com/software-testing.html')

WebUI.click(findTestObject('Object Repository/FarmRegistration/Page_LIMS/label_Same as Owners'))

WebUI.click(findTestObject('FarmRegistration/Page_LIMS/Page_LIMS/input_Village_btn-save'))

