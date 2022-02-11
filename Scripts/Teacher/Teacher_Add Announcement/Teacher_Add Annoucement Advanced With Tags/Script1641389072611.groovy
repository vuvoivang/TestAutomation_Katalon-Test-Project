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

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Announcements Forum'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/a_Add a new topic (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Announcements/input_Subject_subject (1)'), 'Topic With Tags')

WebUI.setText(findTestObject('Object Repository/Page_Announcements/div_This is a topic with advanced field tags (1)'), 'This is a topic with advanced field tags')

WebUI.click(findTestObject('Object Repository/Page_Announcements/input_Cancel_advancedadddiscussion (1)'))

WebUI.click(findTestObject('Object Repository/Page_TTH Add a new topic/a_Tags (1)'))

WebUI.setText(findTestObject('Object Repository/Page_TTH Add a new topic/input_No selection_form_autocomplete_input-_69419d (1)'), 
    'Sample Tags')

WebUI.click(findTestObject('Object Repository/Page_TTH Add a new topic/div_Selected items                No select_148724 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TTH Add a new topic/select_sample tags (1)'), 'Sample Tags', 
    true)

WebUI.click(findTestObject('Object Repository/Page_TTH Add a new topic/div_Sample Tags                            _c5a69e (1)'))

WebUI.click(findTestObject('Object Repository/Page_TTH Add a new topic/input__submitbutton (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Announcements/p_Your post was successfully added'), 'Your post was successfully added.')

WebUI.closeBrowser()

