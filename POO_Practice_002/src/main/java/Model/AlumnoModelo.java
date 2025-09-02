/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Camila
 */
public class AlumnoModelo {
    //Atributo
    private Alumno[] alumnos; //Array
    private int cantidadActual;
    
    
    //Constructor
    public AlumnoModelo(){
        this.alumnos = new Alumno[10];
        this.cantidadActual = 0;
    }
    
    public void agregarAlumno(Alumno alumno){
        
        if(cantidadActual <= 10){
            this.alumnos[cantidadActual] = alumno;
            this.alumnos[cantidadActual].setEstado("HABILITADO");
            this.cantidadActual++;
        }
    }
    
    public Alumno[] obtenerListaDeAlumnos(){
        Alumno[] nuevaListaAlumnos =new Alumno [cantidadActual];
        for( int i=0; i< cantidadActual; i++){
            nuevaListaAlumnos[i] = alumnos[i];
        }
        return nuevaListaAlumnos;
    }
    
    public Alumno[] obtenerListaDeAlumnosHabilitados(){
        Alumno[] nuevaListaAlumnos =new Alumno [cantidadActual];
        for( int i=0; i< cantidadActual; i++){
            if(alumnos[i].getEstado().contentEquals("HABILITADO")){
                nuevaListaAlumnos[i] = alumnos[i];
            }
        }
        return nuevaListaAlumnos;
    }
        
    public Alumno[] obtenerListaDeAlumnosDeshabilitados(){
        Alumno[] nuevaListaAlumnos =new Alumno [cantidadActual];
        for( int i=0; i< cantidadActual; i++){
            if(alumnos[i].getEstado().contentEquals("DESHABILITADO")){
                nuevaListaAlumnos[i] = alumnos[i];
            }
        }
        return nuevaListaAlumnos;
    }
    
    public boolean deshabilitarAlumno(int codAlumno){
        boolean deshabilitado = false;
        for (int i = 0; i < cantidadActual; i++) {
            if(alumnos[i].getCodigo()== codAlumno){
                alumnos[i].setEstado("DESHABILITADO");
                deshabilitado = true;
                return deshabilitado;
            }
        }
        return deshabilitado;
    }
    
    public boolean habilitarAlumno(int codAlumno){
        boolean deshabilitado = false;
        for (int i = 0; i < cantidadActual; i++) {
            if(alumnos[i].getCodigo()== codAlumno){
                alumnos[i].setEstado("HABILITADO");
                deshabilitado = true;
                return deshabilitado;
            }
        }
        return deshabilitado;
    }
    
    public Alumno obtenerCodigoDeAlumno(int codAlumno){
        
        for (int i = 0; i < cantidadActual; i++) {
            if(alumnos[i].getCodigo()== codAlumno){
                return alumnos[i];
            }
        }
        return null;
    }
    
    public void eliminarAlumno(int codigo){
        for ( int i=0; i<cantidadActual; i++){
            if (alumnos[i].getCodigo() == codigo){
                
                for(int j = i; j < cantidadActual-1; j++){
                    alumnos[j] = alumnos[j+1];
                }
                alumnos[cantidadActual] = null;
                cantidadActual--;
            }
        }
        
    }
    
}
