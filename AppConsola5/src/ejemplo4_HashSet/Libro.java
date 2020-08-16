package ejemplo4_HashSet;

public class Libro
{
    private String autor;
    private String titulo;
    private String ISBN;
    /**
     * @return the autor
     */
    public String getAutor()
    {
        return autor;
    }
    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    /**
     * @return the titulo
     */
    public String getTitulo()
    {
        return titulo;
    }
    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    /**
     * @return the iSBN
     */
    public String getISBN()
    {
        return ISBN;
    }
    /**
     * @param iSBN the iSBN to set
     */
    public void setISBN(String iSBN)
    {
        ISBN = iSBN;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Libro [autor=" + autor + ", titulo=" + titulo + ", ISBN=" + ISBN + "]";
    }
    public Libro(String autor, String titulo, String iSBN)
    {
        super();
        this.autor = autor;
        this.titulo = titulo;
        ISBN = iSBN;
    }
    public Libro()
    {
        super();
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (ISBN == null)
        {
            if (other.ISBN != null)
                return false;
        } else if (!ISBN.equals(other.ISBN))
            return false;
        if (autor == null)
        {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (titulo == null)
        {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }
    
    
}
