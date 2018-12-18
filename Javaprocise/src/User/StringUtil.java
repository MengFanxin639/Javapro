package User;
/**
 * 字符串的工具类
 * @version 1.0
 * @author 小新新
 * @2018年7月20日 下午8:01:55
 */
public class StringUtil {
//	*实现用户注册功能
// 	1.用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊字符
	public static boolean isCorrectUserName(String userName) {
		boolean isCorrect = true;
		if (userName == null) return false;
		if (userName.length() > 25)return false;
		//非法字符
		char[] unValidChar = {' ','\'','?','<','>',',','"'};
		for (char ch : unValidChar) {
			if (userName.contains(Character.toString(ch))) {
				isCorrect = false;
				break;
			}
		}
		return isCorrect;
	}
// 	2.密码6-18位，只能包含字母、数字、特殊字符（下划线 、@、 #、￥！）
//	 	纯数字、纯字母时、密码强度都是弱（**####）
//	 	数字+密码、数字+符号、数字+字母，强度为中（****##）
//	 	同时存在三种字符，强度为强（******）
	public static String validatePassword(String password){
		String power = "";
		//密码的强度,如果返回值为空“”，密码验证失败；成功，返回星号
		if (password == null) return power;
		if (password.length() < 6 || password.length() > 18)return power;
		//合法的组成部分
		//String[] correctPart = {"_","@","#","$","!"};
		String part = "_@#!$";
		
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLetterOrDigit(password.charAt(i))) {
				//如果不是字母、数字，，，就是非法格式
				if (part.contains(Character.toString(password.charAt(i)))) {
					return power;
				}
			}
		}
		//判断密码强度
		if (isDigit(password) || isLetter(password)) {
			power = "★★☆☆☆☆";
		}else if(isDigitAndLetter(password)){
			power = "★★★★☆☆";
		}else   {  //经过以上2次过滤，密码强度为强
			power = "★★★★★★";
			 
		}
		
		return power;
	}
//	private static boolean isDigitAndLetterAndSymble(String value){
//		for (int i = 0; i < value.length(); i++) {
//			if (!Character.isDigit(value.charAt(i)) || Character.isLetter(value.charAt(i) )
//					|| "_@#!$".contains(Character.toString(value.charAt(i)))){
//				return false;
//			}
//		}
//		return true;
//	}
//	
	private static boolean isDigitAndLetter(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (Character.isLetterOrDigit((value.charAt(i)))) {
				return true;
			}
		}return false;
	}
	
	//判断字符串是不是一个纯数字
	
	
	private static boolean isDigit(String value){
		for (int i = 0; i < value.length(); i++) {
			if (Character.isDigit(value.charAt(i))) {
				return false;
				
			}
		}
		return true;
	}//判断字符串是不是纯字母
	private static boolean isLetter(String value){
		for (int i = 0; i < value.length(); i++) {
			if (Character.isLetter(value.charAt(i))) {
				return false;
				
			}
		}
		return true;
	}
	
// 	3.用户输入正确的email；
// 		必须包含@符号，且只能包含一个@和.  符号不能在开头和结尾
	private static boolean isContainsSymble(String value){
		String part = "_@#!$";
		for (int i = 0; i < value.length(); i++) {
			if (part.contains(Character.toString(value.charAt(i)))) {
				
			}
		}
		return true;

	}
}
