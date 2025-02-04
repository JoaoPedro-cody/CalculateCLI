package app;

import entities.Agenda;
import entities.Contato;

import java.util.Scanner;

public class Contatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        char opi;

        try {
            do {
                System.out.println("1 - Adicionar Contato ");
                System.out.println("2 - Remover contato ");
                System.out.println("3 - Buscar Contato ");
                System.out.println("4 - Exibir Contatos");
                System.out.print("Opção: ");
                Integer op = sc.nextInt();

                switch (op){
                    case 1: {
                        System.out.print("Id: ");
                        int id = sc.nextInt();
                        System.out.print("Nome: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.print("Numero: ");
                        Long number = sc.nextLong();

                        agenda.adicionarContato(new Contato(id, name, number));
                        break;
                    }
                    case 2: {
                        System.out.print("Digite o id: ");
                        int id = sc.nextInt();
                        System.out.println(agenda.buscarContato(id) + "Removido");
                        agenda.removeContato(id);
                        break;
                    }
                    case 3: {
                        System.out.print("Digite o id: ");
                        int n = sc.nextInt();
                        System.out.println(agenda.buscarContato(n));
                        break;
                    }
                    case 4: {
                        agenda.exibirContatos();
                        break;
                    }
                }

                System.out.print("Finalizar o programa? (s/n)");
                opi = sc.next().charAt(0);

            } while (opi != 's');

            System.out.println("Programa Finalizado");
        }catch (RuntimeException e){
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }

        sc.close();
    }
}
