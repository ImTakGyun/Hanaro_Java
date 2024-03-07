package variable;

public class Substring {
    public static void main(String[] args){

        //이메일을 id와 domain으로 나누기
        String str = "gyun1712@gmail.com";

        String id = str.substring(0, str.indexOf('@'));
        String domain = str.substring(str.indexOf('@') + 1, str.length());

        System.out.println("id : " + id + "\n" +  "domain : " + domain);

        int[] now = new int[5];
        int length = now.length;
        System.out.println(now.getClass().getName());


        //문자열 역순 대문자 출력 (참고: 문자열을 문자 배열로 변환하기 : str.toCharArray())
        String result = "";
        for(int i = str.length(); i > 0; i--){
            result += str.charAt(i-1);
        }

        System.out.println(result.toUpperCase());
    }
}
