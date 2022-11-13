@regression
Feature: Web table user order feature

  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "american express"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  @templateVersion
  Scenario Template: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user selects credit card type "<creditCard>"
    And user enters credit card number "<cardNum>"
    And user enters expiry date "<expiryDate>"
    And user enters process order button
    Then user should see "<customerName>" in first row of the web table

    Examples: Different random customers
      | productType | quantity | customerName   | street            | city   | state      | zipcode | creditCard       | cardNum      | expiryDate |
      | Familybea   | 2        | Elizabeth II   | Buckingham Palace | London | England    | 1021    | MasterCard       | 232911223324 | 12/23      |
      | Familybea   | 2        | Einstein       | Buckingham Palace | London | England    | 1022    | MasterCard       | 323911223324 | 02/03      |
      | Familybea   | 1        | Mozart Amadeus | Central street    | Vienna | Austria    | 1023    | Visa             | 599088123144 | 06/23      |
      | Screenable  | 4        | Abu Shl        | central street    | Vienna | Austria    | 1001    | American Express | 999123213124 | 80/13      |
      | MoneyCog    | 5        | Eren           | small street      | Shi    | Maria Wall | 099     | Visa             | 111100222324 | 07/13      |
      | MoneyCog    | 5        | Mikasa         | small street      | Shi    | Maria Wall | 099     | Visa             | 588827311234 | 07/13      |

    Examples: Females only
      | productType | quantity | customerName | street            | city   | state      | zipcode | creditCard | cardNum      | expiryDate |
      | Familybea   | 2        | Elizabeth II | Buckingham Palace | London | England    | 1021    | MasterCard | 885911223324 | 12/23      |
      | MoneyCog    | 5        | Mikasa       | small street      | Shi    | Maria Wall | 099     | Visa       | 188827311234 | 07/13      |

    Examples: Males only
      | productType | quantity | customerName   | street            | city   | state      | zipcode | creditCard       | cardNum      | expiryDate |
      | Familybea   | 2        | Einstein       | Buckingham Palace | London | England    | 1022    | MasterCard       | 754911223324 | 02/03      |
      | Familybea   | 1        | Mozart Amadeus | Central street    | Vienna | Austria    | 1023    | Visa             | 599088123144 | 06/23      |
      | Screenable  | 4        | Abu Shl        | central street    | Vienna | Austria    | 1001    | American Express | 999123213124 | 80/13      |
      | MoneyCog    | 5        | Eren           | small street      | Shi    | Maria Wall | 099     | Visa             | 111100222324 | 07/13      |