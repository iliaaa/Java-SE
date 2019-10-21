package HomeWork.Lab5;

import java.util.Random;

public class Lab3Fibonachi {
    int prev = 0;
    int curr = 1;
    int n;
    int next;
    boolean flag = true;

    public Lab3Fibonachi() {
        this.n = new Random().nextInt(19);
        System.out.println(n);
    }

    void run(){
        if (n == 0) {
            System.out.println(prev);
        } else if (n == 1) {
            System.out.print(prev + " " + curr);
        } else {
            System.out.print(prev + " " + curr + " ");
            for (int i = 2; i < n; i++){
                int next = prev + curr;
                prev = curr;
                curr = next;
                System.out.print(next + " ");
            }
        }
    }

    int run(int n) {
        if (n == 1){
            if(flag){
                System.out.print(prev);
            }
            return 0;
        }
        if (n == 2){
            if(flag){
                System.out.print(prev + " " + curr + " ");
            }
            return 1;
        }
        if(flag){
            System.out.print(prev + " " + curr + " ");
        }
        if (n > 2) {
            flag = false;
            next = curr + prev;
            prev = curr;
            curr = next;
            System.out.print(next + " ");
            run(n - 1);
        }
        return next;
    }

    public static void main(String[] args) {
        Lab3Fibonachi lab3Fibonachi = new Lab3Fibonachi();
        //lab3Fibonachi.run();
        lab3Fibonachi.run(lab3Fibonachi.n);
    }
}
