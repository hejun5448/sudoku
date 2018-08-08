package sudoku.dto;

import java.util.ArrayList;

/**
 * 数独で使う１行を定義した構造体
 * @author masudakennin
 *
 */
public class SudokuOneLineDto {
	
	/**
	 * 数独で使う１ラインを定義した構造体
	 */
	private ArrayList<SudokuCellDto> SudokuCellDtoList;

	/**
	 * @return the sudokuCellDtoList
	 */
	public ArrayList<SudokuCellDto> getSudokuCellDtoList() {
		return SudokuCellDtoList;
	}

	/**
	 * @param sudokuCellDtoList the sudokuCellDtoList to set
	 */
	public void setSudokuCellDtoList(ArrayList<SudokuCellDto> sudokuCellDtoList) {
		SudokuCellDtoList = sudokuCellDtoList;
	}
	
}
