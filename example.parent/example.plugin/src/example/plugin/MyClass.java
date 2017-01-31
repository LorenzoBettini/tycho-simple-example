package example.plugin;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;

public class MyClass {

	public void myMethod() {
		EClass eclass = EcoreFactory.eINSTANCE.createEClass();
		eclass.setName("world");
		System.out.println("hello " + eclass.getName());
	}
}
