package org.cce.sistema.model;
// Generated 24/06/2020 10:23:40 AM by Hibernate Tools 5.3.15.Final



/**
 * Direccion generated by hbm2java
 */
public class Direccion  implements java.io.Serializable {


     private Integer idDireccion;
     private String calle;

    public Direccion() {
    }

    public Direccion(String calle) {
       this.calle = calle;
    }
   
    public Integer getIdDireccion() {
        return this.idDireccion;
    }
    
    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }




}


