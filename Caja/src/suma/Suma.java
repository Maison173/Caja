
package suma;

public class Suma {
    //Atributos
    int a;
    int b;
    int c;
    //Constructor vacio
    Suma (){}
    //Constructor con dos argumentos
   // Suma (int arg1, int arg2){
   //a= arg1;
   //b= arg2;}
      Suma (int a, int b, int c){

 this.a=a;
 this.b=b;
 this.c=c;
}
    //metodos
    int sumar (int a, int b, int c){
    return a*b*c;
  }
    //Este metodo toma los artributos de la clase
    int sumar (){
    return a*b*c;
    }
}
 //return a*b*c;