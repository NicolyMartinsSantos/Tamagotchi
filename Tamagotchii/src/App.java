import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Tamagotchi pet = new Tamagotchi("Marye", "Felina", 8); 
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
                    pet = new Tamagotchi(nome, especie, idade);
                    System.out.println("Novo Tamagotchi criado!");
                    break;

                case "f":
                    pet.alimentar();
                    break;

                case "p":
                    pet.brincar();
                    break;

                case "s":
                    pet.dormir();
                    break;

                case "w":
                    pet.acordar();
                    break;

                case "v":
                    pet.mostrarStatus();
                    break;

                case "x":
                    System.out.println("Saindo... Até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (!opcao.equals("x"));

        scanner.close();
    }

    public static void menu() {
        System.out.println("\nMenu do Tamagotchi:");
        System.out.println(" c - Criar/Recriar Tamagotchi");
        System.out.println(" f - Alimentar Tamagotchi");
        System.out.println(" p - Brincar com Tamagotchi");
        System.out.println(" s - Dormir");
        System.out.println(" w - Acordar");
        System.out.println(" v - Ver como está");
        System.out.println(" x - Sair\n");
    }
}
