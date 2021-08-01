package br.com.marcoshsilva.desafio.Repository;

import br.com.marcoshsilva.desafio.Entity.FormularioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends CrudRepository<FormularioEntity, Integer> {
}
