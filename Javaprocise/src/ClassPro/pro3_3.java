package ClassPro;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

/**
 * 
 * @version 1.0
 * @author С����
 * @2018��8��26�� ����9:20:28
 * 
 * 
 * **********1����д���򣬿�������һ��ѧ����ѧ�š���������ѧ�����ġ�Ӣ��ɼ��������Բ�ѯѧ������Ϣ�ͳɼ���
 * 				ǿ����Ҫ����Ͷ���ķ�ʽȥʵ�֡�
 */
class Student{
	private int id;				//ѧ��
	private String name;		//����
	private double math;		//��ѧ�ɼ�
	private double chinese;		//���ĳɼ�
	private double english;		//Ӣ��ɼ�
	
	public Student() {
	}
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public Student(int id,String name,double math,double chinese,double english) {
		this(id, name);
		this.math=math;
		this.chinese =chinese;
		this.english =english;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getChinese() {
		return chinese;
	}

	public void setChinese(double chinese) {
		this.chinese = chinese;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ѧ��ѧ�ţ�"+id+"\n");
		sb.append("������    "+"\t"+name+"\n");
		sb.append("��ѧ�ɼ���"+math+"\n");
		sb.append("Ӣ��ɼ���"+english+"\n");
		sb.append("���ĳɼ���"+chinese+"\n");
		return sb.toString();
	}
//	public void print() {
//		System.out.print("id:" +getId() + "���֣�"+"\t"+getName()+"\n" + 
//	"��ѧ�ɼ���" +getMath()+"\t"+"����:"+getChinese()+"\t"+"Ӣ�"+getEnglish() );
//	}
}
public class pro3_3 {
	public static void main(String[] args) {
	Student ���� = new Student(123456, "С��", 60, 70, 80);
	System.out.println(����);
//	����.print();
	}
}
