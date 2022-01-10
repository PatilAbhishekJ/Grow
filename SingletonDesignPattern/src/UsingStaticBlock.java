public class UsingStaticBlock {
    public static UsingStaticBlock instance;
    private UsingStaticBlock(){

    }

    static {
        instance=new UsingStaticBlock();
    }

}
