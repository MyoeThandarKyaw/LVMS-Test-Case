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
import com.kms.katalon.core.testdata.InternalData as InternalData
InternalData data = findTestData("LivestockData")
WebUI.openBrowser('')
for (def index : (0..data.getRowNumbers() - 1)) {
    

    WebUI.navigateToUrl('http://54.169.247.250:85/Identity/Account/Login?ReturnUrl=%2FLivestocks%2FCreate')

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS  Log in/input_v10_InputUserName'), 
        'HNDA')

    WebUI.setEncryptedText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS  Log in/input_v10_InputPassword'), 
        'rXz5fG76N1x/0XfTppooEQ==')

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS  Log in/button_Sign In'))

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Person_OwnerType'))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/span_Select Owner'))

    WebUI.rightClick(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/li_LIGHTING BEAUTY COMPANY LIMITED - 125478476'))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Person_BreedingPartnerType'))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/span_Select Breeding Partner'))

    WebUI.rightClick(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/li_LIGHTING BEAUTY COMPANY LIMITED - 125478476_1'))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Animal is_LocationType'))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Livestock Code_LivestockCode'))

    WebUI.scrollToPosition(400, 400)

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_1'), data.internallyGetValue("livestock_code", index))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input__RFID0'))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_0'),  data.internallyGetValue("rfid", index))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Visual Tag (Main)_VisualTag0'))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_11'), data.internallyGetValue("visual_tag", index))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_1_1'), data.internallyGetValue("height", index))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_1_1_2'), data.internallyGetValue("length", index))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_1_1_2_3'), data.internallyGetValue("grith", index))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_2'), data.internallyGetValue("horn", index))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_1_1_2_3_4'), data.internallyGetValue("weight", index))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Body Conditions_BodyConditions'))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_45'), data.internallyGetValue("body_condition", index))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/span__select2-selection select2-selection--single'))

    WebUI.rightClick(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/li_Buffalo'))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/span__select2-selection select2-selection--single_1'))

    WebUI.rightClick(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/li_Cachena'))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/span_Breeding System_select2-selection sele_0c59ec'))

    WebUI.rightClick(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/li_Straightbred'))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Color Markings Brands  Other_ColorMar_851e09'))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_20'), 'White')

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Color Spot_ColorSpot'))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_20_1'), 'Black')

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/button_Use Birthdate Estimator'))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Livestock age is_livestock-age-year'))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_1_1_2_3_4_5'), data.internallyGetValue("livestock_year", index))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_years_livestock-age-month'))

    WebUI.setText(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_1_1_2_3_4_5_6'), 
        data.internallyGetValue("livestock_month", index))

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_on_btn-calculate'))

    WebUI.scrollToPosition(400, 400)

    //WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/div_Drop files here to upload'))
    WebUI.scrollToElement(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/div_Drop files here to upload'), 
        5)

    CustomKeywords.'upload.uploadcowphoto.uploadFile2'(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/div_Drop files here to upload'), 
        'D:\\ATO\\AIMS\\Cows_photos\\10.jpg', 'D:\\ATO\\AIMS\\Cows_photos\\11.jpg', 'D:\\ATO\\AIMS\\Cows_photos\\12.jpg', 
        'D:\\ATO\\AIMS\\Cows_photos\\13.jpg')

    WebUI.click(findTestObject('Object Repository/RegisterLivestockWithAllInformation/Page_LIMS/input_Total Births Given_btn_save_view'))
}