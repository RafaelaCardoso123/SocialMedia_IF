

public class mensagem extends chat{
    private String Texto;
    private String nome_contato;

    

    @Override 
    public void msg(String Texto, String nome){


        setNome_contato(nome);
        setMensagem(Texto);
        System.out.print("\nSua mensagem é: "+ getMensagem()+"\nVocê enviou para: "+getNome_contato()+"\n");

    }

    public String getNome_contato() {
        return this.nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public String getTexto() {
        return this.Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }



}
