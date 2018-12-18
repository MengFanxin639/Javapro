package renxiaolong_study;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * 获取系统的所有属性
 * @version 1.0
 * @author 小新新
 * @2018年11月21日 上午10:47:38
 */
public class SystemPropertiesDemo {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		Set<Entry<Object,Object>> entrySet = properties.entrySet();
		for(Entry<Object,Object> entry : entrySet) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		
	}
}
