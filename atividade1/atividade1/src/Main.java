import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        String opcao = "S";
        do{
            System.out.println("Digite o nome do pessoa: ");
            String nome = sc.nextLine();
            System.out.println("Digite a idade do pessoa: ");
            int idade = sc.nextInt();
            System.out.println("Digite o sexo do pessoa: [M/F] ");
            String sexo = sc.next();
            sc.nextLine();
            Pessoa p = new Pessoa(nome, idade, sexo);
            pessoas.add(p);
            System.out.println("Deseja cadastrar uma nova pessoa? [S/N]");
            opcao = sc.nextLine();
        }while (opcao.equalsIgnoreCase("S"));

        for(Pessoa p : pessoas){
            System.out.println(p.getNome());
            System.out.println(p.getIdade());
            System.out.println(p.getSexo());
        }
    }
}
