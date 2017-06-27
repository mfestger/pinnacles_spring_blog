package com.codeup.svcs;

import com.codeup.models.User;
import com.codeup.repositories.Roles;
import com.codeup.repositories.UsersRepository;
import com.codeup.svcs.UserWithRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customUserDetailsService")
public class UserDetailsLoader implements UserDetailsService {
    private final UsersRepository userRepo;
    private final Roles roles;

    @Autowired
    public UserDetailsLoader(UsersRepository userRepo, Roles roles) {
        this.userRepo = userRepo;
        this.roles = roles;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("No user found for " + username);
        }

        List<String> userRoles = roles.ofUserWith(username);
        return new UserWithRoles(user, userRoles);
    }
}