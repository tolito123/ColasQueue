package colasqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColasQueue {

    public static void main(String[] args) {
        Queue cola = new LinkedList<>();
        Scanner seleccionar = new Scanner(System.in);
        String numero;
        cola.offer("A");
        cola.offer(2);
        cola.offer(3.6);
        cola.offer("O");
        cola.offer("U");
        
        
        
        
        for(int i=0;i <=3;i++){
        System.out.println("\n\n"+cola);
        System.out.println("Selecciona un numero para realizar una accion: \n1.- Agregar un dato. \n2.- Eliminar un dato. \n3.- Mostrar el primer valor "
                + "\n4.- Mostrar los valores que hay en la cola. \n5.- Eliminar todos los valores. \n6.- Recuperar el primer elemento de la lista"
                + "\n7.- Mostrar el ultimo elemento de una lista. \n8.- Conseguir la lista .");
        
        numero = seleccionar.nextLine();
        
        switch(numero){
            case "1":
                System.out.print("Ingrese un valor: ");
                numero = seleccionar.next();
                cola.offer(numero);
                break;
            case "2":
                cola.remove();
                System.out.print("Se ha eliminado un valor.");
                break;
            case "3":
                System.out.println("Primer valor en la cola: "+cola.peek());
                break;
            case "4":
                System.out.println("Hay "+ cola.size() + " Valores en la cola.");
                break;
            case "5":
                cola.clear();
                System.out.println("Se ha limpiado la cola."); 
            case "6":
                System.out.println(cola.element());
                System.out.println("Se ha recuperado el elemento."); break;
            case "7":
                for(i=0;i <= cola.size()+1;i++){
                cola.poll();
                }
                System.out.println("El ultimo elemento fue: "); break;
                
                        
            case "8":
                cola.addAll(cola);
                System.out.println("Se agrego otra vez la lista: "); break;
                
            
            default:
                System.out.println("no se encontro este opcion");
        }
        System.out.println(cola);
    }
    }
    
}
