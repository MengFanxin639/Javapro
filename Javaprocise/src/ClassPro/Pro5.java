package ClassPro;
/**
 * 
 * @version 1.0
 * @author 小新新
 * @2018年8月29日 下午2:49:58
 */
/*1.假如我们在开发一个系统时需要对员工进行建模，员工包含3个属性：姓名、工号以及工资。经理也是员工，
 * 除了含有员工的属性外，另外还有一个奖金属性。请使用继承的思想设计出员工类和经理类。*/
class worker{		//员工，只是员工，不是经理
	//属性：姓名、工号以及工资
	String workerName;
	int workerId;
	double WorkerMoney;
} 
class strworker extends worker{		//经理、是员工
	//奖金属性
	double extraMoney;
}

public class Pro5 {
public static void main(String[] args) {
	
}
}
