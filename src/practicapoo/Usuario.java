/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoo;

/**
 *
 * @author balalo
 */
public class Usuario {
    private String login;
    private String password;
    private int problemas_intentados;
    private int problemas_resueltos;
    private int errores;
    private double porcentaje_exito;
    
    public Usuario(String nombre, String pwd){
        this.login = nombre;
        this.password = pwd;
        this.problemas_intentados = 0;
        this.problemas_resueltos = 0;
        this.errores = 0;
        this.porcentaje_exito = 0;        
    }
    public Usuario(){
        this.login = "";
        this.password = "";
    }
}
