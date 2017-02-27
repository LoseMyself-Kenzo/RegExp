import java.text.NumberFormat;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.application.*;

public class RegExpDemo2 {
	
	public static void main(String[] args) {
	
		test2();
	}
	public static void demo1(){
		String ss  = "13800104983";
		String RegExp = "1[358]\\d{9}";
		boolean b = ss.matches(RegExp);
		System.out.println(b);
	}
	/**
	 * 组:
	 */
	public static void demo2(){
		
		String str = "zhangsanmmmmlisitttttwangwu";
//		String[] names = str.split("(.)\\1+");
		String[] names = str.split("(.)\\1+");
		for(String name : names){
			System.out.println(name);
		}
	}
	
	public static void demo3(){
		String str = "zhangsanmmmmlisitttttwangwu";
		str = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
		String str1 = "13808634983";
		str1 = str1.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		System.out.println(str1);
	}
	
	public static void demo4(){
		String str = "da jia hao,ming tian bu fang jia!";
		String regexp = "\\b[a-z]{3}\\b";
		//将正则封装成对象
		Pattern p = Pattern.compile(regexp);
		//通过正则对象获取匹配器对象
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group());
			System.out.println(m.start()+":"+m.end());
		}	
	}
	public static void test(){
		String str = "我我....我我....我我要...要要要要.......学学学学......学学编编编.......程程程";
		str = str.replaceAll("\\.+", "");
		System.out.println(str);
		str = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}
	public static void test1(){
		String str ="192.168.10.34   127.0.0.1   3.3.3.3   105.70.11.55";
		str = str.replaceAll("(\\d+)", "00$1");
		System.out.println(str);
		str = str.replaceAll("0*(\\d{3})","$1" );
		System.out.println(str);
		str = str.replaceAll("0*(\\d+)", "$1");
		System.out.println(str);
//		String[] ips = str.split(" +");
//		
//		TreeSet<String> ts = new TreeSet<String>();
//		
//		for(String ip : ips){
//			ts.add(ip);
//		}
	}
	
	public static void test2(){
		String mail = "abc_@sina_.com.c";
		String regex = "\\w+@(\\w[^_])+(\\.[a-zA-Z]{1,3})+";
		boolean b = mail.matches(regex);
		
		System.out.println(mail+":"+b);
	}
}
