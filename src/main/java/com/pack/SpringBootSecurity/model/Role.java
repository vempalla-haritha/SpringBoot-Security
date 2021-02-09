package com.pack.SpringBootSecurity.model;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
	@Id
    @Column(name="role_id")
    private Long id;
    private String name;
    
    @OneToOne(mappedBy="role")
    private User user;
	
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

  
}
