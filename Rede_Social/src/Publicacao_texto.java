public class Publicacao_texto extends Pessoa{
    private String texto;

    @Override
    public void Pub_Texto(String Texto){

        setTexto(Texto);
        System.out.print("\nO texto escrito é: "+ getTexto());
        

        System.out.print("\nPublicação feita\n");

    }
        

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


}