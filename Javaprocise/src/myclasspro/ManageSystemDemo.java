package myclasspro;
/**
 * 系统里有管理员和用户两个角色。每个管理员都有账户和密码。每个用户也都有
 * 账户和密码，并且用户分为普通用户和VIP用户两种类型。要求分析并定义出管
 * 理员类和用户类创建出两个类的对象，并给对象属性赋值，在控制台上显示对象所有的信息。
 * @version 1.0
 * @author 小新新
 * @2018年9月19日 下午12:05:29
 */
//管理员类--登录账号、登录密码
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
			sb.append("管理员："+getName()+"\t\t");
			sb.append("账号："+getId()+"\t\t");
			sb.append("密码："+getPassword());
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
//用户类----登录账号、登录密码、用户类型
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
		 sb.append("用户类型："+getType()+"\t");
		 sb.append("用户id："+getId()+"\t\t");
		 sb.append("用户密码："+getPassword()+"\t");
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
		Manager manager = new Manager("大壮", 123456, "大壮_password");
		System.out.println(manager);
		User user = new User("小壮壮VIP", 123456, "小壮壮_password");
		System.out.println(user);
	}
}










