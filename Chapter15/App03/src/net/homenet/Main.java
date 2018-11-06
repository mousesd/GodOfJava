package net.homenet;

public class Main {
    public static void main(String[] args) {
        String statement = "The String class represents character string.";
        UseStringMethods methods = new UseStringMethods();

        //# 1.
        //String[] words = statement.split(" ");
        //for (String word : words) {
        //    methods.printWord(word);
        //}

        //# 2.
        //methods.findString(statement, "string");

        //# 3.
        //methods.findAnyCaseString(statement, "string");

        //# 4.
        //methods.countChar(statement, 's');

        //# 5.
        methods.printContainWord(statement, "ss");
    }
}
