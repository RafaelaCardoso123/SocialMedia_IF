public abstract class Pessoa {

   private String Nome;
   private int idade;
   private String email;
   private String Biografia;
   private String genero;


   public abstract void controleIdade(int valor);

   public abstract void cadastrar(String nome, String email, String genero);

   public abstract void logar(String nome, String email);

   public abstract void Pub_Foto(String URI, String Formato);

   public abstract void Pub_Texto(String Texto);

   public abstract void Pub_Prop(String patrocinio, String Publico_Alvo);

   public abstract void comentar(String Texto);

   




    public String getNome() {
        return this.Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBiografia() {
        return this.Biografia;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}