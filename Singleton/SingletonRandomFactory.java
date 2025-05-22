
import net.schmizz.sshj.common.Factory;
public class SingletonRandomFactory
        implements Random, Factory<Random> {
    private final Random random;
    public SingletonRandomFactory(Factory<Random> factory) {
        random = factory.create();
    }
    @Override
    public Random create() {
        return this;
    }
    @Override
    public void fill(byte[] bytes, int start, int len) {
        random.fill(bytes, start, len);
    }
    @Override
    public void fill(final byte[] bytes) {
        random.fill(bytes);
    }
}
