package sudoku.dto;

import sudoku.common.CommonConsts;
import sudoku.common.NumberConsts;

/**
 * 数独で使用する数字
 * @author masudakennin
 *
 */
public class VariableNumberDto {
	/**
	 * １〜９までの数字の候補を宣言
	 */
	private Number str1 = new Number(NumberConsts.STR_1);
	private Number str2 = new Number(NumberConsts.STR_2);
	private Number str3 = new Number(NumberConsts.STR_3);
	private Number str4 = new Number(NumberConsts.STR_4);
	private Number str5 = new Number(NumberConsts.STR_5);
	private Number str6 = new Number(NumberConsts.STR_6);
	private Number str7 = new Number(NumberConsts.STR_7);
	private Number str8 = new Number(NumberConsts.STR_8);
	private Number str9 = new Number(NumberConsts.STR_9);
	
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
	 * @return the str1
	 */
	public Number getStr1() {
		return str1;
	}

	/**
	 * @param str1 the str1 to set
	 */
	public void setStr1(Number str1) {
		this.str1 = str1;
	}

	/**
	 * @return the str2
	 */
	public Number getStr2() {
		return str2;
	}

	/**
	 * @param str2 the str2 to set
	 */
	public void setStr2(Number str2) {
		this.str2 = str2;
	}

	/**
	 * @return the str3
	 */
	public Number getStr3() {
		return str3;
	}

	/**
	 * @param str3 the str3 to set
	 */
	public void setStr3(Number str3) {
		this.str3 = str3;
	}

	/**
	 * @return the str4
	 */
	public Number getStr4() {
		return str4;
	}

	/**
	 * @param str4 the str4 to set
	 */
	public void setStr4(Number str4) {
		this.str4 = str4;
	}

	/**
	 * @return the str5
	 */
	public Number getStr5() {
		return str5;
	}

	/**
	 * @param str5 the str5 to set
	 */
	public void setStr5(Number str5) {
		this.str5 = str5;
	}

	/**
	 * @return the str6
	 */
	public Number getStr6() {
		return str6;
	}

	/**
	 * @param str6 the str6 to set
	 */
	public void setStr6(Number str6) {
		this.str6 = str6;
	}

	/**
	 * @return the str7
	 */
	public Number getStr7() {
		return str7;
	}

	/**
	 * @param str7 the str7 to set
	 */
	public void setStr7(Number str7) {
		this.str7 = str7;
	}

	/**
	 * @return the str8
	 */
	public Number getStr8() {
		return str8;
	}

	/**
	 * @param str8 the str8 to set
	 */
	public void setStr8(Number str8) {
		this.str8 = str8;
	}

	/**
	 * @return the str9
	 */
	public Number getStr9() {
		return str9;
	}

	/**
	 * @param str9 the str9 to set
	 */
	public void setStr9(Number str9) {
		this.str9 = str9;
	}
	
}
