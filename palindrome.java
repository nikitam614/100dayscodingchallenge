public class palindrome {
    public static void main(String[] args) {
        String s = "Baekhyun";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else System.out.println("Not a palindrome");
    }
}

