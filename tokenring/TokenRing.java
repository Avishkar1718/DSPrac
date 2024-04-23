import java.util.*;

public class TokenRing{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("nodes");
    int n=sc.nextInt();
    System.out.print("nodes");
    for(int i=0;i<n;i++){
        System.out.print(i +" ");  
    }
    System.out.println("0");
    int choice=0;

    do{
        System.out.println("sender");   
        int sen=sc.nextInt();
        System.out.println("res");   
        int res=sc.nextInt();
        System.out.println("data");   
        int data=sc.nextInt();
        int token=0;
        System.out.println("Token Passing");
            for(int i=token;i<sen ;i++){
                System.out.print(" " +i+"-->");
            }
            System.out.println(" "+ sen);
            System.out.println("sender"+sen+"Data"+data);

         for(int i=sen;i!=res ;i=(i+1)%n){
                System.out.println("data" +data+"Forwasded by"+i);
            }
            System.out.println("res"+res+"Data"+data);
            token=sen;
            System.out.println("Continue 1=yes, 0=no" );
            choice= sc.nextInt();
    }while(choice==1);
}
}