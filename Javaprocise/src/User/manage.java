

class Manage{
	String id;
	String passsword;
}
class Users{
	String userType;
	String id;
	String passsword;
}

public class manage {
	public static void main(String[] args) {
		Manage manage=new Manage();
		manage.id="123456";
		manage.passsword="woshimima";
		System.out.println("�˺�:"+manage.id+"\t"+"����:"+manage.passsword);
		Users user=new Users();
		user.userType="��ͨ�û�";
		user.id="12456";
		user.passsword="putongyonhhumima";
		System.out.println("�û�:"+user.userType+"\t"+"�˺�"+user.id+"\t"+"����:"+user.passsword);
	}
	

}
