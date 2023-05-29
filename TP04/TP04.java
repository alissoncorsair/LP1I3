import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        this.dia = scanner.nextInt();
        System.out.println("Digite o mês: ");
        this.mes = scanner.nextInt();
        System.out.println("Digite o ano: ");
        this.ano = scanner.nextInt();
        scanner.close();
    }

    Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    void entraDia(int d) {
        this.dia = d;
    }

    void entraMes(int m) {
        this.mes = m;
    }

    void entraAno(int a) {
        this.ano = a;
    }

    int retDia() {
        return this.dia;
    }

    int retMes() {
        return this.mes;
    }

    int retAno() {
        return this.ano;
    }

    void mostra1() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    void mostra2() {
        System.out.println(this.dia + "/" + mesPorExtenso(this.mes) + "/" + this.ano);
    }

    boolean bissexto() {
        if (this.ano % 4 == 0 && this.ano % 100 != 0) {
            return true;
        } else if (this.ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    String mesPorExtenso(int mes) {
        String mesPorExtenso = "";
        if (mes < 1 || mes > 12) {
            return "Mês inválido";
        }
        switch (mes) {
            case 1:
                mesPorExtenso = "Janeiro";
                break;
            case 2:
                mesPorExtenso = "Fevereiro";
                break;
            case 3:
                mesPorExtenso = "Março";
                break;
            case 4:
                mesPorExtenso = "Abril";
                break;
            case 5:
                mesPorExtenso = "Maio";
                break;
            case 6:
                mesPorExtenso = "Junho";
                break;
            case 7:
                mesPorExtenso = "Julho";
                break;
            case 8:
                mesPorExtenso = "Agosto";
                break;
            case 9:
                mesPorExtenso = "Setembro";
                break;
            case 10:
                mesPorExtenso = "Outubro";
                break;
            case 11:
                mesPorExtenso = "Novembro";
                break;
            case 12:
                mesPorExtenso = "Dezembro";
                break;
        }
        return mesPorExtenso;
    }

    int diasTranscorridos() {
        int diasTranscorridos = 0;
        for (int i = 1; i < this.mes; i++) {
            diasTranscorridos += diasDoMes(i);
        }
        diasTranscorridos += this.dia;
        return diasTranscorridos;
    }

    int diasDoMes(int mes) {
        int diasDoMes = 0;
        switch (mes) {
            case 1:
                diasDoMes = 31;
                break;
            case 2:
                if (bissexto()) {
                    diasDoMes = 29;
                } else {
                    diasDoMes = 28;
                }
                break;
            case 3:
                diasDoMes = 31;
                break;
            case 4:
                diasDoMes = 30;
                break;
            case 5:
                diasDoMes = 31;
                break;
            case 6:
                diasDoMes = 30;
                break;
            case 7:
                diasDoMes = 31;
                break;
            case 8:
                diasDoMes = 31;
                break;
            case 9:
                diasDoMes = 30;
                break;
            case 10:
                diasDoMes = 31;
                break;
            case 11:
                diasDoMes = 30;
                break;
            case 12:
                diasDoMes = 31;
                break;
        }
        return diasDoMes;
    }

    void apresentaDataAtual() {
        Date currentDate = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate);
    }
}

public class TP04 {
    public static void main(String[] args) {
        Data data = new Data();
        data.mostra1();
        data.mostra2();
        System.out.println("Ano digitado é bissexto: " + (data.bissexto() ? "Sim" : "Não"));
        System.out.println("Dias transcorridos: " + data.diasTranscorridos());
        data.apresentaDataAtual();
    }
}