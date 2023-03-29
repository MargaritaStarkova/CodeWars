package codewars.level_8kyu.fundamentals;
/*
We need a function that can transform a number (integer) into a string.
What ways of achieving this do you know?
        Examples (input --> output):
        123  --> "123"
        999  --> "999"
        -100 --> "-100"
*/
public class ConvertaNumberToaString {

    public static void main(String[] args) {
        System.out.println(numberToString(67));
        System.out.println(numberToString1(123));
        System.out.println(numberToString2(999));
    }

//----------------------------------------------------------------------------------------------------------------------
    public static String numberToString(int num) {
        return ""+num;
    }
//----------------------------------------------------------------------------------------------------------------------
    public static String numberToString1(int num) {
        return String.valueOf(num);
    }
//----------------------------------------------------------------------------------------------------------------------
    public static String numberToString2(int num) {
        return Integer.toString(num);
    }
}
