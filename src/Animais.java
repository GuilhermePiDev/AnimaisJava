public abstract class Animais {
    private String nome; 
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    Animais(String nome,int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public abstract String emitirSom();

    public abstract String acaoDoAnimal();
}
