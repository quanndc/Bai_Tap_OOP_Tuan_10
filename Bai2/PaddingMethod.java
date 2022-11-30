package Bai2;

public class PaddingMethod {
    public static String padLeft(String s, int n, char c){
        return String.format("%" + n + "s", s).replace(' ', c);
    }

    public static String padRight(String s, int n, char c){
        return String.format("%-" + n + "s", s).replace(' ', c);
    }
}
