import java.util.jar.Attributes.Name;

import javax.management.relation.Role;

public class JavaProcisetext {
public static void main(String[] args) {
	JavaProcise role1 = new JavaProcise();
	role1.name = "劳拉";
	role1.level = 25;
	role1.jop = "摸金校尉";
	role1.doSkill();
	
	
	JavaProcise role2 = null;
	role2 = new JavaProcise();
	role2.name = "孙悟空";
	role2.jop = "神仙";
	role2.level = 99;
	role2.doSkill();
}
}
