package sudoku.dto;

import sudoku.common.*;

public class Number {
	private String number = null;
	private String numberStatus = NumberConsts.VARIABLE_NUMBER;
	
	public Number(String num) {
		this.number = num;
	}
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the numberStatus
	 */
	public String getNumberStatus() {
		return numberStatus;
	}

	/**
	 * @param numberStatus the numberStatus to set
	 */
	public void setNumberStatus(String numberStatus) {
		this.numberStatus = numberStatus;
	}
	
}
