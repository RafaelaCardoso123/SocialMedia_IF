public class Usuario extends Pessoa {
    
    @Override
    public void controleIdade(int valor){
        if (valor < 18){

            System.out.println("Menor de idade! Não pode usar a rede social");
            int idade = valor;
            setIdade(idade);

        



        }
        else
        {
            System.out.println("Maior de idade! pode usar a Rede social");


        }

    }


    @Override
    public void cadastrar(String nome){

        
        


        String Nome = nome;
        setNome(Nome);
        System.out.println("Seu nome é: "+ getNome());

        


    }





}
