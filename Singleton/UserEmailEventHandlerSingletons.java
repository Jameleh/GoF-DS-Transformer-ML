
import org.allbinary.logic.communication.log.LogFactory;
import org.allbinary.logic.communication.log.LogUtil;
import org.allbinary.business.user.UserInterface;
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData;
import org.allbinary.logic.communication.smtp.event.handler.EmailEventHandlerUtil;
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler;
import org.allbinary.logic.communication.smtp.event.modules.log.LogUserEmailEventListenerModule;
import java.util.HashMap;
import java.util.Vector;
public class UserEmailEventHandlerSingletons
{
	private static final UserEmailEventHandlerSingletons instance = 
		new UserEmailEventHandlerSingletons();
   private static HashMap userEmailEventHandlerHashMap = null;
   private UserEmailEventHandlerSingletons()
   {
   }
   public static UserEmailEventHandler getInstance(
      UserEmailEventNameData userEmailEventNameData, 
      UserInterface userInterface)
      throws Exception
   {
      if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
      {
         LogUtil.put(LogFactory.getInstance("Start", instance, "getInstance"));
      }
      if(UserEmailEventHandlerSingletons.userEmailEventHandlerHashMap == null)
      {
         if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
         {
            LogUtil.put(LogFactory.getInstance("Initializing HashMap", instance, "getInstance"));
         }
         UserEmailEventHandlerSingletons.userEmailEventHandlerHashMap = new HashMap();
      }
      UserEmailEventHandler userEmailEventHandler = (UserEmailEventHandler)
         UserEmailEventHandlerSingletons.userEmailEventHandlerHashMap.get(
         userEmailEventNameData);
      if(userEmailEventHandler == null)
      {
         if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
         {
            LogUtil.put(LogFactory.getInstance("Creating New Named UserEmailEventHandler",
               instance, "getInstance"));
         }
         UserEmailEventHandler newUserEmailEventHandler = new UserEmailEventHandler();
         Vector vector = 
            EmailEventHandlerUtil.getUserEmailEventListenerVector(
               userEmailEventNameData, userInterface);
         newUserEmailEventHandler.addListener(vector);
         newUserEmailEventHandler.addListener(new LogUserEmailEventListenerModule());
         UserEmailEventHandlerSingletons.userEmailEventHandlerHashMap.put(
            userEmailEventNameData, newUserEmailEventHandler);
         return newUserEmailEventHandler;
      }
      else
      {
         if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
         {
            LogUtil.put(LogFactory.getInstance("Returning existing UserEmailEventHandler",
               instance, "getInstance"));
         }
         return userEmailEventHandler;
      }
   }
}
