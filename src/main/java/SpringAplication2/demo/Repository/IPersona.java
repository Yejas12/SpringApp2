package SpringAplication2.demo.Repository;

import SpringAplication2.demo.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends JpaRepository<Persona, Integer> {


}
