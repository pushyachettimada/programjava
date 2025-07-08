class Satellite {

        static String satelliteName ;
        static String satelliteCountry ;
        static String satelliteOrganization ; 
        static String satelliteMissionType ;
        static String satelliteOrbitType ;
        static String satelliteLaunchDate ;
        static String satelliteLaunchVehicle ;
        static String satelliteLaunchSite ;
        static int satellitePowerCapacityWatts ;
        static int satelliteTranspondersCband ;
        static int satelliteTranspondersKuband ;
        static double satelliteDesignLifeYears ;
        static String satelliteCoverageArea ;
        
		
    public static void main(String bus[] ) {

        System.out.println("The satellite Name is " + satelliteName);
        System.out.println("The satellite Country is " + satelliteCountry);
        System.out.println("The satellite Organization is " + satelliteOrganization);
        System.out.println("The satellite MissionType is " + satelliteMissionType);
        System.out.println("The satellite OrbitType is " + satelliteOrbitType);
        System.out.println("The satellite LaunchDate is " + satelliteLaunchDate);
        System.out.println("The satellite LaunchVehicle is " + satelliteLaunchVehicle);
        System.out.println("The satellite LaunchSite is " + satelliteLaunchSite);
        System.out.println("The satellite PowerCapacity is " + satellitePowerCapacityWatts);
        System.out.println("The satellite C-bandTransponders is " + satelliteTranspondersCband);
        System.out.println("The satellite Ku-bandTransponders is " + satelliteTranspondersKuband);
        System.out.println("The satellite DesignLifeyears is " + satelliteDesignLifeYears);
        System.out.println("The satellite CoverageArea is " + satelliteCoverageArea);
        
		//re-init
		 String satelliteName = "GSAT-30";
         String satelliteCountry = "India";
         String satelliteOrganization = "ISRO";
         String satelliteMissionType = "Communication";
         String satelliteOrbitType = "Geostationary";
         String satelliteLaunchDate = "January 17, 2020";
         String satelliteLaunchVehicle = "Ariane 5 VA251";
         String satelliteLaunchSite = "Guiana Space Centre, French Guiana";
         int satellitePowerCapacityWatts = 6000;
         int satelliteTranspondersCband = 12;
         int satelliteTranspondersKuband = 12;
         double satelliteDesignLifeYears = 15.0;
         String satelliteCoverageArea = "Indian Mainland & Islands";
		
		
        System.out.println("The satellite Name is " + satelliteName);
        System.out.println("The satellite Country is " + satelliteCountry);
        System.out.println("The satellite Organization is " + satelliteOrganization);
        System.out.println("The satellite MissionType is " + satelliteMissionType);
        System.out.println("The satellite OrbitType is " + satelliteOrbitType);
        System.out.println("The satellite LaunchDate is " + satelliteLaunchDate);
        System.out.println("The satellite LaunchVehicle is " + satelliteLaunchVehicle);
        System.out.println("The satellite LaunchSite is " + satelliteLaunchSite);
        System.out.println("The satellite PowerCapacity is " + satellitePowerCapacityWatts);
        System.out.println("The satellite C-bandTransponders is " + satelliteTranspondersCband);
        System.out.println("The satellite Ku-bandTransponders is " + satelliteTranspondersKuband);
        System.out.println("The satellite DesignLifeyears is " + satelliteDesignLifeYears);
        System.out.println("The satellite CoverageArea is " + satelliteCoverageArea);
}
}
