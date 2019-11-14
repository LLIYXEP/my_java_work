package com.example.demo.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.services.annotation.UniqueUseremail;

@Entity
@Table(name = "users")
public class User implements UserDetails {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotEmpty (message = "Fisrt name is required! Can't be empty!")
	@Size(min = 4, max = 40, message = "Fisrt name must be between {min} and {max} characters")
	private String username;
	
	@NotEmpty (message = "Last name is required! Can't be empty!")
	@Size(min = 4, max = 40, message = "Last name must be between {min} and {max} characters")
	private String lastName;
	
	@Range(min = 18, max = 100, message = "Sory, but your age must be between 18 and 100 years")
	@Digits(integer=3, fraction=0, message = "Password must be maximum 3 digits")
	private Integer age;
	
	@NotEmpty (message = "Password is required! Can't be empty!")
	private String password ;
	

	@NotEmpty (message = "Email is required! Can't be empty!")
	@Email
	@Column(name = "email", unique = true)
	@UniqueUseremail (message = "User with this Email already exists!")
	private String email;
	private String activationCode;
	
	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	private boolean active;
	
	@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
	private Set<Role> roles;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Book> books = new ArrayList<Book>();
	
	public String contains(Role role) {
		if (roles.contains(role)) {
			return "checked";
		} else {
			return "";
		}
		
	}
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public User() {
		super();
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}


	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return username;
	}

	public void setFirstName(String firstName) {
		this.username = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return getRoles();
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
	
}
