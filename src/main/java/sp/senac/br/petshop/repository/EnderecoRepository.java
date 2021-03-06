package sp.senac.br.petshop.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sp.senac.br.petshop.model.Endereco;
import sp.senac.br.petshop.model.Usuario;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>
{
    @Query("SELECT e, u FROM Endereco e JOIN e.usuario u WHERE e.usuario = :u")
    Set<Endereco> buscaEnderecos(@Param("u") Usuario u);

}
