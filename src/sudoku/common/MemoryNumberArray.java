package sudoku.common;

import java.util.ArrayList;

public class MemoryNumberArray {

	/**
	 * String １〜９に対して初期値String flaseを返却する。
	 * @return ArrayList<boolean> false
	 */
	public ArrayList<String> memoryNumberArray(){
		ArrayList<String> memoryNumberArray = new ArrayList<String>();
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_1);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_2);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_3);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_4);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_5);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_6);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_7);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_8);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_9);
		
		return memoryNumberArray;
	}
	
	
	/**
	 * String １〜９に対して受け取った引数flgに応じたString ture　または　String flaseを返却する。
	 * @param boolean flg
	 * @return ArrayList<String> true or false
	 */
	public ArrayList<String> memoryNumberArray(boolean flg){
		ArrayList<String> memoryNumberArray = new ArrayList<String>();
		
		if(flg) {
			memoryNumberArray.add(MemoryNumberConsts.STR_TRUE_1);
			memoryNumberArray.add(MemoryNumberConsts.STR_TRUE_2);
			memoryNumberArray.add(MemoryNumberConsts.STR_TRUE_3);
			memoryNumberArray.add(MemoryNumberConsts.STR_TRUE_4);
			memoryNumberArray.add(MemoryNumberConsts.STR_TRUE_5);
			memoryNumberArray.add(MemoryNumberConsts.STR_TRUE_6);
			memoryNumberArray.add(MemoryNumberConsts.STR_TRUE_7);
			memoryNumberArray.add(MemoryNumberConsts.STR_TRUE_8);
			memoryNumberArray.add(MemoryNumberConsts.STR_TRUE_9);
		}
		
		if(!flg) {
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_1);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_2);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_3);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_4);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_5);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_6);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_7);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_8);
			memoryNumberArray.add(MemoryNumberConsts.STR_FALSE_9);
		}
		
		return memoryNumberArray;
	}
}
