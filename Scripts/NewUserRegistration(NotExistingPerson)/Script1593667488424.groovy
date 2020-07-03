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

WebUI.setText(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS  Log in/input_v10_InputUserName'), 
    'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/a_Setup'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/a_Users'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/a_New User'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_Basic Info_IsAdministrator'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_Username_UserName'))

WebUI.setText(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_4'), 'ZZLW')

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_Password_auto_generate_checkbox'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/a_Auto-generate_input-group-text'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_Auto-generate_PwdChangeRequiredAtFirstLogin'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/span_Role_select2-selection select2-selecti_5ebf64'))

WebUI.rightClick(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/li_YCDCUser'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_Name_PersonName'))

WebUI.setText(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_78'), 'Daw Zun Za Lus Wha')

WebUI.selectOptionByValue(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/select_'), 
    '၅', true)

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/span_Initial_select2-selection select2-sele_80bf6e'))

WebUI.rightClick(findTestObject('Person/Page_LIMS/li_'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_Registration Status_PersonNRCTail'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_Registration Status_PersonNRCTail'))

WebUI.setText(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_0'), '၈၄၇၄၈၇')

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_Phone Number_PersonContactNo'))

WebUI.setText(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input_0_1'), '09874646644')

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/span_StateRegion_select2-selection select2-_191195'))

WebUI.rightClick(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/li_'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/span_District_select2-selection select2-sel_d567a0'))

WebUI.rightClick(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/li__1'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/span_Township_select2-selection select2-sel_848e1b'))

WebUI.rightClick(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/li__1_2'))

WebUI.click(findTestObject('Object Repository/NewUserRegistration(NotExistingPerson)/Page_LIMS/input__btn_save_view'))

