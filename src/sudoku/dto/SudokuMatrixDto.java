package sudoku.dto;

import java.util.ArrayList;

/**
 * 数独で使う９＊９のマス
 * @author masudakennin
 *
 */
public class SudokuMatrixDto {
	
	/**
	 * 数独で使う９マスの列
	 */
	private ArrayList<SudokuOneLineDto> sudokuColsList;
	
	/**
	 * 数独で使う９マスの行
	 */
	private ArrayList<SudokuOneLineDto> sudokuRowsList;

	/**
	 * @return the sudokuColsList
	 */
	public ArrayList<SudokuOneLineDto> getSudokuColsList() {
		return sudokuColsList;
	}

	/**
	 * @param sudokuColsList the sudokuColsList to set
	 */
	public void setSudokuColsList(ArrayList<SudokuOneLineDto> sudokuColsList) {
		this.sudokuColsList = sudokuColsList;
	}

	/**
	 * @return the sudokuRowsList
	 */
	public ArrayList<SudokuOneLineDto> getSudokuRowsList() {
		return sudokuRowsList;
	}

	/**
	 * @param sudokuRowsList the sudokuRowsList to set
	 */
	public void setSudokuRowsList(ArrayList<SudokuOneLineDto> sudokuRowsList) {
		this.sudokuRowsList = sudokuRowsList;
	}
	
}
