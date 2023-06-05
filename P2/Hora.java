package P2;

import java.util.Scanner;

/**
 * ADS 371
 * Alisson de Sousa Vieira
 * Leonardo de Fontes Nunes Bezerra
 */
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora: ");
        setHora(scanner.nextInt());
        System.out.println("Digite o minuto: ");
        setMin(scanner.nextInt());
        System.out.println("Digite o segundo: ");
        setSeg(scanner.nextInt());
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