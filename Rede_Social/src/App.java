import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Usuario usu = new Usuario();
        Publicacao_foto Pfoto = new Publicacao_foto();
        Publicacao_texto Ptxt = new Publicacao_texto();
        Publi_Propaganda P_prop = new Publi_Propaganda();
        comentarios com = new comentarios();
        mensagem MSG = new mensagem();
        chamadas lg = new chamadas();
        Foto ft = new Foto();
        videos vd = new videos();

        int valor;
        String nome;
        String genero;
        String email;
        String URI;
        String Formato;
        String Texto;
        String Patrocinio;
        String Publico_Alvo;
        String link;
        int S_or_N = 0;
        int escolha = 0; 

        
        while (escolha  != 11){
        System.out.print("\n Digite: \n 1 - Cadastrar \n 2- Logar \n 3 - Publicar foto \n 4 - Publicar texto \n 5 - Publicar propaganda \n 6 - Comentar uma publicação de outro usuário \n 7 - Enviar mensagem \n 8 - Fazer Ligação \n 9 - Enviar foto \n 10 - Enviar vídeo \n 11 - Sair \n: ");
        escolha= sc.nextInt();

        if (escolha == 1){

            sc.nextLine();
            System.out.print("Informe seu nome: ");
            nome = sc.nextLine();
        
            System.out.print("Informe seu e-mail: ");
            email = sc.nextLine();
            System.out.print("Informe seu gênero: ");
            genero = sc.nextLine();


            
            usu.cadastrar(nome, email, genero);
            

            System.out.print("Informe sua idade: ");
            valor = sc.nextInt();
            usu.controleIdade(valor);



                }
        else if (escolha == 2){
            sc.nextLine();
            System.out.print("Informe seu nome: ");
            nome = sc.nextLine();

            System.out.print("Informe seu e-mail: ");
            email = sc.nextLine();

            usu.logar(nome, email);

        }
        else if (escolha == 3){
            sc.nextLine();
            System.out.print("Informe o URI da foto: ");
            URI = sc.nextLine();

            System.out.print("Informe o formato da imagem: ");
            Formato = sc.nextLine();

            Pfoto.Pub_Foto(URI, Formato);


            while (S_or_N != 2){
            System.out.print("\nVocê deseja comentar a publicação? \n Digite: \n 1 - sim \n 2 - não \n: ");
            S_or_N = sc.nextInt();

            if (S_or_N == 1){

                sc.nextLine();
                System.out.print("Comente a publicação: ");
                Texto = sc.nextLine();

                com.comentar(Texto);  
            }
            else{

            }
        }
            
        }
        else if (escolha == 4){
            sc.nextLine();
            System.out.print("Escreva o texto que deseja publicar: ");
            Texto = sc.nextLine();

            Ptxt.Pub_Texto(Texto);

            while (S_or_N != 2){
                System.out.print("\nVocê deseja comentar a publicação? \n Digite: \n 1 - sim \n 2 - não \n: ");
                S_or_N = sc.nextInt();
    
                if (S_or_N == 1){
    
                    sc.nextLine();
                    System.out.print("Comente a publicação: ");
                    Texto = sc.nextLine();
    
                    com.comentar(Texto);  
                }
                else{
                    
                }
            }

            
        }
        else if (escolha == 5){
            sc.nextLine();
            System.out.print("Informe os patrocinadores: ");
            Patrocinio = sc.nextLine();

            
            System.out.print("Informe o público alvo da propaganda: ");
            Publico_Alvo = sc.nextLine();

            P_prop.Pub_Prop(Patrocinio, Publico_Alvo);

            while (S_or_N != 2){
                System.out.print("\nVocê deseja comentar a publicação? \n Digite: \n 1 - sim \n 2 - não \n: ");
                S_or_N = sc.nextInt();
    
                if (S_or_N == 1){
    
                    sc.nextLine();
                    System.out.print("Comente a publicação: ");
                    Texto = sc.nextLine();
    
                    com.comentar(Texto);  
                }
                else{
    
                }
            }
            
        
            }
        else if (escolha == 6){
            sc.nextLine();
            System.out.print("Comente a publicação: ");
            Texto = sc.nextLine();
    
            com.comentar(Texto);  
            
        
            }
        else if (escolha == 7){
            sc.nextLine();
            System.out.print("Qual o nome do contato? ");
            nome = sc.nextLine();

            System.out.print("Escreva a mensagem para o usuário: ");
            Texto = sc.nextLine();

            MSG.msg(nome, Texto);
            
        
            }
        else if (escolha == 8){
            sc.nextLine();
            System.out.print("Qual o nome do contato que deseja ligar? ");
            nome = sc.nextLine();

            lg.ligacao(nome);
        
            }
        else if (escolha == 9){
            sc.nextLine();
            System.out.print("Qual o nome do contato? ");
            nome = sc.nextLine();
            
            System.out.print("Informe o URI da foto que deseja enviar: ");
            URI = sc.nextLine();

            ft.foto(nome, URI);
            
            }
         else if (escolha == 10){
            sc.nextLine();
            System.out.print("Qual o nome do contato? ");
            nome = sc.nextLine();

            System.out.print("Informe o link do vídeo que deseja enviar: ");
            link = sc.nextLine();

            vd.video(nome, link);
    
            }
        else if (escolha == 11){
            System.exit(0);
        
            }

        

       
        



    }
}
}
