public class StudioPerformance extends Performance{
    StudioPerformance(String name,MainArtist mainArtist,int year,String venue){
        super(name,mainArtist,year,venue);
        System.out.println("This is the constructor StudioPerformance() in the class StudioPerformance");
    }
    public void audioprocess(){
        System.out.println("This is the method audioprocess in the class StudioPerformance.");
        System.out.println("Audio processing...");
    }
    @Override
    public void recode(){
        System.out.println("This is the method recode() in the class StudioPerformance.");
        System.out.println("Recoding StudioPerformance...");
    }
}
