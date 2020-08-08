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

WebUI.navigateToUrl('http://54.169.247.250:85/Identity/Account/Login?ReturnUrl=%2FPeople%2FCreate')

WebUI.setText(findTestObject('Object Repository/LivestockRegistration/Page_LIMS  Log in/input_v10_InputUserName'), 'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/LivestockRegistration/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/LivestockRegistration/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/p_Livestock'))

WebUI.click(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/a_New Livestock'))

WebUI.click(findTestObject('LivestockRegistration/Page_LIMS/span_Select'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/li_'))

WebUI.click(findTestObject('LivestockRegistration/Page_LIMS/span_Select_1'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/li__1'))

WebUI.click(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/span_Select Owner'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/li_U Kaung Htet San - ()'))

WebUI.click(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/input_Animal is_LocationType'))

WebUI.scrollToPosition(300, 300)

WebUI.click(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/input_Livestock Code_LivestockCode'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/input_1'), 'LV-000015')

WebUI.click(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/input__RFID0'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/input_0'), '677190031355622')

WebUI.click(findTestObject('LivestockRegistration/Page_LIMS/span__select2-selection select2-selection--single'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/li_Cattle'))

WebUI.click(findTestObject('LivestockRegistration/Page_LIMS/span__select2-selection select2-selection--single_1'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/li_Jersey cattle'))

WebUI.scrollToElement(findTestObject('LivestockRegistration/Page_LIMS/div_Drop files here to upload'), 5)

CustomKeywords.'photo_upload.photoupload.uploadFile'(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/div_Drop files here to upload'), 
    'D:\\ATO\\AIMS\\Cows_photos\\6.jpg')

WebUI.click(findTestObject('Object Repository/LivestockRegistration/Page_LIMS/input_Total Births Given_btn_save_view'))

