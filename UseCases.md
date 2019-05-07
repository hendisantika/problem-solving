## First Case
You are given an array filled with numbers between 1 and n,
inclusive, except that one of the numbers is missing.
Write a function to return the missing number, given that the numbers in the array are in random order.
e.g.
* [1,3,5,4] // your function should return 2
* [2,3,5,4] // your function should return 1
* [1,5,3,2] // your function should return 4

## Second Case
Write a function to find two numbers in an integer array that sum up to a given number x.
e.g.

array = [1,4,6,9,2,3,4,5,9,8,7,2,5,6,8,3,1,4]

x = 15

your function can return (6,9) and (8,7).

## Third Case
You stumble upon a broken password API.
The API "should" only return true when given a string which exactly matches the password.
But it returns true when given a substring of the password. Write a function to deduce the password.

## Fourth Case
Given the digits 123456789, build an expression by inserting "+" or "-" anywhere BETWEEN the digits so that it results to 100.
Your answer should return all possible combinations.

Example: 1 + 23 - 4 + 5 + 6 + 78 - 9 = 100

## SQL Cases

Given the table. please write query to show following results

### Show the presence of students each day
> showed in following structure

|name      |class   |card_id|date          |
| -------- | ------ | ----- | ------------ |
|Rizaq     |X       |abcd123|    2019-05-01|
|John      |Y       |abcd124|    2019-05-01|
|Lanang    |XY      |abcd120|    2019-05-01|
|Rizaq     |X       |abcd123|    2019-05-02|
|Dan       |MM      |abcd122|    2019-05-02|
|Snow      |XX      |abcd121|    2019-05-02|
|John      |Y       |abcd124|    2019-05-02|
|Lanang    |XY      |abcd120|    2019-05-02|
|Lanang    |XY      |abcd120|    2019-05-03|
|John      |Y       |abcd124|    2019-05-03|
|Snow      |XX      |abcd121|    2019-05-03|
|Rizaq     |X       |abcd123|    2019-05-04|
|Lanang    |XY      |abcd120|    2019-05-04|

### Show the number of student's presence and show it from the biggest presence with following structure
|presence  |student_card_id|   name  |
| -------  | ------------- | ------- |
|4         |   abcd120     |   Lanang|
|3         |   abcd123     |   Rizaq |
|3         |   abcd124     |   John  |
|2         |   abcd121     |   Snow  |
|1         |   abcd122     |   Dan   |

