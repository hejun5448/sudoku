package sudoku.service;

import sudoku.dto.*;

public class Execute {

	public static void main(String[] args) {
		SudokuInit sudokuInit = new SudokuInit();
		SudokuMatrixDto matrix = sudokuInit.initSudokuMatrixDto();
		int num = 1;
		for(SudokuRowsDto rows : matrix.getSudokuColList()) {
			for(SudokuCellDto cell : rows.getSudokuRowsCellList()) {
				cell.setNumber(Integer.toString(num));
				System.out.print(cell.getNumber());
				++num;
			}
			System.out.println();
			num = 1;
		}
		
	}

}
