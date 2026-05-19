package mx.edu.tecdesoftware.market_backend_2026_3_a.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "compras")
public class Compra {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idCompra")
    private Integer idCompra;

    @Column (name = "id_cliente")
    private String idCliente;

    private LocalDate fecha;

    @Column (name = "medio_pago")
    private String medioPago;

    private String comentario;
    private String estado;

    
}
