package com.learn;
import com.learn.algorithms_part_1.union_find.QuickFind;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Main m = new Main();
        m.quickFindAlgo();

    }

    public void quickFindAlgo() {
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
                System.out.println(qf.connected(1, 3));
                break;
            }
        }
    }
}
