@postsApi
Feature: Posts Api

  Scenario Outline: GetPosts
    Given base uri is "https://jsonplaceholder.typicode.com/"
    When when use "posts" Api
    And query by <id>
    Then api response should have <statusCode> and <userId> and <title>
    Examples:
      | id | statusCode | userId | title                     |
      | 15 | 200        | 2      | "eveniet quod temporibus" |