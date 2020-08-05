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

WebUI.navigateToUrl('http://54.169.247.250:85/Identity/Account/Login?ReturnUrl=%2FLivestocks%2FCreate')

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS  Log in/input_v10_InputUserName'), 
    'HNDA')

WebUI.setEncryptedText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Select'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/li_'))

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Select_1'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/li__1'))

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Select Owner'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/li_Daw Hinin Wutyi Mon - ()'))

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Select_1_2'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/li__1_2'))

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Select_1_2_3'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/li__1_2_3'))

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Select Breeding Partner'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/li_Daw Hinin Wutyi Mon - ()_1'))

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_Animal is_LocationType'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_1'), '34')

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_1_1'), '43')

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_1_1_2'), '53')

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_1_1_2_3'), '64')

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_0'), '123')

WebUI.scrollToPosition(400, 400)

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_Body Conditions_BodyConditions'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_45'), 'fatty')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/div_Currently Pregnant                     _5aef01'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_1_1_2_3_4'), '5')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_Livestock Code_LivestockCode'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_1_1_2_3_4_5'), 'LV-000031')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input__RFID0'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_0_1'), '677190031355646')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_Visual Tag (Main)_VisualTag0'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_11'), 'LV-000031')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/b'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/li_Sheep'))

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span__select2-selection select2-selection--single'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/li_Bue Lingo'))

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Breeding System_select2-selection sele_0c59ec'))

WebUI.rightClick(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/li_Multiple Sire Breed'))

WebUI.scrollToElement(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_Color Markings Brands  Other_ColorMar_851e09'), 
    3)

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_Color Markings Brands  Other_ColorMar_851e09'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_20'), 'White')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_Color Spot_ColorSpot'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_20_1'), 'Black')

WebUI.scrollToElement(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/button_Use Birthdate Estimator'), 
    3)

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/button_Use Birthdate Estimator'))

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_Livestock age is_livestock-age-year'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_1_1_2_3_4_5_6'), '7')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_years_livestock-age-month'))

WebUI.setText(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_1_1_2_3_4_5_6_7'), '1')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_on_btn-calculate'))

WebUI.scrollToElement(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Drop files here to upload'), 
    5)

//WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Drop files here to upload'))
CustomKeywords.'upload.uploadcowphoto.uploadFile2'(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/span_Drop files here to upload'), 
    'D:\\ATO\\AIMS\\Cows_photos\\10.jpg', 'D:\\ATO\\AIMS\\Cows_photos\\11.jpg', 'D:\\ATO\\AIMS\\Cows_photos\\12.jpg', 'D:\\ATO\\AIMS\\Cows_photos\\13.jpg')

WebUI.click(findTestObject('Object Repository/LivestockRegistrationOwneris_Person/Page_LIMS/input_Total Births Given_btn_save_view'))