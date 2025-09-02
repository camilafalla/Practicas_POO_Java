/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unjfsc.poo_practice_002;
import Controller.ControladorAlumnoCurso;
import Model.*;
import View.VistaAlumnoCurso;
/**
 *
 * @author Camila
 */
public class POO_Practice_002 {

    public static void main(String[] args) {
        
        //Models
        AlumnoModelo alumnoModelo = new AlumnoModelo();
        CursoModelo cursoModelo = new CursoModelo();
        InscripcionModelo inscripcionModelo = new InscripcionModelo();
        
        //View
        VistaAlumnoCurso vista = new VistaAlumnoCurso();
        
        //Controller
        ControladorAlumnoCurso control = new ControladorAlumnoCurso(alumnoModelo, cursoModelo, inscripcionModelo, vista);
        control.ejecutar();
    }
}
