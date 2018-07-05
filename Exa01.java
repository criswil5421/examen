
public class Exa01{
    public static void main(String[] args){
        int numero[]= {5,10,12,32,34,50,56,56,78};
        System.out.println("la media es:"+promedio(numero));
        System.out.println("la mediana es:"+mediana(numero));
        System.out.println("la moda es:"+moda(numero));


    }
    public static int moda ( int numero[] ) {
    int frecTemp, frecModa = 0, mod = -1; 
    numero = ordernarVector ( numero, 0 );

    for (int i = 0; i < numero.length; i++ ) {
      frecTemp = 1; 
      for (int j = i + 1; j < numero.length; j++ ) {
        if ( numero [ i ] == numero [ j ] )
          frecTemp++;
      }
      if ( frecTemp > frecModa ) {
        frecModa = frecTemp;
        mod = numero [ i ];
      }
    }
    return mod;
  }
 
    public static int mediana ( int numero[]) {

    int pos = 0;
    int a = 0, b = 0;    
    numero = ordernarVector ( numero, 0 );
    a = numero.length / 2;
    if ( numero.length % 2 == 0 ) {
      pos = (int)a;      
      b = (int)(numero [ pos ] / numero [ pos + 1 ]);
    }
    if ( numero.length % 2 == 1 ) {
      pos = (int)(a + 0.5);
      b = (int)(numero [ pos ]);  
    }

    return b;
  }
     
    public static double promedio(int numero[]){
        double suma=0, promedio=0;
        for(int i=0;i<numero.length;i++)
        {
            suma +=numero[i];
        }
        promedio=suma/numero.length;
        return promedio;
    }   
    public static int [ ] ordernarVector ( int numero[], int ord ) {

    int aux = 0;
    
    for (int i = 0; i < numero.length - 1; i++ )
      for (int j = i + 1; j < numero.length; j++ )
        if ( ord == 0 )
          if ( numero [ i ] > numero [ j ] ) {
            aux = numero [ j ];
            numero [ j ] = numero [ i ];
            numero [ i ] = aux;
          }
        else if ( ord == 1 )
          if ( numero [ i ] < numero [ j ] ) {
            aux = numero [ i ];
            numero [ i ] = numero [ j ];
            numero [ j ] = aux;
          }

    return numero;
  }
}