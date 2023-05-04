public class MusicTrack{
    private String name;
    private float duration;

    MusicTrack(String name,float duration){
        System.out.println("This is the constructor MusicTrack() in the class Music Track");
        this.name=name;
        this.duration=duration;
    }
    public void setName(String name){
        System.out.println("This is the method setName() in the class MusicTrack");
        this.name=name;
    }
    public float getDuration(){
        System.out.println("This is the method getDuration() in the class MusicTrack");
        return duration;
    }
    public void setDuration(float duration){
        System.out.println("This is the method setDuration() in the class MusicTrack");
        this.duration=duration;
    }
}
