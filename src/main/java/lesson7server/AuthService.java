package lesson7server;

public interface AuthService {
    String getNickByLoginAndPassword(String login, String password);
}
