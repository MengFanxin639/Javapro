package User;
/**

 	*ʵ���û�ע�Ṧ��
 	1.�û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ������ַ�
 	2.����6-18λ��ֻ�ܰ�����ĸ�����֡������ַ����»��� ��@�� #��������
	 	�����֡�����ĸʱ������ǿ�ȶ�������**####��
	 	����+���롢����+���š�����+��ĸ��ǿ��Ϊ�У�****##��
	 	ͬʱ���������ַ���ǿ��Ϊǿ��******��
 	3.�û�������ȷ��email��
 		�������@���ţ���ֻ�ܰ���һ��@��.  ���Ų����ڿ�ͷ�ͽ�β
 
 * @version 1.0
 * @author С����
 * @2018��7��20�� ����7:38:23
 */
public class User {
	private String userName;
	private String password;
	private String email;
	
	public User(){
		super();
	}
	
	public User(String userName,String password,String email) {
		setUserName(userName);
		setPassword(password);
		setEmail(email);
		 
	}
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
