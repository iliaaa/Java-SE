package HomeWork.Lab5.Game;

public class Game {
    enum Values {
        ROCK (0),
        PAPER (1),
        SCISSORS (2),
        SPOCK (3),
        LIZARD (4);

        int values;

        Values(int values) {
            this.values = values;
        }

        static Values getValById(int val){
            switch (val){
                case 0:
                    return ROCK;
                case 1:
                    return PAPER;
                case 2:
                    return SCISSORS;
                case 3:
                    return SPOCK;
                case 4:
                    return LIZARD;
                default: return null;
            }
        }
    }

    void Game (int c, int p){
        if (p - c == -1 || p - c == -3 || p - c == 2 || p - c == 4)  {
            System.out.println("Player WIN");
        } else if (p == c) {
            System.out.println("Draw");
        } else System.out.println("Computer WIN");
    }

    public static void main(String[] args) {

        Player p = new Player();
        int player = p.addVal();

        Computer c = new Computer();
        int comp = c.val;

        System.out.println("Player choice: " + Values.getValById(player).toString());
        System.out.println("Computer choice: " + Values.getValById(c.val).toString());

        Game game = new Game();
        game.Game(player, comp);
    }
}
