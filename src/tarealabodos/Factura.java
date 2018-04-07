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
public class Factura {

    private String NomProduct;
    private int CantProducto;
    private double PrecioProducto;

    //GETTERS CLASE FACTURA
    public String getNomProduct() {
        return NomProduct;
    }

    public int getCantProducto() {
        return CantProducto;
    }

    public double getPrecioProducto() {
        return PrecioProducto;
    }
    
    //SETTERS CLASE FACTURA
    public void setNomProduct(String NomProduct) {
        this.NomProduct = NomProduct;
    }

    public void setCantProducto(int CantProducto) {
        this.CantProducto = CantProducto;
    }

    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    // CONSTRUCTOR COSTUM CLASE FACTURA 
    public Factura(String nombreProducto, int cantidadProducto, double precioProducto) {
        this.NomProduct = nombreProducto;
        this.CantProducto = cantidadProducto;
        this.PrecioProducto = precioProducto;
    }

}
