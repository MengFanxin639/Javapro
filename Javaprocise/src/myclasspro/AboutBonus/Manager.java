package myclasspro.AboutBonus;
/**
 * ������--���������������š����ʣ����н�������
 * @version 1.0
 * @author С����
 * @2018��10��31�� ����11:56:18
 */
public class Manager extends Emploee{

	double bonus;
	
	public Manager(String name, String id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus=bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("���Ǿ���"+getName()+"\t");
		sb.append("�ҵĹ�����"+getId()+"\t");
		sb.append("����нΪ "+getSalary()+"��"+"\t");
		sb.append("�һ��н���"+getBonus()+"��"+"\t");
		return sb.toString();
	}
	
}
