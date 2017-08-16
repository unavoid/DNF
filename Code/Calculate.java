package Code;

import java.util.*;

import javax.print.Doc;

import java.io.*;
import java.time.*;

public class Calculate {
	private static PrintWriter pw;
	private static BufferedReader rd;
	private static String timeNow = YearMonth.now() + "／" + LocalTime.now();
	private static boolean ifTheFileReadSuccessfully	 = false;
	private static StringBuffer document = new StringBuffer();
	private static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		begin();
		//initialization Material
		Material mt = new Material("111");
		inMaterial();
		//initialization Consumables
		Consumables csb = new Consumables("111");
		iniConsumables();
	}






	private static void begin() {
		// Determine if the "配置.ini" is already exists
		try {
			rd = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("./配置.ini")));
			System.out.println("文件读取成功");
		} catch (IOException e) {
			System.out.println("请在\"配置.ini\"下填写");
			try {
				pw = new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream(".//配置.ini"), "utf8")));
				System.out.println("文件创建成功");
				System.out.println();
				Document dc = new Document("创建时间--" + timeNow.substring(0, 13));
				pw.print(dc);
				pw.close();
			} catch (IOException a) {
				System.out.println("文件创建失败");
			} catch (Exception a) {
				System.out.println("功能需要更新");
				a.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		while(!ifTheFileReadSuccessfully){
			System.out.println("请在填写材料后输入 1 开始计算");
			int judge = cin.nextInt();
			if(judge == 1){
				try{
					rd = new BufferedReader(
							new InputStreamReader(
									new FileInputStream("./配置.ini")));
					ifTheFileReadSuccessfully = IfFileReadRight();
				}catch (IOException e){
					System.out.println("文件读取错误");
				}catch (Exception e) {
					System.out.println("配置参数错误");
					e.printStackTrace();
				}
			}
			if(!ifTheFileReadSuccessfully)
				System.out.println("下列材料填写错误");
		}
	}
	
	
	private static boolean IfFileReadRight() throws IOException{
		String str = null;
			while((str = rd.readLine()) != null){
					document.append(str);
			}
		//remove space
		String str1 = new String(document);
		str1 = str1.replace(" ","");
		//System.out.println(str1);
		//to JudgeFileReadRight
		System.out.println(str1);
		document = new StringBuffer(str);
		return true;
	}
	
	private static void iniConsumables(){
		
	}
	

	private static void inMaterial() {
		// TODO Auto-generated method stub
		int fromIndex = 0;
		while(document.indexOf("材料", fromIndex) != -1){
			
		}
	}
}
