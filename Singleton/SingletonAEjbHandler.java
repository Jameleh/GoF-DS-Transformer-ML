
import org.nju.artemis.aejb.evolution.OperationContext;
import org.nju.artemis.aejb.evolution.OperationFailedException;
public class SingletonAEjbHandler implements OperationStepHandler {
	private static final String HANDLER_NAME = "SingletonAEjbHandler";
	@Override
	public OperationResult execute(OperationContext context) throws OperationFailedException {
		return null;
	}
	@Override
	public String getHandlerName() {
		return HANDLER_NAME;
	}
}
