package renxiaolong_study;
class PriorityThread extends Thread{
	public PriorityThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(super.getName() + "-" + i);
			
		}
	}
}


/**
 * 线程的优先级
 * @version 1.0
 * @author 小新新
 * @2018年11月15日 下午4:54:23
 */
public class PriorityDemo {
	public static void main(String[] args) {
		PriorityThread min = new PriorityThread("最低优先级");
		min.setPriority(Thread.MIN_PRIORITY);
		
		PriorityThread max = new PriorityThread("最高优先级");
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		max.start();
		
		
		
		
		
		
//		//设置主线程的优先级
//		Thread.currentThread().setPriority(4);
//		//获取主线程的优先级5
//		System.out.println(Thread.currentThread().getPriority());
		
	}
}
