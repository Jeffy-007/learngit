import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wujianfei on 2019/5/13.
 */
public class test1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a[]= new int[6];
        System.out.print("请输入6个数字:\n");
        for(int i=0;i<6;i++){
            a[i]=input.nextInt();
        }
        System.out.print("排序前:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        Maopao(a);
        System.out.print("\n排序后:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }

    }

    public static void Maopao(int[] a){
        int i,j,temp;
        for(i=0;i<a.length-1;i++){
            for(j=i;j<a.length-i-1;j++) {
                if(a[j] > a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
