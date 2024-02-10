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

WebUI.navigateToUrl('https://demo.guru99.com/test/newtours/')

WebUI.click(findTestObject('Object Repository/Local_global_variables_OR/Page_Welcome Mercury Tours/a_REGISTER'))

WebUI.setText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_firstName'), 
    Firstname)

WebUI.setText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_lastName'), 
    GlobalVariable.null)

WebUI.setText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_phone'), GlobalVariable.null)

WebUI.setText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_userName'), 
    GlobalVariable.null)

WebUI.setText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_address1'), 
    '#67, unknown street, unknown city')

WebUI.setText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_city'), 'unknown')

WebUI.setText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_state'), 'province')

WebUI.setText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_postalCode'), 
    '175236')

WebUI.selectOptionByValue(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/select_ALBANIAALGERIAAMERICAN SAMOAANDORRAA_ae5feb'), 
    'ALBANIA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/select_ALBANIAALGERIAAMERICAN SAMOAANDORRAA_ae5feb'), 
    'ALBANIA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/select_ALBANIAALGERIAAMERICAN SAMOAANDORRAA_ae5feb'), 
    'BASSA DE INDIA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/select_ALBANIAALGERIAAMERICAN SAMOAANDORRAA_ae5feb'), 
    'BASSA DE INDIA', true)

WebUI.setText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_email'), 'holadeussa')

WebUI.setEncryptedText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_password'), 
    'IBPvW0T8lyw1ICUD6b3bIQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_confirmPassword'), 
    'IBPvW0T8lyw1ICUD6b3bIQ==')

WebUI.click(findTestObject('Object Repository/Local_global_variables_OR/Page_Register Mercury Tours/input_submit'))

WebUI.closeBrowser()

