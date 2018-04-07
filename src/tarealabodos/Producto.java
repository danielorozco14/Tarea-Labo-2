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
public class Producto {

    private String NomProduct;
    private String CodigoProducto;
    private double PrecioProducto;
    
    //GETTERS CLASE PRODUCTO
    public String getNomProduct() {
        return NomProduct;
    }

    public String getCodigoProducto() {
        return CodigoProducto;
    }

    public double getPrecioProducto() {
        return PrecioProducto;
    }
    
    //SETTERS CLASE PRODUCTO
    public void setNomProduct(String NomProduct) {
        this.NomProduct = NomProduct;
    }

    public void setCodigoProducto(String CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    // CONSTRUCTOR COSTUM CLASE PRODUCTO 
    public Producto(String NameProduct, String CodeProduct, double PriceProduct) {
        this.NomProduct = NameProduct;
        this.CodigoProducto = CodeProduct;
        this.PrecioProducto = PriceProduct;
    }

}
