public class comentarios extends Pessoa{
    private String texto;

    @Override
    public void comentar(String Texto){

        setTexto(Texto);
        System.out.print("\nO seu comentário da publicação é: "+ getTexto());

        System.out.print("\nComentário feito\n");




    }



    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
