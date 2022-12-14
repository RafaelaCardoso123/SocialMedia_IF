public abstract class chat {

    private int qtd_contatos;
    private int qtd_de_msg_arq;
    private String mensagem;
    private int qtd_notificacao;


    public abstract void msg(String Texto, String nome);

    public abstract void ligacao(String nome);

    public abstract void foto(String nome, String URI);

    public abstract void video(String nome, String link);



    public int getQtd_contatos() {
        return this.qtd_contatos;
    }

    public void setQtd_contatos(int qtd_contatos) {
        this.qtd_contatos = qtd_contatos;
    }

    public int getQtd_de_msg_arq() {
        return this.qtd_de_msg_arq;
    }

    public void setQtd_de_msg_arq(int qtd_de_msg_arq) {
        this.qtd_de_msg_arq = qtd_de_msg_arq;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getQtd_notificacao() {
        return this.qtd_notificacao;
    }

    public void setQtd_notificacao(int qtd_notificacao) {
        this.qtd_notificacao = qtd_notificacao;
    }
    
}
    