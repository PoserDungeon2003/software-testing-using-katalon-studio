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

def Valid_Date_Message;
def Invalid_Input_Message;
def Invalid_Date_Message;
def Invalid_Month_Message;
def Invalid_Year_Message;
def Invalid_Feb_Date_Message;
def Invalid_Date_Selected_Month_Message;

def Valid_Date_Template = 'Valid date and time.'
def Invalid_Feb_Date_Template = 'Invalid day for February.'

def days = ['28', '29'];
def years = ['1900', '2000', '2020'];
for (def day :days) {
	for (def year : years) {	
		WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), day)
		
		WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')
		
		WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), year)
		
		WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))
		
		if (day.equals('29') && year.equals('1900')) {
			WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))
			
			Invalid_Feb_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))
			
			if(Invalid_Feb_Date_Message != Invalid_Feb_Date_Template) {
				KeywordUtil.markFailed('Test case failed: ' + day + '/2/'+ year)
			}else {
				KeywordUtil.markPassed('Test case passed')
			}
		}		
		else {
			WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))
			
			Valid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))
			if (Valid_Date_Message != Valid_Date_Template) {
				KeywordUtil.markFailed('Test case failed: '+ day + '/2/'+ year)
			} else {
				KeywordUtil.markPassed('Test case passed')
			}
		}
		
		WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))
	}
}

