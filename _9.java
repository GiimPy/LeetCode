public class _9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String a = x + "";
        for (int i = 0; i<a.length()/2; i++) {
            if(a.charAt(i) != a.charAt(a.length()-1-i)) return false;
        }
        return true;
    }
}
