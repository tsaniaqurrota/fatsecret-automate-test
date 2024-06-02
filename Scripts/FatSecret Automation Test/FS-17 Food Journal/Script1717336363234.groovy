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

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Ikon kamera'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Mengambil foto'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Makan malam'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Ikon shutter kamera'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Mencari makanan'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Cari makanan'), 0)

Mobile.sendKeys(findTestObject('Object Repository/FatSecret/FS-17/Cari makanan'), 'padang', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Mencari padang'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Ikon centang'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Tombol selesai'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-17/Jumlah kalori harian'), '664')

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-17/Jumlah kalori makan malam'), '664')

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Ikon expand'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/FatSecret/FS-17/Makanan yang ditandai'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-17/Ikon halaman utama'), 0)

Mobile.scrollToText('Filter')

Mobile.verifyElementExist(findTestObject('Object Repository/FatSecret/FS-17/Penanda waktu'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/FatSecret/FS-17/Penanda waktu'), 0)

Mobile.closeApplication()

