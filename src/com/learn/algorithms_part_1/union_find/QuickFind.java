package com.learn.algorithms_part_1.union_find;

/* Problem - Quick Find (Eager Approach)
 *
 * Integer array id[] of size N
 * Interpretation - p and q are connected if they have same id
 *
 * Example - N = 10
 *           id[] = [0,1,1,8,8,0,0,1,8,8]
 *           {0,5,6} {1,2,7} {3,4,8,9} are connected components
 *
 * Time complexity - N union commands and N objects then time complexity is NxN
 *
 * */

import java.io.*;
import java.util.*;


public class QuickFind {
    private int[] id;

    public QuickFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }


    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }


}