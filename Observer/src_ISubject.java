// Subject
public interface ISubject {
    public void add(IObserver o);
    public void remove(IObserver o);
    public void notifyObservers();
}
