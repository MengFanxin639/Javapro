package myclasspro;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ʵ��ѭ�������ж�
 * @version 1.0->2.0 ****Bug�޸��������븺����ʱ��Ҳ��ʾ������  ����ѭ��....
 * @author
 * @2018��8��24�� ����12:39:34
 */

//************�д��Ż���������bug*************
public class MyScore {

	public static void main(String[] args) {

		float x = 0;   //������������óɱȽϺüǵģ�score
		//x = Integer.parseInt(args[0]); ���ɼ�������ȽϺÿ���
		Scanner reader = new Scanner(System.in);
		while(true){
			System.out.print("������ѧ���ɼ���-1�˳�����");
			try {
				x = reader.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println(e.toString());
				System.out.println("�����ǲ��������~");
				break;
			}
			if (x == -1)break;
			if (x >100) {
				System.out.println("ֻ������100���ڵĳɼ�Ŷ~");
				continue;
			}
			if (x >= 90) {
				System.out.println("����");
			}else if (x >= 80) {		//ִ���˵�һ����䲻��90���ϣ�����90�����ˣ�������������жϵ���80-90֮��
				System.out.println("����");
			}else if (x >= 70) {
				System.out.println("�е�");
			}else if (x >= 60) {
				System.out.println("����");
			}else if (x >= 0) {					//����Ķ������ˣ������ľ��ǲ�����
				System.out.println("������");
			}else{
				System.out.println("���벻�Ϸ�������������");
				continue;
			}

		}
		
	}

}
