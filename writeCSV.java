import java.awt.List;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * The purpose of this class is to write data to a CSV file.
 * 
 * @author Nick Maynard
 * @version 1.0
 * 
 */
public class writeCSV {
	private String name;

	/**
	 * 
	 * @param x is the array list of items being read into CSV.
	 */
	public writeCSV(String x) {
		name = x;
	}
	/**
	 * 
	 * @return the String name of the CSV file.
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * 
	 * @param Filename is the CSV file name being created.
	 */
	public static void write(String Filename) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(Filename);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
