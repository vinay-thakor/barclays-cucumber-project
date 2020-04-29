$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/barclays/resources/featurefile/barclays.feature");
formatter.feature({
  "line": 1,
  "name": "customer feature",
  "description": "as a customer i can see switch to  an account successfully",
  "id": "customer-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 69719694600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to switch an  account successfully",
  "description": "",
  "id": "customer-feature;user-should-navigate-to-switch-an--account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Click on Bank tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on switch to bank account",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 506943400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnBankTab()"
});
formatter.result({
  "duration": 1216793800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSwitchToBankAccount()"
});
formatter.result({
  "duration": 1064685400,
  "status": "passed"
});
formatter.after({
  "duration": 152300,
  "status": "passed"
});
});