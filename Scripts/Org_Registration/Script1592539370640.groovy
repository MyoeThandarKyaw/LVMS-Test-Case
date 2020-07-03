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

WebUI.setText(findTestObject('Object Repository/Org_Registration/Page_LIMS  Log in/input_v10_InputUserName'), 'HNDA')

WebUI.setEncryptedText(findTestObject('Object Repository/Org_Registration/Page_LIMS  Log in/input_v10_InputPassword'), 'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/p_People And Organizations'))

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/a_New Organization'))

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/input__IsOwner'))

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/input_Livestock Owner_IsBreedingPartner'))

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/input__Name'))

WebUI.setText(findTestObject('Object Repository/Org_Registration/Page_LIMS/input_71'), 'ACTIVATOR ENGINEERING AND CONSTRUCTION COMPANY LIMITED')

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/input__OrgRegNo'))

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/div_Role                                   _f18f9f'))

WebUI.setText(findTestObject('Object Repository/Org_Registration/Page_LIMS/input_0'), '125461301')

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/div_Phone Number 1                         _e78f5b'))

WebUI.setText(findTestObject('Object Repository/Org_Registration/Page_LIMS/input_0_1'), '09460496073')

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/input_Phone Number 2_ContactNo2'))

WebUI.setText(findTestObject('Object Repository/Org_Registration/Page_LIMS/input_0_1_2'), '09404967260')

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/input_Phone Number 3_ContactNo3'))

WebUI.setText(findTestObject('Object Repository/Org_Registration/Page_LIMS/input_0_1_2_3'), '09402460967')

WebUI.setText(findTestObject('Object Repository/Org_Registration/Page_LIMS/textarea_172'), 'No-67, Sandar St, Myeik Road')

WebUI.scrollToPosition(100, 100)

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/span__select2-selection select2-selection--single'))

WebUI.rightClick(findTestObject('Org_Registration/Page_LIMS/li__1'))

WebUI.scrollToElement(findTestObject('Org_Registration/Page_LIMS/input_No data available in table_btn-confirm-view'), 10)

WebUI.click(findTestObject('Object Repository/Org_Registration/Page_LIMS/input_No data available in table_btn-confirm-view'))

