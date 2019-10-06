$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ravi/eclipse-workspace/Facebook_cucumber/src/main/java/FaceBookFeature/Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "FaceBook login feature",
  "description": "",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "FaceBook login test Scenario",
  "description": "",
  "id": "facebook-login-feature;facebook-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Open the Facebook page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User wants to login into Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters email and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitionFeature.open_the_Browser()"
});
formatter.result({
  "duration": 3952856935,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.open_the_Facebook_page()"
});
formatter.result({
  "duration": 4539342483,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.User_wants_to_login_into_Facebook()"
});
formatter.result({
  "duration": 13659658,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.user_enters_email_and_password()"
});
formatter.result({
  "duration": 290189291,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.User_has_to_click_the_login_button()"
});
formatter.result({
  "duration": 5624745499,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "FaceBook search Scenario",
  "description": "",
  "id": "facebook-login-feature;facebook-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Search for the option",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Move the mouse on searchbutton",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitionFeature.Search_for_the_option()"
});
formatter.result({
  "duration": 2028561233,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.Move_the_mouse_on_searchbutton()"
});
formatter.result({
  "duration": 10074699341,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"js_2b\"]/form/button/i\"}\n  (Session info: chrome\u003d76.0.3809.132)\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.07 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.42.2\u0027, revision: \u00276a6995d31c7c56c340d6f45a76976d43506cd6cc\u0027, time: \u00272014-06-03 10:52:47\u0027\nSystem info: host: \u0027LAPTOP-P9AHAKG1\u0027, ip: \u0027192.168.0.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:61029}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5), userDataDir\u003dC:\\Users\\ravi\\AppData\\Local\\Temp\\scoped_dir18224_22138}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d76.0.3809.132, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 929bc7eb2970777448d6056b8e922e21\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat stepDefinition.stepDefinitionFeature.Move_the_mouse_on_searchbutton(stepDefinitionFeature.java:91)\r\n\tat ✽.When Move the mouse on searchbutton(C:/Users/ravi/eclipse-workspace/Facebook_cucumber/src/main/java/FaceBookFeature/Facebook.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinitionFeature.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});