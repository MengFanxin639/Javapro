package studentManageSystemDemo;


/**
 * 业务类-管理学生的一些基本操作
 * @version 1.0
 * @author 小新新
 * @2018年10月8日 下午12:48:11
 */
public class StudentBiz {

	
	
	
	/**
	 * 在仓库中是否有注册过的账号
	 * @return 有返回true
	 */
	public boolean hasId(String studentId){
		int studentCount = getStudentCount();
		for(int i = 0;i < studentCount; i++){
			if (studentId.equals(Dates.studentStore[i].getId())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 获得学生仓库Dates.studentStore里的对象个数
	 * @return 实体对象个数
	 */
	public int getStudentCount(){
		int count = 0;
		for (Student student : Dates.studentStore) {
			if(student == null) break;
			count++;
		}
		return count;
	}
	
	public int getStudentCount(Student ... students){
		int count = 0;
		for (Student student : students) {
			if(student == null) break;
			count++;
		}
		return count;
	}
	
	/**
	 * 添加学生对象到仓库
	 * @param student
	 * @return 成功添加返回true
	 */
	public boolean addStudent(Student student) {
		int studentCount = getStudentCount();
		if (Dates.studentStore.length == studentCount) {
			return false;
		}
		Dates.studentStore[studentCount] = student;
		return true;
	}
	
	/**
	 * 删除仓库中的学生
	 * @param student
	 * @return
	 */
	public boolean delStudent(Student student){
		int studentCount = getStudentCount();
		int delIndex= -1;
		for(int i=0;i<studentCount;i++){
			if (student.equals(Dates.studentStore[i])) {
				delIndex = i;
				break;
			}
		}
		if (delIndex == -1) {
			return false;//没找到，false
		}
		//执行删除
		for(int j=delIndex;j<studentCount;j++){
			Dates.studentStore[j]=Dates.studentStore[j+1];
		}
		//将最后一个志为空
		Dates.studentStore[studentCount - 1] = null;
		return true;
	}
	
	/**
	 * 通过学生学号ID查找学生,找不到返回null
	 * @param studentId
	 * @return Student student
	 */
	public Student findById(String studentId){
		int studentCount = getStudentCount();
		for(int i = 0;i < studentCount; i++){
			if (studentId.equals(Dates.studentStore[i].getId())) {
				return Dates.studentStore[i];
			}
		}
		return null;
	}
	
	/**
	 * 验证密码
	 * @return 验证通过返回true
	 */
	public boolean checkPassword(String password){
		int studentCount = getStudentCount();
		for(int i = 0;i < studentCount;i++)
		if (password.equals(Dates.studentStore[i].getPassword())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 修改密码、包含验证仓库中是否存在该对象1 ID
	 * @param password
	 * @param student
	 * @return 修改成功返回 true
	 */
	public boolean modifyPassword(String password, String studentId){
		Student modStudent = findById(studentId);
			if (modStudent == null) {
				return false;
			}else {//执行修改
				modStudent.setPassword(password);
				return true;
			}
	}
	
	/**
	 * 修改数学成绩
	 * @param math
	 * @param studentId
	 * @return
	 */
	public boolean modifyMath(double math, String studentId){
		Student modStudent = findById(studentId);
		if (modStudent == null) {
			return false;
		}else {//执行修改
			modStudent.setMath(math);
			return true;
		}
	}
	

	/**
	 * 修改用户名
	 * @param newId
	 * @param loginStudent
	 * @return
	 */
	public boolean modifyName(String newName, Student loginStudent) {
		Student modStudent = findById(loginStudent.getId());
		if (modStudent == null) {
			return false;
		}else {//执行修改
		loginStudent.setName(newName);
		return true;
	}
	}
	
	/**
	 * 利用唯一Id学号查重
	 * @param checkId
	 * @return 不重复返回true
	 */
	public boolean checkSameId(String checkId) {
		Student checkStundent = findById(checkId);
		if (checkStundent == null) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 返回一个默认注册账号
	 * @return
	 */
	public String addDefalutId(){
		int studentCount = getStudentCount();
		String id = Dates.studentStore[studentCount-1].getId();
		StringBuffer duanId = new StringBuffer("100");
		char ch;
		for(int i = 9; i < 12; i++){
			 ch =id.charAt(i);
			duanId.append(ch);
		}
		String Id=duanId.toString();
		//默认学号是最后一位学号+1
		int n = Integer.parseInt(Id);
		n++;
		String defalutId = Integer.toString(n);
		return "201724"+defalutId;
	}
	
	
	
}
