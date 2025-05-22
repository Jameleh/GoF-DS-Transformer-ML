package obs;

public class ObserverImpl1 implements Observer{
    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl){
            int state=((ObservableImpl)observable).getState();
            System.out.println("************** OBS *********");
            System.out.println("State Value = "+state);
            System.out.println("****************************");
        }


    }
}
