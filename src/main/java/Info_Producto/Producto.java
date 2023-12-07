package Info_Producto;

public class Producto {
    private String código;
    private String nombre;
    private float precio;

    public Producto() {
        código = "00";
        nombre = "producto 0";
        precio = 0;
    }

    public Producto(String código, String nombre, float precio) {
        this.código = código;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String código, String nombre) {
        this.código = código;
        this.nombre = nombre;
        precio = 10;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Producto(Producto other) {
        this.código = other.código;
        this.nombre = other.nombre;
        this.precio = other.precio;
    }
}
