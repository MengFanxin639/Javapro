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
 * �̵߳����ȼ�
 * @version 1.0
 * @author С����
 * @2018��11��15�� ����4:54:23
 */
public class PriorityDemo {
	public static void main(String[] args) {
		PriorityThread min = new PriorityThread("������ȼ�");
		min.setPriority(Thread.MIN_PRIORITY);
		
		PriorityThread max = new PriorityThread("������ȼ�");
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		max.start();
		
		
		
		
		
		
//		//�������̵߳����ȼ�
//		Thread.currentThread().setPriority(4);
//		//��ȡ���̵߳����ȼ�5
//		System.out.println(Thread.currentThread().getPriority());
		
	}
}
