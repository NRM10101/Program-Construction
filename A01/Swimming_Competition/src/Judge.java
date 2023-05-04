public class Judge extends Character{
    boolean whistle=false;

    public Judge(String name, String id){
        super(name,id);
    }
    public void blowWhistle(){
        whistle=true;
        System.out.println("whistle! competition starts");
    }
}
