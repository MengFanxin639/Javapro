package User;
/**
 * �ַ����Ĺ�����
 * @version 1.0
 * @author С����
 * @2018��7��20�� ����8:01:55
 */
public class StringUtil {
//	*ʵ���û�ע�Ṧ��
// 	1.�û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ������ַ�
	public static boolean isCorrectUserName(String userName) {
		boolean isCorrect = true;
		if (userName == null) return false;
		if (userName.length() > 25)return false;
		//�Ƿ��ַ�
		char[] unValidChar = {' ','\'','?','<','>',',','"'};
		for (char ch : unValidChar) {
			if (userName.contains(Character.toString(ch))) {
				isCorrect = false;
				break;
			}
		}
		return isCorrect;
	}
// 	2.����6-18λ��ֻ�ܰ�����ĸ�����֡������ַ����»��� ��@�� #��������
//	 	�����֡�����ĸʱ������ǿ�ȶ�������**####��
//	 	����+���롢����+���š�����+��ĸ��ǿ��Ϊ�У�****##��
//	 	ͬʱ���������ַ���ǿ��Ϊǿ��******��
	public static String validatePassword(String password){
		String power = "";
		//�����ǿ��,�������ֵΪ�ա�����������֤ʧ�ܣ��ɹ��������Ǻ�
		if (password == null) return power;
		if (password.length() < 6 || password.length() > 18)return power;
		//�Ϸ�����ɲ���
		//String[] correctPart = {"_","@","#","$","!"};
		String part = "_@#!$";
		
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLetterOrDigit(password.charAt(i))) {
				//���������ĸ�����֣��������ǷǷ���ʽ
				if (part.contains(Character.toString(password.charAt(i)))) {
					return power;
				}
			}
		}
		//�ж�����ǿ��
		if (isDigit(password) || isLetter(password)) {
			power = "�������";
		}else if(isDigitAndLetter(password)){
			power = "�������";
		}else   {  //��������2�ι��ˣ�����ǿ��Ϊǿ
			power = "�������";
			 
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
	
	//�ж��ַ����ǲ���һ��������
	
	
	private static boolean isDigit(String value){
		for (int i = 0; i < value.length(); i++) {
			if (Character.isDigit(value.charAt(i))) {
				return false;
				
			}
		}
		return true;
	}//�ж��ַ����ǲ��Ǵ���ĸ
	private static boolean isLetter(String value){
		for (int i = 0; i < value.length(); i++) {
			if (Character.isLetter(value.charAt(i))) {
				return false;
				
			}
		}
		return true;
	}
	
// 	3.�û�������ȷ��email��
// 		�������@���ţ���ֻ�ܰ���һ��@��.  ���Ų����ڿ�ͷ�ͽ�β
	private static boolean isContainsSymble(String value){
		String part = "_@#!$";
		for (int i = 0; i < value.length(); i++) {
			if (part.contains(Character.toString(value.charAt(i)))) {
				
			}
		}
		return true;

	}
}
