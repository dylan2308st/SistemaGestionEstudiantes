/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionestudiantes;

/**
 *
 * @author dylan
 */
public class Estudiante {
   private String carnet;
   private String nombre;
   private String correo;

    public Estudiante(String carnet, String nombre, String correo) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
    
    
    public String mostrarInformacion(){
        
       return nombre + "-" + carnet + "-" + correo;
        
    }
}
