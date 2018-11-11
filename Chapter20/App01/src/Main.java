public class Main {
    public static void main(String[] args) {
        System.out.println("Byte min=" + Byte.MIN_VALUE + " max=" + Byte.MAX_VALUE);
        System.out.println("Short min=" + Short.MIN_VALUE + " max=" + Short.MAX_VALUE);
        System.out.println("Integer min=" + Integer.MIN_VALUE + " max=" + Integer.MAX_VALUE);
        System.out.println("Long min=" + Long.MIN_VALUE + " max=" + Long.MAX_VALUE);
        System.out.println("Float min=" + Float.MIN_VALUE + " max=" + Float.MAX_VALUE);
        System.out.println("Double min=" + Double.MIN_VALUE + " max=" + Double.MAX_VALUE);
        System.out.println("Character min=" + (int)Character.MIN_VALUE + " max=" + (int)Character.MAX_VALUE);
        System.out.println();

        System.out.println("Integer Binary min=" + Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("Integer Binary max=" + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer Hex min=" + Integer.toHexString(Integer.MIN_VALUE));
        System.out.println("Integer Hex max=" + Integer.toHexString(Integer.MAX_VALUE));
    }
}
