package br.com.marcoshsilva.desafio.Controller;

import br.com.marcoshsilva.desafio.Entity.FormularioEntity;
import br.com.marcoshsilva.desafio.Services.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping( value = "/formulario")
public class FormularioController {

    @Autowired
    private FormularioService service;

    @GetMapping( value = "/todos")
    @ResponseBody
    public List<FormularioEntity> findAll() {
        return service.findAll();
    }

    @PostMapping( value = "/salvar")
    @ResponseBody
    public FormularioEntity save( @RequestBody FormularioEntity formulario ) {
        return service.save( formulario );
    }

    @PutMapping( value = "/editar/{id}")
    @ResponseBody
    public FormularioEntity update( @RequestBody  FormularioEntity formulario, @PathVariable Integer id ) {
        return service.update(formulario, id);
    }

    @GetMapping( value = "/buscar/{id}")
    @ResponseBody
    public FormularioEntity findById( @PathVariable Integer id ) {
        return service.findById( id );
    }
}
