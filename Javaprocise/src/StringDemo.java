import java.io.UnsupportedEncodingException;
import java.util.Scanner;
/**
 * �ж��û�������ַ����Ƿ�����ȷ��С��
 * �ַ�����ֻ����һ��С���㣬�����ڵ�һλ�����һλ
 * @version 1.0
 * @author С����
 * @2018��7��20�� ����5:52:30
 */
public class StringDemo { 
	public static void main(String[] args) throws UnsupportedEncodingException{
		Scanner input = new Scanner(System.in);099
	public static boolean isDecimal(String str) {
		boolean isDecimal = true;
		for (int i = 0; i < str.length; i++) {
			if (!Character.isDigit(str.charAt(i))) {
				if (str.charAt(i) == '.') {
					if (i == 0|| i == str.length() -1) {//���С�����ڵ�һλ�����һλfalse
						isDecimal = false;
						break;
					}
				}else {//�����ǰ�ַ��������֡�����С���㣬�Ƿ��ַ�����false
					isDecimal = false;
					break;
				}
			}
		}
		//�ж��ַ�����ֻ����һ��С����
		//1.����С����
		//2.��ǰ�������±�=�Ӻ��������±�
		if (str.contains(".") && str.indexOf(".") == str.lastIndexOf(".")) {
			return false;
		}
		
		
		return isDecimal;
		
		
		
		
		//1.�ж��ַ��е�ÿ��Ԫ�ر��������ֻ�С����
		//2.�����С���㣬ֻ����һ�����Ҳ����ڵ�һλ�����һλ
	}
	
	
	
		//trim������ȥ���ַ������ߵ����ҿո�  ���û������û�����ʹ��
		
	 
	}
	
	
}
