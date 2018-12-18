package myclasspro;
/**
 * 
 * @version 1.0
 * @version 2.0
 * @author 灏忔柊鏂�
 * @2018骞�8鏈�25鏃� 涓嬪崍1:11:25
 *
 *1锛庨�夋嫨璇彞缁冧範
飩ㄧ▼搴忓姛鑳斤細鍒ゆ柇鏌愪竴骞存槸鍚︿负闂板勾銆傞棸骞寸殑鏉′欢鏄鍚堜笅闈簩鑰呬箣涓�锛氳兘琚� 4 鏁撮櫎锛屼絾涓嶈兘琚� 100 鏁撮櫎锛�
鑳借 4 鏁撮櫎锛屽張鑳借 100 鏁撮櫎銆� 
 */
import java.util.Scanner;

class Year{
	private int year;
	public Year() {
	}
	public Year(int year) {
		this.year = year;
	}
	public void isyear(int year){
		if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
			System.out.println(year + "鏄棸骞达紒");
		}else{System.out.println(year + "涓嶆槸闂板勾锛�");}
	}
}

public class pro2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("璇疯緭鍏ュ勾浠斤細");
		int year = reader.nextInt();
		Year oneYear = new Year(year);
		oneYear.isyear(year);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner reader = new Scanner(System.in);
//		System.out.print("璇疯緭鍏ュ勾浠斤細");
//		int year = reader.nextInt();
//		if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
//			System.out.println(year + "鏄棸骞达紒");
//		}else{System.out.println(year + "涓嶆槸闂板勾锛�");}
		 
	}

}
