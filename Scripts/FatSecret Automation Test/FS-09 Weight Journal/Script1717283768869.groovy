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

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-9/Post new weight journal'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-9/Check button'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-9/Field- New weight'), 0)

Mobile.setText(findTestObject('Object Repository/FatSecret/FS-9/EditText - Input new weight'), '50', 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-9/Field - Target weight'), 0)

Mobile.setText(findTestObject('Object Repository/FatSecret/FS-9/EditText - Input target weight'), '48', 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-9/TextField - Journal'), 0)

Mobile.setText(findTestObject('Object Repository/FatSecret/FS-9/EditText - Input journal'), 'Berat badan terbaru saya', 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-9/Save'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/FatSecret/FS-9/TextView - Berat badan terbaru saya'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/FatSecret/FS-9/ImageView - Gap weight'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/FatSecret/FS-9/ImageView - Icon gap weight'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/FatSecret/FS-9/TextView - New weight'), 0)

Mobile.closeApplication()

