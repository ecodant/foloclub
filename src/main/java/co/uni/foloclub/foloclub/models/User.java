package co.uni.foloclub.foloclub.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import java.util.Collection;
import java.util.List;

@Document(collection = "users")
@AllArgsConstructor
@NoArgsConstructor
public abstract class User implements UserDetails {

  @Id
  private ObjectId id;
  private String name;
  private String email;
  private String password;
  private String role;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return List.of(() -> role);
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return email;
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
