public class _13 {
    public int romanToInt(String s) {
        int solution = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i <s.length()-1) {
                if(romanCharToInt(s.charAt(i)) < romanCharToInt(s.charAt(i+1))) {
                    solution -= romanCharToInt(s.charAt(i));
                    continue;
                }
            }
            solution += romanCharToInt(s.charAt(i));
        }
        return solution;
    }
    
    private int romanCharToInt(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return 0;
    }
}
