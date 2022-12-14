public class Publicacao_foto extends Pessoa{
    private String URI;
    private String Formato;
    

    @Override
    public void Pub_Foto(String URI, String Formato){

        setURI(URI);
        System.out.print("\n \nO URI da foto é: "+ getURI());
        setFormato(Formato);
        System.out.print("\nO formato da foto é: "+ getFormato());

        System.out.print("\nPublicação feita\n");


    }

    

    public String getURI() {
        return this.URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public String getFormato() {
        return this.Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

}
