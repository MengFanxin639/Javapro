import java.util.jar.Attributes.Name;

import javax.management.relation.Role;

public class JavaProcisetext {
public static void main(String[] args) {
	JavaProcise role1 = new JavaProcise();
	role1.name = "����";
	role1.level = 25;
	role1.jop = "����Уξ";
	role1.doSkill();
	
	
	JavaProcise role2 = null;
	role2 = new JavaProcise();
	role2.name = "�����";
	role2.jop = "����";
	role2.level = 99;
	role2.doSkill();
}
}
