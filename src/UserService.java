import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    ArrayList<User> users = new ArrayList<>();

    UserService() {}

    Scanner sc = new Scanner(System.in);

    public User createUser() {
        System.out.println("Por favor inserta el id del usuario");
        Integer userId = sc.nextInt();
        System.out.println("Por favor inserta la edad del usuario");
        Integer userAge = sc.nextInt();
        System.out.println("Por favor ingresa el nombre del usuario");
        String userName = sc.next();
        System.out.println("Por favor ingresa el peso del usuario");
        float userWeight = sc.nextFloat();
        System.out.println("Por favor ingresa el genero del usuario, las opciones son: H/M o Hombre/Mujer");
        EGender userGender = EGender.fromString(sc.next());
        User newUser = new User(userId, userAge, userName, userWeight, userGender);
        System.out.println("Usuario creado con exito: " + newUser.toString());
        users.add(newUser);
        return newUser;
    }


}
