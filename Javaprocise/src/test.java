//�ӿ�
interface Control {
	void open();
	void close();
}
//����
class Light implements Control{
	private String name;
	public Light(String name) {
		this.name=name;
	}
	
	@Override
	public void open() {
		System.out.println("���ƣ���" + "Ư����" + name);
		
	}

	@Override
	public void close() {
		System.out.println("�ص�!�����ϵĲ�˯�������첻��װb��\n");
		
	}
	
}
//����
class Door implements Control{
	private String name;
	public Door(String name) {
		this.name=name;
	}
	
	@Override
	public void open() {
		 System.out.println("���ţ���" + name);
		
	}

	@Override
	public void close() {
		 System.out.println("���ţ��Ź���");
		
	}
	
}
public class test {
	public static void main(String[] args) {
		Light light = new Light("�޺��");
		light.open();
		light.close();
		
		Object door = new Door("������");
		((Door) door).open();
		((Control) door).close();
	}
}