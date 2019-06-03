import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by wujianfei on 2019/5/13.
 */
public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一串字符串");
        String text = buffer.readLine();
        System.out.println("反转字符串为:" + Fanzhuan(text));
    }

    public static String Fanzhuan(String a){
        int i;
        char[] c = a.toCharArray();
        String b="";
        for(i=c.length-1;i>=0;i--){
            b = b+c[i];
        }
        return b;
    }
}
