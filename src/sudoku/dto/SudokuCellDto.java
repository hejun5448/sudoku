package sudoku.dto;

/**
 * 数独で使う１マス
 * @author masudakennin
 *
 */
public class SudokuCellDto {

	/**
	 * １マスのステータス
	 * 初期値：false
	 */
	private boolean cellStatus = false;
	
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
	public boolean isCellStatus() {
		return cellStatus;
	}

	/**
	 * @param configStatus the configStatus to set
	 */
	public void setCellStatus(boolean cellStatus) {
		this.cellStatus = cellStatus;
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
	public VariableNumberDto getVariableNumberDto() {
		return variableNumberDto;
	}

	/**
	 * @param variableNumberDto the variableNumberDto to set
	 */
	public void setVariableNumberDto(VariableNumberDto variableNumberDto) {
		this.variableNumberDto = variableNumberDto;
	}
	
}
