import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Ciudad ciudad = new Ciudad("A630B","Cochabamba");


        //lista de hospitales
        Hospital univalle = new Hospital("B156C","Univalle",ciudad,123456);


        //medico
        Medico medico = new Medico("89654","Lucas","Perez","Gayardo","8596", Calendar.getInstance().getTime(),univalle);


        //lista de servicios
        Servicio consultas = new Servicio("H310","Revision ",130,"Bienestar");
        Servicio tratamiento = new Servicio("H320","Tratamiento ",160,"Eficiente");
        Servicio atencionMedica = new Servicio("H330","Atencion Medica ",190,"Exelente");
        List<Servicio> servicios = new ArrayList<>();
        servicios.add(consultas);
        servicios.add(tratamiento);
        servicios.add(atencionMedica);

        //pacientes
        Paciente marioGarcia = new Paciente("123456","Mario","Garcia","Quispe","859642",Calendar.getInstance().getTime(), "123456");
        Paciente pedroRamires = new Paciente("589413","Pedro","Ramires","Veltran","789263",Calendar.getInstance().getTime(), "789456");

        //Historial
        Historial historialMario = new Historial("789456",marioGarcia);

        //Visiotas
        Visita marioG = new Visita("123456",Calendar.getInstance().getTime(),univalle,consultas,medico,"Saludable","Ninguno",14,Calendar.getInstance().getTime(),historialMario);


        System.out.println(univalle);
        System.out.println("______________________________________");
        System.out.print(servicios);
        System.out.println("______________________________________");
        System.out.print(medico.toString());
        System.out.println("______________________________________");
        System.out.println(marioGarcia +" ,Historial "+ historialMario.getCodHistorial());
        System.out.println("______________________________________");
        System.out.println("VISITA \n" + " Codigo= "+ marioG.getCodVisita()  + " Fecha Hora= " + marioG.getFechaHora() + " Hospital= " +
                univalle.getNombre() + " Consulta= " +consultas.getNombre() +" Codigo del Medico= "+ medico.getCodMedico() +
                " Diagnostico= " + marioG.getDiagnostico() + " Tratamiento= "+ marioG.getTratamiento() + " NRO de Cama= " + marioG.getNumeroCama() +
                " Fecha deSalida= " + marioG.getFechaSalida() + " Codigo del Historial= " +historialMario.getCodHistorial() );


    }
}
