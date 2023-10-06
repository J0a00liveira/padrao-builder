public class PersonagemBuilder {

    private Personagem personagem;

    public PersonagemBuilder() {
        personagem = new Personagem();
    }

    public Personagem build() {
        if (personagem.getNivel() == 0) {
            throw new IllegalArgumentException("Nivel inválido");
        }
        if (personagem.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (personagem.getHabilidade().equals("")) {
            throw new IllegalArgumentException("Habilidade inválida");
        }
        return personagem;
    }

    public PersonagemBuilder setNivel(int nivel) {
        personagem.setNivel(nivel);
        return this;
    }

    public PersonagemBuilder setNome(String nome) {
        personagem.setNome(nome);
        return this;
    }

    public PersonagemBuilder setHabilidade(String habilidade) {
        personagem.setHabilidade(habilidade);
        return this;
    }

}