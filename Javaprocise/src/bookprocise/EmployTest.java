package bookprocise;

import org.junit.Test;

/**
 * Junit的测试案例演示
 * @version 1.0
 * @author 小新新
 * @2018年12月2日 下午8:36:12
 */
public class EmployTest {

	@Test
	public void testSave(){
		System.out.println("保存员工数据模拟测试");
	}
	
	@Test
	public void testDelete() {
		System.out.println("删除员工模拟测试");
	}
	
	@Test
	public void testInit() throws Exception{
		System.out.println("初始化员工数据测试");
	}
	
	@Test
	public void testDestroy() throws Exception{
		System.out.println("删除数据测试");
	}
	
}
