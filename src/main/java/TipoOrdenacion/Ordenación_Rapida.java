package TipoOrdenacion;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Ordenación_Rapida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[IngresoCantidad()];
        ingresoDatos(a);  
        MostrarArrayInicial(a);
        quicksort(a);
        MostrarArrayFinal(a);
    }
    
    public static int IngresoCantidad(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la CANTIDAD : ");
        int cantidad = sc.nextInt();
        return cantidad;
    }
    
    public static void ingresoDatos(int a[]){
        for(int i=0; i < a.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el dato "+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
    }
    
    public static void MostrarArrayInicial(int a[]){
        System.out.println("Array INICIAL");
        for(int i=0; i < a.length; i++){
            System.out.println("dato ["+i+"] es : "+a[i]);
        }
    }
    
    public static void MostrarArrayFinal(int a[]){
        System.out.println("Array FINAL");
        for(int i=0; i < a.length; i++){
            System.out.println("dato ["+i+"] es : "+a[i]);
        }
    }
    
    public static void quicksort(int a[]){
	quicksort(a, 0, a.length-1);
    }
    
    public static void quicksort(int a[], int primero, int ultimo){
	int i, j, central;
	double pivote;
	central = (primero + ultimo)/2;
	pivote = a[central];
	i = primero;
	j = ultimo;
	do {
            while (a[i] < pivote) i++;
            while (a[j] > pivote) j--;
            if (i <= j){
	 	intercambiar(a, i, j);
	 	i++;
	 	j--;
            }
	}while (i <= j);
	if (primero < j){
            quicksort(a, primero, j); // mismo proceso con sublista izqda
        }
        
        if (i < ultimo){
            quicksort(a, i, ultimo); // mismo proceso con sublista drcha
        }
    }
    
    public static void intercambiar(int []a, int i, int j){
	int aux = a[i];
	a[i] = a[j];
	a[j]= aux ;
    }
}
