package sudoku.common;

import java.util.ArrayList;

public class MemoryNumberArray {

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
