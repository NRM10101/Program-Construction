public class Main {
    public static void main(String[] args) {
        MainArtist mainArtist = new MainArtist("Taylor Swift");
        LivePerformance performance=new LivePerformance("Eras Tour",mainArtist,2023,"Glendale");
        performance.setTrackList("Lavender Haze",10);
        performance.setTrackList(" Lavender Haze",2);
        performance.setTrackList("All Too Well",3);
        performance.setTrackList("The lakes",5);
        performance.setTrackList("The Man",60);
        performance.setTrackList("Love Story",45);
        performance.setBackupSinger("Jeslyn");
        performance.setBackupSinger("Melanie");
        performance.setBackupDancer("Stephanie");
        performance.setBackupDancer("Jake");
        ////////////////Performance starting//////////////
        System.out.println("///////////////////////////////Performance starting//////////////////////////////////////////////////////");
        performance.welcomeMessage();
        performance.recode();
        mainArtist.sing();
        performance.backupSingers();
        mainArtist.dance();
        performance.backupDances();
        performance.interact(mainArtist);
    }
}
