package renxiaolong_study.net;

import java.io.*;
import java.net.*;
import java.util.Scanner;


/**
 * ���Ͷ�
 * @version 1.0
 * @author С����
 * @2018��11��29�� ����7:04:48
 */
public class Send {

	public static void main(String[] args) throws Exception {
		//�������Ͷ˶���
		DatagramSocket sender = new DatagramSocket(10006);
		String data = "��ã���������ҵİ����������¸�";
		InetAddress ip = InetAddress.getByName("10.133.4.170");
		
		DatagramPacket dp = new DatagramPacket(data.getBytes(), data.getBytes().length,
				ip,
				10086);
		//��������  
		sender.send(dp);
		sender.close();
		
	}

}
