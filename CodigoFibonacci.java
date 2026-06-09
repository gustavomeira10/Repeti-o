package Repeticao;
public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 1;
        
        System.out.println("Os 10 primeiros números de Fibonacci são: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(n1 + " ");
            
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }
    }
}
