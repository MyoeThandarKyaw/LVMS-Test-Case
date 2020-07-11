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
import com.kms.katalon.core.testdata.InternalData

InternalData data = findTestData("Org_Data")
for(def index : (0..data.getRowNumbers()-1)) {

WebUI.openBrowser('')

WebUI.navigateToUrl('http://54.169.247.250:85/Identity/Account/Login?ReturnUrl=%2FAdmin%2FUsers')

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS  Log in/input_v10_InputUserName'), 
    'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/p_People And Organizations'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/a_New Organization'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_Role_IsOwner'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_Livestock Owner_IsBreedingPartner'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input__Name'))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_69'), data.internallyGetValue("org_name", index))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input__OrgRegNo'))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_0'), data.internallyGetValue("org_reg_no", index))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input__ContactNo1'))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_0_1'), data.internallyGetValue("contact_no1", index))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_Phone Number 2_ContactNo2'))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_1'), data.internallyGetValue("contact_no2", index))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_Phone Number 3_ContactNo3'))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_0_1_2'), data.internallyGetValue("contact_no3", index))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/textarea_161'), data.internallyGetValue("address", index))

WebUI.scrollToPosition(300, 300)

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/span__select2-selection select2-selection--single'))

WebUI.focus(findTestObject('DataDrivenTestCases/OrgRegistration/Page_LIMS/li_'))

WebUI.rightClick(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/li_'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/OrgRegistration/Page_LIMS/input_No data available in table_btn_save_view'))
}
