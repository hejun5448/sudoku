package sudoku.service;

import java.util.ArrayList;

import sudoku.common.NumberConsts;
import sudoku.dto.*;
import sudoku.dto.Number;
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
		
		cellDto1.setVariableNumberDto(numDto1);
		cellDto2.setVariableNumberDto(numDto2);
		cellDto3.setVariableNumberDto(numDto3);
		cellDto4.setVariableNumberDto(numDto4);
		cellDto5.setVariableNumberDto(numDto5);
		cellDto6.setVariableNumberDto(numDto6);
		cellDto7.setVariableNumberDto(numDto7);
		cellDto8.setVariableNumberDto(numDto8);
		cellDto9.setVariableNumberDto(numDto9);
		
		ArrayList<SudokuCellDto> sudokuCellDtoList = new ArrayList<SudokuCellDto>();
		sudokuCellDtoList.add(cellDto1);
		sudokuCellDtoList.add(cellDto2);
		sudokuCellDtoList.add(cellDto3);
		sudokuCellDtoList.add(cellDto4);
		sudokuCellDtoList.add(cellDto5);
		sudokuCellDtoList.add(cellDto6);
		sudokuCellDtoList.add(cellDto7);
		sudokuCellDtoList.add(cellDto8);
		sudokuCellDtoList.add(cellDto9);
		
		//SudokuRowsDtoの初期化と設定
		SudokuRowsDto rowsDto = new SudokuRowsDto();
		rowsDto.setSudokuRowsCellList(sudokuCellDtoList);
		
		return rowsDto;
	}
	
	/**
	 * 数独で使用する表の作成をする
	 * @return 9*9マスの表を返却する
	 */
	public SudokuMatrixDto initSudokuMatrixDto() {
		//列の作成
		ArrayList<SudokuRowsDto> sudokuRowsDtoList = new ArrayList<SudokuRowsDto>();
		sudokuRowsDtoList.add(this.initSudokuRowsDto());
		sudokuRowsDtoList.add(this.initSudokuRowsDto());
		sudokuRowsDtoList.add(this.initSudokuRowsDto());
		sudokuRowsDtoList.add(this.initSudokuRowsDto());
		sudokuRowsDtoList.add(this.initSudokuRowsDto());
		sudokuRowsDtoList.add(this.initSudokuRowsDto());
		sudokuRowsDtoList.add(this.initSudokuRowsDto());
		sudokuRowsDtoList.add(this.initSudokuRowsDto());
		sudokuRowsDtoList.add(this.initSudokuRowsDto());
		
		//SudokuMatrixDtoの初期化と設定
		SudokuMatrixDto matrixDto = new SudokuMatrixDto();
		matrixDto.setSudokuColList(sudokuRowsDtoList);
		
		return matrixDto;
	}
	/**
	 * 初期化したVariableNumberDtoを返却する
	 * @return VariableNumberDto
	 */
	public VariableNumberDto initVariableNumberDto(){
		//ArrayList<NumberDto>の設定（数字１〜９）
		ArrayList<Number> numberList = new ArrayList<Number>();
		numberList.add(new Number(NumberConsts.STR_1));
		numberList.add(new Number(NumberConsts.STR_2));
		numberList.add(new Number(NumberConsts.STR_3));
		numberList.add(new Number(NumberConsts.STR_4));
		numberList.add(new Number(NumberConsts.STR_5));
		numberList.add(new Number(NumberConsts.STR_6));
		numberList.add(new Number(NumberConsts.STR_7));
		numberList.add(new Number(NumberConsts.STR_8));
		numberList.add(new Number(NumberConsts.STR_9));
		
		//設定した数字をVariableNumberDtoへ設定する
		VariableNumberDto variableNumberDto = new VariableNumberDto();
		variableNumberDto.setStrList(numberList);
		
		return variableNumberDto;
		
	}
	
	public SudokuOneLineDto initSudokuOneLineDto() {
		//SudokuCellDtoの設定
		
	}
	
}
