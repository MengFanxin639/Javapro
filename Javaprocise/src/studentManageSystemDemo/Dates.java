package studentManageSystemDemo;
/**
 * ��������Student���� ����Ա
 * @version 1.0
 * @author С����
 * @2018��10��8�� ����12:39:58
 */
public class Dates {
	static String systemName = "���϶�ͯ";
	
	/**
	 * Ψһ����Ա
	 */
	static Manager IamManager = new Manager("000", "���Ϲ���Ա", "000");
	 
	
	
	static Student[] studentStore = new Student[999];	//�ɴ��999��ѧ������
	
	//ʹ�þ�̬��Ϊѧ���ֿ����ѧ����Ϣ
		static {
			Student student1 = new Student("201724100100", "����", "147258", 70);
			Student student2 = new Student("201724100101", "�Ŵ��", "147258", 74);
			Student student3 = new Student("201724100102", "����", "147258", 47);
			Student student4 = new Student("201724100103", "�Դ��", "147258", 77);
			Student student5 = new Student("201724100104", "�����", "147258", 70 );
			
			studentStore[0] = student1;
			studentStore[1] = student2;
			studentStore[2] = student3;
			studentStore[3] = student4;
			studentStore[4] = student5;
					
			
		}
	
}
