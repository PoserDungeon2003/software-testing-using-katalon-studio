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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '29')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2000')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '29')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2009')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '31')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2020')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '30')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '3')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '32')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '4')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2009')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '-1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2000')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '29')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '30')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '30')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '31')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '31')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '3')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2009')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '-1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2000')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2000')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2009')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '32')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '3')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.closeBrowser()

