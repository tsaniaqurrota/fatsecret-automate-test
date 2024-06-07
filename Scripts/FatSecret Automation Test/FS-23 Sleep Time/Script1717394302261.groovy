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

Mobile.startExistingApplication('com.fatsecret.android')

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.TextView - 0 menit'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.Button - 01'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.Button - 02'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.Button - 03'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.Button - 04'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.Button - 05'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.Button - 06'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.Button - 07'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.Button - 08'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.Button - SIMPAN'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-23/android.widget.RelativeLayout'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-23/android.widget.TextView - 756'), '756')

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-23/android.widget.TextView - 2436'), '2436')

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-23/android.widget.TextView - 2436 (1)'), '2436')

Mobile.closeApplication()

