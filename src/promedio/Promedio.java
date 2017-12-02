package promedio;
import java.util.Scanner;
public class Promedio {
    double total,x2,x1;
    double notas[];
    public Promedio(int a1){
        x1=a1;
      notas=new double [a1];
    }
    public void inicializar(){
        Scanner l=new Scanner(System.in);
        System.out.println("INGRESE LAS NOTAS: ");
        for(int i=0;i<x1;i++){
        notas[i]=l.nextDouble();
        }
    }
    double sumar (){
       for (int z= 0; z<x1;z++){
       total = total + notas [z];
        }
       return total; 
    }
    double promedio(){
    x2=total/x1;    
    return x2;
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el rango de notas");
        int a=leer.nextInt();
        Promedio obj= new Promedio(a);
        obj.inicializar();
        System.out.println("=========================");
        System.out.println("RESPESTA DE LA SUMA: "+obj.sumar());
        System.out.println("=========================");
        System.out.println("EL PROMEDIO ES:"+obj.promedio());
        System.out.println("=========================");
    }
    
}
