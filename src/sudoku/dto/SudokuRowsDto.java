package sudoku.dto;

import java.util.ArrayList;

/**
 * 数独で使う１行を定義した構造体
 * @author masudakennin
 *
 */
public class SudokuRowsDto {
	
	/**
	 * 数独で使う１行を定義した構造体
	 */
	private ArrayList<SudokuCellDto> sudokuRowsCellList;
	
	/**
	 * @return the sudokuRowsCellList
	 */
	public ArrayList<SudokuCellDto> getSudokuRowsCellList() {
		return sudokuRowsCellList;
	}
	/**
	 * @param sudokuRowsCellList the sudokuRowsCellList to set
	 */
	public void setSudokuRowsCellList(ArrayList<SudokuCellDto> sudokuRowsCellList) {
		this.sudokuRowsCellList = sudokuRowsCellList;
	}
	
}
