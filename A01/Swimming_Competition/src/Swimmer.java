public class Swimmer extends Character {
    private float time=0;
    private String clothescolor;
    private String gender;

    Swimmer(String name,String id){
        super(name,id);
    }
    public void swim(){
        System.out.println("Swimming");
    }
    public void touchTouchpad(Touchpad touchpad){
        touchpad.notifyy();
    }
}
