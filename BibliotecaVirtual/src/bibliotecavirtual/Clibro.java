
package bibliotecavirtual;

public class Clibro {
    String Titulo;
    String ISBN;
    String Editorial;
    String Autor;
    String Año;

    public Clibro(String Titulo, String ISBN, String Editorial, String Autor, String Año) {
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.Editorial = Editorial;
        this.Autor = Autor;
        this.Año = Año;
    }
    
    public Clibro(){
        
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }
    
    
}
