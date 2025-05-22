
import org.allbinary.logic.communication.log.LogFactory;
import org.allbinary.logic.communication.log.LogUtil;
import org.allbinary.data.tables.user.UserEntityFactory;
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData;
import org.allbinary.logic.communication.smtp.event.handler.EmailEventHandlerUtil;
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler;
import java.util.HashMap;
import java.util.Vector;
public class AdminUserEmailEventHandlerSingletons
{
	private static final AdminUserEmailEventHandlerSingletons instance = 
		new AdminUserEmailEventHandlerSingletons();
   private static HashMap userEmailEventHandlerHashMap = null;
   private AdminUserEmailEventHandlerSingletons()
   {
   }
   public static UserEmailEventHandler getInstance(UserEmailEventNameData userEmailEventNameData)
      throws Exception
   {
      if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
      {
         LogUtil.put(LogFactory.getInstance("Start", instance, "getInstance"));
      }
      if(AdminUserEmailEventHandlerSingletons.userEmailEventHandlerHashMap == null)
      {
         if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
         {
            LogUtil.put(LogFactory.getInstance("Initializing HashMap", instance, "getInstance"));
         }
         AdminUserEmailEventHandlerSingletons.userEmailEventHandlerHashMap = new HashMap();
      }
      UserEmailEventHandler userEmailEventHandler = (UserEmailEventHandler)
         AdminUserEmailEventHandlerSingletons.userEmailEventHandlerHashMap.get(
         userEmailEventNameData);
      if(userEmailEventHandler == null)
      {
         if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
         {
            LogUtil.put(LogFactory.getInstance("Creating New Named UserEmailEventHandler", instance, "getInstance"));
         }
         Vector userVector = UserEntityFactory.getInstance().getAdministrators();
         UserEmailEventHandler newUserEmailEventHandler =
            EmailEventHandlerUtil.getEventHandler(
               userEmailEventNameData, userVector);
         AdminUserEmailEventHandlerSingletons.userEmailEventHandlerHashMap.put(
            userEmailEventNameData, newUserEmailEventHandler);
         return newUserEmailEventHandler;
      }
      else
      {
         if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
         {
            LogUtil.put(LogFactory.getInstance("Returning existing UserEmailEventHandler", instance, "getInstance"));
         }
         return userEmailEventHandler;
      }
   }
}
