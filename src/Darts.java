import java.util.Random;

public class Darts {
    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static class Team {
        private int[] players = new int[4];

        Team() {
            for (int i = 0; i < this.players.length; i++) {
                players[i] = 0;
            }

        }

        void trow() {
            Random random = new Random();

            for (int i = 0; i < players.length; i++) {
                for (int j = 0; j < 3; j++) {
                    players[i] += random.nextInt(0, 60);
                }
            }
        }

        int max() {
            int max = players[0];
            for (int i = 1; i < players.length; i++) {
                if (players[i] > max) {
                    max = players[i];
                }

            }
            return max;
        }

        int getWinner() {
            for (int i = 0; i < players.length; i++) {
                if (players[i] == max()) {
                    return i + 1;
                }
            }
            return -1;
        }
    }


    public static void main(String[] args) {
        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();


        team1.trow();
        team2.trow();
        team3.trow();
        System.out.println("the winnwe of team 1 is: " + team1.getWinner() + ", hes points are: " + team1.max());
        System.out.println("the winnwe of team 2 is: " + team2.getWinner() + ", hes points are: " + team2.max());
        System.out.println("the winnwe of team 3 is: " + team3.getWinner() + ", hes points are: " + team3.max());
        System.out.println("the champion is: the best player: " + getMax(getMax(team1.max(), team2.max()), team3.max()));

    }
}

