public class Usuario {
    public static void main(String[] args) throws Exception {

        SmarTv smarTv =  new SmarTv();

        System.out.println(smarTv.ligada);
        System.out.println(smarTv.canal);
        System.out.println(smarTv.volume);

        smarTv.ligar();
        System.out.println(smarTv.ligada);

        smarTv.desligar();
        System.out.println(smarTv.ligada);


    }
}
