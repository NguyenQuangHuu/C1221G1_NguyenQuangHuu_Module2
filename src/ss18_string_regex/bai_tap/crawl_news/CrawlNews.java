package ss18_string_regex.bai_tap.crawl_news;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            content = content.replaceAll("", "");
            //<h3\sclass=\"article-title"\>(.*?)\.htm\"\sdata-track-content=(.*?).htm\"\>(.*?)\<\/h3\>
            Pattern p = Pattern.compile("<h3\\sclass=\"article-title\">\\s<a\\sdata-content-name=\"category-timeline_page_1\"\\s(.*?)\\.htm\">(.*?)</a>\\s</h3>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(2));
            }
// close scanner
            scanner.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
