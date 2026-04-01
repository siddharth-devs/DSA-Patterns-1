import java.util.Arrays;

public class ReverseString {
    public static void reverse(char[] s){
        int st = 0;
        int end = s.length-1;
        while(st<=end){
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;

            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        reverse(c);
        System.out.println(Arrays.toString(c));
    }
}
