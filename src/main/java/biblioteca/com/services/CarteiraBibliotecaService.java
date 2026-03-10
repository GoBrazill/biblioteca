package biblioteca.com.services;

import biblioteca.com.DTOs.CarteiraBibliotecaDTO;
import biblioteca.com.entities.CarteiraBiblioteca;
import biblioteca.com.repositories.CarteiraBibliotecaRepository;

public class CarteiraBibliotecaService {

    private final CarteiraBibliotecaRepository carteiraBibliotecaRepository;


    public CarteiraBibliotecaService(CarteiraBibliotecaRepository carteiraBibliotecaRepository) {
        this.carteiraBibliotecaRepository = carteiraBibliotecaRepository;
    }

    public CarteiraBibliotecaDTO criarCarteiraBiblioteca(CarteiraBibliotecaDTO dto, long id) {
        CarteiraBiblioteca carteiraBiblioteca = new CarteiraBiblioteca(dto.getDataEmissao(), dto.isValid());
        carteiraBibliotecaRepository.save(carteiraBiblioteca);

        CarteiraBibliotecaDTO carteiraBibliotecaDto = new CarteiraBibliotecaDTO(carteiraBiblioteca.getDataEmissao(), carteiraBiblioteca.isValid());

        return carteiraBibliotecaDto;
    }
}
