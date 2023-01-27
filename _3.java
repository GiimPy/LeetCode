public class _3 {
    public int lengthOfLongestSubstring(String s) {
        String allChars ="";
        int max = 0;
        while (s.length() > max) {
           for (int i = 0; i<s.length(); i++) {
                if (allChars.indexOf(s.charAt(i)) < 0) {
                    allChars += s.charAt(i);
                } else {
                    break;
                }
            }
            if (allChars.length() > max) max = allChars.length();
            allChars = "";
            s = s.substring(1, s.length());
        }
        return max;
    }
}
