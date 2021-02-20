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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://taskdev.mile.app/login')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('button_Back'), 0)

WebUI.verifyElementPresent(findTestObject('button_Image'), 0)

WebUI.verifyElementPresent(findTestObject('label_Mile'), 0)

WebUI.verifyElementPresent(findTestObject('hyperlink_ContactUs'), 0)

WebUI.verifyElementPresent(findTestObject('textbox_OrganizationName'), 0)

WebUI.setText(findTestObject('textbox_OrganizationName'), 'testonboard')

WebUI.verifyElementPresent(findTestObject('Button_Login'), 0)

WebUI.click(findTestObject('Button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Image_StarWars'), 0)

WebUI.verifyElementPresent(findTestObject('Label_Email'), 0)

WebUI.verifyElementPresent(findTestObject('label_Password'), 0)

WebUI.verifyElementPresent(findTestObject('textbox_Username'), 0)

WebUI.verifyElementPresent(findTestObject('label_Password'), 0)

WebUI.setText(findTestObject('textbox_Username'), 'Username')

WebUI.setText(findTestObject('textbox_Password'), 'Password')

WebUI.verifyElementPresent(findTestObject('Button_Login'), 0)

WebUI.click(findTestObject('Button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Login failed, please check your email or password.', false)

WebUI.closeBrowser()

