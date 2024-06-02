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

try {
    // Start the mobile application
    Mobile.startExistingApplication('com.fatsecret.android')

    // Interact with elements in the application
    Mobile.tap(findTestObject('FatSecret/FS-14/android.widget.LinearLayout'), 0)
    Mobile.tap(findTestObject('FatSecret/FS-14/android.widget.CheckBox'), 0)
    Mobile.tap(findTestObject('FatSecret/FS-14/android.widget.EditText - 49,8'), 0)

    // Clear text in the EditText
    Mobile.clearText(findTestObject('FatSecret/FS-14/android.widget.EditText - 49,8 (1)'), 0)

    // Tap on another element to trigger validation
    Mobile.tap(findTestObject('FatSecret/FS-14/android.widget.TextView'), 0)

    // Wait for the error message to appear
    Mobile.delay(3)

    // Verify the error message appears
    TestObject errorMessage = findTestObject('FatSecret/FS-14/android.widget.TextView - Error Message')
    if (Mobile.verifyElementExist(errorMessage, 5)) {
        String errorText = Mobile.getText(errorMessage, 5)
        assert errorText == 'Berat sekarang ini tidak valid. Silahkan coba lagi.'
        println("Error message verified successfully: " + errorText)
    } else {
        println("Error message not found")
    }
    
    // Close the mobile application
    Mobile.closeApplication()
} catch (Exception e) {
    // Handle any exceptions that occur during the test execution
    println(e.getMessage())
    Mobile.takeScreenshot()
} finally {
    // Ensure the application is closed even if an error occurs
    Mobile.closeApplication()
}
