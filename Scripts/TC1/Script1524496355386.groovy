import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/xpath_with_parameter_testbed.html')

// HTML source:
//     <div id="arabic"><label>اسم المستخدماسم المستخدم</label><input type="text" value="foo"></div>
//     <div id="english"><label>User name</label><input type="text" value="bar"></div>
//     <div id="руский"><label>Ваша имя</label><input type="text" value="baz"></div>

def label_value_en = WebUI.getText(findTestObject('Page_/label_en'))
WebUI.verifyEqual(label_value_ar, 'User name')

//def label_value_ar = WebUI.getText(findTestObject('Page_/label_arabic'))
//WebUI.verifyEqual(label_value_ar, 'اسم المستخدم')

def label_value_en2 = WebUI.getText(findTestObject('Page_/label_indexed_by_i18n_name', ['index':'User name']))
WebUI.verifyEqual(label_value_en2, 'User name')

def input_value_en = WebUI.getText(findTestObject('Page_/input_indexed_by_i18n_name', ['index':'User name']))
WebUI.verifyEqual(input_value_en, 'bar')

WebUI.closeBrowser()

