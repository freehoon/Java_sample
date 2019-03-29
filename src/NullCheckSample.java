import java.util.Map;
import java.util.Objects;

public class NullCheckSample {
    public static void main(String[] args) {
        String str1 = "null";
        String str2 = null;

        // 둘이 같은지 비교
        if(Objects.equals(str1, str2)){
            System.out.println("둘이 다르다");
        }else{
            System.out.println("둘이 다르다");
        }

        //toString 사용법
        System.out.println(Objects.toString(str1, "default"));
        System.out.println(Objects.toString(str2, "default"));


        //requrieNonNull 사용법
        System.out.println("\nrequireNonNull 사용법");
        String str3 = null;
        str3 = Objects.requireNonNullElse(str1, "default");
        System.out.println(str3);
        str3 = Objects.requireNonNullElse(str2, "default");
        System.out.println(str3);

        //isNull 사용법
        System.out.println("\nisNull 사용법");
        if(Objects.isNull(str1)){
            System.out.println("널 일때 실행할 내용");
        }else{
            System.out.println("널이 아닐때 실행할 내용");
        }

        System.out.println("\nnonNull 사용법");
        //nonNull 사용법
        if(Objects.nonNull(str2)){
            System.out.println("널 아닐때 실행할 내용");
        }else{
            System.out.println("널 일때 실행할 내용");
        }

        //isNull 사용법
        String str4 = "";
        System.out.println("\nisEmpty 사용법");
        if(str4.isEmpty()){
            System.out.println("빈값 일때 실행할 내용");
        }else{
            System.out.println("빈값이 아닐때 실행할 내용");
        }


        System.out.println("\nisEmpty로 Map 체크 사용법");
        Map<String, Object> map = null;//new HashMap<>();
        if(Objects.isNull(map)){
            System.out.println("널 일때 실행할 내용");
        }else{
            System.out.println("널이 아닐때 실행할 내용");
        }

        System.out.println("\n== null로 Map 체크 사용법");
        if(map == null){
            System.out.println("널 일때 실행할 내용");
        }else{
            System.out.println("널이 아닐때 실행할 내용");
        }



    }
}
