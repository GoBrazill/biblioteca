package biblioteca.com.services;

import biblioteca.com.DTOs.CarteiraBibliotecaDTO;
import biblioteca.com.entities.CarteiraBiblioteca;
import biblioteca.com.entities.Usuario;
import biblioteca.com.repositories.CarteiraBibliotecaRepository;

public class CarteiraBibliotecaService {

    private final CarteiraBibliotecaRepository carteiraBibliotecaRepository;


    public CarteiraBibliotecaService(CarteiraBibliotecaRepository carteiraBibliotecaRepository) {
        this.carteiraBibliotecaRepository = carteiraBibliotecaRepository;
    }

    public CarteiraBibliotecaDTO criarCarteiraBiblioteca(CarteiraBibliotecaDTO dto, Usuario usuario) {
        CarteiraBiblioteca carteiraBiblioteca = new CarteiraBiblioteca(dto.getDataEmissao(), dto.isValid());
        carteiraBiblioteca.setUsuario(usuario);
        carteiraBibliotecaRepository.save(carteiraBiblioteca);

        CarteiraBibliotecaDTO carteiraBibliotecaDto = new CarteiraBibliotecaDTO(carteiraBiblioteca.getDataEmissao(), carteiraBiblioteca.isValid());

        return carteiraBibliotecaDto;
    }
}
