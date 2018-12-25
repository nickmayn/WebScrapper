/**
 * @author Nick Maynard
 * @version 1.0
 * 
 * Class made to represent the items found in a web search.
 *
 */
public class Item {
	private String address;
	private String url;
	private String price;
	
	public Item(String a, String b, String c)
	{
		setAddress(a);
		setURL(b);
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
	public String getURL()
	{
		return url;
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
	 * method that sets the URL of the item.
	 * @param x is the String representing the URL.
	 */
	public void setURL(String x)
	{
		url = x;
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
}
