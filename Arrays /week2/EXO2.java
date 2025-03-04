import java.util.Scanner;
public class EXO2 {
    public static void main(String[] args) {
        int  number_friend;

        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of  the friend :");
        number_friend= input.nextInt();
        int[] age = new  int[number_friend];
        double[] height= new double[number_friend];
        int max_age,min_age;
        double max_height;



        for  (int i =0; i<number_friend;i++){
            System.out.print("pls enter the age of  "+(i+1)+(":"));
            age[i]= input.nextInt();
            System.out.print("his heigtht :");
            height[i]=input.nextDouble();
        }
         max_age=age[0];
         min_age= age[0];
         max_height=height[0];
        for (int i =0; i<number_friend;i++){
            if (max_age<age[i]){
                max_age=age[i];
            }

            
            if (max_height<height[i]){
              max_height=height[i];
            }
           if( min_age>age[i]){
            min_age=age[i];
           }
        }

       System.out.println("the all information is :\n----------------------------------------------");
        
       System.out.println("the youngess age is "+min_age);
       System.out.println("the old age is :"+max_age);
       System.out.println("the  tallest height :"+max_height);
    }
    
}
