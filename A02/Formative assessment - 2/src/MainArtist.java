public class MainArtist extends Artist implements IBackup{
    MainArtist(String name){
        super(name);
        System.out.println("This is the constructor MainArtist() in the class MainArtist.");
    }
    @Override
    public void sing() {
        System.out.println("This is the method sing() in the class MainArtist.");
        System.out.println(this.getName()+" is Singing");
    }
    @Override
    public void dance() {
        System.out.println("This is the method dance() in the class MainArtist.");
        System.out.println(this.getName()+" is dancing");
    }
    @Override
    public String getName() {
        System.out.println("This is the method getName() in the class MainArtist.");
        return super.getName();
    }
    @Override
    void setName(String name) {
        System.out.println("This is the method setName() in the class MainArtist.");
        super.setName(name);
    }
}
