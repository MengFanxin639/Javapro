package renxiaolong_study.net;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * �ͻ���
 * @version 1.0
 * @author С����
 * @2018��11��28�� ����2:44:35
 */
public class Client {

	public static void main(String[] args) throws Exception, IOException {
		//�����ͻ��˶��󣬲�ָ�����ӷ������������Ͷ˿�
		Socket client = new Socket("localhost",8888);
		//��ȡ�ͻ��˵�����������
		Scanner sc = new Scanner(client.getInputStream());
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		client.close();
	}

}
