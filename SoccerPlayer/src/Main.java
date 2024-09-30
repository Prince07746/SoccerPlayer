import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

        SoccerPlayers player1 = new SoccerPlayers("Messi", 35, "Inter Miami", 20);
        SoccerPlayers player2 = new SoccerPlayers("Messi", 35, "Inter Miami", 20);
        SoccerPlayers player3 = new SoccerPlayers("Neymar", 30, "Al-Hilal", 6);
        SoccerPlayers player4 = new SoccerPlayers("wafi", 26, 32); // Without team
        SoccerPlayers player5 = new SoccerPlayers("Prince",25,"Develhop",67 );
        ArrayList<SoccerPlayers> playersList = new ArrayList<>();
        playersList.add(player1);
        playersList.add(player2);
        playersList.add(player3);
        playersList.add(player4);
        playersList.add(player5);

        System.out.println("\t Soccer Players List:");
        for (SoccerPlayers player : playersList) {
            System.out.println("\t "+player);
        }
        System.out.println("\t ================================");

        System.out.println("\t working on comparison");
        System.out.println("\t Is player1 equal to player3 ? " + player1.equals(player2));
        System.out.println("\t Is player3 equal to player5? " + player3.equals(player5));
        System.out.println("\t ================================");

        player4.setTeam("Paris Saint-Germain");
        player4.setAge(25);
        System.out.println("\t Updated player4: " + player4);
        System.out.println("\t ================================");

        System.out.println("\t Players is in 'Develhop' team:");
        for (SoccerPlayers player : playersList) {
            if ("Develhop".equals(player.getTeam())) {
                System.out.println("\t Matched = "+player);
            }
        }
        System.out.println("\t ================================");

        System.out.println("\t Soccer Players List:");
        for (SoccerPlayers player : playersList) {
            System.out.println("\t "+player);
        }



    }

}

class SoccerPlayers{
    String name;
    int age;
    String team;
    int scoredGoals;
    public SoccerPlayers(String name, int age, String team, int scoredGoals){
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = scoredGoals;
    }
    public SoccerPlayers(String name, int age, int scoredGoals){
        this.name = name;
        this.age = age;
        this.scoredGoals = scoredGoals;
    }

    public String getName() {
        return name;
    }
    public String getTeam(){
        return team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "\n\t name=" + name  +
                "\n\t age=" + age +
                "\n\t team=" + team +
                "\n\t scoredGoals=" + scoredGoals+
                "\n\t ============================";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerPlayers that = (SoccerPlayers) o;
        return scoredGoals == that.scoredGoals && Objects.equals(team, that.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, team, scoredGoals);
    }
}