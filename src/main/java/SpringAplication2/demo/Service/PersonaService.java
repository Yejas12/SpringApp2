package SpringAplication2.demo.Service;

import SpringAplication2.demo.InterfaceService.IPersonaService;
import SpringAplication2.demo.Model.Persona;
import SpringAplication2.demo.Repository.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona repository;

    @Override
    public List<Persona> listar() {
        return repository.findAll();
    }
}
