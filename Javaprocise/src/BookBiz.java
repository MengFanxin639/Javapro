/**
 * ͼ���ҵ���࣬��װ��ͼ���������ɾ�Ĳ鷽��
 * @version 1.0
 * @author С����
 * @2018��7��20�� ����9:50:57
 */
public class BookBiz {
	public void text(int num){
		num++;
	}
	/**
	 * �����鼮
	 * book Ҫ���۵�ͼ�����
	 * ������۳ɹ�������ͼ������������ʧ�ܣ�����-1
	 * */
	public int sellBook(Book book){
		//1.�ж�ͼ��Ŀ���Ƿ����1
		//2.ͼ��Ŀ����-1
		//3.�������۵�����
		if (book.getCount() > 1) {
			return -1;
		}
		book.setCount(book.getCount() -1 );
		return 1;
	}
	
	
	
	
	
	
	
	

}
