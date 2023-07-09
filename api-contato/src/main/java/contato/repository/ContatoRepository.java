package contato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import contato.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
