package interfaces;

import objects.User;

/**
 * Created by Dmitry on 21/03/2017.
 */
public interface SecureLibrary {

    boolean login(User user);

    void logout(User user);

}
