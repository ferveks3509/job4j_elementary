package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equals(login)) {
                rsl = users[i];
                break;
            }
        }
            if (rsl == null) {
                throw new UserNotFoundException("User not found");
            }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = user.isValid();
        boolean result = user.getUserName().length() > 3;
        if (!rsl) {
            throw new UserInvalidException("Invalid user");
        }

        if (!result) {
            throw new UserInvalidException("Length name less of 3");
        }
        return rsl && result;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("User found");
            }
        } catch (UserInvalidException n) {
            System.out.println("Invalid user");
        } catch (UserNotFoundException e) {
            System.out.println("User not found");
        }
    }
}