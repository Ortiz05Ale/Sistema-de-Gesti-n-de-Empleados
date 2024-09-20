public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompeto empleado1 = new EmpleadoTiempoCompeto("Alejandra" , 101, 1500.0, 160);
        EmpleadoTiempoParcial empleado2 = new EmpleadoTiempoParcial("Luis" , 202, 18.0, 15);
        System.out.println(empleado1.toString());
        System.out.println("-----------------------");
        System.out.println(empleado2.toString());
    }

}