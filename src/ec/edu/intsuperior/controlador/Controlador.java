/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;
import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Loggin;
import ec.edu.intsuperior.vista.PFrDocente;
import ec.edu.intsuperior.vista.PFrEstudiante;
/**
 *
 * @author DELL
 */
public class Controlador {
    Administrador administrador= new Administrador(this);
    Loggin loggin=new Loggin(this);
    PFrDocente frDocente= new  PFrDocente(this);
    PFrEstudiante frEstudiante= new PFrEstudiante(this);
    
    public void showFrEstudiante(){
        frEstudiante.setSize(1000,1000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(frEstudiante);
        frEstudiante.setVisible(true);
        administrador.escritorio.revalidate();
        frEstudiante.repaint();
    }
    public void showFrDocente(){
         frDocente.setSize(1000,1000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(frDocente);
        frDocente.setVisible(true);
        administrador.escritorio.revalidate();
        frDocente.repaint();
    }
    
    public void showLoggin(){
        loggin.setVisible(true);
    }
    public void showAdministrador(){
        administrador.setVisible(true);
        
        
        
    }
}
