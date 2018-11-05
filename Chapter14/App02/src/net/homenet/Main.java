package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.throwMyException(13);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private void throwMyException(int number) throws MyException {
        if (number > 12) {
            throw new MyException("Number is over than 12");
        }
    }
}
