package com.quizer9o8.strata.config;

public class StartupClientOnly {
	public static void preInitClientOnly()
	{
    StrataConfiguration.clientPreInit();  // used to set up an event handler for the GUI so that the altered values are
                                    //  saved back to disk.
	}

	public static void initClientOnly()
	{
	}

	public static void postInitClientOnly()
	{
	}

}