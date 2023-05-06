import java.util.Scanner;

class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora(int hora, int min, int seg) {
        hourSetException(hora);
        minSetException(min);
        segSetException(seg);
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Hora() {
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    public void setHora(int hora) {
        hourSetException(hora);
        this.hora = hora;
    }

    public void setMin(int min) {
        minSetException(min);
        this.min = min;
    }

    public void setSeg(int seg) {
        segSetException(seg);
        this.seg = seg;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMin() {
        return this.min;
    }

    public int getSeg() {
        return this.seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    }

    public String getHora2() {
        String ampm = "AM";
        int hora = this.hora;
        if (hora > 12) {
            hora -= 12;
            ampm = "PM";
        }
        return String.format("%02d:%02d:%02d %s", hora, this.min, this.seg, ampm);
    }

    public int getSegundosTotais() {
        return this.hora * 3600 + this.min * 60 + this.seg;
    }

    private void hourSetException(int hora) {
        if (hora < 0 || hora > 23) {
            throw new Error("Hora inválida");
        }
    }

    private void minSetException(int min) {
        if (min < 0 || min > 59) {
            throw new Error("Minuto inválido");
        }
    }

    private void segSetException(int seg) {
        if (seg < 0 || seg > 59) {
            throw new Error("Segundo inválido");
        }
    }

}

public class TP03 {
    public static void main(String[] args) {
        boolean skip = false;
        Hora horario = new Hora();
        Scanner scanner = new Scanner(System.in);
        while (!skip) {
            try {
                System.out.print("Bom dia! Defina a hora atual: ");
                int hora = scanner.nextInt();
                horario.setHora(hora);
                skip = true;
            } catch (Error e) {
                System.out.println(e);
                skip = false;
            }
        }
        skip = false;
        while (!skip) {
            try {
                System.out.print("Defina os minutos: ");
                int min = scanner.nextInt();
                horario.setMin(min);
                skip = true;
            } catch (Error e) {
                System.out.println(e);
                skip = false;
            }
        }
        skip = false;
        while (!skip) {
            try {
                System.out.print("Defina os segundos: ");
                int seg = scanner.nextInt();
                horario.setSeg(seg);
                skip = true;
            } catch (Error e) {
                System.out.println(e);
                skip = false;
            }
        }
        scanner.close();

        System.out.println("Hora atual: " + horario.getHora1());
        System.out.println("Hora atual: " + horario.getHora2());
        System.out.println("Segundos totais: " + horario.getSegundosTotais());

    }
}