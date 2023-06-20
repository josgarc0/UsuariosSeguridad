package pe.edu.utp.wsusuariosutp.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pe.edu.utp.wsusuariosutp.entity.Usuario;
import pe.edu.utp.wsusuariosutp.repository.UsuarioRepository;

@Service
public class SecurityUserDetailsService implements UserDetailsService{
	private final UsuarioRepository usuarioRepository;

    public SecurityUserDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        var user = this.usuarioRepository.findByEmail(username);

        if(user.isPresent()){

        }

        throw new UsernameNotFoundException("User not found: " + username);
    }
}
