public class Program {
    public static void main(String[] args){
        Pacient pacient=Pacient.getInstanta();
        pacient.setPatRabatabil(true);
        System.out.println(pacient.getPatRabatabil());
    }
}
