package school.sptech.avaliacaocontinuada1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.avaliacaocontinuada1.Domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> { }
