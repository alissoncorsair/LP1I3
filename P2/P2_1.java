package P2;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

/**
 * Alisson de Sousa Vieira
 * Leonardo de Fontes
 */
class Data {
    private int dia;
    private int mes;  
    private int ano;

      public Data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        setDia(scanner.nextInt());
        System.out.println("Digite o mês: ");
        setMes(scanner.nextInt());
        System.out.println("Digite o ano: ");
        setAno(scanner.nextInt());
    }

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostra1() {
        System.out.println(getDia() + "/" + getMes() + "/" + getAno());
    }

    public void mostra2() {
        System.out.println(getDia() + "/" + mesPorExtenso(getMes()) + "/" + getAno());
    }

    public boolean bissexto() {
        if (getAno() % 4 == 0 && getAno() % 100 != 0) {
            return true;
        } else if (getAno() % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String mesPorExtenso(int mes) {
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

    public int diasTranscorridos() {
        int diasTranscorridos = 0;
        for (int i = 1; i < getMes(); i++) {
            diasTranscorridos += diasDoMes(i);
        }
        diasTranscorridos += getDia();
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