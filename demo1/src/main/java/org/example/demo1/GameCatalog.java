import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class GameCatalog {
    private List<Game> games;

    public GameCatalog() {
        this.games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void removeGame(String title) {
        Iterator<Game> iterator = games.iterator();
        while(iterator.hasNext()){
            Game game = iterator.next();
            if(game.getTitle().equals(title)){
                iterator.remove();
                break;
            }
        }
    }

    public void updateGame(Game updatedGame) {
        for (int i = 0; i < games.size(); i++) {
            if(games.get(i).getTitle().equals(updatedGame.getTitle())){
                games.set(i, updatedGame);
                break;
            }
        }
    }


    public List<Game> searchGames(String field, String value) {
        // Arama işlemi için gerekli mantık burada eklenecek.
        return new ArrayList<>();
    }


    public List<Game> filterGamesByTags(List<String> tags) {
        // Filtreleme işlemi için gerekli mantık burada eklenecek.
        return new ArrayList<>();
    }


    public List<Game> getAllGames() {
        return games;
    }
}