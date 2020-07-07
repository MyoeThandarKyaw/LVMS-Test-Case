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

WebUI.setText(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS  Log in/input_v10_InputUserName'), 
    'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS/a_Farms'))

WebUI.navigateToUrl('http://54.169.247.250:85/Farms/Edit/704fd75b-9480-450f-8555-453f4382545c')

WebUI.switchToWindowTitle('LIMS')

WebUI.click(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS/input_Person_OwnerType'))

WebUI.click(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS/span_Select Owner'))

WebUI.rightClick(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS/li_SWE TARA PHU COMPANY LIMITED - 125456537'))

WebUI.click(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS/input__Name'))

WebUI.setText(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS/input_71'), 'Shwe Tar Yar Phyu (Taung Gyi) Cattle Farm')

WebUI.click(findTestObject('Object Repository/UpdateFarmOwnerFromPersontoOrg/Page_LIMS/input__btn-save'))

