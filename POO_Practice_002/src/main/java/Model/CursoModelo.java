/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Camila
 */
public class CursoModelo {
    //Atributo
    private Curso[] cursos; 
    private int cantidadCursos;
    
    public CursoModelo(){
        this.cursos = new Curso[10];
        this.cantidadCursos = 0;
                
    }
    
    public void agregarCurso(Curso curso){
        if (cantidadCursos <= 10){
            this.cursos[cantidadCursos] = curso;
            this.cursos[cantidadCursos].setEstado("ACTIVADO");
            this.cantidadCursos++;
        }
    }
    
    public Curso[] obtenerListaDeCursos(){
        
        Curso[] nuevaListaCurso = new Curso[cantidadCursos]; 
        for (int i = 0; i < cantidadCursos; i++) {
            nuevaListaCurso[i] = cursos[i];
        }
        return nuevaListaCurso;
    }
    
    public boolean ActivarCurso(int codCurso){
        boolean activar=false;
        for(int i=0; i<cantidadCursos; i++){
            if(cursos[i].getCodigo()==codCurso){
                cursos[i].setEstado("ACTIVADO");
                activar=true;
                return activar;
            }
        }
        return activar;
    }
    
    public Curso[] obtenerListaCursosActivados(){
        Curso[] newListaCursos= new Curso[cantidadCursos];
        for( int i=0; i< cantidadCursos; i++){
            if(cursos[i].getEstado().contentEquals("ACTIVADO")){
                newListaCursos [i] = cursos[i];
            }
        }
        return newListaCursos;
    }
    
    public boolean desactivarCurso(int codCurso){
        boolean desactivar=false;
        for(int i=0; i<cantidadCursos; i++){
            if(cursos[i].getCodigo()==codCurso){
                cursos[i].setEstado("DESACTIVADO");
                desactivar=true;
                return desactivar;
            }
        }
        return desactivar;
    }
    
    public Curso[] obtenerListaCursosDesactivados(){
        Curso[] newListaCursos =new Curso [cantidadCursos];
        for( int i=0; i< cantidadCursos; i++){
            if(cursos[i].getEstado().contentEquals("DESACTIVADO")){
                newListaCursos[i] = cursos[i];
            }
        }
        return newListaCursos;
    }
    
    
    public Curso obtenerCursoPorCodigo(int codCurso){
        for (int i = 0; i < cantidadCursos; i++) {
            if(cursos[i].getCodigo() == codCurso){
                return cursos[i];
            }
        }
        
        return null;
    }
    
    public void eliminarCurso(int codigo){
        for ( int i=0; i <cantidadCursos ; i++){
            if ( cursos[i].getCodigo() == codigo){
                for( int j =i; j <cantidadCursos-1; j++){
                    cursos[j] = cursos[j+1];
                }
                cursos[cantidadCursos]= null;
                cantidadCursos--;
            }
        }
    }
}
