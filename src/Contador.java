import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        try {
            if (parametroUm < parametroDois){
                System.out.println("Realizando a quantidade de instruções de " + parametroUm + " até " + parametroDois);
            }

            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("ERROR! O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contador = 1;
        for(parametroUm = parametroUm; parametroUm < parametroDois; parametroUm ++){
            System.out.println(contador + "° número: " + parametroUm);
            contador ++;
        }
    }
}
