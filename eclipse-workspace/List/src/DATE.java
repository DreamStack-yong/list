import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.validator.PublicClassValidator;

public class DATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date nowTime=new Date(); 
		System.out.println(nowTime); 
		SimpleDateFormat time=new SimpleDateFormat("yyyy年 MM月 dd日 HH点 mm分 ss秒"); 
		System.out.println(time.format(nowTime)); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yy月 MM日");
		System.out.println(simpleDateFormat.format(nowTime));
	}
	}
