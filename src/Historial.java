public class Historial {
    private String codHistorial;
    private Paciente paciente;

    //metodo costructor

    public Historial(String codHistorial, Paciente paciente) {
        this.setCodHistorial(codHistorial);
        this.setPaciente(paciente);
    }

    //encapsulamiento
    public String getCodHistorial() {
        return codHistorial;
    }

    public void setCodHistorial(String codHistorial) {
        this.codHistorial = codHistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
