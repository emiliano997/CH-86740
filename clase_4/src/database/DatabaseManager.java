package database;

import java.util.List;

public class DatabaseManager {

  private static final String DB_NAME = "coderhouse";

  String host;
  String port;
  String dbType;
  String username;
  String password;

  public void connect() {
    System.out.println("Connected to database " + DB_NAME);
  }

  public void disconnect() {
    System.out.println("Disconnected from database");
  }

  // Setters y Getters
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public String getDbType() {
    return dbType;
  }

  public void setDbType(String dbType) {
    this.dbType = dbType;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
