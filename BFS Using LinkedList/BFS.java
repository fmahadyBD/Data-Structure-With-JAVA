package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Mahady Hasan Fahim
 */
public class BFS {

    static void addList(LinkedList<LinkedList<Integer>> a, int u, int v) {
        a.get(u).add(v);
        a.get(v).add(u);

    }

    static void printl(LinkedList<LinkedList<Integer>> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(i + "-> ");
            for (int j = 0; j < a.get(i).size(); ++j) {
                System.out.println(a.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }
    static void bsf(LinkedList<LinkedList<Integer>>a,int start){
        int size=a.size();
        boolean[]visited= new boolean[size];// Initialize an array to keep track of visited vertices
        Queue<Integer> q=new LinkedList<Integer>();// to track the process
        
        visited[start]=true;
        q.offer(start);
        while(!q.isEmpty()){
            int currentVer=q.poll(); //// Dequeue a vertex from the queue
            System.out.println(currentVer);
            LinkedList<Integer> nigrs=a.get(currentVer);
            for(int n:nigrs){
                if(!visited[n]){
                    visited[n]=true;
                    q.offer(n);
                }
            }
            
            
        }
        
    }

    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> a = new LinkedList<LinkedList<Integer>>();
        int v;
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        for (int i = 0; i < v; i++) {
            a.add(new LinkedList<Integer>());

        }
        System.out.println("Enter the Edge Number: ");
        int e = sc.nextInt();
        System.out.println("Enter 2 connected vertex");
        int x, y;
        for (int i = 0; i < e; i++) {
            x = sc.nextInt();

            y = sc.nextInt();
            addList(a, x, y);

        }

    }

}
