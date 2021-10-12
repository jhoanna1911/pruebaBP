package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import entidad.producto;

@RestController
@RequestMapping("/")
public class productoRest {
	
	public ResponseEntity<producto> getProducto(){
		producto producto = new producto();
		producto.setId(1);
		producto.setNombre("Producto 1");
		return ResponseEntity.ok(producto);
	}

@RequestMapping(value="producto", method=RequestMethod.GET)
public String producto() {
	return "Productos";
}
	
}
