package jade;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWWindowFocusCallback;

public class Window{


   private String title;
   private int width, height;

   private static Window window = null;

    private Window(){
        this.width = 1920;
        this.height = 1080;
        this.title = "Mario";
    }

    public static  Window get(){
         if(Window.window == null){
             Window.window = new Window();
         }
         return Window.window;
    }

    public void run(){
        System.out.println("LWJGL: " + Version.getVersion());

        init();
        loop();
    }
    public void init(){
        //error callback
        GLFWErrorCallback.createPrint(System.err).set();

        if()
    }

    public void loop(){

    }
}
















