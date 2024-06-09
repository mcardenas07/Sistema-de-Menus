**PRACTICA SISTEMA DE MENUS**

**Captura del código**
![](https://i.ibb.co/ScmYGHx/3.png)

**Lineas de codigo**

	package application;
	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Menu;
	import javafx.scene.control.MenuBar;
	import javafx.scene.control.MenuItem;
	import javafx.scene.control.SeparatorMenuItem;
	import javafx.scene.layout.BorderPane;
	import javafx.stage.Stage;

	public class Main extends Application {

    	@Override
    	public void start(Stage primaryStage) {
        	// Crear la barra de menú principal
        	MenuBar menuBar = new MenuBar();

        	// Crear menús principales
        	Menu archivoMenu = new Menu("Archivo");
        	Menu editarMenu = new Menu("Editar");
        	Menu ayudaMenu = new Menu("Ayuda");

        	// Añadir elementos de menú (opciones) dentro de cada menú principal
        	archivoMenu.getItems().addAll(
               	new MenuItem("Abrir"),
                	new MenuItem("Guardar"),
                	new SeparatorMenuItem(),
                	new MenuItem("Salir")
        	);

        	editarMenu.getItems().addAll(
                	new MenuItem("Copiar"),
                	new MenuItem("Pegar"),
                	new SeparatorMenuItem(),
                	new MenuItem("Eliminar")
        );

        ayudaMenu.getItems().addAll(
                new MenuItem("Acerca de"),
                new MenuItem("Ayuda en línea")
        	);

        	// Añadir menús principales a la barra de menú
        	menuBar.getMenus().addAll(archivoMenu, editarMenu, ayudaMenu);

        	// Definir acciones para cada elemento de menú
        	archivoMenu.getItems().get(0).setOnAction(e -> 	System.out.println("Abrir archivo"));
        	archivoMenu.getItems().get(1).setOnAction(e -> 	System.out.println("Guardar archivo"));
        	archivoMenu.getItems().get(3).setOnAction(e -> 	System.out.println("Salir de la aplicación"));

        	editarMenu.getItems().get(0).setOnAction(e -> 	System.out.println("Copiar texto"));
        	editarMenu.getItems().get(1).setOnAction(e -> System.out.println("Pegar texto"));
        	editarMenu.getItems().get(2).setOnAction(e -> 	System.out.println("Eliminar texto"));

        	ayudaMenu.getItems().get(0).setOnAction(e -> 	System.out.println("Acerca de la aplicación"));
        	ayudaMenu.getItems().get(1).setOnAction(e -> 	System.out.println("Ayuda en línea"));

        	// Crear un BorderPane para organizar la barra de menú en la parte superior de la ventana
        	BorderPane root = new BorderPane();
       	root.setTop(menuBar);

        	// Crear la escena y mostrar la ventana
        	Scene scene = new Scene(root, 400, 300);
        	primaryStage.setScene(scene);
        	primaryStage.show();
    	}

    	public static void main(String[] args) {
        	launch(args);
    	}
	}


**Explicación del codigo**
- **Creación de la barra de menú** 
(MenuBar): Se crea una barra de menú que contendrá los menús principales.

- **Creación de menús principales** 
(Menu): Se crean los menús "Archivo", "Editar" y "Ayuda".

- **Añadir elementos de menú** 
(MenuItem): Se agregan elementos de menú a cada menú principal. Los elementos de menú incluyen acciones como "Abrir", "Guardar", "Salir", "Copiar", "Pegar", "Eliminar", "Acerca de", y "Ayuda en línea".

- **Definición de acciones** 
(setOnAction): Se asocian acciones a cada elemento de menú que imprimen un mensaje en la consola cuando son seleccionados.

- **Organización de la interfaz** 
(BorderPane): Se usa un BorderPane para colocar la barra de menú en la parte superior de la ventana.

- **Creación y configuración de la escena** 
(Scene): Se crea una escena con el BorderPane como el nodo raíz, y se establece un tamaño de 400x300 píxeles.

- **Inicialización y visualización de la ventana principal:** 
Se establece la escena en el Stage principal y se muestra la ventana.


**Conclusión**
Este código es un buen ejemplo para aprender a trabajar con menús en JavaFX y cómo asociar acciones básicas a los elementos de menú. Aquí se implementan los conceptos básicos necesarios para construir una interfaz gráfica de usuario simple pero funcional.
