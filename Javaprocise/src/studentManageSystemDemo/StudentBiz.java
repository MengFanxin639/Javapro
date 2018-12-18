package studentManageSystemDemo;


/**
 * ҵ����-����ѧ����һЩ��������
 * @version 1.0
 * @author С����
 * @2018��10��8�� ����12:48:11
 */
public class StudentBiz {

	
	
	
	/**
	 * �ڲֿ����Ƿ���ע������˺�
	 * @return �з���true
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
	 * ���ѧ���ֿ�Dates.studentStore��Ķ������
	 * @return ʵ��������
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
	 * ���ѧ�����󵽲ֿ�
	 * @param student
	 * @return �ɹ���ӷ���true
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
	 * ɾ���ֿ��е�ѧ��
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
			return false;//û�ҵ���false
		}
		//ִ��ɾ��
		for(int j=delIndex;j<studentCount;j++){
			Dates.studentStore[j]=Dates.studentStore[j+1];
		}
		//�����һ��־Ϊ��
		Dates.studentStore[studentCount - 1] = null;
		return true;
	}
	
	/**
	 * ͨ��ѧ��ѧ��ID����ѧ��,�Ҳ�������null
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
	 * ��֤����
	 * @return ��֤ͨ������true
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
	 * �޸����롢������֤�ֿ����Ƿ���ڸö���1 ID
	 * @param password
	 * @param student
	 * @return �޸ĳɹ����� true
	 */
	public boolean modifyPassword(String password, String studentId){
		Student modStudent = findById(studentId);
			if (modStudent == null) {
				return false;
			}else {//ִ���޸�
				modStudent.setPassword(password);
				return true;
			}
	}
	
	/**
	 * �޸���ѧ�ɼ�
	 * @param math
	 * @param studentId
	 * @return
	 */
	public boolean modifyMath(double math, String studentId){
		Student modStudent = findById(studentId);
		if (modStudent == null) {
			return false;
		}else {//ִ���޸�
			modStudent.setMath(math);
			return true;
		}
	}
	

	/**
	 * �޸��û���
	 * @param newId
	 * @param loginStudent
	 * @return
	 */
	public boolean modifyName(String newName, Student loginStudent) {
		Student modStudent = findById(loginStudent.getId());
		if (modStudent == null) {
			return false;
		}else {//ִ���޸�
		loginStudent.setName(newName);
		return true;
	}
	}
	
	/**
	 * ����ΨһIdѧ�Ų���
	 * @param checkId
	 * @return ���ظ�����true
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
	 * ����һ��Ĭ��ע���˺�
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
		//Ĭ��ѧ�������һλѧ��+1
		int n = Integer.parseInt(Id);
		n++;
		String defalutId = Integer.toString(n);
		return "201724"+defalutId;
	}
	
	
	
}
