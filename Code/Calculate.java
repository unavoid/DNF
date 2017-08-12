package Code;
import java.util.*;
import java.io.*;
import java.time.*;

public class Calculate{
	private static PrintWriter pw;
	private static BufferedReader rd;
	private static String timeNow = YearMonth.now() +" "+ LocalTime.now();
	public static void main(String[] args) {
	//Determine if the "配置.ini" is already exists
		try{
			rd = new BufferedReader(
				new InputStreamReader(
					new FileInputStream("配置.ini")));
			System.out.println("文件读取成功");
		}catch(IOException e){	
			System.out.println("请在\"配置.ini\"下填写");
			try{
				pw = new PrintWriter(
					new BufferedWriter(
						new OutputStreamWriter(
							new FileOutputStream("配置.ini"),"utf8")));						
				System.out.println("文件创建成功");
				System.out.println();
				pw.print("创建时间");
				pw.println(YearMonth.now() +" "+ LocalTime.now());
				pw.close();
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
