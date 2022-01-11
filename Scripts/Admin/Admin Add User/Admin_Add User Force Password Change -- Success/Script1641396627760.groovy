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

WebUI.navigateToUrl('http://localhost:8080/moodle/admin/search.php')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Add a new user'))

WebUI.setText(findTestObject('Page_Moodle Administration Users Accounts/input_Username_username'), 'ycute')

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts/em_Click to enter text'))

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts/i_Click to enter text_icon fa fa-eye fa-fw'))

WebUI.setText(findTestObject('Page_Moodle Administration Users Accounts/input_New password_newpassword'), 'yTest123@')

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts/input_Press enter to save changes_preferenc_a80a7a'))

WebUI.setText(findTestObject('Page_Moodle Administration Users Accounts/input_First name_firstname'), 'Ý')

WebUI.setText(findTestObject('Page_Moodle Administration Users Accounts/input_Surname_lastname'), 'cute')

WebUI.setText(findTestObject('Page_Moodle Administration Users Accounts/input_Email address_email'), 'ycute@gmail.com')

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts/input_Address_submitbutton'))

WebUI.navigateToUrl('http://localhost:8080/moodle/admin/user.php')

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts/a_Admin User'))

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Username_username'), 'ycute')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Password_password'), '2710ZA2DREKCf9mxfuEeww==')

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Change password/div_You must change your password to proceed'), 
    0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_Current password_password'), '2710ZA2DREKCf9mxfuEeww==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_New password_newpassword1'), 'nSzDANEUx/lhr7OBbRdQuw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_New password (again)_newpassword2'), 
    'nSzDANEUx/lhr7OBbRdQuw==')

WebUI.click(findTestObject('Object Repository/Page_Change password/input_New password (again)_submitbutton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Password has been changed/div_Password has been changed'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Password has been changed/button_Continue'))

WebUI.closeBrowser()

