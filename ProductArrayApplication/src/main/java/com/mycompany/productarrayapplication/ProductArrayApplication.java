/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productarrayapplication;

import java.util.Arrays;

/**
 *
 * @author chex
 */
public class ProductArrayApplication {
    
    	public static void main(String[] args) {
		long[] prueba = null;
                
            prueba = new long[]{1, 2, 3, 4, 5};
            System.out.println("Prueba 1: {1, 2, 3, 4, 5}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(prueba)));
           
            prueba = new long[]{};
            System.out.println("Prueba 2: {}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(prueba)));
        
            prueba = new long[]{0};
            System.out.println("Prueba 3: {0}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(prueba)));
        
            prueba = new long[]{1};
            System.out.println("Prueba 4: {1}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(prueba)));
        
            prueba = new long[]{1, 2};
            System.out.println("Prueba 5: {1,2}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(prueba)));
        
            System.out.println("Prueba 6: null  el resultado es: " + Arrays.toString(calculateProductArrayBasic(prueba)));
        
            prueba = new long[0];
            System.out.println("Prueba 7: 0  el resultado es: " + Arrays.toString(calculateProductArrayBasic(prueba)));
        
            prueba = new long[]{1, 0, 3, 0, 5};
            System.out.println("Prueba 8: {1, 0, 3, 0, 5}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(prueba)));
        
            prueba = new long[]{1, 2, 3, 0, 5};
            System.out.println("Prueba 9: {1, 2, 3, 0, 5}  el resultado es: " + Arrays.toString(calculateProductArrayBasic(prueba)));
  
           
	}
        
        public static long[] calculateProductArrayBasic(long[] input)
        {
                     if(input!=null){       
        long[] ArrayCopiaParte1 = new long[input.length];
        long[] ArrayCopiarParte2 = new long[input.length];
        
        long[] ArrayResultados =new long[input.length];
        
        for (int i=0; i<input.length;i++){
            ArrayCopiaParte1 = Arrays.copyOfRange(input, 0, i);
            ArrayCopiarParte2 = Arrays.copyOfRange(input, i+1, input.length);

            long[] ArrayUnionPartes = new long[ArrayCopiaParte1.length+ArrayCopiarParte2.length];
            System.arraycopy( ArrayCopiaParte1, 0, ArrayUnionPartes, 0, ArrayCopiaParte1.length );
            System.arraycopy( ArrayCopiarParte2, 0, ArrayUnionPartes, ArrayCopiaParte1.length, ArrayCopiarParte2.length );


            long total = Arrays.stream(ArrayUnionPartes).reduce((a, b) -> a * b).orElse(1);
            ArrayResultados[i]=total;
                }
                    return ArrayResultados ;
             }
                return null;
        }
}
