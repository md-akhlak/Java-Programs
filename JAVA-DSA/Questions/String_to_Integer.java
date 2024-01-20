package Questions;

public class String_to_Integer {

    public static int stringTnInteger(String s) {
        if (s == null) {
            return 0;
        }
        s.trim();

        if (s.length() == 0) return 0;

        int signed = +1;
        int ans = 0;

        if (s.charAt(0) == '-')
            signed = -1;

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        int i = 0;
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            i = 1;
        }else {
            i = 0;
        }

        while(i < s.length()){

        }

    return 0;
    }

    public static void main(String[] args) {

    }
}
