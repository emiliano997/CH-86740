public interface Auth {

  public abstract void login(String username, String password);

  public abstract void logout();
}
