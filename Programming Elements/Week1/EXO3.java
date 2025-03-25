import java.util.Scanner;
public class EXO3 {
public  static void  main(String[] args){
    double distance;
  Scanner input= new Scanner(System.in);
  System.out.print("enter the distance :");
  distance =input.nextDouble();
  System.out.println("the  distance in mile is :"+(distance*1.6)+" mile");
  input.close();
}

}
