package org.anthonyBrown.practiseWork;

import java.util.Scanner;

public class studentClass1 {
    // 数据结构实训1
    private String xh; //学号
    private String xm; //姓名
    private float cj;//成绩

    // 获取信息的方法
    public void GetInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学号：");
        xh = scanner.nextLine();

        System.out.print("请输入姓名：");
        xm = scanner.nextLine();

        System.out.print("请输入成绩：");
        cj = scanner.nextFloat();
    }

    // 显示信息的方法
    public void ShowInfo() {
        System.out.println("学号: " + xh);
        System.out.println("姓名: " + xm);
        System.out.println("成绩: " + cj);
    }
}
