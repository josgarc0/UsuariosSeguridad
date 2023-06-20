package pe.edu.utp.wsusuariosutp.repository;

import pe.edu.utp.wsusuariosutp.entity.Usuario;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	List<Usuario> 	findByEmailContaining(String email, Pageable page);
	public Optional<Usuario> findByEmail(String email);

}
