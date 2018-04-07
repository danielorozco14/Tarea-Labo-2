/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabodos;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617 at uca.edu.sv>
 */
public class Proveedor {

    private String NomProveedor;
    private String ApellProveedor;
    private int TelProveedor;

    // GETTERS CLASE PROVEEDOR
    public String getNomProveedor() {
        return NomProveedor;
    }

    public String getApellProveedor() {
        return ApellProveedor;
    }

    public int getTelProveedor() {
        return TelProveedor;
    }

    //SETTERS CLASE PROVEEDOR
    public void setNomProveedor(String NomProveedor) {
        this.NomProveedor = NomProveedor;
    }

    public void setApellProveedor(String ApellProveedor) {
        this.ApellProveedor = ApellProveedor;
    }

    public void setTelProveedor(int TelProveedor) {
        this.TelProveedor = TelProveedor;
    }

    // CONSTRUCTOR CUSTOM CLASE PROVEEDOR 
    public Proveedor(String NomProveedor, String ApeProveedor, int TelProveedor) {
        this.NomProveedor = NomProveedor;
        this.ApellProveedor = ApeProveedor;
        this.TelProveedor = TelProveedor;
    }

}
