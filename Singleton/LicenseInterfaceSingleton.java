
public class LicenseInterfaceSingleton
{
    private static AbeLicenseInterface licenseInterface = AbeNoLicense.getInstance();
    public static AbeLicenseInterface getInstance()
    {
        return licenseInterface;
    }
    public static void init(AbeLicenseInterface licenseInterface)
    {
        if(licenseInterface != null)
        {
            LicenseInterfaceSingleton.licenseInterface = licenseInterface;
        }
    }
}
