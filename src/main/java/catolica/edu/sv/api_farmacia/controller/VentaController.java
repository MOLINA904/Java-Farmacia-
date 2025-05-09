package catolica.edu.sv.api_farmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import catolica.edu.sv.api_farmacia.entities.VentaEntity;
import catolica.edu.sv.api_farmacia.service.IVenta;

import java.util.List;

@RestController
@RequestMapping("/process")
public class VentaController {

    @Autowired
    private IVenta iVenta;

    @Transactional(readOnly = true)
    @GetMapping("/ventas")
    public List<VentaEntity> getVentas() {
        return iVenta.findAll();
    }

    //post
    @Transactional
    @PostMapping("/ventas")
    public VentaEntity saveVenta(@RequestBody VentaEntity venta) {
        return iVenta.save(venta);
    }
}
