package level_8kyu.fundamentals;

/*
Write a function that removes the spaces from the string, then return the resultant string.
Examples:
Input -> Output
        "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
        "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
        "8aaaaa dddd r     " -> "8aaaaaddddr"
*/
public class RemoveStringSpaces {

    public static void main(String[] args) {
        System.out.println("8j8mBliB8gimjB8B8jlB = " + noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println("88Bifk8hB8BB8BBBB888chl8BhBfd = " + noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println("jfBmgklf8hg88lbe8 = " + noSpace1("jfBm  gk lf8hg  88lbe8 "));
    }

//----------------------------------------------------------------------------------------------------------------------
    public static String noSpace(final String x) {
        String[] array = x.split(" ");
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        return str;
    }
//----------------------------------------------------------------------------------------------------------------------
    public static String noSpace1(final String x) {
        return x.replace(" ", "");
    } //simple solution, but not effective on large strings
//----------------------------------------------------------------------------------------------------------------------
}
