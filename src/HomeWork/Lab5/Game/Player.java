package HomeWork.Lab5.Game;

import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    int val;

    int addVal() {
        do {
            System.out.println("Add your val: ");
            val = sc.nextInt();
        } while (val < 0 || val > 4);
    return val;
    }

    public static void main(String[] args) {
        Player player = new Player();
        player.addVal();
    }
}
