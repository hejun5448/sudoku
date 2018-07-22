package devLabo;

import java.util.ArrayList;

import sudoku.common.NumberConsts;

public class NumberArray {

	/**
	 * １〜９をセットしたArrayListを返却する。
	 * @return ArrayList<String> numberArray
	 */
	public ArrayList<String> numberArray() {
		ArrayList<String>numberArray = new ArrayList<String>();
		
		numberArray.add(NumberConsts.STR_1);
		numberArray.add(NumberConsts.STR_2);
		numberArray.add(NumberConsts.STR_3);
		numberArray.add(NumberConsts.STR_4);
		numberArray.add(NumberConsts.STR_5);
		numberArray.add(NumberConsts.STR_6);
		numberArray.add(NumberConsts.STR_7);
		numberArray.add(NumberConsts.STR_8);
		numberArray.add(NumberConsts.STR_9);
		
		return numberArray;
	}
}
