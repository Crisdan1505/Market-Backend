package mx.edu.tecdesoftware.market_backend_2026_3_a.persistence;

import mx.edu.tecdesoftware.market_backend_2026_3_a.persistence.crud.ProductoCrudRepository;
import mx.edu.tecdesoftware.market_backend_2026_3_a.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;
    //SELEC * FORM productos
    public List<Producto> getndAll() {
        //Se "Castear"bde interablr a la lista
        return (List<Producto>)  productoCrudRepository.findAll();
    }
}
