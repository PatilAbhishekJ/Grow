public class sample {

    private static final sample instance=new sample();

    private sample(){

    }

    public static sample getInstance(){
        return instance;
    }
}
