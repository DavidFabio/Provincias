package aplicacion;

import dominio.*;

public class Principal {
    public static void main(String[] args) {
        // Crear localidades
        Localidad l1 = new Localidad("Localidad1", 1000);
        Localidad l2 = new Localidad("Localidad2", 2000);

        // Crear municipio y agregar localidades
        Municipio municipio = new Municipio("Municipio1");
        municipio.agregarLocalidad(l1);
        municipio.agregarLocalidad(l2);

        // Crear provincia y agregar municipio
        Provincia provincia = new Provincia("Provincia1");
        provincia.agregarMunicipio(municipio);

        // Mostrar resultados
        System.out.println(l1);
        System.out.println(municipio);
        System.out.println(provincia);
    }
}
