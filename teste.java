
package ultimo;

import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        byte[] micaio = new byte[5] ;
        micaio = info();
        short ano;
        System.out.println("Informe o  ano:");
        ano= input.nextShort();
       
        dataHora miicaio = new dataHora(micaio[3],micaio[4],ano,micaio[0],micaio[1],micaio[2]);
        dataHora miccaio = new dataHora(micaio[3],micaio[4],ano);
        
        System.out.println(miicaio+"\n");
        System.out.println(miccaio);
    }
    
    
    
    public static byte[] info(){
        Scanner input = new Scanner(System.in);
        byte[] x = new byte[5];
        System.out.println("Informe a hora:");
        x[0] = input.nextByte();
        System.out.println("Informe os segundos:");
        x[1] = input.nextByte();
        System.out.println("Informe os minutos:");
        x[2] = input.nextByte();
        System.out.println("Informe o dia:");
        x[3] = input.nextByte();
        System.out.println("Informe o mes:");
        x[4] = input.nextByte();
        return x;  
    }

           
    
}

