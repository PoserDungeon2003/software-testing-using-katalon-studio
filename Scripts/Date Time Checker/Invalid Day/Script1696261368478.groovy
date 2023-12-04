import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.GetText

import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.AND
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

def Invalid_Date_Message;

def Invalid_Date_Template = 'Invalid day. Please enter a value between 1 and 31.'

//def days = ['1', '-1', '30', '31', '32'];
//def months = ['-1', '1', '4', '13']
//def years = ['-1', '2023', '4000'];

def days = ['32', '-1'];
for (def day :days) {
		WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), day)
		
		WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '1')
		
		WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2023')
		
		WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))
		
		WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))
		
		Invalid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))
		if (Invalid_Date_Message != Invalid_Date_Template) {
			KeywordUtil.markFailed('Test case failed: ' + day + '/1/2023')
		} else {
			KeywordUtil.markPassed('Test case passed: ' + day + '/1/2023')
		}	
		WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))
}

