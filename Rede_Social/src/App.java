import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        Usuario usu = new Usuario();

        int valor;
        String nome;
        int escolha = 0;


        System.out.println("Informe sua idade: ");
        valor = sc.nextInt();
        usu.controleIdade(valor);

        if (valor >= 18){

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        usu.cadastrar(nome);
        }
        
        else{
            System.out.println("Não pode fazer cadastro");


        }



        

        


        

       
        



    }
}
