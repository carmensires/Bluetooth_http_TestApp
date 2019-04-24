# Bluetooth HTTP
Simple project to scan bluetooth beacons and make an http get request to the BOSSA Platoform API. This has been done to use in the NG911 project in the future.

## Bluetooth Scanner
Scans for beacons during 5 seconds and creates a list of detected beacons:
* UUID
* Major
* Minor
* Rssi

## HTTP Get Request
Converts the detected beacons into a list of Json objects and inserts it into a URL. 
Then, makes an HTTPGet Request to the BOSSA Platform API, to get the indoor location