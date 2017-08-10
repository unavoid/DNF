import java.util.*;
import java.io.*;

public class Calculate{
	private static boolean isFile
	public static void main(String[] args) {
		//to judge is the configure existenced
		try{
			BufferedReader pr = new BufferedReader(
		} catch(IOException e){
			try{
				PrintWriter pw = new PrintWriter(
					new BufferedWriter(
						new OutputStreamWriter(
							new FileOutputStream("配置.ini"))));
				pw.println("配置文件创建成功");
				System.out.println("请前往配置文件填写信息");
				pw.close();
			} catch(IOException a){
				System.out.println("文件写入错误");
				a.printStackTrace();
			} catch(Exception a){
				a.printStackTrace();
			}
			System.out.println("文件写入成功");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}