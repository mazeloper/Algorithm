// tip: each public class is put in its own file
import java.util.*;

/**
설명
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 */

// 혼자 풀기
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
    public String solution(String text) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            if(Character.isUpperCase(c)) {
                answer.append(String.valueOf(c).toLowerCase());
            } else {
                answer.append(String.valueOf(c).toUpperCase());
            }
        }
        return answer.toString();
    }
}

// 인프런 강좌 결과