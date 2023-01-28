public class _5 {

    private static int longestPalindromeLenght = 1;
    public static void main(String[] args) {
        TestConstants tc = new TestConstants();
        for (String i : tc._5) {
            //System.out.println(longestPalindrome(i));
            longestPalindrome(i);
        }
    }

    public static String longestPalindrome(String s) {
        System.out.println(s);
        if (s.length() <= longestPalindromeLenght) return "";
        if (isPalindrome(s)) return s;
        String splitA = longestPalindrome(s.substring(0, s.length()-1));
        String splitB = longestPalindrome(s.substring(1, s.length()));
        if (splitA.length() > splitB.length()) return splitA;
        return splitB;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        for (int i = 0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        longestPalindromeLenght = s.length();
        return true;
    }
}
