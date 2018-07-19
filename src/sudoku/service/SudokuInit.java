package sudoku.service;

import sudoku.dto.*;
public class SudokuInit {

	/**
	 * 数独で使用する行の初期化
	 * @return 1行9マスの表を返却する
	 */
	public SudokuRowsDto initSudokuRowsDto() {
		//NumberDtoの初期化
		VariableNumberDto numDto1 = new VariableNumberDto();
		VariableNumberDto numDto2 = new VariableNumberDto();
		VariableNumberDto numDto3 = new VariableNumberDto();
		VariableNumberDto numDto4 = new VariableNumberDto();
		VariableNumberDto numDto5 = new VariableNumberDto();
		VariableNumberDto numDto6 = new VariableNumberDto();
		VariableNumberDto numDto7 = new VariableNumberDto();
		VariableNumberDto numDto8 = new VariableNumberDto();
		VariableNumberDto numDto9 = new VariableNumberDto();
		
		//SudokuCellDtoの初期化と設定
		SudokuCellDto cellDto1 = new SudokuCellDto();
		SudokuCellDto cellDto2 = new SudokuCellDto();
		SudokuCellDto cellDto3 = new SudokuCellDto();
		SudokuCellDto cellDto4 = new SudokuCellDto();
		SudokuCellDto cellDto5 = new SudokuCellDto();
		SudokuCellDto cellDto6 = new SudokuCellDto();
		SudokuCellDto cellDto7 = new SudokuCellDto();
		SudokuCellDto cellDto8 = new SudokuCellDto();
		SudokuCellDto cellDto9 = new SudokuCellDto();
		
		cellDto1.setNumberDto(numDto1);
		cellDto2.setNumberDto(numDto2);
		cellDto3.setNumberDto(numDto3);
		cellDto4.setNumberDto(numDto4);
		cellDto5.setNumberDto(numDto5);
		cellDto6.setNumberDto(numDto6);
		cellDto7.setNumberDto(numDto7);
		cellDto8.setNumberDto(numDto8);
		cellDto9.setNumberDto(numDto9);
		
		//SudokuRowsDtoの初期化と設定
		SudokuRowsDto rowsDto = new SudokuRowsDto();
		rowsDto.setRow1(cellDto1);
		rowsDto.setRow2(cellDto2);
		rowsDto.setRow3(cellDto3);
		rowsDto.setRow4(cellDto4);
		rowsDto.setRow5(cellDto5);
		rowsDto.setRow6(cellDto6);
		rowsDto.setRow7(cellDto7);
		rowsDto.setRow8(cellDto8);
		rowsDto.setRow9(cellDto9);
		
		return rowsDto;
	}
	
	/**
	 * 数独で使用する表の作成をする
	 * @return 9*9マスの表を返却する
	 */
	public SudokuMatrixDto initSudokuMatrixDto() {
		//SudokuMatrixDtoの初期化と設定
		SudokuMatrixDto matrixDto = new SudokuMatrixDto();
		matrixDto.setCol1(this.initSudokuRowsDto());
		matrixDto.setCol2(this.initSudokuRowsDto());
		matrixDto.setCol3(this.initSudokuRowsDto());
		matrixDto.setCol4(this.initSudokuRowsDto());
		matrixDto.setCol5(this.initSudokuRowsDto());
		matrixDto.setCol6(this.initSudokuRowsDto());
		matrixDto.setCol7(this.initSudokuRowsDto());
		matrixDto.setCol8(this.initSudokuRowsDto());
		matrixDto.setCol9(this.initSudokuRowsDto());
		
		return matrixDto;
	}
}
