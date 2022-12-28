package TipoOrdenacion;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Ordenación_Selección {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[IngresoCantidad()];
        ingresoDatos(a);
        MostrarArrayInicial(a);
        ordSeleccion(a);
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
    
    public static void ordSeleccion (int a[]){
	int indiceMenor, i, j, n;
	n = a.length;	
	for (i = 0; i < n-1; i++){
            // comienzo de la exploración en índice i
            indiceMenor = i;
            // j explora la sublista a[i+1]..a[n-1]
            for (j = i+1; j < n; j++){
	 	if (a[j] < a[indiceMenor]){
                    indiceMenor = j;
                    // sitúa el elemento mas pequeño en a[i]
                    if (i != indiceMenor){
	 	 	intercambiar(a, i, indiceMenor);
                    }
                }
            }
	}
    }
    
    public static void intercambiar(int []a, int i, int j){
	int aux = a[i];
	a[i] = a[j];
	a[j]= aux ;
    }
    
}
