package TipoOrdenacion;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Ordenación_Inserción {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[IngresoCantidad()];
        ingresoDatos(a);
        MostrarArrayInicial(a);
        ordInsercion(a);
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
    
    public static void ordInsercion (int [] a){
	int i, j;
	int aux;
	for (i = 1; i < a.length; i++){
            /*	 indice j es para explorar la sublista a[i-1]..a[0] buscando la
            posicion correcta del elemento destino*/
            j = i;
            aux = a[i];	
            // se localiza el punto de inserción explorando hacia abajo
            while (j > 0 && aux < a[j-1]){
	 	// desplazar elementos hacia arriba para hacer espacio
	 	a[j] = a[j-1];
	 	j--;
            }
            a[j] = aux;
	 }
    }
    
}
