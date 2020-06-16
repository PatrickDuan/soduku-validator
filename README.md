# soduku-validator
Design the validator for verifying if the input grid is standard soduku

How to run
Project was coded using Java 8.

Project created using Eclipse. To run, open project using Eclipse, and pass file as argument to program. 

The project also has several test cases using JUnit, see package:test.com.patrick.soduku, you can run SodukuValidator.java directly
(if you have added Junit in this project path) and those unit tests would be run with corresponding methods.

Basic Design Logic for implementing the Soduku Validator:
Design logic for validating the Soduku (Every grid is filled with 9 x 9 integers)

1. Check every row that contains non-duplicate 1 - 9 digits
2. Check every column that contains non-duplicate 1 - 9 digits
3. Check every 3 x 3 box contains non-duplicate 1 - 9 digits
Note: The 3 x 3 box means the sub-grid of the input grid, there would be 9 boxes of the whole grid

Program logic:                                               
                                                  
SodukuValidator: Input(int[][] grid) -> isSoduku : 
1.isValidInputGrid(Vlidating input is null ? size matches? If so, golobal variable matrix would assign value with inputted grid                                                  
 2. isValidRows (are rows valid in range of [1-9]
 
 3.isValidCols (are cols valid in range of [1-9]
                                         
4.isValidBoxes(are boxes valid in range of [1-9]


Corresponding Junit tests written for validating the whole methods used in the validator.
