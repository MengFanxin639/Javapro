package ClassPro;

import java.util.Scanner;

/**
 * 
 * @version 1.0
 * @author С����
 * @2018��8��28�� ����12:22:59
 */
/*  1������һ��ͼ���ࣨ���Ժͷ����Լ���������Ҫ���ù��췽��ʵ�ֳ�Ա�������������뷽ʽ��
 * ��������ͺ��������������롣  */
class Book{		/*ͼ���š����������ߡ������硢ͼ��۸񡢳���ʱ�䡢*/
	int bookId;			//ͼ����
	String bookName;	//����
	String bookAuther;	//����
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuther() {
		return bookAuther;
	}
	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}
	
}
public class pro4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("������ͼ���ţ�");
		int bookId = reader.nextInt();
		Book book1 = new Book();
		book1.setBookId(bookId);
		System.out.println(book1.bookId);
	}
}
