package net.weg.GestaoBiblioteca.Repository;

import net.weg.GestaoBiblioteca.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
