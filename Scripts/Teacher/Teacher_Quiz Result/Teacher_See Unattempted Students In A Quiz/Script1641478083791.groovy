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

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Quiz Nhiu cu  nhiu la chn'))

WebUI.click(findTestObject('Object Repository/Page_TTH Quiz Nhiu cu  nhiu la chn/a_Quiz Nhiu cu  nhiu la chn_action-menu-toggle-3'))

WebUI.click(findTestObject('Object Repository/Page_TTH Quiz Nhiu cu  nhiu la chn/a_Responses'))

WebUI.navigateToUrl('http://localhost:8080/moodle/mod/quiz/report.php?id=21&mode=responses')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn/select_enrolled users who have attempted th_e23a5c'), 
    'enrolled_without', true)

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn/input_right answer_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn/td_-_1'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn/td_-_1_2'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn/td_-'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn/td_-_1_2_3'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn/td_-_1_2_3_4'), '-')

WebUI.closeBrowser()

