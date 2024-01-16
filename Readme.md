## REMOVE DUPLICATES EXERCISE

Author: [Andrés Julián Aristizábal Martínez](mailto:ajaristi@gmail.com)

Date: 16-Jan-2024

### Solution details:
* I used the Set collection to verify the already added characters.
* Instead of returning the set elements, I decided to create a StringBuilder with the goal of preserve the insertion order and have a more performant solution.
* This solution is O(n) complexity, so I expect good performance of the solution. 
* For the unit tests, I used Jupiter and AssertJ to have more fluent tests.
