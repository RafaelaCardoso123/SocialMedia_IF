public class videos extends chat{
    private String nome_contato;
    private String link;

    @Override
    public void video(String nome, String link){
        
        setNome_contato(nome);
        System.out.print("\n \nO nome do contato é: "+getNome_contato());
        setLink(link);
        System.out.print("\nO link do video é: "+getLink()+"\n");

    }


    
    public String getNome_contato() {
        return this.nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
