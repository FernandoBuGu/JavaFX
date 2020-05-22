# JavaFX_apps
Simple JavaFX applications: calculator, login, files browser, progress indicator, interactive charts...

Each folder is an application. Inside each application, there is a Main.java file that can be executed, 
for instance in Eclipse, and the application will popup in a new window. 

In most cases, interaction with the application will print text in the (i.e. Eclipse) console.
The other files within the folder need to be within the same package as Main.java, 
except for the folder "img" that should be a diferent package within the same JavaFX project.

May have to add this to RunConfiguration/Arguments/VM:

--module-path /usr/share/java/openjfx-11.0.2_linux-x64_bin-sdk/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml

where --module-path should be the path to your java lib folder
