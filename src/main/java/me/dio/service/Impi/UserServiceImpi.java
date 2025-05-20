package me.dio.service.Impi;

import me.dio.service.UserService;
import me.dio.domain.model.User;
import org.springframework.stereotype.Service;
import me.dio.domain.repository.UserRepository;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpi implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("Account number already exists");
        }
        return userRepository.save(userToCreate);
    }
    
}
