package org.cce.sistema.model;
// Generated 24/06/2020 10:23:40 AM by Hibernate Tools 5.3.15.Final



/**
 * Codigo generated by hbm2java
 */
public class Codigo  implements java.io.Serializable {


     private Integer idCodigo;
     private Integer codigoPostal;
     private String colonia;

    public Codigo() {
    }

    public Codigo(Integer codigoPostal, String colonia) {
       this.codigoPostal = codigoPostal;
       this.colonia = colonia;
    }
   
    public Integer getIdCodigo() {
        return this.idCodigo;
    }
    
    public void setIdCodigo(Integer idCodigo) {
        this.idCodigo = idCodigo;
    }
    public Integer getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }




}


