import java.util.ArrayList; 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tamagotchi> pets = new ArrayList<>();
        String opcao;

        System.out.println("Bem-vindo ao seu Tamagotchi!");
        
        do {
            menu();
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextLine().toLowerCase();

            switch (opcao) {
                case "c":
                    System.out.print("Digite o nome do Tamagotchi: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a espécie: ");
                    String especie = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = Integer.parseInt(scanner.nextLine());
                    pets.add(new Tamagotchi(nome, especie, idade));
                    System.out.println("Novo Tamagotchi criado!");
                    break;

                case "l":
                    if(pets.isEmpty()) {
                        System.out.println("Nenhum Tamagotchi criado ainda");
                    } else {
                        for (int i = 0; i < pets.size(); i++) {
                            System.out.println(i + " - " + pets.get(i).getNome());

                        }
                    }
                    break;

                case "a":
                    if(pets.isEmpty()){
                        System.out.println("Nenhum Tamagotchi disponível");
                        break;
                    }

                    System.out.println("Escolha o número do Tamagotchi:");
                    for (int i = 0; i < pets.size(); i++){
                        System.out.println(i + " - " + pets.get(i).getNome());
                    }

                    int index = Integer.parseInt(scanner.nextLine());
                    if (index < 0 || index >= pets.size()) {
                        System.out.println("Ìndice inválido");
                        break;
                    }

                    Tamagotchi pet = pets.get(index);

                    System.out.println("Escolha a ação: (f - alimentar, p - brincar, s - dormir, w - acordar, v - ver status)");
                    String acao = scanner.nextLine().toLowerCase();

                    switch (acao) {
                        case "f": pet.alimentar(); break;
                        case "p": pet.brincar(); break;
                        case "s": pet.dormir(); break;
                        case "w": pet.acordar(); break;
                        case "v": pet.mostrarStatus(); break;
                        default: System.out.println("Ação inválida "); break;
                    }
                    break;

                case "x":
                    System.out.println("Saindo...Até a próxima");
                    break;
                
                default:
                    System.out.println("Opção inválida. Tente novamente. ");
                    break;
                
                }

        } while (!opcao.equals("x"));

        scanner.close();

    }

    public static void menu() {
        System.out.println("\nMenu do Tamagotchi:");
        System.out.println(" c - Criar novo Tamagotchi");
        System.out.println(" l - Listar todos os Tamagotchis");
        System.out.println(" a - Escolher um Tamagotchi para interagir");
        System.out.println(" x - Sair\n");
    }
}
