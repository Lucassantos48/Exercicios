package classe;

public class DataTeste {
    public static void main(String[] args) {
        
        Data p1 = new Data();
        p1.dia = 15;
        p1.mes = 12;
        p1.ano = 2001;

        System.out.println(p1.dataFormatada());
    }
    
}
