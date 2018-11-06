package net.homenet;

class UseStringMethods {
    void printWord(String string) {
        System.out.println(string);
    }

    void findString(String str, String findStr) {
        int index = str.indexOf(findStr);
        System.out.printf("%s is appeared at %d\r\n", findStr, index);
    }

    void findAnyCaseString(String str, String findStr) {
        int index = str.toLowerCase().indexOf(findStr.toLowerCase());
        System.out.printf("%s is appeared at %d\r\n", findStr, index);
    }

    void countChar(String str, char c) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char innerC : chars) {
            if (innerC == c)
                count++;
        }
        System.out.printf("char '%s' count is %d\r\n", c, count);
    }

    void printContainWord(String str, String findStr) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.contains(findStr)) {
                System.out.printf("%s contains %s\r\n", word, findStr);
            }
        }
    }
}
