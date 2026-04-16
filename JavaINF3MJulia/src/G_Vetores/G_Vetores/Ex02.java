package G_Vetores;

import D_Tratamento_de_erros.Operador;

public class Ex02 {
    public static void main (String args[]){
        byte vetor[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Operador opera = new Operador();
        
        System.out.println("Digite 10 numeros: ");
        
        for(byte i = 0; i < 10; i++){
            System.out.print(">");
            vetor[i] = opera.receberByte((byte) -255,(byte) 267);
        }
        
        System.out.print("\nVETOR CONSTRUIDO: \n");
        
        for(byte i = 0; i < 10; i++){
            System.out.println("Indice: " + i + ". Valor: " + vetor[i]);
        }
    }
}
