package catolica.edu.sv.api_farmacia.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import catolica.edu.sv.api_farmacia.entities.ProveedorProductoEntity;


import java.util.List;
@RestController
@RequestMapping("/process")
public class ProveedorProductoController {

    @Autowired
    private catolica.edu.sv.api_farmacia.service.IProveedorProducto IProveedorProducto;


    @Transactional(readOnly = true)
    @GetMapping("/proveedorProductos")
    public List<ProveedorProductoEntity> getProveedorProductos() {
        return IProveedorProducto.findAll();
    }

    @Transactional
    @PostMapping("/proveedoreProductos")
    public ProveedorProductoEntity saveProveedoresProductos(@RequestBody ProveedorProductoEntity proveedorproductos) {
        return IProveedorProducto.save(proveedorproductos);
    }
}
