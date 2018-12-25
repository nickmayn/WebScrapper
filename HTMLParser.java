import java.io.*;
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
			document = Jsoup.connect("https://www.zillow.com/homes/for_sale/McLean-VA-22101/67147_rid/3-_baths/globalrelevanceex_sort/38.982831,-77.10248,38.889095,-77.219896_rect/12_zm/").get();
			Elements address1 = document.select("span[itemprop]:contains(McLean)");
			Elements price1 = document.select(".zsg-photo-card-price:contains($)");
			Elements bed1 = document.select(".zsg-photo-card-info:contains(bds)");
			int i = 0;
			while (i < price1.size() - 2) {
				Item item = new Item(address1.get(i).text(), price1.get(i).text(), bed1.get(i).text());
				Item.add(item);
				i++;
				}
			for (int x = 2; x < 9; x++) {
			document = Jsoup.connect("https://www.zillow.com/homes/for_sale/McLean-VA-22101/67147_rid/3-_baths/globalrelevanceex_sort/38.982831,-77.10248,38.889095,-77.219897_rect/12_zm/"+ x +"_p/").get();
			i = 0;
			Elements address = document.select("span[itemprop]:contains(McLean)");
			Elements price = document.select(".zsg-photo-card-price:contains($)");
			Elements bed = document.select(".zsg-photo-card-info:contains(bds)");
			while (i < price.size() - 2) {
				Item item = new Item(address.get(i).text(), price.get(i).text(), bed.get(i).text());
				Item.add(item);
				i++;
				i++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(Item.size());
	}
}