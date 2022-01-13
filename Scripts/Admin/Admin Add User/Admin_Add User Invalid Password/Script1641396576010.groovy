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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Add a new user'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts/input_Username_username'), 'yk15')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts/em_Click to enter text'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts/i_Click to enter text_icon fa fa-eye fa-fw'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts/input_New password_newpassword'), 
    'y')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts/input_First name_firstname'), 
    'Ý')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts/input_Surname_lastname'), 'Đàm')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts/input_Email address_email'), 'ydamk15@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts/input_Address_submitbutton'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/div_Passwords must be at least 8 characters long'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/div_Passwords must have at least 1 digit(s)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/div_Passwords must have at least 1 upper ca_8e926f'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/div_The password must have at least 1 speci_80717b'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

