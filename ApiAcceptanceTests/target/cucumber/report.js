$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("apitest.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want to verify that the city of Frankfurt is in Germany and return their corresponded latitude and longitude",
  "description": "",
  "id": "as-a-user-i-want-to-verify-that-the-city-of-frankfurt-is-in-germany-and-return-their-corresponded-latitude-and-longitude",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@feature"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "verify that the city of Frankfurt is in Germany and return their corresponded latitude and longitude",
  "description": "",
  "id": "as-a-user-i-want-to-verify-that-the-city-of-frankfurt-is-in-germany-and-return-their-corresponded-latitude-and-longitude;verify-that-the-city-of-frankfurt-is-in-germany-and-return-their-corresponded-latitude-and-longitude",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have an api \"http://api.citybik.es/v2/networks\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I send request to the api",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see in the response that city of Frankfurt is in Germany",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "return their corresponded latitude and longitude",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://api.citybik.es/v2/networks",
      "offset": 15
    }
  ],
  "location": "ApiTestStepdefs.i_have_an_api(String)"
});
formatter.result({
  "duration": 218548690,
  "status": "passed"
});
formatter.match({
  "location": "ApiTestStepdefs.i_send_request_to_the_api()"
});
formatter.result({
  "duration": 1624830154,
  "status": "passed"
});
formatter.match({
  "location": "ApiTestStepdefs.i_should_see_in_the_response_that_city_of_Frankfurt_is_in_Germany()"
});
formatter.result({
  "duration": 2999190,
  "status": "passed"
});
formatter.match({
  "location": "ApiTestStepdefs.return_their_corresponded_latitude_and_longitude()"
});
formatter.result({
  "duration": 4265943,
  "status": "passed"
});
});