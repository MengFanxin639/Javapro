package studentManageSystemDemo;
/**
 * 管理员类
 * @version 1.0
 * @author 小新新
 * @2018年10月9日 下午1:11:54
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
		// TODO 自动生成的构造函数存根
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
