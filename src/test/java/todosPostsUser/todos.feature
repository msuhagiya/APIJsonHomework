@todosApi
Feature: Todos Api

  Scenario Outline: GetTodos

    Given base uri is "https://jsonplaceholder.typicode.com/"
    When when use "todos" Api
    And query by <id>
    Then api response should have <statusCode> and <title> and <userId>
    Examples:
      | id | statusCode | title                 | userId |
      | 29 | 200        | "laborum aut in quam" | 2      |

