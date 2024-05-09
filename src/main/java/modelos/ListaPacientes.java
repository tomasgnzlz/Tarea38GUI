/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import daw.LecturaEscritura;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class ListaPacientes {

    private static List<Pacientes> listaPacientes;

    public ListaPacientes() throws IOException {
        listaPacientes = new ArrayList<>();
        listaPacientes = LecturaEscritura.lecturaFicheroJSON();
    }

    public List<Pacientes> getLista() {
        return listaPacientes;
    }

    public Pacientes getPaciente(String id) {
        System.out.println("id buscado " + id);
        // Habría que controlar que si el id no es valido, hay excepción
        return listaPacientes.stream()
                .filter(p -> String.valueOf(p.getId_paciente()).equalsIgnoreCase(id))
                .findFirst()
                .get();

    }
}
