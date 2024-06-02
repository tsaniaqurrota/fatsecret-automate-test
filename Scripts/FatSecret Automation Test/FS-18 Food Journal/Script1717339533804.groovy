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

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-18/Ikon kamera'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-18/Mengambil foto'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-18/Camilan atau lainnya'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-18/Tombol shutter kamera'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-18/Tulis komentar'), 0)

Mobile.sendKeys(findTestObject('Object Repository/FatSecret/FS-18/Teks Ice cream'), 'Ice cream')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-18/Tombol selesai'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-18/Ikon halaman utama'), 0)

Mobile.scrollToText('Filter')

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-18/Teks Ice cream (posted)'), 'Ice cream')

Mobile.verifyElementExist(findTestObject('Object Repository/FatSecret/FS-18/Penanda waktu'), 0)

Mobile.closeApplication()

