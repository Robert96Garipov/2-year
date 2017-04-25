package ru.kpfu.formsvalidation.model;

import java.util.Objects;
import javax.validation.constraints.*;

public class Book {

//  public static final String VALUE_MALE = "male";
//  public static final String VALUE_FEMALE = "female";

  @NotNull
  @Size(min = 8, max = 32)
  private String fullName;


  @NotNull
  @Pattern(regexp = "^(?:[a-zA-Z0-9_'^&/+-])+(?:\\.(?:[a-zA-Z0-9_'^&/+-])+)" +
          "*@(?:(?:\\[?(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))\\.)" +
          "{3}(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\]?)|(?:[a-zA-Z0-9-]+\\.)" +
          "+(?:[a-zA-Z]){2,}\\.?)$",
          message = "Wrong e-mail")
  private String email;

  @NotNull
  private String country;

  @NotNull
  private String sex;

  @NotNull
  @Size(min = 8, max = 32)
  private String firstPassword;

  @NotNull
  @Size(min = 8, max = 32)
  private String secondPassword;


  private boolean newsSubscribe;

  public Book() {
  }

  public Book(String fullName, String email, String country, String sex, String firstPassword, String secondPassword, boolean newsSubscribe) {
    this.fullName = fullName;
    this.email = email;
    this.country = country;
    this.sex = sex;
    this.firstPassword = firstPassword;
    this.secondPassword = secondPassword;
    this.newsSubscribe = newsSubscribe;
  }
  @Override
  public int hashCode() {
    int hash = 6;
    hash = 83 * hash + Objects.hashCode(this.fullName);
    hash = 83 * hash + Objects.hashCode(this.email);
    hash = 83 * hash + Objects.hashCode(this.country);
    hash = 83 * hash + Objects.hashCode(this.sex);
    hash = 83 * hash + Objects.hashCode(this.firstPassword);
    hash = 83 * hash + Objects.hashCode(this.secondPassword);
    hash = 83 * hash + (this.newsSubscribe ? 1 : 0);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Book other = (Book) obj;

    if (this.newsSubscribe != other.newsSubscribe) {
      return false;
    }
    if (!Objects.equals(this.email, other.email)) {
      return false;
    }
    if (!Objects.equals(this.firstPassword, other.firstPassword)) {
      return false;
    }
    if (!Objects.equals(this.secondPassword, other.secondPassword)) {
      return false;
    }
    if (!Objects.equals(this.fullName, other.fullName)) {
      return false;
    }
    if (!Objects.equals(this.country, other.country)) {
      return false;
    }
    if (!Objects.equals(this.sex, other.sex)) {
      return false;
    }
    return true;
  }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(boolean fullName) {
        this.sex = sex;
    }

    public String getFirstPassword() {
        return firstPassword;
    }

    public void setFirstPassword(String firstPassword) {
        this.firstPassword = firstPassword;
    }

    public String getSecondPassword() {
        return secondPassword;
    }

    public void setSecondPassword(String secondPassword) {
        this.secondPassword = secondPassword;
    }

    public boolean isNewsSubscribe() {
        return newsSubscribe;
    }

    public void setNewsSubscribe(boolean newsSubscribe) {
        this.newsSubscribe = newsSubscribe;
    }
}
