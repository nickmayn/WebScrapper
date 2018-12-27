import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

/**
 * The purpose of this class is to create a class that will parse HTML code into
 * readable formats.
 * 
 * @author Nick Maynard
 * @version 1.0
 */
public class HTMLParser {
	public static void main(String args[]) {
		Document document;
		ArrayList<Item> Item = new ArrayList<Item>();
		try {
			document = Jsoup.connect("https://www.zillow.com/homes/for_sale/McLean-VA/46465_rid/3-_baths/globalrelevanceex_sort/39.049985,-77.074757,38.862567,-77.30959_rect/11_zm/0_mmm/").get();
			Elements address1 = document.select("span[itemprop]:contains(McLean)");
			Elements price1 = document.select(".zsg-photo-card-price:contains($)");
			Elements bed1 = document.select(".zsg-photo-card-info:contains(bds)");
			int i = 0;
			while (i < price1.size() - 2) {
				Item item = new Item(address1.get(i).text(), bed1.get(i).text(), price1.get(i).text());
				Item.add(item);
				i++;
				}
			for (int x = 2; x < 9; x++) {
			document = Jsoup.connect("https://www.zillow.com/homes/for_sale/McLean-VA/46465_rid/3-_baths/globalrelevanceex_sort/39.049985,-77.074757,38.862567,-77.30959_rect/11_zm/"+ x +"_p/0_mmm/").get();
			i = 0;
			Elements address = document.select("span[itemprop]:contains(McLean)");
			Elements price = document.select(".zsg-photo-card-price:contains($)");
			Elements bed = document.select(".zsg-photo-card-info:contains(bds)");
			while (i < price.size() - 2) {
				Item item = new Item(address.get(i).text(), bed.get(i).text(), price.get(i).text());
				Item.add(item);
				i++;
				}
			}
			for (int y = 0; y < Item.size(); y++)
			{
				Item temp = Item.get(y);
				String holder = temp.getPrice().substring(1);
				String holder2 = temp.getAddress();
				String[] x = holder.split(",");
				String d = "";
				for (int x2 = 0; x2 < x.length; x2++)
				{
					d = d + x[x2];
				}
				Item.get(y).setPrice(d);
				System.out.println(Item.get(y).getAddress());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		writeCSV.write("C:\\Users\\Nick\\Desktop\\Personal Projects\\Web Scrapper\\houseData.csv",Item);
	}
}