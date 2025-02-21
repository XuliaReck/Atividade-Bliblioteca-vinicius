package net.weg.GestaoBiblioteca.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import net.weg.GestaoBiblioteca.Model.Livro;
import net.weg.GestaoBiblioteca.Model.Usuario;
import net.weg.GestaoBiblioteca.Service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

        private UsuarioService service;

        @Operation(description = "Metodo Para Listar Usuario")
        @ApiResponses(value = {
                @ApiResponse(responseCode = "200", description = "sucesso"),
                @ApiResponse (responseCode = "400", description = "erro cliente"),
                @ApiResponse (responseCode = "500", description = "erro servidor")
        })
        @GetMapping
        public List<Usuario> buscarUsuario(){
                return service.buscarUsuario();
        }


        @Operation(description = "Metodo Para Postar Usuario")
        @ApiResponses(value = {
                @ApiResponse (responseCode = "200", description = "sucesso"),
                @ApiResponse (responseCode = "400", description = "erro cliente"),
                @ApiResponse (responseCode = "500", description = "erro servidor")
        })
        @PostMapping
        public Usuario criarUsuario(@RequestBody Usuario usuario){
                return service.criarUsuario(usuario);
        }


        @Operation(description = "Metodo Para Buscar Usuario")
        @ApiResponses(value = {
                @ApiResponse (responseCode = "200", description = "sucesso"),
                @ApiResponse (responseCode = "400", description = "erro cliente"),
                @ApiResponse (responseCode = "500", description = "erro servidor")
        })
        @GetMapping("/{id}")
        public Usuario buscarumUsuario(@PathVariable Integer id){
                return service.buscarUmusuario(id);
        }


        @Operation(description = "Metodo Para Deletar Usuario")
        @ApiResponses(value = {
                @ApiResponse (responseCode = "200", description = "sucesso"),
                @ApiResponse (responseCode = "400", description = "erro cliente"),
                @ApiResponse (responseCode = "500", description = "erro servidor")
        })
        @DeleteMapping("/{id}")
        public void deltarUsuario(@PathVariable Integer id){
                service.deleteUsuario(id);
        }
}
