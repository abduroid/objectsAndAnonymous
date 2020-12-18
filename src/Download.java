public class Download implements FinishListener {

    @Override
    public void onFinished() {

        System.out.println("Download finished" + this);

    }
}
