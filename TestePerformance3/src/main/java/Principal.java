import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero = lerEntrada();
        boolean sePar = retornarNumeroPar(numero);

        if (sePar) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
        public static int lerEntrada(){
            Scanner sc = new Scanner(System.in);
            int entrada;
            try{
                System.out.println("Digite um número inteiro: ");
                entrada =sc.nextInt();
            }catch(Exception e){
                System.out.println("Erro: Digite um número inteiro");
                sc.next();
                return lerEntrada();
            }
            return entrada;
        }

        public static boolean retornarNumeroPar(int numero){ return numero % 2 == 0;}

}
