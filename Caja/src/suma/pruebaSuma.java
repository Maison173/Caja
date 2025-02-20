
package suma;

public class pruebaSuma {
       public static void main(String args[]){
           Suma objeto1=new Suma();
           int resultado = objeto1 . sumar (3, 2,6);
           System.out.println("volumen:"+ resultado);
           
                    Suma objeto2 =new Suma(3,2,6);
           System.out.println("volumen:"+objeto2.sumar());
       }
}
