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
	public static void write(String Filename, ArrayList<Item> Item) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(Filename);
			fileWriter.append("Address");
			fileWriter.append(",");
			fileWriter.append("Price");
			fileWriter.append(",");
			fileWriter.append("Bedrooms");
			fileWriter.append(",");
			fileWriter.append("Baths");
			fileWriter.append(",");
			fileWriter.append("Square Footage");
			fileWriter.append("\n");
			for(int i = 0; i < Item.size(); i++)
			{
				fileWriter.append(Item.get(i).getAddress());
				fileWriter.append(",");
				fileWriter.append(Item.get(i).getPrice());
				fileWriter.append(",");
				fileWriter.append(Item.get(i).getBed());
				fileWriter.append(",");
				fileWriter.append(Item.get(i).getBath());
				fileWriter.append(",");
				fileWriter.append(Item.get(i).getSqft());
				fileWriter.append("\n");
			}
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
