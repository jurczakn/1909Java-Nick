package com.revature.main;

import static com.revature.util.LoggerUtil.*;

public class Driver {
	
	public static void main(String[] args) {
		fatal("This is a fatal msg");
		error("This is an error msg");
		warn("This is an warn msg");
		debug("This is a debug msg");
		info("This is an info msg");
		trace("This is a trace msg");
	}

}
