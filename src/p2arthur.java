import java.util.Scanner;


public class p2arthur {
    public static void main(String[] args) {
        Scanner digitavel = new Scanner (System.in);
        
        System.out.println(" OI, eu sou o seu assistente, me chamo Alfred," +
         " para começarmos digite o seu nome:");
        String nome = digitavel .nextLine();

        System.out.println ("Olá," + nome + "para prosseguir com o cadastro," + 
        " responda quantos anos você tem?" );
        int idade = digitavel .nextInt();
    

        if ( idade >= 18){
        
            System.out.println("Você é maior de idade, então poderá dar continuidade ao cadastro" + 
            " no nosso site.");     
           }

        else {

            System.out.println(" Você não possui a idade necessária, infelizmente" + 
            " não poderá dar continuidade ao cadastro em nosso site. ");
        }
        


    }
}
