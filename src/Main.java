import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors);
        System.out.println("-----------------------------------");
        Collections.sort(colors);
        System.out.println(colors);
        System.out.println("---------------------");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));;
        }

        for (String  b : colors) {
            System.out.println(b);
        }

        System.out.println("--------------------------------------------");

        Player player = new Player("Griezmann", 8);
        Player player2 = new Player("Araujo", 4);
        Player player3 = new Player("De Jong",21);
        ArrayList<Player> players = new ArrayList<>();
        players.add(player);
        players.add(player2);
        players.add(player3);

        System.out.println(players);
    }
}