package net.weg.GestaoBiblioteca.Service;

import lombok.AllArgsConstructor;
import net.weg.GestaoBiblioteca.Model.Livro;
import net.weg.GestaoBiblioteca.Model.Usuario;
import net.weg.GestaoBiblioteca.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class UsuarioService {

    private UsuarioRepository repository;

    public List<Usuario> buscarUsuario(){
        return repository.findAll();
    }

    public Usuario criarUsuario(Usuario usuario){
        return repository.save(usuario);
    }

    public Usuario buscarUmusuario(Integer id){return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));}

    public void deleteUsuario(Integer id){ repository.deleteById(id);}

}
