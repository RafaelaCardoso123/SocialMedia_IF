public class Usuario extends Pessoa {
    
    @Override
    public void controleIdade(int valor){
        if (valor < 18){

            System.out.println("\nMenor de idade! Não pode usar a rede social");
            
            setIdade(valor);

        



        }
        else
        {
            System.out.println("\nMaior de idade! pode usar a Rede social");


        }

    }


    @Override
    public void cadastrar(String nome, String email, String genero){

        setNome(nome);
        System.out.println("\nSeu nome é: "+ getNome());
        setEmail(email);
        System.out.println("Seu e-mail é: "+ getEmail());
        setGenero(genero);
        System.out.println("Seu gênero é: "+ getGenero()+"\n");

    }

    @Override
    public void logar(String nome, String email){

        setNome(nome);
        System.out.println("\nSeu nome é: "+ getNome());
        setEmail(email);
        System.out.println("Seu e-mail é: "+ getEmail());

    }





}
