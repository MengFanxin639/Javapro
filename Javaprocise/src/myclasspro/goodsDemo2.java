package myclasspro;

import java.util.Scanner;

/**
 * 升级购物清算
 * @version 1.0
 * @author 小新新
 * @2018年9月6日 下午10:14:59
 */
class Goods{
	private String name;
	private int id;
	private int amount;
	private float price;
	private static float realPrice;
	
	public Goods(){}
	public Goods(String name, int id, int amount, float price){//默认构造
		this.name = name;
		this.id = id;
		this.amount = amount;
		this.price = price;
		realPrice += amount * price;//合计金额
		float getShifuPrice;
	}
	public void inFo(){//初始化
		System.out.println("**********************************");
		System.out.println("1.T-short    2.网球鞋       3.网球拍");
		System.out.println("**********************************"+"\n");
	}
	public float getRealPrice(){		//应付金额
		return realPrice;
	}	
	public float toRealPrice(){			//实付金额
		int temp = -1;
		temp = (int) (this.getRealPrice() / 100);
		temp++;
		temp *=100; 
		return temp;
	}
	public float toExtraPrice(){		//找零
		int temp = -1;
		temp = (int) (this.getRealPrice() / 100);
		temp++;
		temp *=100; 
		return temp-this.getRealPrice();
	}
	public void printOrder(Goods myGoods){
		System.out.println("应付金额:"+myGoods.getRealPrice()+"￥" );
		System.out.println("实付金额:"+myGoods.toRealPrice()+"￥" );
		System.out.println("找零:"+myGoods.toExtraPrice()+"￥" );
	}
	public void whileAndSwitch(Goods myGoods){
		Scanner reader = new Scanner(System.in);
		while(true){
			System.out.printf("请输入商品编号:");
			int id = reader.nextInt();
			System.out.printf("请输入购买数量:");
			int amount = reader.nextInt();
			int price = -1;
			if (id == 1) {
				price = 245;
				name = "T-short";
			}else if (id == 2) {
				price = 570;
				name = "网球鞋";
			}else if (id == 3) {
				price = 250;
				name = "网球拍";
			}else {
				System.out.println("没有该选项！");
			}
			myGoods = new Goods(name, id, amount, price);
			System.out.println("合计："+myGoods.getRealPrice() +"￥");
			System.out.printf("是否继续(y/n)");
			char ch = reader.next().charAt(0);
			if (ch == 'n') {
				break;
			}
		}
	}
}
public class goodsDemo2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String name = "无";
		Goods myGoods = new Goods();
		myGoods.inFo();
		myGoods.whileAndSwitch(myGoods);
		myGoods.printOrder(myGoods); 
}
}