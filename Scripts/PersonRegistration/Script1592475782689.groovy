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

WebUI.setText(findTestObject('Object Repository/PersonRegistration/Page_LIMS  Log in/input_v10_InputUserName'), 'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/PersonRegistration/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/p_People And Organizations'))

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/a_New Person'))

WebUI.scrollToPosition(100, 100)

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/input__IsOwner'))

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/input_Livestock Owner_IsBreedingPartner'))

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/input__Name'))

WebUI.scrollToPosition(100, 100)

WebUI.setText(findTestObject('Object Repository/PersonRegistration/Page_LIMS/input_83'), 'Daw Khine Su Wai')

WebUI.selectOptionByValue(findTestObject('Object Repository/PersonRegistration/Page_LIMS/select_'), '၅', true)

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/span_Initial_select2-selection select2-sele_80bf6e'))

WebUI.rightClick(findTestObject('Object Repository/PersonRegistration/Page_LIMS/li_'))

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/input_Registration Status_NRCTail'))

WebUI.scrollToPosition(300, 300)

WebUI.setText(findTestObject('Object Repository/PersonRegistration/Page_LIMS/input_0'), '၇၅၈၃၆၄')

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/input__ContactNo'))

WebUI.setText(findTestObject('Object Repository/PersonRegistration/Page_LIMS/input_1'), '9772588042')

WebUI.setText(findTestObject('Object Repository/PersonRegistration/Page_LIMS/textarea_190'), 'No-67, Sandar St, Myeik Road')

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/span__select2-selection select2-selection--single'))

WebUI.rightClick(findTestObject('Object Repository/PersonRegistration/Page_LIMS/li__1'))

WebUI.click(findTestObject('Object Repository/PersonRegistration/Page_LIMS/input__btn-confirm-view'))

