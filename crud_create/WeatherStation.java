class WeatherStation {

String temperatureReadings[] = new String[17];
int index;

public boolean addReading(String reading) {
boolean isReadingAdded = false;

    if(index < temperatureReadings.length) {
    if(reading != null && !reading.isEmpty()) {
        temperatureReadings[index++] = reading;
        isReadingAdded = true;
        } 
		else 
        System.out.println(reading + " is not valid");
            
        } else 
        System.out.println("Temperature readings list is full");
        
return isReadingAdded;
    }

public void getReadings() {
    System.out.println("Temperature Readings are:");
        for(String reading : temperatureReadings)
        System.out.println(reading);
        
    }
}

