package studentManageSystemDemo;

/**
 * �����࣬������һЩ�������ķ���
 * @version 1.0
 * @author С����
 * @2018��10��8�� ����3:07:38
 */
public abstract class AbstractStudentView {

	
	
	/**
	 * ѧ���˸��������
	 */
	public abstract void modifyPasswordView(Student student);
	/**
	 * ������޸���������������
	 */
	public abstract void modifyPasswordView();
	
	/**
	 * ��ʾ�˵�
	 * @return ����ѡ��
	 */
	public abstract String showMainView();
	
	/**
	 * ѧ���˵�¼����
	 * @return 
	 * @return�ɹ���¼����true
	 */
	public abstract Student LoginView();
	
	
	public abstract void doMainView(String choice, Student loginStudent);
	
	
	
}