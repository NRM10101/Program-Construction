public class Dancer extends Artist{
    Dancer(String name){
        super(name);
        System.out.println("This is the constructor Dancer() in the class Dancer");
    }
    public void dance(){
        System.out.println("This is the method dance() in the class Dancer().");
        System.out.println(this.getName()+" is Dancing");
    }
}