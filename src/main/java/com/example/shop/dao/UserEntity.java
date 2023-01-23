//package com.example.shop.dao;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "user", schema = "cargo_delivery", catalog = "")
//public class UserEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "userId")
//    private int userId;
//    @Basic
//    @Column(name = "role")
//    private String role;
//    @Basic
//    @Column(name = "name")
//    private String name;
//    @Basic
//    @Column(name = "surname")
//    private String surname;
//    @Basic
//    @Column(name = "patronymic")
//    private String patronymic;
//    @Basic
//    @Column(name = "phone")
//    private String phone;
//    @Basic
//    @Column(name = "login")
//    private String login;
//    @Basic
//    @Column(name = "password")
//    private String password;
//    @Basic
//    @Column(name = "cash")
//    private double cash;
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public double getCash() {
//        return cash;
//    }
//
//    public void setCash(double cash) {
//        this.cash = cash;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        UserEntity that = (UserEntity) o;
//
//        if (userId != that.userId) return false;
//        if (Double.compare(that.cash, cash) != 0) return false;
//        if (role != null ? !role.equals(that.role) : that.role != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
//        if (patronymic != null ? !patronymic.equals(that.patronymic) : that.patronymic != null) return false;
//        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
//        if (login != null ? !login.equals(that.login) : that.login != null) return false;
//        if (password != null ? !password.equals(that.password) : that.password != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = userId;
//        result = 31 * result + (role != null ? role.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (surname != null ? surname.hashCode() : 0);
//        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
//        result = 31 * result + (phone != null ? phone.hashCode() : 0);
//        result = 31 * result + (login != null ? login.hashCode() : 0);
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        temp = Double.doubleToLongBits(cash);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
//}
