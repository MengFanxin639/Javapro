import javax.swing.JOptionPane;

/**
 * ��Ʒ������
 * @version 1.0
 * @author С����
 * @2018��7��20�� ����10:58:20
 */
public class ProductBiz {
	public static void main(String[] args) {
		//��������ÿ����Ʒ������
		int[] counts = new int[3];
		double total = 0;  //����֧�����ܽ��
		Product[] products = new Product[3];
		for (int i = 0; i < counts.length; i++) {
			if (products[i] == null) {
				products[i]= new Product();
					
			}
			products[i] = new Product();
			//Product product = new Product();
			String name = JOptionPane.showInputDialog("��������Ʒ���ƣ�");
			products[i].setName(name);
			//�����û��������Ʒ���ۡ�Ҫע�⣬����ֵ���ַ������ͣ���
			String strPrice = JOptionPane.showInputDialog("��������Ʒ�ĵ��ۣ�");
			//��Ҫ���ַ�������ת��Ϊdouble���ͣ��ڽ��и�ֵ
			//��֤
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("�����빺���������");
			counts[i] = Integer.parseInt(strCount);
			
			//�ۼ��ܽ��
			total += products[i].getPrice() * counts[i];
			
		}
		System.out.println("������㣺" + "\t" +"��Ʒ" + "\t" + "���" + "\t" + "����");
		for (int i = 0; i < products.length; i++) {
			System.out.println("\t\t" + products[i].getName() + "\t" + products[i].getPrice() + "\t" + counts[i]);
		}
		System.out.println("��Ʒ���ܽ��Ϊ��" + total);
	}

	
}
