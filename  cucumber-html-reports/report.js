$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("radioButton.feature");
formatter.feature({
  "line": 1,
  "name": "Radio Button",
  "description": "",
  "id": "radio-button",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Male Button Check",
  "description": "",
  "id": "radio-button;male-button-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on Selenium Easy page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click Input Forms",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click Radio Buttons Demo",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I click Male Button under Radio Button Demo",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click get checked value",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should see Radio button Male is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "RadioButton.i_am_on_Selenium_Easy_page()"
});
formatter.result({
  "duration": 3062286954,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_click_Input_Forms()"
});
formatter.result({
  "duration": 182525867,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_click_Radio_Buttons_Demo()"
});
formatter.result({
  "duration": 203211409,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_click_Male_Button_under_Radio_Button_Demo()"
});
formatter.result({
  "duration": 229196138,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_click_get_checked_value()"
});
formatter.result({
  "duration": 47576024,
  "status": "passed"
});
formatter.match({
  "location": "RadioButton.i_should_see_Radio_button_Male_is_checked()"
});
formatter.result({
  "duration": 91275389,
  "status": "passed"
});
formatter.after({
  "duration": 60778996,
  "status": "passed"
});
});