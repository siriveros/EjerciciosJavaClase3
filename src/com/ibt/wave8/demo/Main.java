package com.ibt.wave8.demo;

import com.ibt.wave8.demo.negocio.Celular;
import com.ibt.wave8.demo.negocio.Persona;
import com.ibt.wave8.demo.negocio.SortUtils;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Simon", 1023934231);
        Persona persona2 = new Persona("Andres", 1026361711);
        Persona persona3 = new Persona("Sebastian", 102361311);
        Persona persona4 = new Persona("Maria", 1023789789);
        Persona persona5 = new Persona("Julian", 1231231232);
        Persona persona6 = new Persona("Mario", 1236752322);

        Persona personas[] = {persona1, persona2, persona3, persona4, persona5, persona6};

        System.out.println("====================================");
        System.out.println("Criterio de ordenamiento personas, nombre de la persona");
        SortUtils.ordenarBurbuja(personas);

        for (Persona per : personas) {
            System.out.println("---------------------------------------");
            System.out.println(per);
        }

        Celular celular1 = new Celular("3215056768",persona1);
        Celular celular2 = new Celular("3214841212",persona2);
        Celular celular3 = new Celular("3102244412",persona3);
        Celular celular4 = new Celular("3182191921",persona4);
        Celular celular5 = new Celular("3122313209",persona5);
        Celular celular6 = new Celular("3098791213",persona6);


        Celular celulares[] = {celular1,celular2,celular3,celular4,celular5,celular6};
        SortUtils.ordenarBurbuja(celulares);


        System.out.println("====================================");
        System.out.println("Criterio de ordenamiento celulares, nombre del titular");
        for (Celular cel: celulares){
            System.out.println("---------------------------------------");
            System.out.println(cel);
        }
    }
}
