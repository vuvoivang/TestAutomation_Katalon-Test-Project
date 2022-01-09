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

WebUI.navigateToUrl('http://localhost:8080/moodle/course/view.php?id=4')

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Quiz Nhiu la chn  Mt cu'))

WebUI.navigateToUrl('http://localhost:8080/moodle/mod/quiz/view.php?id=20')

WebUI.click(findTestObject('Object Repository/Page_TTH Quiz Nhiu la chn  Mt cu/button_Re-attempt quiz'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu la chn  Mt cu/input_Question text_q261_choice0'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu la chn  Mt cu/input_a_q261_choice1'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu la chn  Mt cu/input_d_next'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn Attempt summary/td_Answer saved'), 
    'Answer saved')

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu la chn  Mt cu Attempt summary/button_Submit all and finish'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu la chn  Mt cu Attempt summary/input_Once you submit, you will no longer b_983128'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn Attempt review/td_Finished'), 'Finished')

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu la chn  Mt cu Attempt review/a_Finish review'))

WebUI.closeBrowser()

