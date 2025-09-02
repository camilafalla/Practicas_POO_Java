/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.Alumno;
import Model.Curso;
import Model.Inscripcion;
import java.util.Scanner;
import biblioteca.LE;

/**
 *
 * @author Camila
 */
public class VistaAlumnoCurso {
    private Scanner scanner;
    
    public VistaAlumnoCurso(){
        this.scanner = new Scanner(System.in);
    }
    
    public void mostrarMenu(){
        System.out.println("------------------------------------------");
        System.out.println("-------------REGISTRO ACADEMICO---------------");
        System.out.println("-------------------------------------------");
        System.out.println("Seleccione una opción: ");
        System.out.println("1: Nueva Inscripción ");
        System.out.println("2: Mostrar inscripciones");
        System.out.println("3: Cancelar inscripción");
        System.out.println("4: Cambiar el nombre de alumno");
        System.out.println("5: Cambio de curso por alumno");
        System.out.println("6: Agregar Registro de Cursos");
        System.out.println("7: Agregar Registro de Alumnos"); 
        System.out.println("8: Nueva Inscripcion con Codigo de Curso");
        System.out.println("9: Mostrar lista de alumnos");
        System.out.println("10: Mostrar lista de alumnos habilitados");
        System.out.println("11: Mostrar lista de alumnos deshabilitados");
        System.out.println("12: Deshabilitar Alumno");
        System.out.println("13: Habilitar Alumno");
        System.out.println("14: Mostrar lista de cursos");
        
        System.out.println("15: Mostrar lista de Cursos activados");
        System.out.println("16: Mostrar lista de Cursos desactivados");
        System.out.println("17: Activar curso");
        System.out.println("18: Desactivar Curso");
        
        System.out.println("19: Salir");
    }
    
    public int leerOpcion(){
        int opcion=Integer.parseInt(scanner.nextLine());
        return opcion;
    }
    
    public Alumno ingresarAlumno(){
        System.out.println("\n Ingreso de datos del alumno: ");
        
        System.out.print("Ingrese su codigo: ");
        int codigo=Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese el nombre: ");
        String nombre= scanner.nextLine();
        
        System.out.print("Ingrese el apellido: ");
        String apellido= scanner.nextLine();
        
        System.out.print("Ingrese su correo: ");
        String correo= scanner.nextLine();
        
        System.out.print("Ingrese su fecha de nacimiento: ");
        String fechaNacimiento= scanner.nextLine();
        
        Alumno nuevoAlumno= new Alumno(codigo, nombre, apellido, correo, fechaNacimiento);
        return nuevoAlumno;
             
    }
    
    public Curso ingresarCurso(){

        try{
            System.out.println("\n Ingreso de datos del curso: ");
        
            System.out.print("Ingrese el codigo del curso: ");
            int codigo=Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el nombre del curso: ");
            String nombre= scanner.nextLine();

            System.out.print("Ingrese el docente del curso: ");
            String docente= scanner.nextLine();

            System.out.print("Ingrese los creditos del curso: ");
            String creditos= scanner.nextLine();

            System.out.print("Ingrese la descripcion del curso: ");
            String descripcion= scanner.nextLine();

            Curso nuevoCurso = new Curso(codigo, nombre, docente, codigo, descripcion);
            return nuevoCurso;
            
        }catch (Exception e){
            System.out.println("Ingrese nuevamente...");
            return null;
        }
    }
    
    public int obtenerCodigoDeCancelacionInscripcion(){

        try{
            System.out.println("=======CANCELANDO INSCRIPCION=======");
            System.out.print("Ingrese el codigo del alumno: ");
            int codigo=Integer.parseInt(scanner.nextLine());
            return codigo;
           
        }catch (Exception e){
            System.out.println("Ingrese numeros ...");
            return 0;
        }
    }
    
    public int codigoParaElCambioDeNombreAlumno (){
        try {
            System.out.println("CAMBIO DE NOMBRE DEL ALUMNO");
            System.out.println("Ingrese el codigo del alumno: ");
            int codigo=Integer.parseInt(scanner.nextLine());
            
            return codigo;
        } catch (Exception e) {
            System.out.println("Ingrese numeros ...");
            return 0;
        }
    }
    
    public String NuevoNombreAlumno(){
        try {
            System.out.println("Ingrese el nuevo nombre del alumno: ");
            String NuevoNombre=scanner.nextLine();
            return NuevoNombre;
        } catch (Exception e) {
            System.out.println("Ingrese letras...");
            return "";
        }
    }
    
    public int codigoAlumnoCambioDeCurso(){
        try {
            System.out.println("CAMBIO DE CURSO");
            System.out.println("Ingrese el codigo del alumno: ");
            int codigoAlum= Integer.parseInt(scanner.nextLine());
            
            return codigoAlum;
            
        } catch (Exception e) {
             System.out.println("Ingrese numeros ...");
            return 0;
        }
    }
    
    public void mostrarVerificacionDeCambioNombreAlumno(boolean verificacion){
        if (verificacion==true){
            System.out.println("Se cambio correctamente el nombre del alumno.");
        }else{
            System.out.println("Error.");
        }
        
    }
    
    public void mostraVerificacionDeCambioDeCurso(boolean verificacion){
         if (verificacion==true){
            System.out.println("Se cambio correctamente el curso.");
        }else{
            System.out.println("Error.");
        }
    }
    
    public int codigoCursoCambio()
    {
        try {
            System.out.println("Ingrese el codigo del curso: ");
            int codigoCuso= Integer.parseInt(scanner.nextLine());
            
            return codigoCuso;
        } catch (Exception e) {
             System.out.println("Ingrese numeros ...");
            return 0;
        }
    }
    
    public int solicitarCodigoCurso()
    {
        try {
            //System.out.println("Ingrese el codigo del curso: ");
            //int codigoCurso= Integer.parseInt(scanner.nextLine());
            //return codigoCurso;
            
            int codigoCurso = Integer.parseInt(LE.leerString("Ingrese el codigo del curso: "));
            return codigoCurso;
        } catch (Exception e) {
             System.out.println("Ingrese numeros ...");
            return 0;
        }
    }
    
     public int solicitarCodigoAlumno(){
        try {
            //System.out.println("Ingrese el codigo del alumno: ");
            //int codigoCuso= Integer.parseInt(scanner.nextLine());
            int codigoAlumno = Integer.parseInt(LE.leerString("Ingrese el codigo del alumno: "));
            return codigoAlumno;
        } catch (Exception e) {
             System.out.println("Ingrese numeros ...");
            return 0;
        }
    }
    
    public String nuevoCurso(){
        try {
            System.out.println("Ingrese el nuevo curso: ");
            String cambioCurso=scanner.nextLine();
            return cambioCurso;
            
        } catch (Exception e) {
            System.out.println("Ingrese letras...");
            return "";
        }
        
    }
    
    
    public void mostrarInscripciones(Inscripcion[] inscripciones){
        
        System.out.println("=============================================");
        System.out.println("================INSCRIPCIONES================");
        System.out.println("=============================================");
        System.out.println("\n");
        for(int i=0; i< inscripciones.length; i++){
            System.out.println("Codigo de inscripcion: "+ inscripciones[i].getCodigo()+
                                    " Nombre del alumno: "+ inscripciones[i].getAlumno().getNombre()+
                                    " Curso: "+ inscripciones[i].getCurso().getNombre()+
                                    " Fecha: "+ inscripciones[i].getFecha()+
                                    " Estado: "+ inscripciones[i].getEstado());
        }
    }
    
    public void mostrarListaAlumnos (Alumno[] listAlumnos){
        System.out.println("=============================================");
        System.out.println("==============LISTA DE ALUMNOS===============");
        System.out.println("=============================================");
        System.out.println("\n");
        
        for(int i=0; i<listAlumnos.length; i++){
            System.out.println("Codigo de alumno: "+listAlumnos[i].getCodigo()+
                                "Nombre del alumno: "+listAlumnos[i].getNombre()+
                                "Apellido del alumno: "+listAlumnos[i].getApellido()+
                                "Correo: "+listAlumnos[i].getCorreo()+
                                "Fecha de nacimiento: "+listAlumnos[i].getFechaNacimiento()+
                                "Estado: "+listAlumnos[i].getEstado());
        }
    }
    
        public void mostrarListaAlumnosDeshabilitados (Alumno[] listAlumnos){
        System.out.println("=============================================");
        System.out.println("=======LISTA DE ALUMNOS DESHABILITADOS=======");
        System.out.println("=============================================");
        System.out.println("\n");
        
        boolean lista = false;
        for(int i=0; i<listAlumnos.length; i++){
            if(listAlumnos[i]!=null){
                System.out.println("Codigo de alumno: "+listAlumnos[i].getCodigo()+
                                    "Nombre del alumno: "+listAlumnos[i].getNombre()+
                                    "Apellido del alumno: "+listAlumnos[i].getApellido()+
                                    "Correo: "+listAlumnos[i].getCorreo()+
                                    "Fecha de nacimiento: "+listAlumnos[i].getFechaNacimiento()+
                                    "Estado: "+listAlumnos[i].getEstado());
                lista = true;
            }
        }
        
        if(lista==false){
            LE.mostrarAdvertencia("No hay registros de alumnos deshabilitados");
            //System.out.println("No hay registros de alumnos deshabilitados\n");
        }
    }
        
    public void mostrarListaAlumnosHabilitados(Alumno[] listAlumnos) {
        System.out.println("=============================================");
        System.out.println("=======LISTA DE ALUMNOS HABILITADOS==========");
        System.out.println("=============================================");
        System.out.println("\n");

        boolean lista = false;
        for (int i = 0; i < listAlumnos.length; i++) {
            if (listAlumnos[i] != null) {
                System.out.println("Codigo de alumno: " + listAlumnos[i].getCodigo()
                        + "Nombre del alumno: " + listAlumnos[i].getNombre()
                        + "Apellido del alumno: " + listAlumnos[i].getApellido()
                        + "Correo: " + listAlumnos[i].getCorreo()
                        + "Fecha de nacimiento: " + listAlumnos[i].getFechaNacimiento()
                        + "Estado: " + listAlumnos[i].getEstado());
                lista = true;
            }
        }
        
        if(lista==false){
            System.out.println("No hay registros de alumnos deshabilitados\n");
        }
    }
    
    public void mostrarListaCursosActivados(Curso[] listCurso){
        System.out.println("=============================================");
        System.out.println("=======LISTA DE CURSOS ACTIVADOS==========");
        System.out.println("=============================================");
        System.out.println("\n");

        boolean lista = false;
        
        for(int i=0; i<listCurso.length;i++){
            if(listCurso[i]!= null){
                System.out.println("Codigo de curso: "+listCurso[i].getCodigo()+
                                "Nombre del curso: "+listCurso[i].getNombre()+
                                "Nombre del docente: "+listCurso[i].getDocente()+
                                "Creditos: "+listCurso[i].getCodigo()+
                                "Descripcion: "+listCurso[i].getDescripcion()+
                                "Estado: "+listCurso[i].getEstado());
                lista=true;
            }
        }
        
        if(lista==false){
            System.out.println("No hay registros de cursos activos\n");
        }
    }
    
    public void mostrarListaCursosDesactivados(Curso[] listCurso){
        System.out.println("=============================================");
        System.out.println("=======LISTA DE CURSOS DESACTIVADOS==========");
        System.out.println("=============================================");
        System.out.println("\n");

        boolean lista = false;
        for(int i=0; i<listCurso.length;i++){
            if(listCurso[i]!= null){
                System.out.println("Codigo de curso: "+listCurso[i].getCodigo()+
                                "Nombre del curso: "+listCurso[i].getNombre()+
                                "Nombre del docente: "+listCurso[i].getDocente()+
                                "Creditos: "+listCurso[i].getCodigo()+
                                "Descripcion: "+listCurso[i].getDescripcion()+
                                "Estado: "+listCurso[i].getEstado());
                lista=true;
            }
        }
        if(lista==false){
            System.out.println("No hay registros de cursos desactivados\n");
        }
    }
    
    public int deshabilitarAlumno(){
        try {
            System.out.println("Ingrese el codigo del alumno para deshabilitar: ");
            int codigoCuso= Integer.parseInt(scanner.nextLine());
            
            return codigoCuso;
        } catch (Exception e) {
             System.out.println("Ingrese numeros ...");
            return 0;
        }
    }
    
    public int habilitarAlumno(){
        try {
            System.out.println("Ingrese el codigo del alumno para habilitar: ");
            int codigoCuso= Integer.parseInt(scanner.nextLine());
            
            return codigoCuso;
        } catch (Exception e) {
             System.out.println("Ingrese numeros ...");
            return 0;
        }
    }
    
    public int activarCurso(){
        try {
            System.out.println("Ingrese el codigo del curso para activar: ");
            int codActivar=Integer.parseInt(scanner.nextLine());
            
            return codActivar;
        } catch (Exception e) {
            System.out.println("Ingrese numeros");
            return 0;
        }
    }
    
    public int desactivarCurso(){
        try {
            System.out.println("Ingrese el codigo del curso para desactivar: ");
            int codDesactivar=Integer.parseInt(scanner.nextLine());
            
            return codDesactivar;
        } catch (Exception e) {
            System.out.println("Ingrese numeros");
            return 0;
        }
    }
    
    
    
    
    public void mostrarListaCursos (Curso[] listCurso){
        System.out.println("=============================================");
        System.out.println("==============LISTA DE CURSOS================");
        System.out.println("=============================================");
        System.out.println("\n");
        for( int i=0; i<listCurso.length;i++){
            System.out.println("Codigo de curso: "+listCurso[i].getCodigo()+
                                "Nombre del curso: "+listCurso[i].getNombre()+
                                "Nombre del docente: "+listCurso[i].getDocente()+
                                "Creditos: "+listCurso[i].getCodigo()+
                                "Descripcion: "+listCurso[i].getDescripcion());
        }
    }
    
    public void mostrarEstadoCancelacion(boolean estado){  
        if(estado == true){
            System.out.print("La inscripcion fue cancelada");
        }else{
            System.out.print("No se pudo cancelar la inscripcion");
        }
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.print(mensaje+ "\n");
    }
    
    public void mostrarSalidaDelSistema(){
        System.out.println("Saliendo del sistema...");
    }
}

