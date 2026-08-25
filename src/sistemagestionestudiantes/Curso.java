/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionestudiantes;

/**
 *
 * @author dylan
 */
public class Curso {
    private String nombre;
    private String siglas;

    public Curso(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSiglas() {
        return siglas;
    }
    
    public String mostrarInformacionCurso(){
        return siglas + "-" + nombre;
    }
}
