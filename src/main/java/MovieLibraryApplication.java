import utils.MenuHandler;
import utils.UserInputHandler;

public class MovieLibraryApplication {

    public static void main(String[] args) {
        MenuHandler.print();
        switch (UserInputHandler.getMenuOptionFromUser()) {
            case DISPLAY_INFORMATION_ABOUT_MOVIE:
                // to do
                break;
            case DISPLAY_ACTORS:
                // to do
                break;
            case QUIT:
                System.out.println("Goodbye");
                System.exit(1);
        }
    }


}
