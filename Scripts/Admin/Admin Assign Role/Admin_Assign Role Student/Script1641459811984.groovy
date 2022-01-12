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

WebUI.callTestCase(findTestCase('Admin/Admin_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Site home'))

WebUI.navigateToUrl('http://localhost:8080/moodle/?redirect=0')

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle/a_Lp trnh hng i tng 19CTT3'))

WebUI.click(findTestObject('Object Repository/Page_Course Lp trnh hng i tng 19CTT3/a_Participants'))

WebUI.click(findTestObject('Object Repository/Page_OOP Participants/input_Participants_btn btn-secondary my-1'))

WebUI.setText(findTestObject('Object Repository/Page_OOP Participants/input_No selection_form_autocomplete_input-_a46864'), 
    'ypro')

WebUI.click(findTestObject('Object Repository/Page_OOP Participants/li_Xuan Y Dam Thi    yprotk21gmail.com'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OOP Participants/select_Xuan Y Dam Thi    yprotk21gmail.com _a35d9e'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_OOP Participants/div_Select users'))

WebUI.click(findTestObject('Object Repository/Page_OOP Participants/button_Enrol users'))

WebUI.click(findTestObject('Object Repository/Page_OOP Participants/a_Admin User'))

WebUI.click(findTestObject('Object Repository/Page_OOP Participants/a_Log out'))

WebUI.navigateToUrl('http://localhost:8080/moodle/')

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Username_username'), 'xuany')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Password_password'), 'p4y+y39Ir5PR9RXlOHjWlj+CAJiYdX4g')

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle/a_Lp trnh hng i tng 19CTT3'))

WebUI.click(findTestObject('Object Repository/Page_Course Lp trnh hng i tng 19CTT3/a_Participants'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OOP Participants/th_Xuan Y Dam Thi'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OOP Participants/td_Student'), 0)

WebUI.closeBrowser()

