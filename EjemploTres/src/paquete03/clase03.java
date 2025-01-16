/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author abraham
 */
import org.apache.commons.lang3.math.NumberUtils;



void method() {
        
     }
      

void method() {
        
     }
     
public class clase03 {

    /*Dado el siguiente arreglo
```
String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
```

Obtener como resultado un arreglo con las siguientes características:

```
int[] dataFinal = {100, 90, 0, 10, 0, 0};
```
Presentar dataFinal
     */
    public static void main(String[] args) {
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int[] dataFinal = new int[dataInicial.length];
        for (int i = 0; i < dataInicial.length; i++) {
            dataFinal[i] = NumberUtils.toInt(dataInicial[i], 0);



        }
for (int i = 0 ; i  <dataFinal.length;i++){
    System.out.printf("%d\n",dataFinal[i]);
}
    }
}
