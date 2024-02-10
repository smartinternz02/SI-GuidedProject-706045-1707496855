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


//Scripting mode  for testing

//Open Browser
WebUI.openBrowser("")

//Give the URL
WebUI.navigateToUrl("https://www.amazon.com")


//click on a button
WebUI.click(findTestObject(location_of_object))

//mazimize window
WebUI.maximizeWindow()

//to capture a URL
String Url = WebUI.getUrl()
system.out.println(Url)


//window number
system.out.println(WebUI.getWindowIndex())


//display window title
system.out.println(WebUI.getWindowTitle())


//for delaying in website opening
WebUI.delay(6)

WebUI.navigateToUrl("https://www.quora.com")


//take back to previous window
WebUI.back()

WebUI.navigateToUrl("https://www.katalon.com")




//type in something ( e.g. username)
WebUI.setText(location_of_object)
