package mx.edu.tecdesoftware.market_backend_2026_3_a.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categorias")
    private Integer id_categoria;

    @Column(name = "codigo_barras")
    private Integer codigos_barras;

    @Column(name = "precio_venta")
    private Integer prercio_venta;

    @Column(name = "cantidad_stock")
    private Integer cantidad_stock;

    private boolean estado;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Integer getCodigos_barras() {
        return codigos_barras;
    }

    public void setCodigos_barras(Integer codigos_barras) {
        this.codigos_barras = codigos_barras;
    }

    public Integer getPrercio_venta() {
        return prercio_venta;
    }

    public void setPrercio_venta(Integer prercio_venta) {
        this.prercio_venta = prercio_venta;
    }

    public Integer getCantidad_stock() {
        return cantidad_stock;
    }

    public void setCantidad_stock(Integer cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
