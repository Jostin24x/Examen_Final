package TipoOrdenacion;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Ordenación_Shell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[IngresoCantidad()];
        ingresoDatos(a);
        MostrarArrayInicial(a);
        ordenacionShell(a);
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
    
    public static void ordenacionShell(int a[]){
	int intervalo, i, j, k;
	int n= a.length;
	intervalo = n / 2;
	while (intervalo > 0){
            for (i = intervalo; i < n; i++){
                j = i - intervalo;
	 	while (j >= 0){
                    k = j + intervalo;
                    if (a[j] <= a[k]){
                        j = -1; // par de elementos ordenado
                    }else{
	 	 	intercambiar(a, j, j+1);
	 	 	j -= intervalo;
                    }
	 	}
            }
            intervalo = intervalo / 2;
	}
    }
    
    public static void intercambiar(int []a, int i, int j){
	int aux = a[i];
	a[i] = a[j];
	a[j]= aux ;
    }
    
}
