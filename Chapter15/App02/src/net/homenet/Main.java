package net.homenet;

public class Main {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();

        //# 1.
        //sample.checkString();

        //# 2.
        //sample.checkCompare();


        //# 3.
        StringCheck check = new StringCheck();
        String[] addresses = new String[]{
            "서울시 구로구 신도림동",
            "경기도 성남시 분당구 정자동 개발공자",
            "서울시 구로구 개봉동"
        };
        //check.checkAddress(addresses);

        //# 4.
        check.containsAddresses(addresses);
    }
}
