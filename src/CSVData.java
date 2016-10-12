/***
 * 
 * @author shivanighanta
 *
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;

	public CSVData() {

	}

	/***
	 * returns a new CSVData object for a file ignoring the lines at the top It
	 * uses the first row as the column names. all other data is stored in 2D
	 * array
	 * 
	 * @param filename
	 *            name of the CSV file
	 * @param numLinesIgnore
	 *            the number of lines to ignore from the top of the file
	 * @param columnHeaders
	 *            the names/descriptions of each column of values
	 * @return CSVData
	 */
	public static CSVData readCSVFile(String filename, int numLinesIgnore, String[] columnHeaders) {
		return new CSVData();
	}
	
	public static CSVData readCSVFile(String filename, int numLinesIgnore) {
		return new CSVData();
	}
	
	public static double[] getRow(int row){
		return null;
	}
	
	public static double[] getColumn(int column){
		return null;
	}
	
	public static double[][] getMultipleRows(int[] rows){
		return null;
	}
	
	public static double[][] getMultipleColumns(int[] columns){
		return null;
	}
	
	public static void setEntry(int row, int column){
		
	}
	
	public static void setRow(double[] values){
		
	}
	
	public static void setColumn(double[] values){
		
	}

	public static String[] getColumnTitles(){
		return null;
	}
	
	public static void readDataToCSVFile(){
		
	}
}
