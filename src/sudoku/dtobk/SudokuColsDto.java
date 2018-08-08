package sudoku.dtobk;

import java.util.ArrayList;

/**
 * 数独で使う列を定義した構造体
 * @author masudakennin
 *
 */
public class SudokuColsDto {
	
	/**
	 * 数独で使う１列を定義した構造体
	 */
	private ArrayList<SudokuCellDto> sudokuColsCellList;

	/**
	 * @return the sudokuColsCellList
	 */
	public ArrayList<SudokuCellDto> getSudokuColsCellList() {
		return sudokuColsCellList;
	}

	/**
	 * @param sudokuColsCellList the sudokuColsCellList to set
	 */
	public void setSudokuColsCellList(ArrayList<SudokuCellDto> sudokuColsCellList) {
		this.sudokuColsCellList = sudokuColsCellList;
	}
}
