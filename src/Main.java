public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Alejandra" , 101, 2200, 400);
        EmpleadoTiempoParcial empleado2 = new EmpleadoTiempoParcial("Luis" , 202, 220, 15);
        System.out.println(empleado1.toString());
        System.out.println("-----------------------");
        System.out.println(empleado2.toString());
    }

}