package ClassPro;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年8月26日 下午9:20:28
 * 
 * 
 * **********1．编写程序，可以输入一个学生的学号、姓名和数学、语文、英语成绩，并可以查询学生的信息和成绩。
 * 				强调：要用类和对象的方式去实现。
 */
class Student{
	private int id;				//学号
	private String name;		//姓名
	private double math;		//数学成绩
	private double chinese;		//语文成绩
	private double english;		//英语成绩
	
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
		sb.append("学生学号："+id+"\n");
		sb.append("姓名：    "+"\t"+name+"\n");
		sb.append("数学成绩："+math+"\n");
		sb.append("英语成绩："+english+"\n");
		sb.append("语文成绩："+chinese+"\n");
		return sb.toString();
	}
//	public void print() {
//		System.out.print("id:" +getId() + "名字："+"\t"+getName()+"\n" + 
//	"数学成绩：" +getMath()+"\t"+"语文:"+getChinese()+"\t"+"英语："+getEnglish() );
//	}
}
public class pro3_3 {
	public static void main(String[] args) {
	Student 老王 = new Student(123456, "小王", 60, 70, 80);
	System.out.println(老王);
//	老王.print();
	}
}
