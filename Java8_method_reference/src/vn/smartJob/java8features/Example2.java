/*
 * Copyright (C) 2016 - SmartJob.vn
 * SmartJob VN proprietary/confidential. Use is subject to license terms.
 * Website: http://smartJob.vn
 * Email: contact@smartJob.vn
 * Telephone: (84)-4-6294 44 47
 */
package vn.smartJob.java8features;

import java.util.function.Supplier;

/**
 * Demo for method reference in Java 8.
 *
 * @author Do Nhu Vy
 */
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
