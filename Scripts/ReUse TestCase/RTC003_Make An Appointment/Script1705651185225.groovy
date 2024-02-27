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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    healthcareCenter, true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Medicare'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_22'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_comment'), comment)

WebUI.rightClick(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_comment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_comment'), '')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 'Appointment Confirmation')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Please be informed that your appointment _11813a'), 
    'Please be informed that your appointment has been booked as following:')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Yes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Medicare'), 'Medicare')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_22012024'), '22/01/2024')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_ok'), 'ok')

