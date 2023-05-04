public class LivePerformance extends Performance{
    LivePerformance(String name,MainArtist mainArtist,int year,String venue){
        super(name,mainArtist,year,venue);
        System.out.println("This is the constructor LivePerformance() in the class LivePerformance");
    }
    @Override
    public void recode(){
        System.out.println("This is the method recode() in the class LivePerformance.");
        System.out.println("Recording LivePerformance...");
    }
    public void interact(Artist artist){
        System.out.println("This is the method interact() in the class LivePerformance");
        System.out.println(artist.getName()+" interact with audience");
    }

}
