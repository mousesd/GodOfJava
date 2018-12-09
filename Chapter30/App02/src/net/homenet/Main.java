package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runJdk6SwitchStatement(3);
        app.runJdk7SwitchStatement("Developer");
    }

    private void runJdk6SwitchStatement(int employeeLevel) {
        switch (employeeLevel) {
            case 1:
                System.out.println("10.0");
                break;
            case 2:
                System.out.println("15.0");
                break;
            case 3:
                System.out.println("100.0");
                break;
            case 4:
                System.out.println("20.0");
                break;
        }
    }

    private void runJdk7SwitchStatement(String employeeLevel) {
        switch (employeeLevel) {
            case "CEO":
                System.out.println("10.0");
                break;
            case "Manager":
                System.out.println("15.0");
                break;
            case "Developer":
                System.out.println("100.0");
                break;
            case "Designer":
                System.out.println("20.0");
                break;
        }
    }
}
