public class Singer extends Artist{
    Singer(String name){
        super(name);
        System.out.println("This is the constructor Singer() in the class Singer");
    }
    public void sing(){
        System.out.println("This is the method sing() in the class Singer.");
        System.out.println(this.getName()+" is Singing");
    }
}
