/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionestudiantes;

/**
 *
 * @author dylan
 */
public class SistemaGestionEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("C5L225", "Dylan");
        
        System.out.println(estudiante.mostrarInformacion());
    }
    
}
