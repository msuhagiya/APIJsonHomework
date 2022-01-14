@usersApi
Feature: Users Api

  Scenario Outline: GetUsers

    Given base uri is "https://jsonplaceholder.typicode.com/"
    When when use "users" Api
    And query by <id>
    Then api response should have <statusCode> and <name> and <street> and <lat> and <catchPhrase>
    Examples:
      | id | statusCode | name               | street         | lat      | catchPhrase                            |
      | 5  | 200        | "Chelsey Dietrich" | "Skiles Walks" | "-31.8129" | "User-centric fault-tolerant solution" |