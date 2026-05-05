
package com.mycompany.subordinates;

import java.util.*;

public class Subordinates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] jefe = new int[n + 1];

            for (int i = 2; i <= n; i++) {
                jefe[i] = sc.nextInt();
}
    ArrayList<Integer>[] hijos = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            hijos[i] = new ArrayList<>();
        }

        for (int i = 2; i <= n; i++) {
            hijos[jefe[i]].add(i);
           }
        
        int[] subordinados = new int[n + 1];

    }
}
