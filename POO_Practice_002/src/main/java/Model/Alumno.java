/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Camila
 */
//PascalCase uso en clases
public class Alumno {

    //Atributos
    private int codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String fechaNacimiento;
    private String estado;

    //Constructores
    public Alumno() {
    }
    
    public Alumno(int codigo, String nombre, String apellido, String correo, String fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Metodos Getters y Setters
    //camelCase uso en variables y metodos
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado (String estado){
        this.estado=estado;
    }
    
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNaciemiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

}
