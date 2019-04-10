$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Amazon.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: tripathimani4@gmail.com"
    }
  ],
  "line": 3,
  "name": "Amazon automation",
  "description": "",
  "id": "amazon-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "User login",
  "description": "",
  "id": "amazon-automation;user-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user is at homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user hovers at login option and clicks on login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is at login page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.user_opens_browser()"
});
formatter.result({
  "duration": 9340256913,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_is_at_homepage()"
});
formatter.result({
  "duration": 113652317,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_hovers_at_login_option_and_clicks_on_login()"
});
formatter.result({
  "duration": 729486,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat com.amazon.pages.LoginPage.signinMouseHover(LoginPage.java:35)\r\n\tat com.amazon.stepdefinations.LoginStepDefinations.user_hovers_at_login_option_and_clicks_on_login(LoginStepDefinations.java:30)\r\n\tat ✽.Then user hovers at login option and clicks on login(Amazon.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinations.user_is_at_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinations.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinations.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
});