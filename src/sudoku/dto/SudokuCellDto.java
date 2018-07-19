package sudoku.dto;

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
	 * 数独で使用する数字の候補
	 */
	private VariableNumberDto variableNumberDto;

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
	 * @return the variableNumberDto
	 */
	public VariableNumberDto getNumberDto() {
		return variableNumberDto;
	}

	/**
	 * @param variableNumberDto the variableNumberDto to set
	 */
	public void setNumberDto(VariableNumberDto variableNumberDto) {
		this.variableNumberDto = variableNumberDto;
	}
	
}
