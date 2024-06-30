package Modelo;

public class Productos {
    private int id;
    private String codigo;
    private String nombre;
    private int proveedor;
    private String proveedorPro;
    private int stock;
    private double precio;
    private double precioConIgv; // Nuevo campo para precio con IGV

    private static final double IGV_RATE = 0.18; // Tasa del IGV (18%)

    public Productos() {}

    public Productos(int id, String codigo, String nombre, int proveedor, String proveedorPro, int stock, double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.proveedorPro = proveedorPro;
        this.stock = stock;
        this.precio = precio;
        this.precioConIgv = calcularPrecioConIgv(precio);
    }

    private double calcularPrecioConIgv(double precio) {
        return precio * (1 + IGV_RATE);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public String getProveedorPro() {
        return proveedorPro;
    }

    public void setProveedorPro(String proveedorPro) {
        this.proveedorPro = proveedorPro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        this.precioConIgv = calcularPrecioConIgv(precio); // Actualizar precio con IGV al cambiar el precio base
    }

    public double getPrecioConIgv() {
        return precioConIgv;
    }

    public void setPrecioConIgv(double precioConIgv) {
        this.precioConIgv = precioConIgv;
    }
}
