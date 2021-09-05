package practice.project;

import practice.project.Test;

public class Main {
    public static void main(String[] args) {
        Test t = new Test("Hello World!");
        Test t1 = new Test("Hello World!");
        Test t2 = new Test("Hell World!");
        t.print();
        t1.print();
        t2.print();
    }
}
