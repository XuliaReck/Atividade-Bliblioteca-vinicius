package net.weg.GestaoBiblioteca.Service;

import lombok.AllArgsConstructor;
import net.weg.GestaoBiblioteca.Model.Livro;
import net.weg.GestaoBiblioteca.Repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bruna Júlia Reckziegel
 * @version 1.0
 * @since 20/02/2025
 */
@Service
@AllArgsConstructor
public class LivroService {
    private LivroRepository repository;

    /**
     * "Busca varios livros"
     * @return "Retorna uma lista de livros cadastrados"
     */
    public List<Livro> buscarLivros(){
     return repository.findAll();
    }

    /**
     *
     * @param livro "É NECESSARIOA ENVIAR UM LIVRO COMO PARAMETRO"
     * @return "Retorna a criação de um livro"
     */
    public Livro criarLivro(Livro livro){
        return repository.save(livro);
    }

    /**
     *
     * @param id "É NECESSARIOA ENVIAR ID COMO PARAMETRO"
     * @return "retorna o livro encontrado"
     */
    public Livro buscarUmLivro(Integer id){return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Livro não encontrado"));}

    /**
     *
     * @param id "É NECESSARIOA ENVIAR UM ID COMO PARAMETRO"
     */
    public void deleteLivro(Integer id){ repository.deleteById(id);}

}