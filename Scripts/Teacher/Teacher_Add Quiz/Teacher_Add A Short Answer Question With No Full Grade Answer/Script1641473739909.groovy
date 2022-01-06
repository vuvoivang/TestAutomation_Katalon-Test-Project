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

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Add an activity or resource_1'))

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/a_Quiz_1'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Quiz/input_Name_name'), 'This is a quiz that has a short answer question with no full grade answer')

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_TTH This is a quiz with a name/button_Edit quiz'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz This is a quiz with a name/a_Add'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz This is a quiz with a name/span_a new question'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz This is a quiz with a name/label_Short answer                         _b7d048'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz This is a quiz with a name/input_Description_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Page_Editing a Short answer question/input_Question name_name'), 'A short answer question')

WebUI.setText(findTestObject('Object Repository/Page_Editing a Short answer question/div_Question text'), 'Question text')

WebUI.setText(findTestObject('Object Repository/Page_Editing a Short answer question/input_Answer 1_answer0'), 'Answer that is not full grade')

WebUI.setText(findTestObject('Object Repository/Page_Editing a Short answer question/input_Answer 2_answer1'), 'Another answer that is not full grade')

WebUI.click(findTestObject('Object Repository/Page_Editing a Short answer question/input__submitbutton'))

WebUI.closeBrowser()

