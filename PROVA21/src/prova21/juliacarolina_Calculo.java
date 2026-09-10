package prova21;

public class juliacarolina_Calculo {
    float jc_n1 = 0;
    float jc_n2 = 0;
    float jc_n3 = 0;

    public void setNotas(float n1, float n2, float n3) {
        this.jc_n1 = n1;
        this.jc_n2 = n2;
        this.jc_n3 = n3;
    }

    float CalculoMedia() {
        try {
            float media = (jc_n1 + jc_n2 + jc_n3) / 3;
            return media;
        } catch (Exception e) {
            System.out.print("Erro no cálculo da média das notas");
            return 0;
        }
    }

    String Situacao() {
        float media = CalculoMedia();

        if (media <= 4) {
            return "reprovado";
        } else if (media <= 6) {
            return "recuperação";
        } else {
            return "aprovado";
        }
    }

    String Conceito() {
        float media = CalculoMedia();

        if (media <= 5) {
            return "E";
        } else if (media <= 6.4) {
            return "D";
        } else if (media <= 7.4) {
            return "C";
        } else if (media <= 9) {
            return "B";
        } else if (media >= 9) {
            return "A";
        } else {
            return "Desconhecido";
        }
    }
}
