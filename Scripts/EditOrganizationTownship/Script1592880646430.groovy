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

WebUI.setText(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS  Log in/input_v10_InputUserName'), 'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/a_People And Organizations'))

WebUI.click(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/a_Organizations'))

WebUI.navigateToUrl('http://54.169.247.250:85/Organizations/Edit/b61e6c59-f86a-4fdf-b247-55dd2a8eb5cd')

WebUI.switchToWindowTitle('LIMS')

WebUI.scrollToPosition(300, 300)

WebUI.click(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/span_'))

WebUI.rightClick(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/li_'))

WebUI.rightClick(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/span_Village Tract_select2-selection select_73d1e1'))

WebUI.click(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/span_Village Tract_select2-selection select_73d1e1_1'))

WebUI.rightClick(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/li__1'))

WebUI.click(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/span_Village_select2-selection select2-sele_31ac95'))

WebUI.rightClick(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/li__1_2'))

WebUI.scrollToElement(findTestObject('EditOrganizationTownship/Page_LIMS/input_Delete_btn-save-view'), 5)

WebUI.click(findTestObject('Object Repository/EditOrganizationTownship/Page_LIMS/input_Delete_btn-save-view'))

