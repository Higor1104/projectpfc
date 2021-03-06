package br.com.projectpfc.service;

import javax.faces.context.FacesContext;
import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

public class AuthenticationService {

  @Autowired
  @Qualifier("authenticationManager")
  private AuthenticationManager authenticationManager;

  public boolean login(String username, String password) throws AuthenticationException {
    UsernamePasswordAuthenticationToken token =
        new UsernamePasswordAuthenticationToken(username, password);
    Authentication authenticate = authenticationManager.authenticate(token);
    if (authenticate.isAuthenticated()) {
      SecurityContextHolder.getContext().setAuthentication(authenticate);
      return true;
    }
    return false;
  }

  public void logout() {
    SecurityContextHolder.getContext().setAuthentication(null);
    invalidateSession();
  }

  public User getUsuarioLogado() {
    return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  }

  private void invalidateSession() {
    FacesContext fc = FacesContext.getCurrentInstance();
    HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
    session.invalidate();
  }

}