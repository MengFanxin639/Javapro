package renxiaolong_study.net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;

/**
 * �����
 * @version 1.0
 * @author С����
 * @2018��11��28�� ����2:43:37
 */
public class Server {

	public static void main(String[] args) throws IOException {
		//������������ָ���˿�Ϊ8888
		ServerSocket server = new ServerSocket(8888);
		System.out.println("�����׼������");
		//�������Ӹ÷������Ŀͻ��˶���
		boolean accept = true;
		while(accept){
		Socket client = server.accept();
		System.out.println("���ӹ����ġ��ͻ��ˣ�" + client.getInetAddress());
		
		String data = "���Ƿ���ˣ����пͻ��ˣ�";
		PrintStream out = new PrintStream(client.getOutputStream());
		out.println(data);
		
		out.close();
		}
		server.close();
		
	}

}
