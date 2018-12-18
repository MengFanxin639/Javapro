package studentManageSystemDemo;
/**
 * 用来保存Student数组 管理员
 * @version 1.0
 * @author 小新新
 * @2018年10月8日 下午12:39:58
 */
public class Dates {
	static String systemName = "智障儿童";
	
	/**
	 * 唯一管理员
	 */
	static Manager IamManager = new Manager("000", "智障管理员", "000");
	 
	
	
	static Student[] studentStore = new Student[999];	//可存放999个学生对象
	
	//使用静态块为学生仓库添加学生信息
		static {
			Student student1 = new Student("201724100100", "李大大", "147258", 70);
			Student student2 = new Student("201724100101", "张大大", "147258", 74);
			Student student3 = new Student("201724100102", "吴大大", "147258", 47);
			Student student4 = new Student("201724100103", "赵大大", "147258", 77);
			Student student5 = new Student("201724100104", "王大大", "147258", 70 );
			
			studentStore[0] = student1;
			studentStore[1] = student2;
			studentStore[2] = student3;
			studentStore[3] = student4;
			studentStore[4] = student5;
					
			
		}
	
}
