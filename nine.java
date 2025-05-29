import java.text.SimpleDateFormat;
import java.util.Date;

public class nine {
    public static void main(String[] args) {
        // print date in specific formate
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date); // 06-23-2020
    }
}
