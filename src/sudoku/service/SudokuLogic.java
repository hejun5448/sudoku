package sudoku.service;

import java.util.ArrayList;

import sudoku.common.CommonConsts;
import sudoku.common.NumberConsts;
import sudoku.dto.*;
import sudoku.dto.Number;

public class SudokuLogic {

	/**
	 * 
	 * 表示用ナンバーをキーとする
	 * ここに値がある場合は固定値となる
	 * 固定値がある場合、その行の他のところから固定値を削除する
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	/**
	 * 
	//チェック対象の番号の特定
	//１つなら確定　definitionNumber
	//複数あるなら候補 valiableNumber
	 *
	 *行と列はそれぞれ１−９の数字が含むこと。
	 *１列の中で該当がない場合は数字を決定する。
	 *１行の中で重複がない場合は数字を決定する。
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * cellDtoの表示番号を特定し返却する
	 * 
	 */
	public String identifyNumber(SudokuCellDto cell) {
		if(cell.isCellStatus()) {
			return cell.getNumber();
		}
		ArrayList<Number> numbers = new ArrayList<Number>();
		numbers = cell.getVariableNumberDto().getNumbersList();
		for(Number num : numbers) {
			if(NumberConsts.DIFINITION_NUMBER.equals(num.getNumberStatus())) {
				cell.setCellStatus(true);
				return cell.getNumber();
			}
		}
		return CommonConsts.BLANK;
		
	}
	
	
}
