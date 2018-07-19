package sudoku.service;

import sudoku.dto.*;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SudokuInit sudokuInit = new SudokuInit();
		
		SudokuMatrixDto matrix = sudokuInit.initSudokuMatrixDto();
		System.out.println(sudokuInit.initSudokuMatrixDto());
		System.out.println(matrix.getCol1().getRow1().getNumberDto().getStr2());
		
		
		
	}

}
