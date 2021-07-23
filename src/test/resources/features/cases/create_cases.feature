Feature: Create Cases
  Scenario: Create a case with required fields
    Given I login to salesforce
    And I navigate to the cases site to create a new one
    When I save the required "fields" on the case
      | status | New |
      | caseOrigin | Phone |
    Then a success "message" is displayed
      | message | Case "[0-9]{8} was created."
    When I check on the site's headers
    Then all header's fields match to the created case
    And I check on the site's details
    Then all detail's fields match to the created case
    When I navigate to all cases view site
    Then the created case is displayed

  Scenario: Create a case with all required fields
    Given I login to salesforce
    And I navigate to the cases site to create a new one
    When I save the required "fields" on the case
      | status | New |
      | caseOrigin  | Phone |
      | contactName | Bruce Wayne |
      | accountName | Batman      |
      | type        | Mechanical  |
      | caseReason  | Installation |
      | priority    | Medium       |
      | webEmail    | email@email.com |
      | webName     | my name         |
      | webCompany  | my company      |
      | webPhone    | 1111 2222 4444  |
      | product     | GC1040          |
      | potentialLiability | No       |
      | engineeringReqNumber | 5      |
      | sLAViolation         | No     |
      | subject              | The subject |
      | description          | The description |
      | myInternalComments   | The comments    |
    Then a success "message" is displayed
      | message | Case "[0-9]{8} was created."
    When I check on the site's headers
    Then all header's fields match to the created case
    And I check on the site's details
    Then all detail's fields match to the created case
    When I navigate to all cases view site
    Then the created case is displayed