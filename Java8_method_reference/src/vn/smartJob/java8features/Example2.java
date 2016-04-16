package vn.smartJob.java8features;

import java.util.function.Supplier;

public class Example2 {

    public static void main(String[] args) {
        String s = "SmartJob - Mạng tuyển dụng hàng đầu Việt Nam";
        printResult(s::length);
    }

    public static void printResult(Supplier<Integer> supplier) {
        System.out.println(supplier.get());
    }

}

// Kết quả
// 44