package ClassPro;


/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年8月27日 上午8:19:22
 * 
 * ************1．编写程序，定义一个职工类（属性和行为请依据题目自行分析），再定义一个功能类，
	 * 通过功能类可以对某位职工进行加薪或减薪操作，请按照软件三层结构的方式进行程序设计，将界面、
	 * 功能和操作对象分开定义，在主方法中输入多个职工，然后完成某个员工的加薪或减薪操作。
 */
class worker{	//人名或编号、工资、
	String name;
	double money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
}
class opworker extends worker{				
	/* 初始化基础工资，调用加薪减薪先初始化  */
	public double  info(double m) {
		return this.money = m;
	}
	public double addMoney(Double m) {		//加薪
		return this.money += m;
	}
	public double decreacemoney(double m) {					//基础工资减
		return this.money -= m;
	}
}

public class pro3_333 {
	public static void main(String[] args) {
		opworker 小明 = new opworker();
		小明.info(3000);
		//测试
		小明.addMoney(4000.0);
		System.out.println(小明.money);
	}
}
