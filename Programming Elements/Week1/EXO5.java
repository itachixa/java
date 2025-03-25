import java.util.Scanner;
public class EXO5 {
    public  static void  main(String[] args){
    int  numbers_pen,numbers_students;
    Scanner input = new Scanner(System.in);

    System.out.print("enter  the number of pens: ");
    numbers_pen=input.nextInt();
    
    System.out.print("enter  the number of students: ");
    numbers_students=input.nextInt();
    
    if (numbers_pen%numbers_students==0) {
        System.out.println("\nthe number of  pen by student is:" + numbers_pen/numbers_students);    
    }else{

        for(int i=numbers_students;i>0;i=i-1){
            if(i%numbers_students==0){
                System.out.println("the pen by students is:"+ numbers_pen/i+"\nthe pen don't distribuate is :"+(numbers_pen-((numbers_pen/i)*numbers_students)));
                input.close();

}


}
}
}

}
