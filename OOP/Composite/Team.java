
import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players = new ArrayList<Player>();

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public void createOrchestra() {
        System.out.println("Team creates orchestra\n");
        for(Player player: players) {
            player.playMusic();
        }
    }
}
