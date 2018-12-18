/**
 * 
 * @version 1.0
 * @author С����
 * @2018��7��20�� ����9:48:11
 */
public class Book {
	
	//MVC
	
	private String name;
	private String isbn;
	private double price;
	private int count;  //��ǰͼ��Ŀ����
	private boolean borrow;
	
	public boolean isBorrow() {
		return borrow;
	}
	public void setBorrow(boolean borrow) {
		this.borrow = borrow;
	}
	public  Book() {
		
	}
	public Book(String name){
		this().setName(name);
	}
	
	public Book(String name,String isbn,double price,int count){
		setName(name);
		setIsbn(isbn);
		setPrice(price);
		setCount(count);
		setBorrow(borrow);
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		//������д�ж��߼�
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if (count < 0) {
			count = 0;
		}else{
			this.count = count;
		}
		
	}
	
	
	
	
	
	
	
}
