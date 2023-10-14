package com.controller;

import com.modelo.Prenda;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Controller {

    List<Prenda> catalogoprenda = new ArrayList<>();
    Prenda prenda = new Prenda();
    private List<Prenda> listadecompras = new ArrayList<>();
    
    public Controller() {
    }

    public Prenda agregarAlCatalogo() {
        catalogoprenda.add(prenda);
        return prenda = new Prenda();

    }
    
    public void venderPrenda(Prenda prenda) {
    if (prenda == null) {
        FacesUtil.addInfoMessage("La prenda es nula, no se puede vender.");
        
        return;
    }

    if (prenda.getCantidad() > 0) {
        int cantidad = prenda.getCantidad() - 1;
        prenda.setCantidad(cantidad);

        getListadecompras().add(prenda);

        if (prenda.getCantidad() == 0) {
            getListadecompras().remove(prenda);
        }
    } else {
        FacesUtil.addInfoMessage("No hay suficientes existencias para vender "+ prenda.getNombre());
        
    }
}



    public List<Prenda> getListadecompras() {
        return listadecompras;
    }

    public void setListadecompras(List<Prenda> listadecompras) {
        this.listadecompras = listadecompras;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public List<Prenda> getCatalogoprenda() {
        return catalogoprenda;
    }

    public void setCatalogoprenda(List<Prenda> catalogoprenda) {
        this.catalogoprenda = catalogoprenda;
    }

}
