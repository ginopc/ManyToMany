package main.repository;

import java.awt.geom.Area;
import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import main.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {

	@Query("SELECT g FROM Utente g INNER JOIN FETCH Competizione on g.id =:id")
	public Optional<Utente> findById (Long id);
	
}
