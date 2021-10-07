package net.ivanvega.fragmentosdinamicos;

import java.util.Vector;

public class Libro {

    static Vector<Libro> libros = new Vector<Libro>();
    static{
        final String link1 =
                "https://cf-media.sndcdn.com/ttl4D3sfzY34.128.mp3?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiKjovL2NmLW1lZGlhLnNuZGNkbi5jb20vdHRsNEQzc2Z6WTM0LjEyOC5tcDMqIiwiQ29uZGl0aW9uIjp7IkRhdGVMZXNzVGhhbiI6eyJBV1M6RXBvY2hUaW1lIjoxNjMzNjMyMjg4fX19XX0_&Signature=cseoBJs-wnbihJ~75ZsQAK2fdAuDTwMPa3uhZ9edi7JJ1Og6MckOB-6zDZihnu~~ObM0Nx4wMirgmUbslZvIKlRM3mexdxGTR88nFRppCSWwLO6DNtTCvGxy8LFU~GldRQMFcTWnQg7uL77Q0gigfTwKfFBWiVgDArckKpyLNdwCWdhHhG4nIZv~SXNx-GpBLzf7owuuzkDmFC~05x-oep4K4OHzGs9KrJO2LzJklwzGtdUJKIWviK0HCZjtU3atMV7DgwByEtLesKfcjE2YBW6ORsMoCyOx8~Y2KxeTP6qnMmCAQYsvTC~DiIr6g92ERIRETCWrodwPBjXoFr14aw__&Key-Pair-Id=APKAI6TU7MMXM5DG6EPQ";


        libros.add(new Libro("Kappa", "Akutagawa", R.drawable.kappa, link1, Libro.G_S_XIX, false, true));
        libros.add(new Libro("Avecilla", "Alas Clarín, Leopoldo", R.drawable.avecilla, link1, Libro.G_S_XIX, true, false));
        libros.add(new Libro("Divina Comedia", "Dante", R.drawable.divina_comedia, link1, Libro.G_EPICO, false, true));
        libros.add(new Libro("Viejo Pancho, El", "Alonso y Trelles, José", R.drawable.viejo_pancho, link1, Libro.G_S_XIX, true, true));
        libros.add(new Libro("Canción de Rolando", "Anónimo", R.drawable.cancion_rolando, link1, Libro.G_EPICO, false, true));
        libros.add(new Libro("Matrimonio de sabuesos", "Agata Christie", R.drawable.matrim_sabuesos, link1, Libro.G_SUSPENSE, true, false));
        libros.add(new Libro("La iliada", "Homero", R.drawable.la_iliada, link1, Libro.G_EPICO, true, false));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRecursoImagen() {
        return recursoImagen;
    }

    public void setRecursoImagen(int recursoImagen) {
        this.recursoImagen = recursoImagen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Libro( String titulo, String autor,
                  int recursoImagen, String url,
                  String genero,Boolean novedad, Boolean leido) {
        this.novedad = novedad;
        this.leido = leido;
        this.titulo = titulo;
        this.autor = autor;
        this.recursoImagen = recursoImagen;
        this.url = url;
        this.genero = genero;
    }

    public static Vector<Libro> ejemplosLibros(){
        return libros;
    }

    public Boolean getNovedad() {
        return novedad;
    }

    public void setNovedad(Boolean novedad) {
        this.novedad = novedad;
    }

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    private Boolean novedad; // Es una novedad
    private Boolean leido;

    // Leído por el usuario
    public final static String G_TODOS = "Todos los géneros";
    public final static String G_EPICO = "Poema épico";
    public final static String G_S_XIX = "Literatura siglo XIX";
    public final static String G_SUSPENSE = "Suspense";

    private String titulo;
    private String autor;
    private int recursoImagen;
    private String url;
    private String genero;





}
