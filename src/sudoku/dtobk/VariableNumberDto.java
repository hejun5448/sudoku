package sudoku.dtobk;

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
	 * このクラスが保持しているNumber型の数字を返却する。
	 * @return Number型のArrayList
	 */
	public ArrayList<Number> getNumbersList(){
		ArrayList<Number> numbers = new ArrayList<Number>();
		
		//リストの設定
		numbers.add(str1);
		numbers.add(str2);
		numbers.add(str3);
		numbers.add(str4);
		numbers.add(str5);
		numbers.add(str6);
		numbers.add(str7);
		numbers.add(str8);
		numbers.add(str9);
		
		return numbers;
	}
	
	/**
	 * このクラスが保持しているNumber型のステータスをセットする。
	 * @return Number型のArrayList
	 */
	public void setNumbersStatus(String num, String numStatus){
		
		boolean inputChk = true;
		if(!NumberConsts.DIFINITION_NUMBER.equals(numStatus)
				|| !NumberConsts.DIFINITION_NUMBER.equals(numStatus)
				|| !NumberConsts.DIFINITION_NUMBER.equals(numStatus)) {
			inputChk = false;
		}
		
		if(inputChk) {
			if(str1.getNumber().equals(num)) {
				str1.setNumberStatus(numStatus);
			}
			if(str2.getNumber().equals(num)) {
				str2.setNumberStatus(numStatus);
			}
			if(str3.getNumber().equals(num)) {
				str3.setNumberStatus(numStatus);
			}
			if(str4.getNumber().equals(num)) {
				str4.setNumberStatus(numStatus);
			}
			if(str5.getNumber().equals(num)) {
				str5.setNumberStatus(numStatus);
			}
			if(str6.getNumber().equals(num)) {
				str6.setNumberStatus(numStatus);
			}
			if(str7.getNumber().equals(num)) {
				str7.setNumberStatus(numStatus);
			}
			if(str8.getNumber().equals(num)) {
				str8.setNumberStatus(numStatus);
			}
			if(str9.getNumber().equals(num)) {
				str9.setNumberStatus(numStatus);
			}
		}
	}
	
	/**
	 * このクラスが保持しているNumber型のステータスを取得する。
	 * @return Number型のArrayList
	 */
	public String getNumbersStatus(String num){
		
		String workNumberStatus = CommonConsts.BLANK;
		
		if(str1.getNumber().equals(num)) {
			workNumberStatus = str1.getNumberStatus();
		}
		if(str2.getNumber().equals(num)) {
			workNumberStatus = str2.getNumberStatus();
		}
		if(str3.getNumber().equals(num)) {
			workNumberStatus = str3.getNumberStatus();
		}
		if(str4.getNumber().equals(num)) {
			workNumberStatus = str4.getNumberStatus();
		}
		if(str5.getNumber().equals(num)) {
			workNumberStatus = str5.getNumberStatus();
		}
		if(str6.getNumber().equals(num)) {
			workNumberStatus = str6.getNumberStatus();
		}
		if(str7.getNumber().equals(num)) {
			workNumberStatus = str7.getNumberStatus();
		}
		if(str8.getNumber().equals(num)) {
			workNumberStatus = str8.getNumberStatus();
		}
		if(str9.getNumber().equals(num)) {
			workNumberStatus = str9.getNumberStatus();
		}
		
		return workNumberStatus;
	}
}
