
public class Personagem {

    private int nivel;
    private String nome;
    private String habilidade;

    public Personagem() {
        this.nivel = 1;
        this.nome = "";
        this.habilidade = "";
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}