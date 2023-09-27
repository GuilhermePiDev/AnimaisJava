public class Cachorro extends Animais {

    Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String emitirSom(){
        return "AU AU AU!!";
    }

    @Override
    public String acaoDoAnimal(){
        return "O cachorro correu!";
    }
    
}
