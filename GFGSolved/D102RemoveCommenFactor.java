
import java.io.*;

class D102RemoveCommenFactor {
    public static String ConnectedString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) == -1) sb.append(c);
        }
        for (char c : s2.toCharArray()) {
            if (s1.indexOf(c) == -1) sb.append(c);
        }
        return sb.length() == 0 ? "-1" : sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "Nikita";
        String str2 = "Yogita";
        System.out.println(ConnectedString(str1, str2));
    }
}