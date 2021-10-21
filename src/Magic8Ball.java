import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {  
    
    
    public static String resposta;
    public static void main(String[] args) {
        
    Random ball8 = new Random();
    Scanner scan = new Scanner(System.in);
    int secret = ball8.nextInt(9);
    
    
    System.out.println("Digite 1 para começar");
    resposta = scan.nextLine();
      
    switch(resposta) {
    case "1":
    System.out.println("The magic 8 Ball gives you a "+ secret);
    break;
         default:
    System.out.println("ok");     
    
    
  }
 }
}
