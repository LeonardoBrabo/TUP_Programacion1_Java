public class Libro {
    private String isbn;
    private  String titulo;
    private String autor;
    private int numeroPaginas;


    //constructores
    //alt+insert
    public static final String NO_TITULO = "NO TITULO";
    public static final String NO_AUTOR = "Sin Autor";

    public static final int NO_PAGINAS = 0;
    public Libro(String isbn) {
        this.isbn = isbn;
        titulo = NO_TITULO;
        autor = NO_AUTOR;
        numeroPaginas = NO_PAGINAS;
    }

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        autor = NO_AUTOR;
        numeroPaginas = NO_PAGINAS;
    }

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        numeroPaginas = NO_PAGINAS;
    }

    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    //Métodos:

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "El libro con ISBN "+isbn+" creado por el autor "+autor+" tiene "+numeroPaginas+" páginas";
    }
}
