package org.example;

import org.example.Modelo.Contacto;
import org.example.Servicio.Agenda;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Agregar contactos
        agenda.agregarContacto("Mario", 123456789, "mariolocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Link", 987654321, "linklocal@gmail.com", "1986-02-21");
        agenda.agregarContacto("Zelda", 987654321, "zeldalocal@gmail.com", "1986-02-21");
        agenda.agregarContacto("Peach", 987654321, "peachlocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Bowser", 987654321, "bowserlocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Luigi", 987654321, "luigillcal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Toad", 987654321, "toadlocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Yoshi", 987654321, "yoshilocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Donkey Kong", 987654321, "donkeylocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Diddy Kong", 987654321, "diddylocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Dixie Kong", 987654321, "dixielocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Wario", 987654321, "wariolocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Waluigi", 987654321, "waluigilocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Rosalina", 987654321, "rosalinalocal@gmail.com", "1985-09-13");
        agenda.agregarContacto("Toadette", 987654321, "toadettelocal@gmail.com", "1985-09-13");


        // Mostrar contactos
        System.out.println("Contactos en la agenda:");
        agenda.mostrarContactos();

        // Buscar un contacto
        System.out.println("\nBuscando el contacto de Link:");
        Contacto contacto = agenda.buscarContacto("Link");
        if (contacto != null) {
            System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Eliminar un contacto
        System.out.println("\nEliminando el contacto de Peach.");
        agenda.eliminarContacto("Peach");

        // Mostrar contactos después de la eliminación
        System.out.println("Contactos en la agenda después de eliminar a Alice:");
        agenda.mostrarContactos();
    }
}