package renxiaolong_study;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * ��ȡϵͳ����������
 * @version 1.0
 * @author С����
 * @2018��11��21�� ����10:47:38
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
