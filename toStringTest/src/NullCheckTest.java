import java.util.Objects;

public class NullCheckTest {
    public static void main(String[] args) throws Exception{
        String str1 = "abc";

        //nullCheck(str1);

        String str2 = "abadf";
        compareToCheck(str1,str2);

    }

    public static void nullCheck(String str){
        String str1 =  Objects.requireNonNull(str, "default2");
        System.out.println(str1);
    }

    public static void compareToCheck(String str1, String str2){
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
    }
}
