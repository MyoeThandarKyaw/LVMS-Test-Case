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
InternalData data = findTestData("PersonData")
for(def index : (0..data.getRowNumbers()-1)) {
WebUI.openBrowser('')

WebUI.navigateToUrl('http://54.169.247.250:85/Identity/Account/Login?ReturnUrl=%2FAdmin%2FUsers')

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS  Log in/input_v10_InputUserName'), 
    'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/a_People And Organizations'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/a_New Person'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input_Role_IsOwner'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input_Livestock Owner_IsBreedingPartner'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input__Name'))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input_79'), data.internallyGetValue("person_name", index))

WebUI.selectOptionByValue(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/select_'), 
    '၈', true)

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/span_Initial_select2-selection select2-sele_80bf6e'))

WebUI.rightClick(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/li__1_2'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input_Registration Status_NRCTail'))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input_0'), data.internallyGetValue("nrc_no", index))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input__ContactNo'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input__ContactNo'))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input_0_1'), data.internallyGetValue("phone_no", index))

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/textarea_161'), data.internallyGetValue("address", index))

WebUI.scrollToPosition(300, 300)

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/span__select2-selection select2-selection--single'))

WebUI.focus(findTestObject('DataDrivenTestCases/PersonRegistration/Page_LIMS/li__1_2_3'))

WebUI.rightClick(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/li__1_2_3'))

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/PersonRegistration/Page_LIMS/input_Village_btn_save_view'))

 }