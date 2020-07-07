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

WebUI.navigateToUrl('http://54.169.247.250:85/Identity/Account/Login?ReturnUrl=%2FPeopleAndOrganizations')

WebUI.setText(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS  Log in/input_v10_InputUserName'), 
    'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/a_Organizations'))

WebUI.navigateToUrl('http://54.169.247.250:85/Organizations/Edit/08adbb5c-9781-46b3-bdb5-b7ddfdb83b5b')

WebUI.switchToWindowTitle('LIMS')

WebUI.scrollToPosition(300, 300)

WebUI.click(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/button_Add Person'))

WebUI.click(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/span_Select'))

WebUI.focus(findTestObject('EditOrganizationWithContactPerson/Page_LIMS/li_ ()'))

WebUI.rightClick(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/li_ ()'))

WebUI.click(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/span_Select_1_2'))

WebUI.focus(findTestObject('EditOrganizationWithContactPerson/Page_LIMS/li_'))

WebUI.rightClick(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/li_'))

WebUI.click(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/span_Select Person_1'))

WebUI.focus(findTestObject('EditOrganizationWithContactPerson/Page_LIMS/li_Daw Poe April Htet - ()'), FailureHandling.STOP_ON_FAILURE)

WebUI.rightClick(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/li_Daw Poe April Htet - ()'))

WebUI.setText(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/input_Job Position_JobPosition'), 
    'Manager')

WebUI.click(findTestObject('Object Repository/EditOrganizationWithContactPerson/Page_LIMS/input_Job Position_btn-confirm-person'))

WebUI.click(findTestObject('EditOrganizationWithContactPerson/Page_LIMS/input_No data available in table_btn_save_view'))

