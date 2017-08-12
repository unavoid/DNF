import java.util.*;
import java.io.*;
import java.time.*;

public class Calculate{
	public static void main(String[] args) {
	//Determine if the "配置.ini" is already exists
		try{
			BufferedReader rd = new BufferedReader(
				new InputStreamReader(
					new FileInputStream("配置.ini")));
			System.out.println("文件读取成功");
		}catch(IOException e){	
			System.out.println("请在\"配置.ini\"下填写");
			try{
				PrintWriter pw = new PrintWriter(
					new BufferedWriter(
						new OutputStreamWriter(
							new FileOutputStream("配置.ini"))));						
				System.out.println("文件创建成功");
				pw.print("创建时间");
				pw.println(LocalDateTime.now());
			}catch(IOException a){
				System.out.println("文件创建失败");
			}catch(Exception a){
				System.out.println("功能需要更新");
				a.printStackTrace();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
