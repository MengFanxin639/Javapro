/**
 * 
 * @version 1.0
 * @author С����
 * @2018��7��20�� ����9:58:09
 */
public class BookText {
	public static void main(String[] args) {
		Book book = new Book("ǳ̸С����", "123-321", 98.8, 5);
		System.out.println(book.toString());
		//ʵ����ͼ�����
		BookBiz bookBiz = new BookBiz();
		int num = 1234;
		
		bookBiz.sellBook(book);
		bookBiz.text(num);
		
		System.out.println(book.getCount());
		
	}
}
