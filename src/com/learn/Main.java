package com.learn;

import com.learn.algorithms_part_1.union_find.QuickFind;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        QuickFind qf = new QuickFind(n);
        int p, q;
        while (true) {
            p = scanner.nextInt();
            q = scanner.nextInt();

            if (p != -1 && q != -1) {
                qf.union(p, q);
            } else {
                break;
            }
        }
    }
}
