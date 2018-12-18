package myclasspro;

import java.util.Scanner;

/**
 * 实现商品换购
 * @version 1.0
 * @author 小新新
 * @2018年9月6日 下午9:25:11
 */


public class GoodsDemo1 {
	public void printSwitch(){
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1：满50元，加2元换购百事可乐饮料一瓶");
		System.out.println("2：满100元，加3元换购500ml可乐饮料一瓶");
		System.out.println("3：满100元，加10元换购5公斤面粉");
		System.out.println("4：满100元，加10元可换购1个苏泊尔炒菜锅");
		System.out.println("5：满100元，加20元换购欧莱雅爽肤水一瓶");
		System.out.println("0：不换购");
	}
	
	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		String goodsName = "啥也没有！";
		System.out.print("请输入消费金额：");
		float payMoney = reader.nextFloat();
		GoodsDemo1 myGoods = new GoodsDemo1();
		myGoods.printSwitch();
		System.out.print("请选择:");
		int chioce = reader.nextInt();
		switch (chioce) {
		case 1:if (payMoney < 50) {
			System.out.println("您消费金额不满50，无法参加此活动！");
		}else {
			payMoney += 2;
		}
			goodsName = "百事可乐一瓶";
			break;
		case 2:if (payMoney < 100) {
			System.out.println("您消费金额不满100，无法参加此活动！");
		}else {
			payMoney += 3;
		}
			goodsName = "500ml可乐饮料一瓶";
			break;	
		case 3:if (payMoney < 100) {
			System.out.println("您消费金额不满100，无法参加此活动！");
		}else {
			payMoney += 10;
		}
			goodsName = "5公斤面粉";
			
			break;
		case 4:if (payMoney < 200) {
			System.out.println("您消费金额不满200，无法参加此活动！");
		}else {
			payMoney += 10;
		}
			goodsName = "1个苏泊尔炒菜锅";
			break;
		case 5:if (payMoney < 200) {
			System.out.println("您消费金额不满200，无法参加此活动！");
		}else {
			payMoney += 20;
		}
			goodsName = "欧莱雅爽肤水一瓶";
			break;
		case 0:
			break;
		default:System.out.println("输入有误！");
		}
		System.out.printf("本次消费总金额:" + "%.1f",payMoney);
		System.out.println();
		System.out.println("成功换购：  " + goodsName);
		
		
		
		
		
		
		
		
		
		
	}	
		
	}

