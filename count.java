public class Main {
    public static void main(String[] args){
        int i;
               int  cCount=0;
               int vCount=0;
String str="I love myself";
str = str.toLowerCase();
for(i=0;i<str.length();i++){
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
vCount++;
}
else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
cCount++;
}
}
System.out.println("The no of vowels "+vCount);
System.out.println("The no of consonants " +cCount);
}
}