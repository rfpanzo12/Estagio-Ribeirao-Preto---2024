import java.util.Scanner;

public class Main {
    public static int fib(int n){ //Função recursiva para o cálculo dos valores da sequencia de Fibonacci
        if(n == 1) return 0;
        else if(n == 2) return 1;
        else if(n > 2) return fib(n - 1) + fib(n - 2);
        else return -1;
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor_sequencia, n=1, valor=12;
        boolean flag=true;
        System.out.print("Informe o valor a ser verificado: ");
        valor = ler.nextInt();
        
        while(flag){
            valor_sequencia = fib(n);
            if(valor == valor_sequencia){ // Valor pertence a sequencia
                System.out.println("O valor informado pertence a sequencia.\n");
                flag = false;
            }
            
            else if(valor < valor_sequencia){ // Valor não pertence a sequencia
                System.out.println("O valor informado nao pertence a sequencia.\n");
                flag = false;
            }
            
            n++;
        }
        
    }
}
