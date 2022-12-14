public class chamadas extends chat{
   private int qntd_participantes;
   private String nome_contato;

    

   @Override
   public void ligacao(String nome){

    setNome_contato(nome);
    System.out.print("\nVocê ligou para "+getNome_contato()+"\n");


   }

    public String getNome_contato() {
        return this.nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public int getQntd_participantes() {
        return this.qntd_participantes;
    }

    public void setQntd_participantes(int qntd_participantes) {
        this.qntd_participantes = qntd_participantes;
    }
    
}
