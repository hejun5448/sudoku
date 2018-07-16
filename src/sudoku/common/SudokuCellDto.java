package sudoku.common;

/**
 * 数独で使う１マス
 * @author masudakennin
 *
 */
public class SudokuCellDto {

	/**
	 * 数独設定のステータス
	 * 初期値：false
	 */
	private boolean configStatus = false;
	
	/**
	 * 表示用数字（文字列）
	 * 初期値：null
	 */
	private String number = null;
	
	/**
	 * 数独で使用する数字
	 */
	private NumberDto numberDto;

	/**
	 * @return the configStatus
	 */
	public boolean isConfigStatus() {
		return configStatus;
	}

	/**
	 * @param configStatus the configStatus to set
	 */
	public void setConfigStatus(boolean configStatus) {
		this.configStatus = configStatus;
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
	 * @return the numberDto
	 */
	public NumberDto getNumberDto() {
		return numberDto;
	}

	/**
	 * @param numberDto the numberDto to set
	 */
	public void setNumberDto(NumberDto numberDto) {
		this.numberDto = numberDto;
	}
	
}
