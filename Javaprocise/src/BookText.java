/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年7月20日 上午9:58:09
 */
public class BookText {
	public static void main(String[] args) {
		Book book = new Book("浅谈小新新", "123-321", 98.8, 5);
		System.out.println(book.toString());
		//实例化图书对象
		BookBiz bookBiz = new BookBiz();
		int num = 1234;
		
		bookBiz.sellBook(book);
		bookBiz.text(num);
		
		System.out.println(book.getCount());
		
	}
}
