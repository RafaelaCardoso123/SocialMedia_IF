public class Publi_Propaganda extends Pessoa{
   private String Patrocinio;
   private String Publico_Alvo;

   @Override
   public void Pub_Prop(String patrocinio, String Publico_Alvo){

    setPatrocinio(patrocinio);
    System.out.print("\nOs patrocinadores são: "+ getPatrocinio());
    setPublico_Alvo(Publico_Alvo);
    System.out.print("\nO público alvo  é: "+ getPublico_Alvo());

    System.out.print("\nPublicação feita\n");

   }
   



    public String getPublico_Alvo() {
        return this.Publico_Alvo;
    }

    public void setPublico_Alvo(String Publico_Alvo) {
        this.Publico_Alvo = Publico_Alvo;
    }

    public String getPatrocinio() {
        return this.Patrocinio;
    }

    public void setPatrocinio(String Patrocinio) {
        this.Patrocinio = Patrocinio;
    }

}