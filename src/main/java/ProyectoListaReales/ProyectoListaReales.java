package ProyectoListaReales;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author ACER
 */
public class ProyectoListaReales {
    
    ArrayList<Double> listaReales;
    
    public static void main(String[] args) {
        ProyectoListaReales proyectoReales = new ProyectoListaReales();
        proyectoReales.listaReales = new ArrayList();
        proyectoReales.leerOpcion();
    }
    
    public void leerOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Agregar un número");
            System.out.println("2. Buscar un número");
            System.out.println("3. Modificar un número");
            System.out.println("4. Eliminar un número");
            System.out.println("5. Insertar un número en una posición dada");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            System.out.print("Ingrese opcion (1-6 ): ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: IngresarValor();
                break;
                case 2: BuscarValor();
                break;
                case 3: ModificarValor();
                break;
                case 4: InsertarValor();
                break;
                case 5: EliminarValor();
                break;
            }
        }while(opcion!=6);
    }
    
    public void IngresarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        System.out.print("Ingrese valor: ");
        valor = entrada.nextDouble();
        listaReales.add(valor);
    }
    public void BuscarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if(indice != -1)
        System.out.println("Dato se encuentra en posicion: " + indice);
        else
        System.out.println("Dato no se encuentra");
    }
    public void ModificarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;
        System.out.print("Valor a modificar: ");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if(indice != -1){
            System.out.print("Nuevo valor: ");
            nuevoValor = entrada.nextDouble();
            listaReales.set(indice, nuevoValor);
        }
        else
        System.out.println("Dato no se encuentra");
    }
    public void InsertarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a insertar: ");
        valor = entrada.nextDouble();
        System.out.print("Posicion donde desea insertar: ");
        indice = entrada.nextInt();
        listaReales.add(indice, valor);
    }
    public void EliminarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a eliminar: ");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if(indice != -1){
            listaReales.remove(indice);
            System.out.println("Dato eliminado");
        }
        else
        System.out.println("Dato no se encuentra");
    }
    
}
