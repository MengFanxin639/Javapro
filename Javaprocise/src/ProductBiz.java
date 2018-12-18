import javax.swing.JOptionPane;

/**
 * 商品管理类
 * @version 1.0
 * @author 小新新
 * @2018年7月20日 上午10:58:20
 */
public class ProductBiz {
	public static void main(String[] args) {
		//用来保存每种商品的总量
		int[] counts = new int[3];
		double total = 0;  //最终支付的总金额
		Product[] products = new Product[3];
		for (int i = 0; i < counts.length; i++) {
			if (products[i] == null) {
				products[i]= new Product();
					
			}
			products[i] = new Product();
			//Product product = new Product();
			String name = JOptionPane.showInputDialog("请输入商品名称：");
			products[i].setName(name);
			//接受用户输入的商品单价、要注意，返回值是字符串类型！！
			String strPrice = JOptionPane.showInputDialog("请输入商品的单价：");
			//需要将字符串类型转换为double类型，在进行赋值
			//验证
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("请输入购买的数量：");
			counts[i] = Integer.parseInt(strCount);
			
			//累加总金额
			total += products[i].getPrice() * counts[i];
			
		}
		System.out.println("购物结算：" + "\t" +"商品" + "\t" + "金额" + "\t" + "数量");
		for (int i = 0; i < products.length; i++) {
			System.out.println("\t\t" + products[i].getName() + "\t" + products[i].getPrice() + "\t" + counts[i]);
		}
		System.out.println("商品的总金额为：" + total);
	}

	
}
