
import org.allbinary.logic.communication.log.LogFactory;
import org.allbinary.logic.communication.log.LogUtil;
import org.allbinary.business.context.modules.storefront.StoreFrontInterface;
import org.allbinary.data.tables.user.UserEntityFactory;
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData;
import org.allbinary.logic.communication.smtp.event.handler.EmailEventHandlerUtil;
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler;
import java.util.HashMap;
import java.util.Vector;
public class StoreAdminUserEmailEventHandlerSingletons
{
	private static final StoreAdminUserEmailEventHandlerSingletons instance = 
		new StoreAdminUserEmailEventHandlerSingletons();
   private static HashMap userEmailEventHandlerHashMap = null;
   private StoreAdminUserEmailEventHandlerSingletons()
   {
   }
   public static UserEmailEventHandler getInstance(
      UserEmailEventNameData userEmailEventNameData,
      StoreFrontInterface storeFrontInterface)
      throws Exception
   {
      if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
      {
         LogUtil.put(LogFactory.getInstance("Start", instance, "getInstance"));
      }
      if(StoreAdminUserEmailEventHandlerSingletons.userEmailEventHandlerHashMap == null)
      {
         if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
         {
            LogUtil.put(LogFactory.getInstance("Initializing HashMap", instance, "getInstance"));
         }
         StoreAdminUserEmailEventHandlerSingletons.userEmailEventHandlerHashMap = new HashMap();
      }
      UserEmailEventHandler userEmailEventHandler = (UserEmailEventHandler)
      StoreAdminUserEmailEventHandlerSingletons.userEmailEventHandlerHashMap.get(
         userEmailEventNameData);
      if(userEmailEventHandler == null)
      {
         if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance().EMAILLOGGING))
         {
            LogUtil.put(LogFactory.getInstance("Creating New Named UserEmailEventHandler", instance, "getInstance"));
         }
         Vector userVector =
            UserEntityFactory.getInstance().getStoreManagers(storeFrontInterface);
         UserEmailEventHandler newUserEmailEventHandler =
            EmailEventHandlerUtil.getEventHandler(
               userEmailEventNameData, userVector);
         StoreAdminUserEmailEventHandlerSingletons.userEmailEventHandlerHashMap.put(
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
