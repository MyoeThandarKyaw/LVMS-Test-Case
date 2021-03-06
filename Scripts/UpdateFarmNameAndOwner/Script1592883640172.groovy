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

WebUI.setText(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS  Log in/input_v10_InputUserName'), 'qcstdev')

WebUI.setEncryptedText(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS  Log in/input_v10_InputPassword'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS  Log in/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS/a_Farms'))

WebUI.navigateToUrl('http://54.169.247.250:85/Farms/Edit/fb2c8637-5a94-435a-81d8-e2cfcc8faf16')

WebUI.switchToWindowTitle('LIMS')

WebUI.click(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS/span_'))

WebUI.rightClick(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS/li_'))

WebUI.click(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS/span_Select'))

WebUI.rightClick(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS/li__1'))

WebUI.click(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS/span_Select Owner'))

WebUI.rightClick(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS/li_Daw Moe Sat May - ()'))

WebUI.setText(findTestObject('UpdateFarmNameAndOwner/Page_LIMS/input_82'), 'Shwe Tar Yar Phyu (MyitKyiNar) Cattle Farm')

WebUI.scrollToElement(findTestObject('UpdateFarmNameAndOwner/Page_LIMS/input_Village_btn-save'), 5)

WebUI.click(findTestObject('Object Repository/UpdateFarmNameAndOwner/Page_LIMS/input_Village_btn-save'))

