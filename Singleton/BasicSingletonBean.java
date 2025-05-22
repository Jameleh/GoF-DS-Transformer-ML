
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Properties;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.TimedObject;
import javax.ejb.Timer;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.openejb.test.ApplicationException;
import org.apache.openejb.test.beans.TimerSync;
import org.apache.openejb.test.object.OperationsPolicy;
public class BasicSingletonBean implements SessionBean, TimedObject {
    private String name;
    private SessionContext ejbContext;
    private static Hashtable allowedOperationsTable = new Hashtable();
    public String businessMethod(String text) {
        testAllowedOperations("businessMethod");
        StringBuffer b = new StringBuffer(text);
        return b.reverse().toString();
    }
    public void scheduleTimer(String name) {
        ejbContext.getTimerService().createTimer(1, name);
    }
    public void throwApplicationException() throws ApplicationException {
        throw new ApplicationException("Testing ability to throw Application Exceptions");
    }
    public void throwSystemException_NullPointer() {
        throw new NullPointerException("Testing ability to throw System Exceptions");
    }
    public Properties getPermissionsReport() {
        return null;
    }
    public OperationsPolicy getAllowedOperationsReport(String methodName) {
        return (OperationsPolicy) allowedOperationsTable.get(methodName);
    }
    public String remove(String str){
        return str;
    }    
    public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
        ejbContext = ctx;
        testAllowedOperations("setSessionContext");
    }
    public void ejbCreateObject() throws javax.ejb.CreateException {
        testAllowedOperations("ejbCreate");
        this.name = "nameless automaton";
    }
    public void ejbRemove() throws EJBException, RemoteException {
        testAllowedOperations("ejbRemove");
    }
    public void ejbActivate() throws EJBException, RemoteException {
        testAllowedOperations("ejbActivate");
    }
    public void ejbPassivate() throws EJBException, RemoteException {
        testAllowedOperations("ejbPassivate");
    }
    public void ejbTimeout(Timer timer) {
        testAllowedOperations("ejbTimeout");
        try {
            String name = (String) timer.getInfo();
            TimerSync timerSync = (TimerSync) ejbContext.lookup("TimerSyncBeanBusinessRemote");
            timerSync.countDown(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void testAllowedOperations(String methodName) {
        OperationsPolicy policy = new OperationsPolicy();
        /*[8] Test JNDI_access_to_java_comp_env 
        try {
            InitialContext jndiContext = new InitialContext();
            String actual = (String) jndiContext.lookup("java:comp/env/singleton/references/JNDI_access_to_java_comp_env");
            policy.allow(OperationsPolicy.JNDI_access_to_java_comp_env);
        } catch (IllegalStateException ise) {
        } catch (NamingException ne) {
        }
        /*[11] Test lookup 
        try {
            ejbContext.lookup("singleton/references/JNDI_access_to_java_comp_env");
            policy.allow(OperationsPolicy.Context_lookup);
        } catch (IllegalArgumentException ise) {
        }
        /*[12] Test getTimerService
        try {
            ejbContext.getTimerService();
            policy.allow(OperationsPolicy.Context_getTimerService);
        } catch (IllegalStateException ise) {
        }
        allowedOperationsTable.put(methodName, policy);
    }
}
