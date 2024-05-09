/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import modelos.Pacientes;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class LecturaEscritura {

    public static void main(String[] args) throws IOException {
        List<Pacientes> lista = new ArrayList<>();
        lista = lecturaFicheroJSON();
        lista.forEach(System.out::println);

    }

    public final static String NOMBRE_FICHERO = "donantes.json";

    // Método que lee el fichero json y lo guarda en una lista
    public static List<Pacientes> lecturaFicheroJSON() throws IOException {
        List<Pacientes> lista = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        lista = mapeador.readValue(new File(NOMBRE_FICHERO),
                mapeador.getTypeFactory()
                        .constructCollectionType(List.class, Pacientes.class));
         return lista;
    }
}
