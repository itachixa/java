package Methode;
import java.util.Scanner;
public class SpringSeason {
    public static boolean ChekSeason(int M, int D){
        if ((M==3 && D>=20)||(M==3 && D<=31)||(M==4 && D>=1)||(M==4 && D<=30) ||(M==5 && D>=1)||(M==5 && D<=31)||(M==6 && D>=1)||(M==6 && D<=20)){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        int Mounth,Day;



        System.out.print("please enter the number of Mouth:"); 
        Mounth=Input.nextInt();
 
        System.out.print("please enter the  number of day:");
        Day=Input.nextInt();
        if(ChekSeason(Mounth, Day)){
            System.out.println("Its a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
        Input.close();
 
    }

    
}
