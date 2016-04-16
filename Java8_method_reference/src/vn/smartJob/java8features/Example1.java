package vn.smartJob.java8features;

import java.util.List;
import java.util.ArrayList;

public class Example1 {

    public static void main(String args[]) {
        List employeeList = new ArrayList();
        employeeList.add("Bùi Đăng Trường");
        employeeList.add("Nguyễn Tiến Mạnh");
        employeeList.add("Nguyễn Văn Bình");
        employeeList.add("Nguyễn Anh Dũng");
        employeeList.add("Đỗ Văn Cường");
        employeeList.forEach(System.out::println);
    }

}

// Kết quả:
//run:
//Bùi Đăng Trường
//Nguyễn Tiến Mạnh
//Nguyễn Văn Bình
//Nguyễn Anh Dũng
//Đỗ Văn Cường
//BUILD SUCCESSFUL (total time: 0 seconds)
