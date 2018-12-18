import java.io.UnsupportedEncodingException;
import java.util.Scanner;
/**
 * 判断用户传入的字符串是否是正确的小数
 * 字符串中只能有一个小数点，不能在第一位、最后一位
 * @version 1.0
 * @author 小新新
 * @2018年7月20日 下午5:52:30
 */
public class StringDemo { 
	public static void main(String[] args) throws UnsupportedEncodingException{
		Scanner input = new Scanner(System.in);099
	public static boolean isDecimal(String str) {
		boolean isDecimal = true;
		for (int i = 0; i < str.length; i++) {
			if (!Character.isDigit(str.charAt(i))) {
				if (str.charAt(i) == '.') {
					if (i == 0|| i == str.length() -1) {//如果小数点在第一位，最后一位false
						isDecimal = false;
						break;
					}
				}else {//如果当前字符不是数字、不是小数点，非法字符返回false
					isDecimal = false;
					break;
				}
			}
		}
		//判断字符串中只能有一个小数点
		//1.存在小数点
		//2.从前搜索的下标=从后搜索的下标
		if (str.contains(".") && str.indexOf(".") == str.lastIndexOf(".")) {
			return false;
		}
		
		
		return isDecimal;
		
		
		
		
		//1.判断字符中的每个元素必须是数字或小数点
		//2.如果有小数点，只能有一个，且不能在第一位、最后一位
	}
	
	
	
		//trim方法：去掉字符串两边的左右空格  在用户输入用户名后使用
		
	 
	}
	
	
}
