package bookprocise;

import java.text.DecimalFormat;

/**
 * ����߼����׼����
 * @version 1.0
 * @author С����
 * @2018��9��18�� ����8:33:11
 */
class StuWeight{
	private double mh;
	private double fh;
	
	double forMale(double h){
		this.mh=h;
		return (h-100)*0.9;
	}
	double forFemale(double h){
		this.fh=h;
		return (h-100)*0.9 - 2.5;
	}
	public double getMh() {
		return mh;
	}
	public void setMh(double mh) {
		this.mh = mh;
	}
	public double getFh() {
		return fh;
	}
	public void setFh(double fh) {
		this.fh = fh;
	}
	void StardWeight(){
		System.out.printf("��׼���أ�[%.2lf]-[%.2lf]",getMh()-getMh()*0.1,getMh()+getMh()*0.1);
	}
	
}
public class p_113 {
	public static void main(String[] args) {
		StuWeight stu=new StuWeight();
		stu.setMh(166);
		stu.StardWeight();
	}
}
