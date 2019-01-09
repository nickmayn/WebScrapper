/**
 * @author Nick Maynard
 * @version 1.0
 * 
 * Class made to represent the items found in a web search.
 *
 */
public class Item {
	private String address;
	private String bed;
	private String price;
	private String bath;
	private String sqft;
	
	public Item(String a, String b, String c)
	{
		setAddress(a);
		setBed(b);
		setPrice(c);
	}
	/**
	 * method that returns the name of the item found.
	 * @return the name of the item
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * method that returns the url of the searched item.
	 * @return the URL of the item
	 */
	public String getBed()
	{
		return bed;
	}
	/**
	 * method that returns the price of the object.
	 * @return the price of the object
	 */
	public String getPrice()
	{
		return price;
	}
	/**
	 * method that returns the bath number of the searched item.
	 * @return the bath number.
	 */
	public String getBath()
	{
		return bath;
	}
	/**
	 * method that returns the bath number of the searched item.
	 * @return the bath number.
	 */
	public String getSqft()
	{
		return sqft;
	}
	/**
	 * method that sets the beds of the item.
	 * @param x is the String with the number of beds.
	 */
	public void setBed(String x)
	{
		bed = x;
	}
	/**
	 * method that sets the title of the item.
	 * @param x is the title of the item
	 */
	public void setAddress(String x)
	{
		address = x;
	}
	/**
	 * method that sets the price of the object.
	 * @param x is the price of the object.
	 */
	public void setPrice(String x)
	{
		price = x;
	}
	/**
	 * method that sets the price of the object.
	 * @param x is the price of the object.
	 */
	public void setBath(String x)
	{
		bath = x;
	}
	/**
	 * method that sets the sqft of the item.
	 * @param x is the String with the number of beds.
	 */
	public void setSqft(String x)
	{
		sqft = x;
	}
}
