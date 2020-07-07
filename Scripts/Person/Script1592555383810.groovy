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

WebUI.setText(findTestObject('Object Repository/Person/Page_LIMS  Log in/input_v10_InputUserName'), 'HNDA')

WebUI.setEncryptedText(findTestObject('Object Repository/Person/Page_LIMS  Log in/input_v10_InputPassword'), 'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/Person/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Person/Page_LIMS/input__IsOwner'))

WebUI.click(findTestObject('Object Repository/Person/Page_LIMS/input_Livestock Owner_IsBreedingPartner'))

WebUI.scrollToPosition(200, 200)

WebUI.click(findTestObject('Object Repository/Person/Page_LIMS/input__Name'))

WebUI.setText(findTestObject('Object Repository/Person/Page_LIMS/input_84'), 'Daw Kay Khine Nyein')

WebUI.selectOptionByValue(findTestObject('Object Repository/Person/Page_LIMS/select_'), '၅', true)

WebUI.click(findTestObject('Person/Page_LIMS/span_Initial_select2-selection select2-sele_80bf6e'))

WebUI.rightClick(findTestObject('Person/Page_LIMS/li_'))

WebUI.click(findTestObject('Object Repository/Person/Page_LIMS/input_Registration Status_NRCTail'))

WebUI.setText(findTestObject('Object Repository/Person/Page_LIMS/input_0'), '၇၆၂၄၈၂')

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Person/Page_LIMS/input__ContactNo'))

WebUI.setText(findTestObject('Object Repository/Person/Page_LIMS/input_0_1'), '09475196478')

WebUI.setText(findTestObject('Object Repository/Person/Page_LIMS/textarea_189'), '09494984447')

WebUI.click(findTestObject('Object Repository/Person/Page_LIMS/span__select2-selection select2-selection--single'))

WebUI.rightClick(findTestObject('Object Repository/Person/Page_LIMS/li__1'))

WebUI.click(findTestObject('Object Repository/Person/Page_LIMS/Page_LIMS/input_Village_btn_save_view'))

