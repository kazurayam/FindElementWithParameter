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
WebUI.setViewPortSize(360, 800)
WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/14291_testbed.html')



// HTML source:
//   <body>
//     <div id="english"><label>User name</label><input type="text" value="foo"></div>
//     <div id="arabic"><label>اسم المستخدم</label><input type="text" value="bar"></div>
//   </body>

WebUI.comment('>>> 1')
//     <div id="english"><label>User name</label><input type="text" value="foo"></div>
//                              ^^^^^^^^^
def label_en = WebUI.getText(findTestObject('Page_/label_en'))
WebUI.verifyEqual(label_en, 'User name')


WebUI.comment('>>> 2')
//     <div id="arabic"><label>اسم المستخدم</label><input type="text" value="bar"></div>
//                             ^^^^^^
def label_ar = WebUI.getText(findTestObject('Page_/label_ar'))
WebUI.verifyEqual(label_ar, 'اسم المستخدم')


WebUI.comment('>>> 3')
//     <div id="english"><label>User name</label><input type="text" value="foo"></div>
//                              ^^^^^^^^^
def label_en_param = WebUI.getText(
    findTestObject('Page_/label_parameterized', ['index':'User name']))
WebUI.verifyEqual(label_en_param, 'User name')


WebUI.comment('>>> 4')
//     <div id="arabic"><label>اسم المستخدم</label><input type="text" value="bar"></div>
//                              ^^^^^^
def label_ar_param = WebUI.getText(
    findTestObject('Page_/label_parameterized', ['index':'اسم المستخدم']))
WebUI.verifyEqual(label_ar_param, 'اسم المستخدم')


WebUI.comment('>>> 4')
//     <div id="english"><label>User name</label><input type="text" value="foo"></div>
//                                                                         ^^^
def input_en = WebUI.getAttribute(
    findTestObject('Page_/input_next_to_label_parameterized', ['index':'User name']),
    'value')
WebUI.verifyEqual(input_en, 'foo')


WebUI.comment('>>> 5')
//     <div id="arabic"><label>اسم المستخدم</label><input type="text" value="bar"></div>
//                                                                     ^^^
def input_ar = WebUI.getAttribute(
    findTestObject('Page_/input_next_to_label_parameterized', ['index':'اسم المستخدم']),
    'value')
WebUI.verifyEqual(input_ar, 'bar')


WebUI.closeBrowser()

