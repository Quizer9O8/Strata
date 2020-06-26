package com.quizer9o8.strata.config;

public class StartupCommonOnly
{
	public static void preInitCommon()
	{
    StrataConfiguration.preInit();
    System.out.println("Strata: myInteger=" + StrataConfiguration.myInteger
                               + "; myBoolean=" + StrataConfiguration.myBoolean
                               + "; myString=" + StrataConfiguration.myString);
    System.out.println("Strata: myDouble=" + StrataConfiguration.myDouble
                               + "; myColour=" + StrataConfiguration.myColour);
    System.out.print("Strata: myIntList=");
    for (int value : StrataConfiguration.myIntList) {
      System.out.print(value + "; ");
    }
    System.out.println();

  }

	public static void initCommon()
	{
	}

	public static void postInitCommon()
	{
	}

}