import java.util.Scanner;
public class removespaces {
    public static void main(String[] args){
        String str;
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        str = str.replaceAll("[aeiou]","");
        System.out.println("final string: " +str);

    }
}
