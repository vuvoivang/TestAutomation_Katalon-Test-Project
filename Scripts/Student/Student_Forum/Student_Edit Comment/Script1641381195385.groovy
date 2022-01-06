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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Lp trnh hng i tng 19CTT3'))

WebUI.click(findTestObject('Object Repository/Page_Course Lp trnh hng i tng 19CTT3/span_OOP 19_3 Forum'))

WebUI.click(findTestObject('Object Repository/Page_OOP 19_3 Forum/a_Tho lun  thi cui k 2019-2020'))

WebUI.click(findTestObject('Object Repository/Page_OOP Tho lun  thi cui k 2019-2020/a_Edit'))

WebUI.click(findTestObject('Object Repository/Page_OOP Tho lun  thi cui k 2019-2020 Tho l_939791/div_Okay'))

WebUI.setText(findTestObject('Object Repository/Page_OOP Tho lun  thi cui k 2019-2020 Tho l_939791/div_Okay Edited'), '<div class="text_to_html" style="" id="yui_3_17_2_1_1641381458399_755">Okay Edited!!!</div>')

WebUI.click(findTestObject('Object Repository/Page_OOP Tho lun  thi cui k 2019-2020 Tho l_939791/input__submitbutton'))

WebUI.closeBrowser()

