package Multithreding;

import java.util.Scanner;

public class ThreadActivity extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        
        if (threadName.equals("ADD")) {
            addition();
        } else if (threadName.equals("CHAR")) {
            charPrint();
        } else if (threadName.equals("NUM")) {
            numPrint();
        }
    }

    void addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
        sc.close();
    }

    void charPrint(){
        for(char ch = 'A'; ch <= 'H'; ch++) {
            System.out.println(ch);
        }
    }

    void numPrint(){
        for(int i = 1; i <= 9; i++) {
            System.out.println(i);
        }
    }
}
