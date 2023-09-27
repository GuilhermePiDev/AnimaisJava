public class Preguica extends Animais {


    Preguica(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String emitirSom(){
        return "Hmmmmm";
    }

    @Override
    public String acaoDoAnimal() {
        return "A preguiça subiu a arvore";
    }
    
}
