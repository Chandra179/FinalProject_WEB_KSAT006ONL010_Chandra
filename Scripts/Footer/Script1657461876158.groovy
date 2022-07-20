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

WebUI.navigateToUrl(GlobalVariable.WebsiteName)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Footer/strong_Newsletter'), 'Newsletter')

WebUI.verifyElementText(findTestObject('Footer/japan_1'), '地図&アクセス方法')

WebUI.verifyElementText(findTestObject('Footer/japan_2'), 'お問い合わせ')

WebUI.verifyElementText(findTestObject('Footer/p_Store Location'), 'Store Location')

WebUI.verifyElementText(findTestObject('Footer/p_562-0031 42527 Le Claire 2'), '事務所：562-0031 大阪府箕面市小野原東4ー25ー27 Le Claire 2')

WebUI.verifyElementText(findTestObject('Footer/p_Email  kotakoki.jpgmail.com'), 'Email : kotakoki.jp@gmail.com')

WebUI.verifyElementText(findTestObject('Footer/p_TEL 0727 03 0048'), 'TEL: 0727 03 0048')

WebUI.verifyElementText(findTestObject('Footer/div_Copyright  2022. Powered by WS Lab'), 'Copyright © 2022. Powered by WS Lab')

WebUI.closeBrowser()

