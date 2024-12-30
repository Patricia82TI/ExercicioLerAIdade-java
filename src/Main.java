import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler um número indeterminado de dados, contendo cada um,
//a idade de um inidvíduo. O último dado, que não entrará nos cãlculos,
//contém um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
//indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a mensagem
//"Impossível calcular"
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;

        while(idade >= 0){
            soma = soma + idade;
            cont = cont + 1;
            idade = sc.nextInt();
        }

        if(cont > 0){
            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        }else{
            System.out.println("impossivel calcular");
        }
    }
}