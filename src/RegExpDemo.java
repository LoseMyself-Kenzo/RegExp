import java.text.NumberFormat;
import javafx.application.*;

public class RegExpDemo {
	public static void main(String[] args) {
		String qq = "b13456";
//		checkQQ(qq);
		
//		String regex = "[a-b&&[^b]][0-9]{4,14}";
//		boolean b = qq.matches(regex);
//		System.out.println(qq+":"+b);
//		
		
		String str = "aooooooob";
		String regex1 = "ao{4,6}b";
		boolean b = str.matches(regex1);
		System.out.println(str+":"+b);
	}

	public static void checkQQ(String qq) {
		System.out.print(qq+":");
		int len = qq.length();
		if (len >= 5 && len <= 15) {
			if (!qq.startsWith("0")) {
				try {
					long l = Long.parseLong(qq);
					System.out.print("正確");
				} catch (NumberFormatException e) {
					System.out.println("账号不可有字符串");
				}

			} else {
				System.out.println("开头不可为0");
			}
		} else {
			System.out.println("长度不正确");
		}
	}
}
