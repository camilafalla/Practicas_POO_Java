/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Camila
 */
public class Curso {
    //Atributos
    private int codigo;
    private String nombre;
    private String docente;
    private int creditos;
    private String descripcion;
    private String estado;
    
    //Constructor
    public Curso(){
        
    }
    
    public Curso(int codigo, String nombre, String docente, int creditos, String descripcion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.docente = docente; 
        this.creditos = creditos; 
        this.descripcion = descripcion;
    }
    
    //Métodos
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDocente(){
        return docente;
    }
    
    public void setDocente(String docente){
        this.docente=docente;
    }
    
    public int getCreditos(){
        return creditos;
    }
    
    public void setCreditos(int creditos){
        this.creditos=creditos;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    public String getEstado(){
        return estado;
    }
    
    public void setEstado (String estado){
        this.estado=estado;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
}
