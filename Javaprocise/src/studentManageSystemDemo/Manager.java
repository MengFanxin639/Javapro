package studentManageSystemDemo;
/**
 * ����Ա��
 * @version 1.0
 * @author С����
 * @2018��10��9�� ����1:11:54
 */
public class Manager {

	private String id;	
	private String name;
	private String password;
	
	public Manager(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public Manager() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
