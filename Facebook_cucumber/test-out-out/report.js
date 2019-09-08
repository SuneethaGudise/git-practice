$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "FaceBook login feature",
  "description": "",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: FaceBook login test Scenario"
    },
    {
      "line": 5,
      "value": "#Given Open the Browser"
    },
    {
      "line": 6,
      "value": "#Then Open the Facebook page"
    },
    {
      "line": 7,
      "value": "#When User wants to login into Facebook"
    },
    {
      "line": 8,
      "value": "#Then User enters email and password"
    },
    {
      "line": 9,
      "value": "#And User has to click the login button"
    },
    {
      "line": 11,
      "value": "#Scenario: FaceBook search Scenario"
    },
    {
      "line": 13,
      "value": "#Given Search for the option"
    },
    {
      "line": 14,
      "value": "#When Move the mouse on searchbutton"
    },
    {
      "line": 16,
      "value": "#DEFINE USERNAME AND PASSWORD HERE IN FEATUREFILE"
    }
  ],
  "line": 17,
  "name": "FaceBook login test Scenario",
  "description": "",
  "id": "facebook-login-feature;facebook-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Open the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Open the Facebook page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User wants to login into Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User has to give the \"sunitha.gudise@gmail.com\" and \"kutty136\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitionFeature.open_the_Browser()"
});
formatter.result({
  "duration": 3047451253,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.open_the_Facebook_page()"
});
formatter.result({
  "duration": 5420666924,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.User_wants_to_login_into_Facebook()"
});
formatter.result({
  "duration": 13978071,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sunitha.gudise@gmail.com",
      "offset": 22
    },
    {
      "val": "kutty136",
      "offset": 53
    }
  ],
  "location": "stepDefinitionFeature.User_has_to_give_the_and(String,String)"
});
formatter.result({
  "duration": 284492772,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitionFeature.User_has_to_click_the_login_button()"
});
formatter.result({
  "duration": 11932920348,
  "status": "passed"
});
});