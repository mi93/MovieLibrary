package utils;

public enum MenuOptions {

    DISPLAY_INFORMATION_ABOUT_MOVIE(1),
    DISPLAY_ACTORS(2),
    QUIT(3);

    final int action;

    MenuOptions(int action) {
        this.action = action;
    }
}
