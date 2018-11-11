package net.homenet;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Method[] methods = UseAnnotationSample.class.getDeclaredMethods();
        for (Method method : methods) {
            UseAnnotation annotation = method.getAnnotation(UseAnnotation.class);
            if (annotation != null) {
                int number = annotation.number();
                String text = annotation.text();
                System.out.printf("%s() : number=%d, text=%s\r\n", method.getName(), number, text);
            } else {
                System.out.printf("%s() : annotation is null\r\n", method.getName());
            }
        }
    }
}
