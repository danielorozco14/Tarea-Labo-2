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
public class TareaLaboDos {

    public static void main(String[] args) {
        // INSTANCIA DE PRODUCTO
        Producto producto = new Producto("Sardina Marimar", "FG349H", 1.75);
        // INSTANCIA PROVEEDOR 
        Proveedor proveedor = new Proveedor("Daniel", "Orozco", 78231490);
        // INSTANCIA FACTURA 
        Factura factura = new Factura("Sardina Marimar", 35, 1.75);
        
    }

}
