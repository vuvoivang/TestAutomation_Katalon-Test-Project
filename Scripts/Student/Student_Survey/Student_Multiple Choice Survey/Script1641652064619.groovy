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

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Survey ALLTS'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Not yet answered_q45'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q46'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Not yet answered_q47'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q48'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Not yet answered_q49'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q50'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q52'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q51'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Not yet answered_q53'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Not yet answered_q54'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q55'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Not yet answered_q56'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q57'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q58'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q59'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q60'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q61'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q62'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q63'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly disagree_q64'))

WebUI.click(findTestObject('Object Repository/Page_Survey ALLTS/input_Strongly agree_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Survey saved/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Survey ALLTS'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Survey ALLTS/div_Youve completed this survey.  The graph_fd12d9'), 
    'You\'ve completed this survey. The graph below shows a summary of your results compared to the class averages.')

WebUI.closeBrowser()

