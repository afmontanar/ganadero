/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activosfijos;

import java.awt.Image;

/**
 *
 * @author jonathan
 */
public class Imagen {
    Image imagen;
    String nombre1;

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre1 = nombre;
    }

    public Image getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre1;
    }
}
