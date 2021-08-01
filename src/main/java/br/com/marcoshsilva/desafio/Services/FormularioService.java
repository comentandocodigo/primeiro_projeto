package br.com.marcoshsilva.desafio.Services;

import br.com.marcoshsilva.desafio.Entity.FormularioEntity;
import br.com.marcoshsilva.desafio.Repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository repository;

    public List<FormularioEntity> findAll() {
        return (List<FormularioEntity>) repository.findAll();
    }

    @Transactional( rollbackFor = Exception.class )
    public FormularioEntity save( FormularioEntity formulario ) {
        return repository.save(formulario);
    }

    @Transactional( rollbackFor = Exception.class )
    public FormularioEntity update( FormularioEntity formulario, Integer id ) {
        formulario.setId(id);
        return repository.save(formulario);
    }

    public FormularioEntity findById( Integer id ) {
        return repository.findById(id).get();
    }
}