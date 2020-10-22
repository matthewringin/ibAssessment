$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/goToContactPage.feature");
formatter.feature({
  "name": "Test contact us page fields",
  "description": "  As a user\n  I want to fill in my details in the contact us page\n  So I can submit my query to Intelligencebank",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test fields with valid information",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I open \"baseURL\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_open_the_site(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidArgumentException: invalid argument\n  (Session info: chrome\u003d86.0.4240.80)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Matto.local\u0027, ip: \u0027fe80:0:0:0:1c48:69a4:8e70:7e88%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.80, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /var/folders/ml/87dw5y4j20j...}, goog:chromeOptions: {debuggerAddress: localhost:62403}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7ce2946ede638cf9f3ae2ad80a67c38b\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\n\tat stepDefinitions.Steps.i_open_the_site(Steps.java:28)\n\tat ✽.I open \"baseURL\"(file:src/test/java/features/goToContactPage.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "I navigate to the Contact Us page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_opens_contactPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I fill in the form fields",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_fills_in_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should take a screenshot to confirm",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_takes_screenshot()"
});
formatter.result({
  "status": "skipped"
});
});