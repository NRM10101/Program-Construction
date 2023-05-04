public class Character {
    private String name;
    private String id;

    Character(String name,String id){
        this.name=name;
        this.id=id;
    }
    public void chekScoreBoard(Scoreboard scoreboard){
        scoreboard.displayScorecard();
    }
    public String getName(){
        return this.name;
    }
}
