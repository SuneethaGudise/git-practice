$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
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
  "duration": 3191743696,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.open_the_Facebook_page()"
});
formatter.result({
  "duration": 4396767283,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.User_wants_to_login_into_Facebook()"
});
formatter.result({
  "duration": 8078797,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.User_enters_email_and_password()"
});
formatter.result({
  "duration": 295684467,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.User_has_to_click_the_login_button()"
});
formatter.result({
  "duration": 14279559666,
  "status": "passed"
});
});