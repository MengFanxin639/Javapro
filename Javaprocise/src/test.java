//接口
interface Control {
	void open();
	void close();
}
//灯类
class Light implements Control{
	private String name;
	public Light(String name) {
		this.name=name;
	}
	
	@Override
	public void open() {
		System.out.println("开灯！！" + "漂亮的" + name);
		
	}

	@Override
	public void close() {
		System.out.println("关灯!大晚上的不睡觉，明天不用装b啊\n");
		
	}
	
}
//门类
class Door implements Control{
	private String name;
	public Door(String name) {
		this.name=name;
	}
	
	@Override
	public void open() {
		 System.out.println("开门！！" + name);
		
	}

	@Override
	public void close() {
		 System.out.println("关门，放狗！");
		
	}
	
}
public class test {
	public static void main(String[] args) {
		Light light = new Light("霓虹灯");
		light.open();
		light.close();
		
		Object door = new Door("东二门");
		((Door) door).open();
		((Control) door).close();
	}
}