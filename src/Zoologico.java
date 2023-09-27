
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoologico {

    List<Animais> jaulas = new ArrayList<>();
    Scanner sca = new Scanner(System.in);

    public List<Animais> inserindoAnimais() {

        for (int i = 1; i < 10; i++) {
            System.out.println("Jaula #" + i);
            System.out.println("Qual o nome do animal?");
            String nome = sca.next();
            System.out.println("Qual a idade dele?");
            int idade = sca.nextInt();

            System.out.println("Que animal ele é?\n1.Cachorro\n2.Cavalo\n3.Preguiça");
            int animalTipo = sca.nextInt();

            switch (animalTipo) {
                case 1:
                    jaulas.add(new Cachorro(nome, idade));
                    break;
                case 2:
                    jaulas.add(new Cavalo(nome, idade));
                    break;
                case 3:
                    jaulas.add(new Cachorro(nome, idade));
                    break;
            }

        }

        return jaulas;
    }

    public void exibirJaula() {
        for (Animais animais : jaulas) {

          
            System.out.println("Jaula de um "+animais.getClass()+"\nNome: " + animais.getNome() +"\nidade: "+animais.getIdade()+"\n"+animais.acaoDoAnimal() );
             Veterinario.examinar(animais);
             System.out.println("\n------------------------------------------------------------------------\n");
             
        }
        

    }
}