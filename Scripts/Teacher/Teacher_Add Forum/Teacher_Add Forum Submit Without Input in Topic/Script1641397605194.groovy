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

WebUI.setText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Username_username'), 'onix')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Password_password'), 'uw4zQNl2RedGtkZxJt1B2nZNxIOg3YnT')

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Course image'))

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/button_Turn editing on'))

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Add an activity or resource'))

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/img_Information about the Folder activity_i_e12f9c'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Forum/input_Forum name_name'), 'My New Forum')

WebUI.click(findTestObject('Object Repository/Page_Editing Forum/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_My New Forum/a_Add a new discussion topic'))

WebUI.click(findTestObject('Object Repository/Page_My New Forum/div_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_My New Forum/input_Message_submitbutton'))

WebUI.closeBrowser()

