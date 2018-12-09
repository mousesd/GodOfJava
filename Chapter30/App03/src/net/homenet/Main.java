package net.homenet;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runCreateGeneric1();
        app.runCreateGeneric2();
        app.runCreateGeneric3();
        app.runCreateGeneric4();
    }

    private void runCreateGeneric1() {
        GenericClass<Integer> generic = new GenericClass<>("String");
        generic.setValue(999);
    }

    private void runCreateGeneric2() {
        //# <> 미 지정시 아래 컴파일 경고 발생. 실행은 됨
        //# - Main.java uses unchecked or unsafe operations.
        //# - Recompile with -Xlint:unchecked for details.
        GenericClass<Integer> generic = new GenericClass("String");
        generic.setValue(999);
    }

    private void runCreateGeneric3() {
        GenericClass<Integer> generic = new <String>GenericClass<Integer>("String");
        generic.setValue(999);
    }

    private void runCreateGeneric4() {
        //# 명시적으로 타입을 선언하면 <>를 사용하면 안됨
        //# - Error:(32, 65) java: cannot infer type arguments for net.homenet.GenericClass<X>
        //# - reason: cannot use '<>' with explicit type parameters for constructor
        //GenericClass<Integer> generic = new <String>GenericClass<>("String");
        GenericClass<Integer> generic = new GenericClass<>("String");
        generic.setValue(999);
    }
}
