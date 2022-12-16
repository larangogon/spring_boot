package com.movie.reviews.authentication;

import java.util.Collection;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

public class UserAuthentication implements Authentication {

	private static final long serialVersionUID = 1L;

	public UserAuthentication(User user) {
		super();
		this.user = user;
	}

	private User user;

	@Override
	public String getName() {
		return user.getFirstName() + user.getLastName();
	}

	@Override
	public Collection <? extends GrantedAuthority> getAuthorities() {
		return user.getAuthorities();
	}

	@Override
	public Object getCredentials() {
		return null;
	}

	@Override
	public Object getDetails() {
		return user;
	}

	@Override
	public Object getPrincipal() {
		return user.getEmailId();
	}

	@Override
	public boolean isAuthenticated() {
		return false;
	}

	@Override
	public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {}
}
