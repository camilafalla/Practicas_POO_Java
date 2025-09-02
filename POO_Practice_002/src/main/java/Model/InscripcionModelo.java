/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.time.LocalDate;
import java.lang.classfile.instruction.IncrementInstruction;

/**
 *
 * @author Camila
 */
public class InscripcionModelo {
    private Inscripcion[] inscripciones;
    private int cantidadIncrip;
    private int codigoAutomatico;
    
    public InscripcionModelo(){
        this.inscripciones = new Inscripcion[10];
        this.cantidadIncrip = 0; //1
        this.codigoAutomatico = 1;
    }
    
    public void agregarInscripcion(Alumno alumno, Curso curso){
        
        Inscripcion nuevaInscripcion = new Inscripcion(codigoAutomatico, 
                                                       alumno, 
                                                       curso, 
                                                       LocalDate.now().toString(),
                                                       "INSCRITO");
        if(cantidadIncrip <= 10){
            inscripciones[cantidadIncrip] = nuevaInscripcion;
            cantidadIncrip++;
            codigoAutomatico++;
        }
    }
    
    public boolean cancelarInscripcion (int codigoAlumno){
        
        boolean estado = false;
        for (int i=0; i< cantidadIncrip; i++){
            if(inscripciones[i].getAlumno().getCodigo()==codigoAlumno){
                if(inscripciones[i].getEstado().contentEquals("CANCELADO")){
                    estado = false;
                }else{
                    inscripciones[i].setEstado("CANCELADO");
                    estado = true;
                }
            }
        }
        return estado;
    }
    
    public boolean cambioNombre (int codigoAlumno, String nombreNuevo){
        boolean cambio = false;
        for ( int i=0; i<cantidadIncrip; i++){
            if (inscripciones[i].getAlumno().getCodigo() == codigoAlumno){
                inscripciones[i].getAlumno().setNombre(nombreNuevo);
                cambio=true;
            }
        }
        return cambio;
    }
    
    public boolean cambioDeCurso (int codigoAlumno,int codigoCurso, String nuevoCurso){
        boolean cambio = false;
        for ( int i=0; i<cantidadIncrip; i++){
            if(inscripciones[i].getAlumno().getCodigo()==codigoAlumno){
                if (inscripciones[i].getCurso().getCodigo()==codigoCurso){
                    inscripciones[i].getCurso().setNombre(nuevoCurso);
                    cambio=true;
                }
                
            }
            
        }
        return cambio;
    }
    
    public Inscripcion[] obtenerInscripciones(){
        Inscripcion[] listaInscripciones = new Inscripcion[cantidadIncrip];
 
        for (int i=0; i < cantidadIncrip;i++){
            listaInscripciones[i] =  inscripciones[i];
        }
        return listaInscripciones;
    }
}
