import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest3 {
	
	public static void main(String[] args) throws Exception{
		
		List<String> list = getMails();
		for(String mail : list){
			System.out.println(mail);
		}
		System.out.println("111111");
	}
	
	
	public static List<String> getMails() throws Exception{
		List<String> list = new ArrayList<String>();
		//
		BufferedReader bufr = new BufferedReader(new FileReader("A:\\RegExp.html"));
		//
		String mail_regex = "\\w+@\\w(\\.\\w+)+";
		
		Pattern p = Pattern.compile(mail_regex);
		
		String line = null;
		
		while((line = bufr.readLine())!=null){
			
			Matcher m = p.matcher(line);
			while(m.find()){
				list.add(m.group());
			}
			
		}
		bufr.close();
		
		return list;
	}
}
