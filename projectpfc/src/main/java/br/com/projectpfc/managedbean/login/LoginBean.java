package br.com.projectpfc.managedbean.login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.security.sasl.AuthenticationException;

import br.com.projectpfc.service.AuthenticationService;

@ManagedBean
public class LoginBean {

  @ManagedProperty(value = "#{authenticationService}")
  private AuthenticationService authenticationService;

  private String userName;

  private String password;

  public String login() {
    boolean success = false;
    try {
      success = authenticationService.login(userName, password);
    } catch (AuthenticationException e) {
      e.printStackTrace();
    }
    if (!success) {
      FacesMessage facesMessage =
          new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Login ou senha inválidos");
      FacesContext.getCurrentInstance().addMessage(null, facesMessage);
      return "falhaLogin";
    }
    return "sucessoLogin";
  }

  public String logout() {
    authenticationService.logout();
    return "login";
  }

}