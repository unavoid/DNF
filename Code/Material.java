package Code;
import java.util.*;

public class Material {
	HashMap<String, Integer> materials = new HashMap<>();
	private String name;
	
	public Material(String name){
		this.name =  name;
	}
	
	public void setmaterials(String name , int price){
		materials.put(name, price);
	}

	public String getName(){
		return this.name;
	}
	
	public int getPrice(String name){
		return materials.get(name);
	}
	
	public void listMaterial(){
		for(Map.Entry<String, Integer>entry:materials.entrySet()){
			System.out.println("name:" + entry.getKey() + " price:" + entry.getValue());
		}
	}
}