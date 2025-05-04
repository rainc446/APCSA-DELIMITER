import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        String[] tokens = {"(", "x + y", ")", "*5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens));

        String[] a = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        ArrayList<String> x = new ArrayList<String>();
        for (String word: a) x.add(word);
        Delimiters s = new Delimiters("<sup>", "</sup>");
        System.out.println(s.isBalanced(x));

        a = new String[]{"<sup>", "</sup>", "</sup>", "<sup>"};
        x = new ArrayList<String>();
        for (String word: a) x.add(word);
        System.out.println(s.isBalanced(x));
    }
}
