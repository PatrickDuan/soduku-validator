package com.patrick.soduku;


import java.util.ArrayList;
import java.util.List;

/**
 * Soduku Validator is the class for validating whether the input matrix is valid Soduku or not
 * 
 * @author Patrick DUAN
 *
 * Design logic for validating the Soduku (Every grid is filled with 9 x 9 integers)
 * 
 * 1. Check every row that contains non-duplicate 1 - 9 digits
 * 
 * 2. Check every column that contains non-duplicate 1 - 9 digits
 * 
 * 3. Check every 3 x 3 box contains non-duplicate 1 - 9 digits
 * 
 * Note: The 3 x 3 box means the sub-grid of the input grid, there would be 9 boxes of the whole grid
 */

public class SodukuValidator {
	
	/**
	 * Global variable matrix for recording the valid inputing grid, using it directly rather than pass inputing grid everytime
	 */
	private int[][] matrix;
	
	/**
	 * Constructor of this class would be non-argument since method inside it would pass the grid for validating, it would initialize the global variable matrix
	 */
	
	public SodukuValidator() {
		//Created the global 9 x 9 integer arrays
		matrix = new int[9][9];
	}
	
	/**
	 * Method for validating if the input integer matrix is valid soduku or not
	 * @param matrix - the input grid which contains digits in the range of [1 - 9] (it mentioned in the email that digits only contains from 1 to 9)
	 * @return 
	 *       true - The grid is valid Soduku
	 *       false - The grid is invalid Soduku
	 */
	public boolean isValidSoduku(int[][] grid) {
		//Validating whether the input grid is 9 x 9 or not
		if (!isValidInputGrid(grid)) {
			return false;
		}
		
		return isValidRows() && isValidCols() && isValidBoxes();
	}
	
	/**
	 * Method for validating inputting grid is valid Soduku grid or not
	 * @param grid - inputting grid 
	 * @return 
	 * 		true - The inputting grid is standard 9x9 Soduku grid
	 * 		false - The inputting grid is invalid Soduku grid
	 */
	public boolean isValidInputGrid(int[][] grid) {
		if (grid == null || grid.length != 9) {
			return false;
		}
		
		for (int i = 0; i < 9; i ++) {
			if (grid[i].length != 9) {
				return false;
			}
		}
		
		matrix = grid;
		
		return true;
	}
	
	/**Method for validating each row in the Soduku matrix
	 * 
	 * @return
	 *        true - every row is valid
	 *        false - there are invalid rows
	 */
	public boolean isValidRows() {
		//Loop every row to check the digits valid or not
		for (int i = 0; i < 9; i++) {
			//Created boolean[] with 9 size to guarantee no duplicate in range of [1 - 9]
			boolean[] digits = new boolean[9];
			
			for (int j = 0; j < 9; j++) {
				//It exists duplicates in this row, this row is invalid, return false
				if (digits[matrix[i][j] - 1]) {
					return false;
				} else {
					digits[matrix[i][j] - 1] = true;
				}
			}
		} // end loop
		
		//Now every row validated, return true
		return true;
	}
	
	/**Method for validating each column in the Soduku matrix
	 * 
	 * @return
	 *        true - every column is valid
	 *        false - there are invalid columns
	 */
	public boolean isValidCols() {
		//Loop every row to check the digits valid or not
		for (int i = 0; i < 9; i++) {
			//Created boolean[] with 9 size to guarantee no duplicate in range of [1 - 9]
			boolean[] digits = new boolean[9];
			
			for (int j = 0; j < 9; j++) {
				//It exists duplicates in this column, this column is invalid, return false
				if (digits[matrix[j][i] - 1]) {
					return false;
				} else {
					digits[matrix[j][i] - 1] = true;
				}
			}
		} // end loop
		
		//Now every column validated, return true
		return true;
	}
	
	/**Method for validating each box in the Soduku matrix
	 * 
	 * @return
	 *        true - every box is valid
	 *        false - there are invalid boxes
	 */
	public boolean isValidBoxes() {
		//Since every box is 3x3 sub grid of the whole grid, there is the relationship between each box's element and the specific box it belongs to
		/*[0   1    2
		   3   4    5   
		   6   7    8]
		            */
		
		//As shown above, whole grid divided into 9 parts with id [0-8], if the current row is i, column is j, box Id would be: (i / 3) * 3 + j / 3
		//For example, box id of matrix[1, 8] is (1 / 3) * 3 + (8 /3) = 0 + 2 = 2
		
		//Now using a list of boolean[] array to represent the digits in each box
		List<boolean[]> digits = new ArrayList<boolean[]>();
		
		for (int i = 0; i < 9; i++) {
			digits.add(new boolean[9]);
		}
		
		for (int i = 0 ; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				//Caculating the box id for current element at first
				int boxId = (i / 3) * 3 + j / 3;
				
				//Getting current digits for validating non duplicate digits in the box
				boolean[] curDigits = digits.get(boxId);
				
				//It exists duplicates in this row, this row is invalid, return false
				if (curDigits[matrix[i][j] - 1]) {
					return false;
				} else {
					curDigits[matrix[i][j] - 1] = true;
				}
			}
		} // end loop
		
		//Now every box validated, return true
		return true;
	}
}
