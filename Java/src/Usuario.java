public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        System.out.println("--------Novo Status--------");
        smartTv.ligar();
        System.out.println("Ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.novoCanal(52);
        System.out.println("Canal: " + smartTv.canal);
    }
}
