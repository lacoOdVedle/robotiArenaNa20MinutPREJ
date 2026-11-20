public class Main {
    public static void main(String[] args) {
        LehkyRobot lehky = new LehkyRobot();
        ObrnenyRobot  obrneny = new ObrnenyRobot();

        lehky.utoc(obrneny);
        obrneny.utoc(lehky);
        obrneny.prijmoutZasah(5);
        obrneny.prijmoutZasah(200);
        obrneny.utoc(lehky);
    }
}
