public class ValidPalindrome {
    public static boolean validPalindrome(String s){
        String out = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                out+=s.charAt(i);
            }
        }
        out = out.toLowerCase();
        int left = 0;
        int right = out.length()-1;
        while(left<=right){
            if(out.charAt(left)!=out.charAt(right)){
                
                return false;
            } else{
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(validPalindrome(s));
    }
}
