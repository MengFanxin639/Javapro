/**
 * 商品实体类
 * @version 1.0
 * @author 小新新
 * @2018年7月20日 上午10:51:40
 */
public class Product {
	private String name;
	private double price;
	//商品描述
	private  String description;
	//商品服务
	private String service;
	
	public Product(){
		
	}
	
	public Product(String name,String description){
		setName(name);
		setDescription(description);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
}
