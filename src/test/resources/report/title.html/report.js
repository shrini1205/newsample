$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/new.feature");
formatter.feature({
  "name": "facebook page validation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "fb page title validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user print page title",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_print_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "fb page url validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user print the page url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_print_the_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});