/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Camila
 */
public class Inscripcion {
    //Atributos
    private int codigo;
    private Alumno alumno;
    private Curso curso;
    private String fecha;
    private String estado; //Completado - Cancelado
    
    //Constructores
    public Inscripcion(){
        
    }
    
    public Inscripcion(int codigo, Alumno alumno,Curso curso, String  fecha, String estado){
        this.codigo=codigo;
        this.alumno=alumno;
        this.curso=curso;
        this.fecha=fecha;
        this.estado=estado;
        
    }
    
    //metodos
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public Alumno getAlumno(){
        return alumno;
    }
    
    public void setAlumno(Alumno alumno){
        this.alumno=alumno;
    }
    
    public Curso getCurso(){
        return curso;
    }
    
    public void setCurso(Curso curso){
        this.curso=curso;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
      
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
}
