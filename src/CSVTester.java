
public class CSVTester {

	public static void main(String[] args){
		CSVData a = CSVData.readCSVFile("/Users/shivanighanta/Downloads/HIMU-2016-10-14_10-24-50.txt", 5);
		System.out.println(a);
	}
}
