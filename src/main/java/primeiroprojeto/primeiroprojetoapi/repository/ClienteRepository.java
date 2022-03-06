package primeiroprojeto.primeiroprojetoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import primeiroprojeto.primeiroprojetoapi.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	//JPA já implementa os principais metodos
	
}
