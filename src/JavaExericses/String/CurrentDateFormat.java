package JavaExericses.String;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateFormat {
    public static void main(String []args){
        Format f = new SimpleDateFormat("DD/MM/YYYY");
        String str = f.format(new Date());
        System.out.println("Current Date is "+str);
    }
}
