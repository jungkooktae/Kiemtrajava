package org.samsung.ktra.services;

import org.samsung.ktra.configuration.CustomUserDetails;
import org.samsung.ktra.repositories.UserRepository;
import org.samsung.ktra.repositories.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //1.
        //Call our repository to work with db
        User user = userRepository.findByUsername(username);
        if(user==null)
            throw new UsernameNotFoundException(username);
            //2. return custom user details
        else return new CustomUserDetails(user);
    }

    public void createUser(User newUser)
    {
        userRepository.save(newUser);
    }

    public User getUserByUserName(String username)
    {
        return userRepository.findByUsername(username);
    }
}
