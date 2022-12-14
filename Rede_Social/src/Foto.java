

public class Foto extends chat{
    private String URI;
    private String nome_contato;


    @Override
    public void foto(String nome, String URI){

        setNome_contato(nome);
        System.out.print("\nO nome do contato é: "+getNome_contato());
        setURI(URI);
        System.out.print("\n O URI da foto é: "+getURI()+"\n");


    }

    public String getNome_contato() {
        return this.nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }
    

    public String getURI() {
        return this.URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    
    

    


}

