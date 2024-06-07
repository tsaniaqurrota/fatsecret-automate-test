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

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-19/android.widget.TextView - 1008 kal'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-19/android.widget.TextView - Latihan'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-19/android.widget.TextView - PENCARIAN'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-19/android.widget.EditText - Pencarian untuk Latihan (1)'), 0)

Mobile.setText(findTestObject('Object Repository/FatSecret/FS-19/android.widget.EditText - Pencarian untuk Latihan (1)'), 
    'Berenang', 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-19/android.widget.TextView - berenang (cepat)'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-19/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-19/android.widget.LinearLayout'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-19/android.widget.TextView - Berenang (Cepat) (1)'), 
    'Berenang (Cepat)')

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-19/android.widget.TextView - 420'), '620')

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-19/android.widget.TextView - 1 jam'), '1 hour')

Mobile.closeApplication()

