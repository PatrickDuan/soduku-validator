package test.com.patrick.soduku;


import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.Test;

import com.patrick.soduku.SodukuValidator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for SodukuVlidator
 */
@RunWith(JUnit4.class)
public class SodukuValidatorTester {  
	//Unit test for valid input
	  @Test
	  public void testValidInputGrid() {
		int[][] grid = {{8,3,5,4,1,6,9,2,7},
                {2,9,6,8,5,7,4,3,1},
                {4,1,7,2,9,3,6,5,8},
                {5,6,9,1,3,4,7,8,2},
                {1,2,3,6,7,8,5,4,9},
                {7,4,8,5,2,9,1,6,3},
                {6,5,2,7,8,1,3,9,4},
                {9,8,1,3,4,5,2,7,6},
                {3,7,4,9,6,2,8,1,1}};
		
	    SodukuValidator s = new SodukuValidator();
	    assertTrue(s.isValidInputGrid(grid));
	  }
	  
	  //Unit test for invalid input
	  @Test
	  public void testInValidInputGrid() {
		int[][] grid = {{8,3,5,4,1,6,9,2,7},
                {2,9,6,8,5,7,4,3,1,1},
                {4,1,7,2,9,3,6,5,8},
                {5,6,9,1,3,4,7,8,2},
                {1,2,3,6,7,8,5,4,9},
                {7,4,8,5,2,9,1,6,3},
                {6,5,2,7,8,1,3,9,4},
                {9,8,1,3,4,5,2,7,6},
                {3,7,4,9,6,2,8,1,1}};
		
	    SodukuValidator s = new SodukuValidator();
	    assertFalse(s.isValidInputGrid(grid));
	  }
	  
	  //Unit test for null input
	  @Test
	  public void testNullInputGrid() {
		int[][] grid = null;
		
	    SodukuValidator s = new SodukuValidator();
	    assertFalse(s.isValidInputGrid(grid));
	  }
	  
	  //Unit test for valid row
	  @Test
	  public void testValidRow() {
		int[][] grid =  {{8,3,5,4,1,6,9,2,7},
				 {2,9,6,8,5,7,4,3,1},
				 {4,1,7,2,9,3,6,5,8},
				 {5,6,9,1,3,4,7,8,2},
				 {1,2,3,6,7,8,5,4,9},
				 {7,4,8,5,2,9,1,6,3},
				 {6,5,2,7,8,1,3,9,4},
				 {9,8,1,3,4,5,2,7,6},
				 {3,7,4,9,6,2,8,1,5}};
		
	    SodukuValidator s = new SodukuValidator();
	    s.isValidInputGrid(grid);
	    assertTrue(s.isValidRows());
	  }
	  
	  //Unit test for valid col
	  @Test
	  public void testInValidRow() {
		int[][] grid =  {{8,3,5,4,1,6,9,2,7},
				 {2,9,6,8,5,7,4,3,1},
				 {4,1,7,2,9,3,6,5,8},
				 {5,6,9,1,3,4,7,8,2},
				 {1,2,3,6,7,8,5,4,9},
				 {7,4,8,5,2,9,1,6,3},
				 {6,5,2,7,8,1,3,9,4},
				 {9,8,1,3,4,5,2,7,6},
				 {3,7,4,9,6,2,8,1,5}};
		
	    SodukuValidator s = new SodukuValidator();
	    s.isValidInputGrid(grid);
	    assertTrue(s.isValidRows());
	  }
	  
	  //Unit test for invalid col
	  @Test
	  public void testValidCol() {
		int[][] grid =  {{8,3,5,4,1,6,9,7,7},
				 {2,9,6,8,5,7,4,3,1},
				 {4,1,7,2,9,3,6,5,8},
				 {5,6,9,1,3,4,7,8,2},
				 {1,2,3,6,7,8,5,4,9},
				 {7,4,8,5,2,9,1,6,3},
				 {6,5,2,7,8,1,3,9,4},
				 {9,8,1,3,4,5,2,7,6},
				 {3,7,4,9,6,2,8,1,5}};
		
	    SodukuValidator s = new SodukuValidator();
	    s.isValidInputGrid(grid);
	    assertFalse(s.isValidCols());
	  }
	  
	  //Unit test for valid box
	  @Test
	  public void testValidBox() {
		int[][] grid =  {{8,3,5,4,1,6,9,2,7},
				 {2,9,6,8,5,7,4,3,1},
				 {4,1,7,2,9,3,6,5,8},
				 {5,6,9,1,3,4,7,8,2},
				 {1,2,3,6,7,8,5,4,9},
				 {7,4,8,5,2,9,1,6,3},
				 {6,5,2,7,8,1,3,9,4},
				 {9,8,1,3,4,5,2,7,6},
				 {3,7,4,9,6,2,8,1,5}};
		
	    SodukuValidator s = new SodukuValidator();
	    s.isValidInputGrid(grid);
	    assertTrue(s.isValidBoxes());
	  }
	  
	  //Unit test for invalid box
	  @Test
	  public void testInValidBox() {
		int[][] grid =  {{8,3,5,4,1,6,9,7,7},
				 {2,9,6,8,5,7,4,3,1},
				 {4,1,7,2,9,3,6,5,8},
				 {5,6,9,1,3,4,7,8,2},
				 {1,2,3,6,7,8,5,4,9},
				 {7,4,8,5,2,9,1,6,3},
				 {6,5,2,7,8,1,3,9,4},
				 {9,8,1,3,4,5,2,7,6},
				 {3,7,4,9,6,2,8,1,5}};
		
	    SodukuValidator s = new SodukuValidator();
	    s.isValidInputGrid(grid);
	    assertFalse(s.isValidRows());
	  }
	  
	  //Unit test for valid soduku
	  @Test
	  public void testValidSoduku() {
		int[][] grid =  {{8,3,5,4,1,6,9,2,7},
				 {2,9,6,8,5,7,4,3,1},
				 {4,1,7,2,9,3,6,5,8},
				 {5,6,9,1,3,4,7,8,2},
				 {1,2,3,6,7,8,5,4,9},
				 {7,4,8,5,2,9,1,6,3},
				 {6,5,2,7,8,1,3,9,4},
				 {9,8,1,3,4,5,2,7,6},
				 {3,7,4,9,6,2,8,1,5}};
		
	    SodukuValidator s = new SodukuValidator();
	    assertTrue(s.isValidSoduku(grid));
	  }
	  
	  
	  //Unit test for invalid soduku
	  @Test
	  public void testInValidSoduku() {
		int[][] grid =  {{8,3,5,4,1,6,9,7,7},
				 {2,9,6,8,5,7,4,3,1},
				 {4,1,7,2,9,3,6,5,8},
				 {5,6,9,1,3,4,7,8,2},
				 {1,2,3,6,7,8,5,4,9},
				 {7,4,8,5,2,9,1,6,3},
				 {6,5,2,7,8,1,3,9,4},
				 {9,8,1,3,4,5,2,7,6},
				 {3,7,4,9,6,2,8,1,5}};
		
	    SodukuValidator s = new SodukuValidator();
	    assertFalse(s.isValidSoduku(grid));
	  }
}	