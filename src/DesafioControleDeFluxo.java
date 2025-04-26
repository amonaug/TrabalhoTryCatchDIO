import com.sun.tools.javac.Main;

import java.util.Scanner;

public class DesafioControleDeFluxo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número número: ");
        int num2 = scanner.nextInt();


        try{
            contar(num1, num2);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

    static void contar(int p1, int p2) throws ParametroInvalidosException{
        ParametroInvalidosException.validar(p1, p2);
        int contagem = p1 - p2;

        for(int i = 0; i < contagem; i++){
            System.out.println(i+1);
        }
    }
}
