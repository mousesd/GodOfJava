package net.homenet;

public interface DefaultMethod {
    String getName();
    int getSince();
    default String getEmail() {
        return getName() + "@bbb.ccc";
    }
}
