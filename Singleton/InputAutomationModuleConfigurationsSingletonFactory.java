
public class InputAutomationModuleConfigurationsSingletonFactory
{
    private static InputAutomationModuleConfigurations inputAutomationModuleConfigurations =
        new InputAutomationModuleConfigurations();
    private InputAutomationModuleConfigurationsSingletonFactory()
    {
    }
    public static InputAutomationModuleConfigurations getInstance()
    {
        return inputAutomationModuleConfigurations;
    }
}
