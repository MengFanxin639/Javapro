package bookprocise;

import java.text.DecimalFormat;

/**
 * 按身高计算标准体重
 * @version 1.0
 * @author 小新新
 * @2018年9月18日 下午8:33:11
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
		System.out.printf("标准体重：[%.2lf]-[%.2lf]",getMh()-getMh()*0.1,getMh()+getMh()*0.1);
	}
	
}
public class p_113 {
	public static void main(String[] args) {
		StuWeight stu=new StuWeight();
		stu.setMh(166);
		stu.StardWeight();
	}
}
