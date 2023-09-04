/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author u10092957137
 */
public class ListaUsuarios {
    public static void main(String[] args) {
        List<Usuarios> lista = new ArrayList();
        Usuarios usuarios = new Usuarios();
        usuarios.setIdUsuarios(1);
        usuarios.setNome("Joao");
        usuarios.setApelido("Jl");
        
        lista.add( usuarios);
        lista.add(new Usuarios(2, "jose" , "jj"));
         Collections.<Usuarios>sort(lista);
         for (Usuarios usuarios1 : lista) {
             System.out.println(usuarios1.getNome());
            
        }
    }
    
}
