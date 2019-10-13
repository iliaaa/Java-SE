package HomeWork.Lab3;

import java.util.Scanner;
/*
разобрался как именно перекладываются кольца, но рекурсивный метод загуглил конечно,
пытался разобраться каким образом тут работает рекурсия, почитал хабр,
посмотрел видео в ютюде, почитал википедию - не понял. если вы мне объясните это буду благодарен.
 */
public class Hanoi {
    static void hanoi(int n, int from, int to, int additional)

    {

        if (n == 0) return;

        hanoi(n-1,from,additional,to);

        System.out.println(from + " " + to);

        hanoi(n-1,additional,to,from);

    }



    public static void main(String[] args)

    {
        Scanner con = new Scanner(System.in);

        int n = con.nextInt();

        hanoi(n,1,2,3);


    }
}


