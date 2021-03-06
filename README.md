# MidKnight Magic Too Team 9042
This is the official repository for the 2016-17 season Velocity Vortex.

#Vuforia
The key for 9042 is:  AU+Uvo3/////AAAAGdjYkc8TVkvGi3gbOyzI/78U4cJXgtsDrKQQzVxuphNb8X7dpRSTS8cbzdTtVsdwde7l+kFjJnNEOm1NFffYgG/rf8Z3+gLanvBF7rpIHNPwFsbLR1GxJJQth2kFif2tYIOXSTJ7oQQZDcUojld9UR70afiVxqCqQHbuueadf7KQBOgihBye/RLvQc2dkSDQt3o/J++1NpwEhuguCsJVlBX/C576EQ23DkmR+vmVJPiW78U7I9yEQLsRRtYOe4LhkwV6GdmkweJshkO99nzNjF28+BeODZakEImq6lJQDTHsKvlYXvIolqIzoUNSMppMB35iFGc6qhgoo9O1yqpsum2clDulBglIVpjD3MLRalK8

# ftc_app
FTC Android Studio project to create FTC Robot Controller app.

This is the FTC SDK that can be used to create an FTC Robot Controller app, with custom op modes.
The FTC Robot Controller app is designed to work in conjunction with the FTC Driver Station app.
The FTC Driver Station app is available through Google Play.

To use this SDK, download/clone the entire project to your local computer.
Use Android Studio to import the folder  ("Import project (Eclipse ADT, Gradle, etc.)").

Documentation for the FTC SDK are included with this repository.  There is a subfolder called "doc" which contains several subfolders:

 * The folder "apk" contains the .apk files for the FTC Driver Station and FTC Robot Controller apps.
 * The folder "javadoc" contains the JavaDoc user documentation for the FTC SDK.
 * The folder "tutorial" contains PDF files that help teach the basics of using the FTC SDK.

For technical questions regarding the SDK, please visit the FTC Technology forum:

  http://ftcforum.usfirst.org/forumdisplay.php?156-FTC-Technology
  
T. Eng
November 5, 2015

**************************************************************************************

Release 15.10.06.002

 * Added support for Legacy Matrix 9.6V motor/servo controller.
 * Cleaned up build.gradle file.
 * Minor UI and bug fixes for driver station and robot controller apps.
 * Throws error if Ultrasonic sensor (NXT) is not configured for legacy module port 4 or 5.

T. Eng
October 6, 2015

**************************************************************************************

In this latest version of the FTC SDK (20150803_001) the following changes should be noted:

 * New user interfaces for FTC Driver Station and FTC Robot Controller apps.
 * An init() method is added to the OpMode class.
   - For this release, init() is triggered right before the start() method.
   - Eventually, the init() method will be triggered when the user presses an "INIT" button on driver station.
   - The init() and loop() methods are now required (i.e., need to be overridden in the user's op mode).
   - The start() and stop() methods are optional.
 * A new LinearOpMode class is introduced.
   - Teams can use the LinearOpMode mode to create a linear (not event driven) program model.
   - Teams can use blocking statements like Thread.sleep() within a linear op mode.
 * The API for the Legacy Module and Core Device Interface Module have been updated.
   - Support for encoders with the Legacy Module is now working.
 * The hardware loop has been updated for better performance.


T. Eng
August 3, 2015
