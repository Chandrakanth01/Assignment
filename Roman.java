package Programming;

import java.util.HashMap;

public class Roman {
    public static void main(String[] args) {
        String romanNumber ="IX"; 
        int res = convert(romanNumber);
        System.out.println("The resultant Integer is:" + res);
    }

    public static int convert(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int res=0;
        int prev=0;

        for (int i =s.length()-1;i>=0;i--) {
            int value = romanMap.get(s.charAt(i));
            if (value < prev) {
                res -=value;
            } else {
                res +=value;
            }
            prev =value;
        }

        return res;
    }
}
