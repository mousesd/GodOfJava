package net.homenet;

class StringCheck {
    void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";

        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount++;
            }

            if (address.endsWith(endText)) {
                endCount++;
            }
        }

        System.out.printf("Starts with %s count is %s\r\n", startText, startCount);
        System.out.printf("Ends with %s count is %s\r\n", endText, endCount);
    }

    void containsAddresses(String[] addresses) {
        int containCount = 0;
        String containText = "구로";

        for (String address : addresses) {
            if (address.contains(containText)) {
                containCount++;
            }
        }

        System.out.printf("Contains %s count is %s\r\n", containText, containCount);
    }
}
