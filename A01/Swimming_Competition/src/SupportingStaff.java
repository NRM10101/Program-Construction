public class SupportingStaff extends Character{

    public SupportingStaff(String name, String id){
        super(name,id);
    }
    public void support(){
        System.out.println("Support!");
    }
    public void support1(Scoreboard scoreboard){
       scoreboard.displayScorecard();
    }
}
