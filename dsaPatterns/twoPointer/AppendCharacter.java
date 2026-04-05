package dsaPatterns.twoPointer;

public class AppendCharacter {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";

        System.out.println(AppendChar(s,t));

    }

    private static int AppendChar(String s, String t) {
        int i =0,
                j =0;

        while(i<s.length() && j< t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }

        StringBuilder sb = new StringBuilder(s);
        sb.append(t.substring(j));
        System.out.println(sb);
        return t.length() - j;

    }

}
