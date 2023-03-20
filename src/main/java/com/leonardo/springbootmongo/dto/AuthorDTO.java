package com.leonardo.springbootmongo.dto;

import java.io.Serializable;

import com.leonardo.springbootmongo.domain.User;

public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User user) {
        id = user.getId();
        name = user.getName();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
