package com.revature.main;

public class Scopes {

	static int staticScope = doStatic();

	int instanceScope = 5;

	static {
		System.out.println("Inside static");
		staticScope += 5;
		System.out.println(staticScope);
		// main(null);
	}

	{
		System.out.println("Inside instance");
		instanceScope++;
		staticScope++;
		System.out.println("Instance scope: " + instanceScope + "Static scope: " + staticScope);
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
		doStatic();
		System.out.println("about to create instance");
		new Scopes().doStuff(8);
		Scopes s1 = new Scopes();
		Scopes s2 = new Scopes();
		s1.instanceScope = 10;
		s2.instanceScope = 20;
		s1.doStuff(6);
		s2.doStuff(7);
		s1.doStatic();
		Scopes.doStatic();
	}

	static int doStatic() {
		System.out.println("Inside do static");
		int staticLocal;
		staticLocal = staticScope;
		// staticLocal = instanceScope;
		// doStuff(7);\
		//this.staticScope;
		return 55;
	}

	void doStuff(int stuff) {
		
		System.out.println("Inside doStuff");
		
		System.out.println(Scopes.staticScope);

		// System.out.println(Scopes.instanceScope);

		System.out.println(instanceScope);

		int methodScope = 7;

		for (;;) {
			int local = methodScope;
			int instanceScope = 27;
			local = staticScope;
			local = this.instanceScope;
			System.out.println("instanceScope: " +local);
			if (true) {
				{
					int x = 5;
					System.out.println(x);
				}
				int superLocal = local;
				// int local = 7;
				// int instanceScope = 17;
				break;
			}
			// System.out.println(superLocal);
		}

	}

}
