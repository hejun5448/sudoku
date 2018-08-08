package sudoku.dto;

import sudoku.common.CommonConsts;
import sudoku.common.NumberConsts;
import java.util.ArrayList;


/**
 * 数独で使用する数字
 * @author masudakennin
 *
 */
public class VariableNumberDto {
	/**
	 * 数字の候補
	 */
	private ArrayList<Number> strList;

	/**
	 * @return the strList
	 */
	public ArrayList<Number> getStrList() {
		return strList;
	}

	/**
	 * @param strList the strList to set
	 */
	public void setStrList(ArrayList<Number> strList) {
		this.strList = strList;
	}
	
}
