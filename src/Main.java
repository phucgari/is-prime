import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What number do you want to check prime?");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        boolean result = true;
        if(num<2){
            result=false;
        }else {
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    result=false;
                    break;
                }
            }
        }
        if(result){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }
    }
}