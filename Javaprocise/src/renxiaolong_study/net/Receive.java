package renxiaolong_study.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * ���ն�
 * @version 1.0
 * @author С����
 * @2018��11��29�� ����7:26:45
 */
public class Receive {

	public static void main(String[] args) throws Exception {
		//�������ܶ˶���
		DatagramSocket receiver = new DatagramSocket(10086);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		//��������
		receiver.receive(dp );
		//��ȡ���ܵ�����
		String msg = new String(dp.getData(), 0,dp.getLength());
		System.out.println("���͹���������:" + msg);
		System.out.println(InetAddress.getLocalHost());
	}

}
