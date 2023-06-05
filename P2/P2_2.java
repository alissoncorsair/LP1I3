package P2;

import P2.Data;
import P2.Hora;
import java.util.Scanner;

class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    static int quantidade;

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String nomePaciente, String nomeMedico) {
        quantidade++;
        Data data = new Data(d, m, a);
        Hora hora = new Hora(h, mi, s);
        setData(data);
        setHora(hora);
        setNomePaciente(nomePaciente);
        setNomeMedico(nomeMedico);
    }

    public ConsultaAgendada(Data data, Hora hora, String nomePaciente, String nomeMedico) {
        quantidade++;
        setData(data);
        setHora(hora);
        setNomePaciente(nomePaciente);
        setNomeMedico(nomeMedico);
    }

    public ConsultaAgendada() {
        Scanner scanner = new Scanner(System.in);
        quantidade++;
        System.out.println("Digite o nome do paciente: ");
        setNomePaciente(scanner.nextLine());
        System.out.println("Digite o nome do médico: ");
        setNomeMedico(scanner.nextLine());
        System.out.println("Digite o dia: ");
        int d = scanner.nextInt();
        System.out.println("Digite o mês: ");
        int m = scanner.nextInt();
        System.out.println("Digite o ano: ");
        int a = scanner.nextInt();
        Data data = new Data(d, m, a);
        setData(data);
        System.out.println("Digite a hora: ");
        int h = scanner.nextInt();
        System.out.println("Digite o minuto: ");
        int mi = scanner.nextInt();
        System.out.println("Digite o segundo: ");
        int s = scanner.nextInt();
        Hora hora = new Hora(h, mi, s);
        setHora(hora);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setData() {
        Data data = new Data();
        this.data = data;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public void setHora() {
        Hora hora = new Hora();
        this.hora = hora;
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setNomePaciente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do paciente: ");
        setNomePaciente(scanner.nextLine());
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public void setNomeMedico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do médico: ");
        setNomeMedico(scanner.nextLine());
    }

    public String getData() {
        return String.format("%02d/%02d/%02d", this.data.getDia(), this.data.getMes(), this.data.getAno());
    }

    public String getHora() {
        return String.format("%02d:%02d:%02d", this.hora.getHora(), this.hora.getMin(), this.hora.getSeg());
    }

}

public class P2_2 {
    /**
     Usando a classe ConsultaAgendada instancie o objeto p1 inicializado-o com o
    construtor ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p, String
    m);
     Exiba todas as propriedades de p1;
     Agora instancie o objeto p2 usando o construtor ConsultaAgendada ();
     Exiba todas as propriedades de p2;
     Usando os métodos setData(), setHora(), setNomePaciente(), setNomeMedico altere
    as propriedades de p1;
     Exiba todas as propriedades de p1 novamente.
     Exiba a quantidade final de consultas.
     */
    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 10, 10, 2020, "Alisson", "Leonardo");
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Médico: " + p1.getNomeMedico());
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println("Médico: " + p2.getNomeMedico());
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Médico: " + p1.getNomeMedico());
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Quantidade de consultas: " + ConsultaAgendada.quantidade);
    }
}
