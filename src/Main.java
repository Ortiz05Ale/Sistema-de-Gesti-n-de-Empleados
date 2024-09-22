public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Alejandra" , 101, 2200, 400);
        EmpleadoTiempoCompleto empleado4 = new EmpleadoTiempoCompleto();
        empleado4.setNombre("Paty");
        empleado4.setID(102);
        empleado4.setSalario(150);
        empleado4.setHorasTrabajadas(200);


        EmpleadoTiempoParcial empleado2 = new EmpleadoTiempoParcial("Luis" , 201, 220, 15);
        EmpleadoTiempoParcial empleado3 = new EmpleadoTiempoParcial();
        empleado3.setNombre("Magdiel");
        empleado3.setID(202);
        empleado3.setSalario(180);
        empleado3.setHorasPorSemana(20);

        System.out.println(empleado1.toString());
        System.out.println("-----------------------");
        System.out.println(empleado2.toString());
        System.out.println("-----------------------");
        System.out.println(empleado3.toString());
        System.out.println("-----------------------");
        System.out.println(empleado4.toString());
    }

}