package net.weg.GestaoBiblioteca.Repository;

import net.weg.GestaoBiblioteca.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
