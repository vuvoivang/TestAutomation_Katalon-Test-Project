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

WebUI.click(findTestObject('Object Repository/Page_Course Ton t hp/span_Quiz Nhiu cu  nhiu la chn'))

WebUI.navigateToUrl('http://localhost:8080/moodle/mod/quiz/view.php?id=21')

WebUI.click(findTestObject('Object Repository/Page_TTH Quiz Nhiu cu  nhiu la chn/button_Attempt quiz now'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 1 of 2)/div_b. 6'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 1 of 2)/input_a_q201_choice1'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 1 of 2)/input_b_q201_choice2'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 1 of 2)/input_c_q201_choice3'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 1 of 2)/input_b_q202_choice2'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 1 of 2)/input_a_q202_choice1'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 1 of 2)/input_c_q202_choice3'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 1 of 2)/input_Question text_q202_choice0'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 1 of 2)/input_d_next'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 2 of 2)/input_c_q203_choice3'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 2 of 2)/div_c. 32'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 2 of 2)/input_b_q203_choice2'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn (page 2 of 2)/input_d_next'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn Attempt summary/td_Answer saved'), 
    'Answer saved')

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn Attempt summary/button_Submit all and finish_1'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn Attempt summary/input_Once you submit, you will no longer b_741fcb'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn Attempt review/td_Finished'), 'Finished')

WebUI.click(findTestObject('Object Repository/Page_Quiz Nhiu cu  nhiu la chn Attempt review/a_Finish review'))

WebUI.closeBrowser()

