    
package bibliotecavirtual;

import java.util.ArrayList;
import java.util.Iterator;

public class GuardarDatos {
    private ArrayList<Clibro> libros;
    private Clibro datos;

    public GuardarDatos() {
    }

    public GuardarDatos(ArrayList<Clibro> libros, Clibro datos) {
        this.libros = libros;
        this.datos = datos;
    }

    public ArrayList<Clibro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Clibro> libros) {
        this.libros = libros;
    }

    public Clibro getDatos() {
        return datos;
    }

    public void setDatos(Clibro datos) {
        this.datos = datos;
    }
    
    public boolean validarLibro(String libro, String info){
        Iterator<Clibro> i = libros.iterator();
        boolean encontrado = false;
        while(i.hasNext()&&(encontrado==false)){
            Clibro l = i.next();
            if((l.getTitulo().compareTo(libro)==0)&&(l.getISBN().compareTo(info)==0)){
                encontrado = true;
                this.setDatos(l);
            }
        }
        return encontrado;
    }
    
}
