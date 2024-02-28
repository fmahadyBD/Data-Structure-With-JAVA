package algorithm;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Mahady Hasan Fahim
 */
public class Algorithm {

    static void adlist(LinkedList<LinkedList<Integer>> ad, int u, int v) {

        ad.get(u).add(v);
        ad.get(v).add(u);
    }

    static void print(LinkedList<LinkedList<Integer>> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(  i + " -> ");
            for (int j = 0; j < a.get(i).size(); j++) {
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> adj = new LinkedList<LinkedList<Integer>>();
        int v;
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        for (int i = 0; i < v; i++) {
            adj.add(new LinkedList<Integer>());
        }
        System.out.println("Enter the Number of Edgs:");
        int x, y, e;
        e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            System.out.println("Enter connected Tow Edges: ");
            x = sc.nextInt();
            y = sc.nextInt();
            adlist(adj, x, y);
        }
        print(adj);
    }

}
