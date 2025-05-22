package unitTest;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.proxyTest.interFace.ProxyInterface;
import com.proxyTest.object.InstanceObject;
import com.proxyTest.object.ProxyObject;

public class ProxyTestClient {

	
	@Test
	public void test() {
		ProxyInterface realObj = new InstanceObject();
		
		ProxyObject proxy = new ProxyObject();
		
		ProxyInterface proxyObj = (ProxyInterface)proxy.bind(realObj);
		
//		String ee = "";
		proxyObj.proxyMethod();
		proxyObj.method2("arg Test");
	}
}
