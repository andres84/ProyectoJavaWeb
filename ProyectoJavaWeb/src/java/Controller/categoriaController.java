/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Ejb.CategoriaFacadeLocal;
import Modelo.Categoria;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class categoriaController implements Serializable{
    
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    @PostConstruct
    public void init(){
        
        categoria = new Categoria();
        
    }
    
    public void registrar(){
        
        try {
            
            categoriaEJB.create(categoria);
            
        } catch (Exception e) {
        }
        
    }
    
    
}
