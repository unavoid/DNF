package Code;

import java.util.*;

public class Consumables{
	// consumable's constitute of Material's price
	HashMap<String,HashMap<String,Integer>> formPrice = new  HashMap<>();
	// consumable's constitute of Material's number
	HashMap<String,HashMap<String,Integer>> formNumber =new HashMap<>();
	private HashMap<String,Integer> captial = new HashMap<>();
	private HashMap<String,Integer> sellingPrice =  new HashMap<>();
	private HashMap<String, Integer> requirement = new HashMap<>();
	private String name;
	
	public Consumables(String name){
		this.name = name;
		//set form number
	}
	
	public void setformPrice(String name, HashMap<String, Integer> consitute) {
		formPrice.put(name, consitute);
	}
	
	public void setRequirement(String name, int rq){
		requirement.put(name, rq);
	}
	
	public void setSellingPrice(String name, int price){
		sellingPrice.put(name, price);
	}
	
	
	public String getname(){
		return this.name;
	}
	
	public int getCaptial(String name){
		return captial.get(name);
	}
	
	public int getSellingPrice(String name){
		return sellingPrice.get(name);
	}
	
	public int getProfit(String name){
		return sellingPrice.get(name) - captial.get(name);
	}

	
	//在读取配置文件后 实现材料的组成 -- 最快的方法是在读取的时候就设置成本价 但是这样写似乎更好操控点 
	//这里我们需要传入材料单，为了方便可以计算多个大区
	public void combination(Material mt){
		for(HashMap.Entry<String, HashMap<String,Integer>> entry : formPrice.entrySet()){
			String cbName = entry.getKey();
			HashMap<String, Integer> cbformPrice = entry.getValue();
			int price = 0;
			for(HashMap.Entry<String, Integer> entry1 : cbformPrice.entrySet()){
					price += mt.getPrice(entry1.getKey()) * entry1.getValue();
			}
			captial.put(cbName, price);
		}
	}
	
}