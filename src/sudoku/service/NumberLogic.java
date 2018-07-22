package sudoku.service;

import java.util.ArrayList;

import sudoku.common.CommonConsts;
import sudoku.common.NumberConsts;
import sudoku.dto.Number;

public class NumberLogic {
	/**
	 * Number型が保持しているステータスを比較し、数字が決定している場合は表示する数字を返却する。
	 * それ以外の場合はブランクを返却する。
	 * @param num
	 * @return 数字　または　ブランク
	 */
	public String getNumberForDisplay(Number num) {
		if(NumberConsts.DIFINITION_NUMBER.equals(num.getNumberStatus())) {
			return num.getNumber();
		} else {
			return CommonConsts.BLANK;
		}
	}
	
	/**
	 * Number型のステータスを設定する。
	 * @param num
	 * @param numberStatus
	 */
	public void setNumberStatus(Number num, String numberStatus) {
		num.setNumberStatus(numberStatus);
	}
	
	

	/**
	 * Number型の数字をステータスごとに振り分け返却する。
	 * 数字が決定している場合は、決定している数字をNumber型で返却する。
	 * @param numberList
	 * @return ステータスに振り分けられた数字を返却する。
	 */
	public ArrayList<Number> getNumberList(ArrayList<Number> numberList){
		
		ArrayList<Number> workDifinitionNumberList = new ArrayList<Number>();
		ArrayList<Number> workVariableNumberList = new ArrayList<Number>();
		ArrayList<Number> workNotVariableNumberList = new ArrayList<Number>();
		
		//数字ステータスの振り分け
		for(Number num: numberList) {
			if(NumberConsts.DIFINITION_NUMBER.equals(num.getNumberStatus())) {
				workDifinitionNumberList.add(num);
			}
			if(NumberConsts.VARIABLE_NUMBER.equals(num.getNumberStatus())) {
				workVariableNumberList.add(num);
			}
			if(NumberConsts.NOT_VARIABLE_NUMBER.equals(num.getNumberStatus())) {
				workNotVariableNumberList.add(num);
			}
		}
		
		//数字が決まっている場合
		if(!workDifinitionNumberList.isEmpty()) {
			return workDifinitionNumberList;
		}
		//数字の候補がある場合
		else if(!workVariableNumberList.isEmpty()) {
			return workVariableNumberList;
		} 
		//数字の候補がない場合
		else if (workNotVariableNumberList.isEmpty()) {
			return workNotVariableNumberList;
		} else {
			return numberList;
		}
	}
}
