public class Cavalo extends Animais {

    Cavalo(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
       return "iiirrrrí, rilinchin";
    }
    
    @Override
    public String acaoDoAnimal() {
        return "O cavalo correu";
    }
    
}
