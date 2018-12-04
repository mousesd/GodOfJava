package net.homenet;

import java.io.Serializable;

@SuppressWarnings("WeakerAccess")
public class SerializeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String bookName;
    transient private int bookOrder;
    private boolean isBestSeller;
    private long soldPerDay;
    private String bookType;

    public SerializeDTO(String bookName, int bookOrder, boolean isBestSeller, long soldPerDay) {
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.isBestSeller = isBestSeller;
        this.soldPerDay = soldPerDay;
    }

    @Override
    public String toString() {
        return "SerializeDTO[bookName='" + bookName + '\'' +
            ", bookOrder=" + bookOrder +
            ", isBestSeller=" + isBestSeller +
            ", soldPerDay=" + soldPerDay +
            ", bookType=" + bookType +
            ']';
    }
}
