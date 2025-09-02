/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import View.VistaAlumnoCurso;

/**
 *
 * @author Camila
 */
public class ControladorAlumnoCurso {
    private AlumnoModelo alumnoModelo;
    private CursoModelo cursomodelo;
    private InscripcionModelo inscripcionModelo;
    
    private VistaAlumnoCurso vista;
    
    public ControladorAlumnoCurso(AlumnoModelo alumnoModelo, CursoModelo cursomodelo, InscripcionModelo inscripcionModelo, VistaAlumnoCurso vista){
        this.alumnoModelo = alumnoModelo;
        this.cursomodelo = cursomodelo;
        this.inscripcionModelo = inscripcionModelo;
        this.vista = vista;
    }
    
    public void ejecutar(){
        
        int opcion;
        
        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();
            
            switch (opcion) {
                case 1:
                    registrarInscripcionPorCodigos();
//                    registrarInscripcion();
                   break;
                    
                case 2:
                    mostrarInscripciones();
                    break;
                 
                case 3:
                    cancelarInscripcion();
                    break;
                case 4:
                    cambioNombreAlumno();
                    break;
                case 5: 
                    cambioCurso();
                    break;
                case 6: 
                    agregarCursos();
                    break;
               case 7: 
                    agregarAlumno();
                    break;  
                case 8:
                    registrarInscripcionConCodigoCurso();
                    break;
                case 9:
                    mostrarListaAlumnos();
                    break;
                case 10:
                    mostrarListaAlumnosHabilitados();
                    break;
                case 11:
                    mostrarListaAlumnosDeshabilitados();
                    break; 
                case 12:
                    deshabilitarAlumno();
                    break;
                case 13:
                    habilitarAlumno();
                    break;
                case 14: 
                    mostrarListaCurso();
                    break;
                case 15:
                    mostrarListaCursosActivados();
                    break;
                case 16:
                    mostrarListaCursosDesactivados();
                    break;
                case 17:
                    activarCurso();
                    break;
                case 18:
                    desactivarCurso();
                  
                default:
                    break;
            }

        } while(opcion !=19 );
        
        salirDelSistema();
    }
    
    
    public void agregarCursos(){
        Curso nuevoCurso = vista.ingresarCurso();
        cursomodelo.agregarCurso(nuevoCurso);
    }
    
    public void agregarAlumno(){
        Alumno nuevoAlumno =vista.ingresarAlumno();
        alumnoModelo.agregarAlumno(nuevoAlumno);
    }
    
    public void registrarInscripcionConCodigoCurso(){
        Alumno newAlumno = vista.ingresarAlumno();

        int codCurso = vista.solicitarCodigoCurso();
        Curso newCurso = cursomodelo.obtenerCursoPorCodigo(codCurso);
        
        inscripcionModelo.agregarInscripcion(newAlumno, newCurso);
    }
    
    public void registrarInscripcionPorCodigos(){
        //Curso
        int codCurso = vista.solicitarCodigoCurso();
        Curso newCurso = cursomodelo.obtenerCursoPorCodigo(codCurso);
        
        if(newCurso == null){
            vista.mostrarMensaje("No se encontro el curso con ID " + codCurso);
            return;
        }
        //Alumno
        int codAlumno=vista.solicitarCodigoAlumno();
        Alumno newAlumno =alumnoModelo.obtenerCodigoDeAlumno(codAlumno);
        if(newAlumno ==null){
            vista.mostrarMensaje(("No se encontro el alumno con ID "+codAlumno));
            return;
        }
        
        
        inscripcionModelo.agregarInscripcion(newAlumno, newCurso);
    }
    
    public void mostrarInscripciones(){ 
        vista.mostrarInscripciones(inscripcionModelo.obtenerInscripciones());
    }
    
    public void cancelarInscripcion(){
        int cod = vista.obtenerCodigoDeCancelacionInscripcion();
        boolean cancel = inscripcionModelo.cancelarInscripcion(cod);
        vista.mostrarEstadoCancelacion(cancel);
    }
    
    public void cambioNombreAlumno(){
        int cod=vista.codigoParaElCambioDeNombreAlumno();
        String nombreNuevo=vista.NuevoNombreAlumno();
        boolean cambio= inscripcionModelo.cambioNombre(cod, nombreNuevo);
        vista.mostrarVerificacionDeCambioNombreAlumno(cambio);
        
    }
    public void mostrarListaAlumnos(){
        Alumno[] listAlumnos = alumnoModelo.obtenerListaDeAlumnos();
        vista.mostrarListaAlumnos(listAlumnos);
    }
    
    public void mostrarListaAlumnosHabilitados(){
        Alumno[] listAlumnos = alumnoModelo.obtenerListaDeAlumnosHabilitados();
        vista.mostrarListaAlumnosHabilitados(listAlumnos);
    }
        
    public void mostrarListaAlumnosDeshabilitados(){
        Alumno[] listAlumnos = alumnoModelo.obtenerListaDeAlumnosDeshabilitados();
        vista.mostrarListaAlumnosDeshabilitados(listAlumnos);
        
    }
    
    public void mostrarListaCursosActivados(){
        Curso[] lisCursos=cursomodelo.obtenerListaCursosActivados();
        vista.mostrarListaCursosActivados(lisCursos);
    }
    
    public void mostrarListaCursosDesactivados(){
        Curso[] lisCursos=cursomodelo.obtenerListaCursosDesactivados();
        vista.mostrarListaCursosDesactivados(lisCursos);
    }
    public void deshabilitarAlumno(){
        int codAlumno = vista.deshabilitarAlumno();
        alumnoModelo.deshabilitarAlumno(codAlumno);
    }
    
    public void habilitarAlumno(){
        int codAlumno = vista.deshabilitarAlumno();
        alumnoModelo.habilitarAlumno(codAlumno);
    }
    
    public void activarCurso(){
        int codCurso=vista.activarCurso();
        cursomodelo.ActivarCurso(codCurso);
    }
    
     public void desactivarCurso(){
        int codCurso=vista.activarCurso();
        cursomodelo.desactivarCurso(codCurso);
    }
    
    public void mostrarListaCurso(){
        Curso[] listCurso = cursomodelo.obtenerListaDeCursos();
        vista.mostrarListaCursos(listCurso);
    }
    public void cambioCurso(){
        int codAlum=vista.codigoAlumnoCambioDeCurso();
        int codCurso=vista.codigoCursoCambio();
        String nuevoCurso=vista.nuevoCurso();
        boolean cambio=inscripcionModelo.cambioDeCurso(codAlum, codCurso, nuevoCurso);
        vista.mostraVerificacionDeCambioDeCurso(cambio);
    }
    
    
    public void salirDelSistema(){
        vista.mostrarSalidaDelSistema();
    }
    
}
