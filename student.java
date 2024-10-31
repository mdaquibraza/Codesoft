import java.util.Scanner;
class student{
public static void main(String[] args) {
    


    try(Scanner sc=new Scanner(System.in)){
        System.out.println("enter your all five marks");
        System.out.println("enter mark of English");
    int English=sc.nextInt();
    System.out.println("enter mark of Hindi");
    int Hindi=sc.nextInt();
    System.out.println("enter mark of Math");
    int Math=sc.nextInt();
    System.out.println("enter mark of Science");
    int Science=sc.nextInt();
    System.out.println("enter mark of Social");
    int Social=sc.nextInt();
    


    int total=English+Hindi+Math+Science+Social;
    System.out.println("your total marks is "+total);


    int percentage=total/5;
    System.out.println("your percentage is "+percentage);
    


    if(percentage>=70){
        System.out.println( "Grade "+"A");
    }
    else if(percentage>=40 && percentage<=69){
        System.out.println("Grade "+"B");
    }
    else if(percentage>=25 && percentage<=39){
System.out.println("Grade "+"C");
}
else{
    System.out.println("no grade");
}
    }
}
}
