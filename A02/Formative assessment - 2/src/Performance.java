import java.util.ArrayDeque;
import java.util.ArrayList;
public class Performance {
    private MainArtist mainArtist;
    private String performanceName;
    private  int year;
    private  String venue;
    private ArrayList<MusicTrack> trackList=new ArrayList<>();
    private ArrayList<Singer> backupSingers=new ArrayList<>();
    private ArrayList<Dancer> backupDancers=new ArrayList<>();

    Performance(String performanceName,MainArtist mainArtist,int year,String venue){
        System.out.println("This is the constructor Performance() in the class Performance");
        this.performanceName=performanceName;
        this.mainArtist=mainArtist;
        this.year=year;
        this.venue=venue;
    }
    public void welcomeMessage(){
        System.out.println("This is the method welcomeMessage() in the class Performance");
        System.out.println("Welcome to the performance "+this.performanceName+" by "+this.mainArtist.getName());
    }
    public void recode(){
        System.out.println("This is the method recode() in the class Performance.");
        System.out.println("Recoding...");
    }
    public Artist getMainArtist(){
        System.out.println("This is the method getMainArtist() in the Performance");
        return this.mainArtist;
    }
    //performanceName is viewable and changeable
    public void setPerformanceName(String performanceName){
        System.out.println("This is the method setPerformanceName() in the class Performance");
        this.performanceName = performanceName;
    }
    public String getPerformanceName(){
        System.out.println("This is the method getPerformanceName() in the class Performance");
        return this.performanceName;
    }
    //year and venue view by anyone but cannot be changed
    public String getVenue(){
        System.out.println("This is the method getVenue() in the class Performance");
        return this.venue;
    }
    public int getYear(){
        System.out.println("This is the method getYear() in the class Performance");
        return this.year;
    }
    //Anyone can make changes to the trackList ,but the currently existing track list should not be visible to outsiders.
    public void setTrackList(String name,float duration){
        MusicTrack musicTrack=new MusicTrack(name,duration);
        trackList.add(musicTrack);// you can add more methods to the TrackList
        System.out.println("This is the method setTrackList() in the class Performance");
    }
    //The number of backup singers and backup dancers varies for each performance.
    public void setBackupSinger(String name){
        Singer backupSinger=new Singer(name);
        backupSingers.add(backupSinger);
        System.out.println("This is the method setBackupSinger() in the class Performance");
    }
    public void setBackupDancer(String name){
        Dancer backupDancer=new Dancer(name);
        backupDancers.add(backupDancer);
        System.out.println("This is the method setBackupDancer() in the class Performance");
    }
    public void backupSingers(){
        System.out.println("This is the method backupSingers() in the class Performance");
        for(Singer singer:backupSingers){
            singer.sing();
        }
    }
    public void backupDances(){
        System.out.println("This is the method backupSingers() in the class Performance");
        for(Dancer dancer:backupDancers){
            dancer.dance();
        }
    }
}
