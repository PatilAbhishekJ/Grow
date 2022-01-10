public class BillPughImplementation {

    private BillPughImplementation(){

    }

    private static class BillPughSingleton{
        private static final BillPughImplementation INSTANCE =new BillPughImplementation();
    }

    public static BillPughImplementation getInstance(){
        return BillPughSingleton.INSTANCE;
    }


}
