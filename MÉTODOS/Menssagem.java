public class Menssagem {
    public static void obterMenssagem(int hora){
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                menssagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                menssagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 01:
            case 02:
            case 03:
            case 04:
                menssagemBoaNoite();
                break;
            default:
        }
    }

    public static void menssagemBoaNoite() {
        System.out.println("Boa noite");
    }

    public static void menssagemBoaTarde() {
        System.out.println("Boa tarde");
    }

    public static void menssagemBomDia() {
        System.out.println("Bom dia");
    }
}
