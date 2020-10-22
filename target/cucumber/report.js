$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/goToContactPage.feature");
formatter.feature({
  "name": "Test contact us page fields",
  "description": "  As a user\n  I want to fill in my details in the contact us page\n  So I can submit my query to Intelligencebank",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test fields with valid information",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open \u0027https://www.intelligencebank.com/\u0027",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigate to the \u0027CONTACT US\u0027 page",
  "keyword": "And "
});
formatter.step({
  "name": "I type \u0027\u003ccompany\u003e\u0027 into the company field",
  "keyword": "When "
});
formatter.step({
  "name": "I type \u0027\u003cfirstName\u003e\u0027 into the first name field",
  "keyword": "And "
});
formatter.step({
  "name": "I type \u0027\u003clastName\u003e\u0027 into the last name field",
  "keyword": "And "
});
formatter.step({
  "name": "I type \u0027\u003cemail\u003e\u0027 into the email field",
  "keyword": "And "
});
formatter.step({
  "name": "I select \u0027\u003ccountry\u003e\u0027 in the country selector",
  "keyword": "And "
});
formatter.step({
  "name": "I type \u0027\u003cphone\u003e\u0027 into the phone field",
  "keyword": "And "
});
formatter.step({
  "name": "I type \u0027\u003cenquiry\u003e\u0027 into the enquiry field",
  "keyword": "And "
});
formatter.step({
  "name": "I select \u0027\u003cproduct\u003e\u0027 in the product selector",
  "keyword": "And "
});
formatter.step({
  "name": "I click the checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "I should take a screenshot to confirm and close the site",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "company",
        "firstName",
        "lastName",
        "email",
        "country",
        "phone",
        "enquiry",
        "product"
      ]
    },
    {
      "cells": [
        "IB",
        "Matt",
        "Ringin",
        "matthew.ringin@intelligencebank.com",
        "AU",
        "0451791194",
        "Please help",
        "DAM"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test fields with valid information",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open \u0027https://www.intelligencebank.com/\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_open_the_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the \u0027CONTACT US\u0027 page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_opens_contactPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \u0027IB\u0027 into the company field",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_fills_in_company_fields(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \u0027Matt\u0027 into the first name field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_fills_in_first_name_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \u0027Ringin\u0027 into the last name field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_fills_in_last_name_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \u0027matthew.ringin@intelligencebank.com\u0027 into the email field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_fills_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027AU\u0027 in the country selector",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_selects_country_in_country_selector(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \u00270451791194\u0027 into the phone field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_fills_in_phone_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \u0027Please help\u0027 into the enquiry field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_fills_in_enquiry_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027DAM\u0027 in the product selector",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_selects_product_in_product_selector(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_the_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should take a screenshot to confirm and close the site",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_takes_screenshot()"
});
formatter.result({
  "status": "passed"
});
});