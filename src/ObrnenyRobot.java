public class ObrnenyRobot extends Robot {
    int silaUtoku;

    public ObrnenyRobot(){
        super();
        silaUtoku = 20;
    }

    @Override
    public int getSilaUtoku() {
        return silaUtoku;
    }

    @Override
    public void prijmoutZasah(int sila) {
        setBodyEnergie(getBodyEnergie()-Math.max(0,sila-10));
        System.out.println("obrneny robot prijmul zasah - " + Math.max(0, sila - 10));
        if (this.getBodyEnergie() <= 0) {
            setBodyEnergie(0);
            System.out.println("obrneny robot ma energie - " + this.getBodyEnergie());
        } else {
            System.out.println("obrneny robot ma energie - " + this.getBodyEnergie());
        }

    }
}
