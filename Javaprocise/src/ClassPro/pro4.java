package ClassPro;

import java.util.Scanner;

/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年8月28日 下午12:22:59
 */
/*  1、定义一个图书类（属性和方法自己分析），要求用构造方法实现成员变量的两种输入方式，
 * 键盘输入和函数参数传递输入。  */
class Book{		/*图书编号、书名、作者、出版社、图书价格、出版时间、*/
	int bookId;			//图书编号
	String bookName;	//书名
	String bookAuther;	//作者
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
		System.out.println("请输入图书编号：");
		int bookId = reader.nextInt();
		Book book1 = new Book();
		book1.setBookId(bookId);
		System.out.println(book1.bookId);
	}
}
