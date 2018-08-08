package sudoku.dtobk;

import java.util.ArrayList;

/**
 * 数独で使う９＊９のマス
 * @author masudakennin
 *
 */
public class SudokuMatrixDto {
	
	/**
	 * 
	 */
	private ArrayList<SudokuRowsDto> sudokuColList;
	/**
	 * @return the sudokuColList
	 */
	public ArrayList<SudokuRowsDto> getSudokuColList() {
		return sudokuColList;
	}
	/**
	 * @param sudokuColList the sudokuColList to set
	 */
	public void setSudokuColList(ArrayList<SudokuRowsDto> sudokuColList) {
		this.sudokuColList = sudokuColList;
	}
}
