import java.util.*;
import java.io.*;

public static void main(String[] args) {
	//Determine if the "配置.ini" is already exists
	try{
		FileReader fr = new FileReader(
			new BufferedReader(
				new InputStreamReader(
					new InputStream("配置.ini"))));
		System.out.println("文件读取成功");
	}catch(IOException e){
		System.out.println("请在\"配置.ini\"下填写");
		try{

		}catch(IOException a){

		}catch(Expection a){
			
		}
	}catch(Expection e){
		e.printStackTrace();
	}
}