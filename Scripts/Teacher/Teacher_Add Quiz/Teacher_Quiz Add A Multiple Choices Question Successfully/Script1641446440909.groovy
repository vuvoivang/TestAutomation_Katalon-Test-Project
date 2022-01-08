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

WebUI.setText(findTestObject('Object Repository/Page_Editing Quiz/input_Name_name'), 'This is a quiz with a multiple choices question')

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_TTH This is a quiz with a question tha_2529fa/button_Edit quiz'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz A multiple choices questi_f96158/span_Add'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz A multiple choices questi_f96158/span_a new question'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz A multiple choices questi_f96158/span_Multiple choice'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz A multiple choices questi_f96158/input_Description_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/input_Question name_name'), 'A multiple choices question')

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/div_ques text'), 'Question text')

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/div_Choice 1'), 'The first answer')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Editing a Multiple choice question/select_None            100            90   _353130'), 
    '1.0', true)

WebUI.click(findTestObject('Object Repository/Page_Editing a Multiple choice question/p'))

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/div_The second answer'), 'The second answer')

WebUI.click(findTestObject('Object Repository/Page_Editing a Multiple choice question/input__submitbutton'))

WebUI.navigateToUrl('http://localhost:8080/moodle/mod/quiz/edit.php?cmid=36&cat=12%2C44&qpage=0')

WebUI.closeBrowser()

