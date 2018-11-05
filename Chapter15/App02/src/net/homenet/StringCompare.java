package net.homenet;

class StringCompare {
    void checkString() {
        String text = "You must know String class.";
        System.out.println("text.length()=" + text.length());

        String korean = "한글";
        System.out.println("korean.length()=" + korean.length());
    }

    void checkCompare() {
        String text1 = "Check value";
        //String text2 = "Check value";
        String text2 = new String("Check value");

        if (text1 == text2) {
            System.out.println("text1==text2 result is same.");
        } else {
            System.out.println("text1==text2 result is different.");
        }

        if (text1.equals(text2)) {
            System.out.println("text1.equals(text2) result is same.");
        }
    }
}
