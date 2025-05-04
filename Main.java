public class Main {
    public static void main (String[] args) {
        String[] tokens = {"(", "x + y", ")", "*5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens));

        String[] a = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        Delimiters s = new Delimiters("<sup>", "</sup>");
    }
}
