package myclasspro;
/**
 * ϵͳ���й���Ա���û�������ɫ��ÿ������Ա�����˻������롣ÿ���û�Ҳ����
 * �˻������룬�����û���Ϊ��ͨ�û���VIP�û��������͡�Ҫ��������������
 * ��Ա����û��ഴ����������Ķ��󣬲����������Ը�ֵ���ڿ���̨����ʾ�������е���Ϣ��
 * @version 1.0
 * @author С����
 * @2018��9��19�� ����12:05:29
 */
//����Ա��--��¼�˺š���¼����
class Manager{
	private String name;
	private int id;
	private String password;
	public Manager(String n,int i,String p) {
		setName(n);
		setId(i);
		setPassword(p);
	}
	@Override
		public String toString() {
			StringBuilder sb=new StringBuilder();
			sb.append("����Ա��"+getName()+"\t\t");
			sb.append("�˺ţ�"+getId()+"\t\t");
			sb.append("���룺"+getPassword());
			return sb.toString();
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
//�û���----��¼�˺š���¼���롢�û�����
class User{
	private String type;
	private int id;
	private String password;
	public User(String type,int id,String password) {
		setType(type);
		setId(id);
		setPassword(password);
	}
	
	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("�û����ͣ�"+getType()+"\t");
		 sb.append("�û�id��"+getId()+"\t\t");
		 sb.append("�û����룺"+getPassword()+"\t");
		return sb.toString();
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
public class ManageSystemDemo {
	public static void main(String[] args) {
		Manager manager = new Manager("��׳", 123456, "��׳_password");
		System.out.println(manager);
		User user = new User("С׳׳VIP", 123456, "С׳׳_password");
		System.out.println(user);
	}
}










