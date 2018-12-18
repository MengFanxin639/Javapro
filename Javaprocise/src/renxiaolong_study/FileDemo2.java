package renxiaolong_study;

import java.io.File;
import java.io.FilenameFilter;
/**
 * 过滤器
 * @version 1.0
 * @author 小新新
 * @2018年11月21日 上午9:40:55
 */
public class FileDemo2 {

	public static void main(String[] args) {
		File dir = new File("D:/javatext/ObiArrayDemo/src/user");
		File[] fs1 = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
				
			}
		});
		for(File file : fs1) {
			System.out.println(file);
		}
	}
}
