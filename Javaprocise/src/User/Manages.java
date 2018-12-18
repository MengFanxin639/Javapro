package User;

 
 
class Users{
	String userType;
	String id;
	String passsword;
}

public class Manages {
	String id;
	String passsword;
	
	public static void main(String[] args) {
		Manages manage=new Manages();
		manage.id="123456";
		manage.passsword="woshimima";
		System.out.println("ÕËºÅ:"+manage.id+"\t"+"ÃÜÂë:"+manage.passsword);
		Users user=new Users();
		user.userType="ÆÕÍ¨ÓÃ»§";
		user.id="12456";
		user.passsword="putongyonhhumima";
		System.out.println("ÓÃ»§:"+user.userType+"\t"+"ÕËºÅ"+user.id+"\t"+"ÃÜÂë:"+user.passsword);
	}
	

}
