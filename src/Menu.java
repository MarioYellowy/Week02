import java.util.Scanner;

public class Menu {
    Menu() {
        Boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        UserService userService = new UserService();
        while (loop) {
            System.out.println("-- Welcome, select a option: --\n\t1.- Crear nuevo usuario\n\t2.- Editar usuario\n\t3.- Eliminar usuario" +
                "\n\t4.- Crear objetivo\n\t5.- Editar objetivo\n\t6.- Eliminar objetivo\n\t7.- Crear nuevos pasos para el objetivo" +
                "\n\t8.- Eliminar paso para el objetivo\n\t9.- Agregar ejercicio\n\t10.- Editar ejercicio\n\t11.- Eliminar ejercicio" +
                "\n\t12.- Crear recordatorio\n\t13.- Editar recordatorio\n\t14.- Eliminar recordatorio\n\t15.- Crear plan de entrenamiento" +
                "\n\t16.- Editar plan de entrenamiento\n\t17.- Eliminar plan de entrenamiento\n\t18.- Crear sesion de ejercicio" +
                "\n\t19.- Editar la sesion de ejercicio\n\t20.- Eliminar la sesion de ejercicio\n\t21.- Exit");
            Integer input = scanner.nextInt();
            switch (input) {
                case 1:
                    userService.createUser();
                    break;
                case 2:
                    userService.editUser();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                case 21:
                    loop = false;
                    break;
            }
        }
    }
}
