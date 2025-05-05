import java.util.*;
public class HollowRhombus{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n=sc.nextInt();
        // System.out.print("Enter the number of columns : ");
        // int c=sc.nextInt();
        hollowrhombus(n);
    }
    public static void hollowrhombus(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }

            for(int j=1;j<=n;j++){
                if (i==1 || i==n){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}