package catolica.edu.sv.api_farmacia.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "venta")

public class VentaEntity {

    @Id
    @Column(columnDefinition = "INT", name = "IdVenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;

    @ManyToOne
    @JoinColumn(name = "IdCliente", referencedColumnName = "IdCliente", foreignKey = @ForeignKey(name = "fk_venta_cliente"))
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado", foreignKey = @ForeignKey(name = "fk_venta_empleado"))
    private EmpleadoEntity empleado;

    @Column(columnDefinition = "DATE")
    private Date fecha_venta;

}
