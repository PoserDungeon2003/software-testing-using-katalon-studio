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
def Invalid_Input_Template = 'Invalid input. Please enter numeric values for day, month, and year.'
def Invalid_Date_Template = 'Invalid day. Please enter a value between 1 and 31.'
def Invalid_Month_Template = 'Invalid month. Please enter a value between 1 and 12.'
def Invalid_Year_Template = 'Invalid year. Please enter a value between 1000 and 3000.'
def Invalid_Feb_Date_Template = 'Invalid day for February.'
def Invalid_Date_Selected_Month_Template = 'Invalid day for the selected month.'

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '29')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2000')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))

//def days = ['29', '31', '30', '32', '-1', '1', '28']
//
//def months = ['13', '4', '2', '1']
//
//def years = ['1600', '2023', '4000', '-1']
//
//for (def day : days) {
//	
//	for(def month : months) {
//		
//		for(def year : years) {
//			WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), day)
//			
//			WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), month)
//			
//			WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), year)
//			
//			WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))
//			
//			WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))
//			
//		}
//	}
//}

Valid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))

if (Valid_Date_Message != Valid_Date_Template) {
    KeywordUtil.markFailedAndStopAndStop('Test case failed')
} else {
    KeywordUtil.markPassed('Test case passed')
}


WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '29')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2009')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))

Invalid_Feb_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))

if(Invalid_Feb_Date_Message != Invalid_Feb_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
}else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '31')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2020')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))

Invalid_Feb_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))

if(Invalid_Feb_Date_Message != Invalid_Feb_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
}else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '30')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '3')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))

Valid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))
if (Valid_Date_Message != Valid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '32')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '4')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2009')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))

Invalid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))
if (Invalid_Date_Message != Invalid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '31')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '4')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2023')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for the selected month'))

Invalid_Date_Selected_Month_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for the selected month'))
if (Invalid_Date_Selected_Month_Message != Invalid_Date_Selected_Month_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '-1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2000')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))

Invalid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))
if (Invalid_Date_Message != Invalid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '29')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))

Valid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))
if (Valid_Date_Message != Valid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '30')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))

Valid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))
if (Valid_Date_Message != Valid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '30')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

Invalid_Feb_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))

if(Invalid_Feb_Date_Message != Invalid_Feb_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
}else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '31')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))

Invalid_Feb_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day for February'))

if(Invalid_Feb_Date_Message != Invalid_Feb_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
}else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '31')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '3')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2009')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))

Valid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))
if (Valid_Date_Message != Valid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '-1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2000')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))

Invalid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))
if (Invalid_Date_Message != Invalid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2000')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))

Valid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))
if (Valid_Date_Message != Valid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '1')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '2')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2009')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))

Valid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Valid date and time'))
if (Valid_Date_Message != Valid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '32')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '3')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))

Invalid_Date_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid day. Please enter a value between 1 and 31'))
if (Invalid_Date_Message != Invalid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '31')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '13')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '2024')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid month. Please enter a value between 1 and 12'))

Invalid_Month_Message = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid month. Please enter a value between 1 and 12'))
if (Invalid_Date_Message != Invalid_Date_Template) {
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Day_r1'), '31')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Month_r3'), '12')

WebUI.setText(findTestObject('Object Repository/Date Time Checker/Page_React App/input_Year_r5'), '4000')

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Check'))

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid year. Please enter a value between 1000 and 3000'))

Invalid_Year_Message  = WebUI.getText(findTestObject('Object Repository/Date Time Checker/Page_React App/p_Invalid year. Please enter a value between 1000 and 3000'))
if (Invalid_Year_Message != Invalid_Year_Template){
	KeywordUtil.markFailedAndStop('Test case failed')
} else {
	KeywordUtil.markPassed('Test case passed')
}

WebUI.click(findTestObject('Object Repository/Date Time Checker/Page_React App/button_Close'))
WebUI.closeBrowser()

