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

WebUI.navigateToUrl('http://localhost:8080/moodle/')

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/form_document.getElementById(anchor).value _70e5d4'))

WebUI.setText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Username_username'), 'hoangvu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Password_password'), 'p4y+y39Ir5PR9RXlOHjWlj+CAJiYdX4g')

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_OOP'))

WebUI.click(findTestObject('Object Repository/Page_Course Lp trnh hng i tng 19CTT3/span_Chn 1 bui hc b Choice'))

WebUI.click(findTestObject('Object Repository/Page_Chn 1 bui hc b/input__answer (1)'))

WebUI.click(findTestObject('Object Repository/Page_Chn 1 bui hc b/input__btn btn-primary (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Chn 1 bui hc b/div_Your selection 141'), 'Your selection: 14/1')

WebUI.closeBrowser()

