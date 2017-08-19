import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.*;


public class BaalzePageCollector {
	
	public static void main(String[] args) {
		try {
			Document doc;
			doc = Jsoup.connect("http://en.wikipedia.org/").get();
			Elements newsHeadlines = doc.select("#mp-itn b a");
			for(Element e: newsHeadlines) {
				System.out.println(e.attr("abs:href"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
