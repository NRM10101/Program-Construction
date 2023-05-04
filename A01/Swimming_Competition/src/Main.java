import java.util.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        HashMap<String,String> scorecard=new HashMap<>();
        System.out.println("||||||||||||||Swimming Competition|||||||||||||");
        System.out.print("Enter number of Swimmers : ");
        int no_of_swimmers= input.nextInt();
        System.out.print("Enter number of Judges : ");
        int no_of_judges=input.nextInt();
        System.out.print("Enter number of Spectators : ");
        int no_of_spectators=input.nextInt();
        System.out.print("Enter number of Supporting staff : ");
        int no_of_supporting_staff=input.nextInt();

        Swimmer[] swimmers=new Swimmer[no_of_swimmers];
        Judge[] judges=new Judge[no_of_judges];
        Spectator[] spectators=new Spectator[no_of_spectators];
        SupportingStaff[] supportingStaffs=new SupportingStaff[no_of_supporting_staff];

        for(int i=0;i<no_of_swimmers;i++){
            System.out.print("Enter the name of the swimmer : ");
            String name= input.next();
            System.out.print("Enter the id of the swimmer : ");
            String id= input.next();
            swimmers[i]=new Swimmer(name,id);
        }
        for(int i=0;i<no_of_judges;i++){
            System.out.print("Enter the name of the judge : ");
            String name= input.next();
            System.out.print("Enter the id of the judge : ");
            String id= input.next();
            judges[i]=new Judge(name,id);
        }
        for(int i=0;i<no_of_spectators;i++){
            System.out.print("Enter the name of the swimmer : ");
            String name= input.next();
            System.out.print("Enter the id of the swimmer : ");
            String id= input.next();
            spectators[i]=new Spectator(name,id);
        }
        for(int i=0;i<no_of_supporting_staff;i++){
            System.out.print("Enter the name of the swimmer : ");
            String name= input.next();
            System.out.print("Enter the id of the swimmer : ");
            String id= input.next();
            supportingStaffs[i]=new SupportingStaff(name,id);
        }
/////////////////////////////////////////////////////////////////////

        for(int j=0;j<no_of_judges;j++){
            judges[j].blowWhistle();
        }
        for(int i=0;i<no_of_swimmers;i++){
            swimmers[i].swim();
        }

    }
}