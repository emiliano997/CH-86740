package database;

public class DatabaseManager {
  String host;
  String port;
  String dbType;
  String username;
  String password;
  String dbName;

  public void connect() {
    System.out.println("Connected to database");
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

  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }
}
