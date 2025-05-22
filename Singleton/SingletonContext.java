
import org.apache.openejb.core.BaseSessionContext;
import org.apache.openejb.core.Operation;
import org.apache.openejb.core.ThreadContext;
import org.apache.openejb.spi.SecurityService;
public class SingletonContext extends BaseSessionContext {
    public SingletonContext(SecurityService securityService) {
        super(securityService);
    }
    @Override
    public void check(Call call) {
        final Operation operation = ThreadContext.getThreadContext().getCurrentOperation();
        switch (call) {
            case getEJBLocalObject:
            case getEJBObject:
            case getBusinessObject:
            case getUserTransaction:
            case getTimerService:
            case getContextData:
                switch (operation) {
                    case INJECTION:
                        throw illegal(call, operation);
                    default:
                        return;
                }
            case getCallerPrincipal:
            case isCallerInRole:
                switch (operation) {
                case INJECTION:
                case CREATE:
                case POST_CONSTRUCT:
                case PRE_DESTROY:
                    throw illegal(call, operation);
                default:
                    return;
                }
            case timerMethod:
            case setRollbackOnly:
            case getRollbackOnly:
            case UserTransactionMethod:
                switch (operation) {
                    case INJECTION:
                    case CREATE:
                        throw illegal(call, operation);
                    default:
                        return;
                }
            case getInvokedBusinessInterface:
                switch (operation) {
                    case BUSINESS:
                        return;
                    default:
                        throw illegal(call, operation);
                }
            case getMessageContext:
                switch (operation) {
                    case BUSINESS_WS:
                        return;
                    default:
                        throw illegal(call, operation);
                }
        }
    }
}
