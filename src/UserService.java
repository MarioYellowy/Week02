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

    public void editUser() {
        System.out.println("Por favor ingresa el id del usuario que quieres editar:");
        Integer inputId = sc.nextInt();
        for (User user : users) {
            Integer userId = user.getUserId();
            String userName;
            Integer userAge;
            float userWeight;
            EGender userGender;
            if (userId == inputId) {
                System.out.println("Se actualizaran todos los datos");
                System.out.println("Por favor ingresa el nombre:");
                userName = sc.next();
                user.setUserName(userName);
                System.out.println("Por favor ingresa la edad:");
                userAge = sc.nextInt();
                user.setUserAge(userAge);
                System.out.println("Por favor ingresa el peso:");
                userWeight = sc.nextFloat();
                user.setUserWeight(userWeight);
                System.out.println("Por favor ingresa el genero:");
                userGender = EGender.fromString(sc.next());
                user.setUserGender(userGender);
            } else {
                System.out.println("EL usuario con id: " + inputId + " no existe");
            }
        }
    }

}
