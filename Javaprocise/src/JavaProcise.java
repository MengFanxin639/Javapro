/**
 * 游戏角色类
 * @version 1.0
 * @author 小新新
 * @2018年7月18日 下午8:21:38
 */
/**
 * 名称  劳拉
 * 等级 25
 * 职业 考古学家
 * 技能 双枪
 * */
public class JavaProcise {
	//名称属性
	public String name;
	//等级				
	public int level;
	//职业				
	public String jop;
	//释放技能
	public void doSkill(){
		if (name.equals("劳拉")) {
			System.out.println("laola技能，双枪老太婆！");
		}else if(name.equalsIgnoreCase("孙悟空"))
		{
			System.out.println("吃俺老孙一棒");
		}
		
	}

}
