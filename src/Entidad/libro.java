
package Entidad;

/**
 *
 * @author Usuario
 */
public class libro {
    
    public String titulo;
    public String isbm;
    public String autor;
    public int paginas;

    public libro() {
    }

    public libro(String titulo, String isbm, String autor, int paginas) {
        this.titulo = titulo;
        this.isbm = isbm;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbm() {
        return isbm;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
    
    
    @Override
    public String toString() {
        return "libro{" + "titulo=" + titulo + ", isbm=" + isbm + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
    
}
