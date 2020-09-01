Feature: DataTable Samples

  Scenario: Default and simple DataTable
    When I use this as simple DataTable
      | userName    | password     | confirmPassword |
      | jack@gg.com | Password@123 | Password@123    |
      | abc@tt.com  | Pass@123     | Pass@123        |

  Scenario: DataTable as Custom Type
    When I use this DataTable with Custom Type
      | userName    | password     | confirmPassword |
      | jack@gg.com | Password@123 | Password@123    |
      | abc@tt.com  | Pass@123     | Pass@123        |

  Scenario: DataTable transposed
    When I use this DataTable but columns transposed
      | userName        | jack@gg.com  | abc@tt.com |
      | password        | Password@123 | Pass@123   |
      | confirmPassword | Password@123 | Pass@123   |
