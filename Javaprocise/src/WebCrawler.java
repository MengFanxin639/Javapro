import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;
import java.io.IOException;
public class WebCrawler {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个url:(http://开头)");
		String strUrl = input.next();
		crawLer(strUrl);
	}
	
	public static void crawLer(String startUrl){
		//未访问的连接
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		listOfPendingURLs.add(startUrl);
		
		while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
			String strUrl = listOfPendingURLs.remove(0);
			if (!listOfPendingURLs.contains(strUrl)) {
				listOfPendingURLs.add(strUrl);
				System.out.println("开始访问链接：" + strUrl);
				for (String str : getSubURLs(strUrl)) {
					if (!listOfPendingURLs.contains(str)) {
						listOfPendingURLs.add(str);
					}
				}
			}
			
		}
	}
	
	private static ArrayList<String> getSubURLs(String strUrl){
		ArrayList<String> urList = new ArrayList<>();
		try{
			URL url = new URL(strUrl);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while(input.hasNext()){
				String line = input.nextLine();
				current = line.indexOf("http:",current);
				while(current > 0){
				int endIndex = line.indexOf("\"", current);
				if (endIndex > 0) {
					urList.add(line.substring(current,endIndex));
					current = line.indexOf("http:",endIndex);
				}else {
					current = -1;
				}
			}
		}
			input.close();
	}catch (MalformedInputException e) {
		 System.out.println("MalformedInputException" + e.getMessage());
	}catch (IOException e) {
		System.out.println("io异常：" + e.getMessage());
	}catch (Exception e) {
		System.out.println("未知异常" + e.getMessage());
	}
		return urList;
	}

}
