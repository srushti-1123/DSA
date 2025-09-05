public class ValidPalindromeString {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s.length();
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = s = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(s = "A man, a plan, a canal: Panama");
        System.out.println(ans);
    }
}
