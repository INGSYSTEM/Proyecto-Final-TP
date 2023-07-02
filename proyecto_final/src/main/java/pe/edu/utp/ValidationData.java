package pe.edu.utp;

/**
 * @author Juan Bladimir Romero Collazos
 */

public class ValidationData
{
    // Constructores (Autor: Juan Bladimir Romero Collazos)

    public ValidationData() {
    }

    /**
     * Este constructor nos permite almacenar la data
     * @param id
     * @param fechaUTC
     * @param horaUTC
     * @param latitud
     * @param longitud
     * @param profundidad
     * @param magnitud
     * @param fechaCorte
     */

    public ValidationData(long id, String fechaUTC, String horaUTC, double latitud, double longitud,
                          int profundidad, double magnitud, String fechaCorte) {
        this.id = id;
        this.fechaUTC = fechaUTC;
        this.horaUTC = horaUTC;
        this.latitud = latitud;
        this.longitud = longitud;
        this.profundidad = profundidad;
        this.magnitud = magnitud;
        this.fechaCorte = fechaCorte;
    }
    // Getters y Setters (Autor: Juan Bladimir Romero Collazos)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFechaUTC() {
        return fechaUTC;
    }

    public void setFechaUTC(String fechaUTC) {
        this.fechaUTC = fechaUTC;
    }

    public String getHoraUTC() {
        return horaUTC;
    }

    public void setHoraUTC(String horaUTC) {
        this.horaUTC = horaUTC;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public double getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(double magnitud) {
        this.magnitud = magnitud;
    }

    public String getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(String fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    // toString (Autor: Juan Bladimir Romero Collazos)

    /**
     * Proporciona una representación personalizada de sus objetos como una cadena de caracteres,
     * que incluye información específica de las variables de instancia del objeto. Esto es útil
     * cuando se desea obtener una representación legible del objeto para su visualización o depuración.
     * @return
     */

    @Override
    public String toString() {
        return "ValidationData{" +
                "id=" + id +
                ", fechaUTC='" + fechaUTC + '\'' +
                ", horaUTC='" + horaUTC + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", profundidad=" + profundidad +
                ", magnitud=" + magnitud +
                ", fechaCorte='" + fechaCorte + '\'' +
                '}';
    }

    // Declaración de variables (Autor: Juan Bladimir Romero Collazos)
    private long id;
    private String fechaUTC;
    private String horaUTC;
    private double latitud;
    private double longitud;
    private int profundidad;
    private double magnitud;
    private String fechaCorte;
}
