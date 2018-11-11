package net.homenet;

public class Main {
    public static void main(String[] args) {
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<>();
        dto1.setObject(new String());
        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<>();
        dto2.setObject(new StringBuffer());
        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<>();
        dto3.setObject(new StringBuilder());

        String s = dto1.getObject();
        StringBuffer buffer = dto2.getObject();
        StringBuilder builder = dto3.getObject();
    }
}
