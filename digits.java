import java.util.Scanner;
public class digits {
    public static void main(String[] args){
        int count = 0,n ;
        System.out.println("Enter any number");
        Scanner r =new Scanner(System.in);
        n =r.nextInt();

        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("The no of digits " +count);


    }
}
