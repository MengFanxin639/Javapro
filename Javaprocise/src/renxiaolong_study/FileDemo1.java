package renxiaolong_study;

import java.io.File;
import java.io.FilenameFilter;

/**
 * �г�ָ��Ŀ¼�е������ļ�
 * @version 1.0
 * @author С����
 * @2018��11��20�� ����9:03:48
 */
public class FileDemo1 {
	
	public static void main(String[] args) {
		
			
		File dir = new File("D:/javatext/ObiArrayDemo/src/user");
		listAllFile(dir);
		
		
		
	}
	private static void listAllFile(File dir){
		//��һ�����ļ�
		File[] fs1 = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(new File(dir,name).isFile() && name.endsWith(".java")) {
					return true;
				}else {
					return false;
				}
				
			}
		});
		for(File file1 : fs1){
			System.out.println(file1);
			//�ڶ���
			if (file1.isDirectory()) {
				listAllFile(file1);
//				File[] fs2 = dir.listFiles();
//				for(File file2 : fs2){
//					System.out.println(file2);
//					//3
//					if (file2.isDirectory()) {
//						File[] fs3 = file2.listFiles();
//						for(File file3 : fs3){
//							System.out.println(file3);
//						}
//					}
//				}
			}
		}
		
	}

}
