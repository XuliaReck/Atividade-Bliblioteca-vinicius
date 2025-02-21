package net.weg.GestaoBiblioteca.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import net.weg.GestaoBiblioteca.Model.Livro;
import net.weg.GestaoBiblioteca.Service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
@AllArgsConstructor
public class LivroController {

    private LivroService service;

    @Operation(description = "Metodo Para Listar Livros")
    @ApiResponses(value = {
            @ApiResponse (responseCode = "200", description = "sucesso"),
            @ApiResponse (responseCode = "400", description = "erro cliente"),
            @ApiResponse (responseCode = "500", description = "erro servidor")
    })
    @GetMapping
    public List<Livro> LivroControler(){
        return service.buscarLivros();
    }


    @Operation(description = "Metodo Para Postar Livros")
    @ApiResponses(value = {
            @ApiResponse (responseCode = "200", description = "sucesso"),
            @ApiResponse (responseCode = "400", description = "erro cliente"),
            @ApiResponse (responseCode = "500", description = "erro servidor")
    })
    @PostMapping
    public Livro criarLivro(@RequestBody Livro livro){
        return service.criarLivro(livro);
    }



    @Operation(description = "Metodo Para Buscar Livros")
    @ApiResponses(value = {
            @ApiResponse (responseCode = "200", description = "sucesso"),
            @ApiResponse (responseCode = "400", description = "erro cliente"),
            @ApiResponse (responseCode = "500", description = "erro servidor")
    })
    @GetMapping("/{id}")
    public Livro buscarumLivro(@PathVariable Integer id){
        return service.buscarUmLivro(id);
    }

    @Operation(description = "Metodo Para Deletar Livros")
    @ApiResponses(value = {
            @ApiResponse (responseCode = "200", description = "sucesso"),
            @ApiResponse (responseCode = "400", description = "erro cliente"),
            @ApiResponse (responseCode = "500", description = "erro servidor")
    })
    @DeleteMapping("/{id}")
    public void deltarLivro(@PathVariable Integer id){
        service.deleteLivro(id);
    }
}
