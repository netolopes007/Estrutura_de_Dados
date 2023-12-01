
package trabalho_java;
import java.util.Scanner;


public class exercicio_01 {
   public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
   
    String[] nomes = new String[10];
    //int [] vetor = new int[5];  
    
    for (int i = 0; i < 10; i++) { 
        System.out.println("Digite o nome :");
        nomes[i] = sc.nextLine();
    }
     System.out.print("Digite um nome para buscar: ");
        String nomesbusca = sc.nextLine();
    
    
    
    for (int i = 0; i < 10; i++) { 
    
    if (nomesbusca==nomes[i]) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
    
}
}

