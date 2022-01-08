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

WebUI.setText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Username_username'), 'hoangvu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/input_Password_password'), 'p4y+y39Ir5PR9RXlOHjWlj+CAJiYdX4g')

WebUI.click(findTestObject('Object Repository/Page_BCS Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_TTH'))

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Survey Critical Incidents'))

WebUI.setText(findTestObject('Object Repository/Page_Survey Critical Incidents/textarea_At what moment in class were you m_f5425c'), 
    'A')

WebUI.setText(findTestObject('Object Repository/Page_Survey Critical Incidents/textarea_At what moment in class were you m_a98c70'), 
    'B')

WebUI.setText(findTestObject('Object Repository/Page_Survey Critical Incidents/textarea_What action from anyone in the for_4db313'), 
    'C')

WebUI.setText(findTestObject('Object Repository/Page_Survey Critical Incidents/textarea_What action from anyone in the for_b7ee52'), 
    'D')

WebUI.setText(findTestObject('Object Repository/Page_Survey Critical Incidents/textarea_What event surprised you most_q73'), 
    'E')

WebUI.click(findTestObject('Object Repository/Page_Survey Critical Incidents/input_What event surprised you most_btn btn_1c5d04'))

WebUI.click(findTestObject('Object Repository/Page_Survey saved/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Survey Critical Incidents'))

WebUI.closeBrowser()

