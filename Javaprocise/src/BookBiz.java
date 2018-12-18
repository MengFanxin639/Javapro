/**
 * 图书的业务类，封装了图书数组的增删改查方法
 * @version 1.0
 * @author 小新新
 * @2018年7月20日 上午9:50:57
 */
public class BookBiz {
	public void text(int num){
		num++;
	}
	/**
	 * 销售书籍
	 * book 要销售的图书对象
	 * 如果销售成功，返回图书数量，销售失败，返回-1
	 * */
	public int sellBook(Book book){
		//1.判断图书的库存是否大于1
		//2.图书的苦楚你-1
		//3.返回销售的数量
		if (book.getCount() > 1) {
			return -1;
		}
		book.setCount(book.getCount() -1 );
		return 1;
	}
	
	
	
	
	
	
	
	

}
