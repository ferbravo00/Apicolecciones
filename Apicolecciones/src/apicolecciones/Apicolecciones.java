/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apicolecciones;

import java.lang.reflect.Array;
import java.util.*;

/**
 *
 * @author Alumno Mañana
 */
public class Apicolecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <String> semana = new ArrayList<>();
        HashSet <String> semana1 = new HashSet<>();
        HashMap <Integer,String> semana2 = new HashMap<>();
//        Iterator <String> itr= semana1.iterator();
        String dias[] = new String [7];
        
        dias[0]="LUNES";
        dias[1]="MARTES";
        dias[2]="MIERCOLES";
        dias[3]="JUEVES";
        dias[4]="VIERNES";
        dias[5]="SABADOI";
        dias[6]="DOMINGO";
        
//        semana.add("LUNES");
//        semana.add("MARTES");
//        semana.add("MIERCOLES");
//        semana.add("JUEVES");
//        semana.add("VIERNES");
//        semana.add("SABADOI");
//        semana.add("DOMINGO");
    
        for (Integer i = 0; i < dias.length; i++) {
            semana.add(dias[i]);
            semana1.add(dias[i]);
            semana2.put(i,dias[i]);
        }
        
        System.out.println(semana2);
        
//        for (Object elem: semana) {
//            System.out.println(elem);
//        }
        
        imprimir(semana1);
        imprimir(semana);
        imprimir(semana2.keySet());
        imprimir(semana2.values());
    }
    
    public static void imprimir(Collection list) {
        System.out.println("Imprimiendo con forEach");
        list.forEach(elem -> {
            System.out.println(elem);
        });
    }
    
}
