package sudoku.dto;

/**
 * 数独で使う９＊９のマス
 * @author masudakennin
 *
 */
public class SudokuMatrixDto {
	/**
	 * 行の構造体で列の構造体を宣言（９＊９の正方形）
	 */
	private SudokuRowsDto col1;
	private SudokuRowsDto col2;
	private SudokuRowsDto col3;
	private SudokuRowsDto col4;
	private SudokuRowsDto col5;
	private SudokuRowsDto col6;
	private SudokuRowsDto col7;
	private SudokuRowsDto col8;
	private SudokuRowsDto col9;
	/**
	 * @return the col1
	 */
	public SudokuRowsDto getCol1() {
		return col1;
	}
	/**
	 * @param col1 the col1 to set
	 */
	public void setCol1(SudokuRowsDto col1) {
		this.col1 = col1;
	}
	/**
	 * @return the col2
	 */
	public SudokuRowsDto getCol2() {
		return col2;
	}
	/**
	 * @param col2 the col2 to set
	 */
	public void setCol2(SudokuRowsDto col2) {
		this.col2 = col2;
	}
	/**
	 * @return the col3
	 */
	public SudokuRowsDto getCol3() {
		return col3;
	}
	/**
	 * @param col3 the col3 to set
	 */
	public void setCol3(SudokuRowsDto col3) {
		this.col3 = col3;
	}
	/**
	 * @return the col4
	 */
	public SudokuRowsDto getCol4() {
		return col4;
	}
	/**
	 * @param col4 the col4 to set
	 */
	public void setCol4(SudokuRowsDto col4) {
		this.col4 = col4;
	}
	/**
	 * @return the col5
	 */
	public SudokuRowsDto getCol5() {
		return col5;
	}
	/**
	 * @param col5 the col5 to set
	 */
	public void setCol5(SudokuRowsDto col5) {
		this.col5 = col5;
	}
	/**
	 * @return the col6
	 */
	public SudokuRowsDto getCol6() {
		return col6;
	}
	/**
	 * @param col6 the col6 to set
	 */
	public void setCol6(SudokuRowsDto col6) {
		this.col6 = col6;
	}
	/**
	 * @return the col7
	 */
	public SudokuRowsDto getCol7() {
		return col7;
	}
	/**
	 * @param col7 the col7 to set
	 */
	public void setCol7(SudokuRowsDto col7) {
		this.col7 = col7;
	}
	/**
	 * @return the col8
	 */
	public SudokuRowsDto getCol8() {
		return col8;
	}
	/**
	 * @param col8 the col8 to set
	 */
	public void setCol8(SudokuRowsDto col8) {
		this.col8 = col8;
	}
	/**
	 * @return the col9
	 */
	public SudokuRowsDto getCol9() {
		return col9;
	}
	/**
	 * @param col9 the col9 to set
	 */
	public void setCol9(SudokuRowsDto col9) {
		this.col9 = col9;
	}
}
