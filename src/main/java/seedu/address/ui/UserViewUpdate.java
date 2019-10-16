package seedu.address.ui;

import javafx.scene.layout.Pane;

/**
 * Communicates with {@code UserViewManager} to update the view based on user's command.
 * Updates each time a command is executed to refresh data.
 *
 */
public class UserViewUpdate {

    private Pane paneToRender;
    private UserViewMain userViewMain;

    public UserViewUpdate(Pane paneToRender, UserViewMain userViewMain) {
        this.paneToRender = paneToRender;
        this.userViewMain = userViewMain;
    }

    /**
     * Retrieves user command's preamble and retrieves the respective pane.
     * Clears the current view first and switches to the desired view.
     *
     * @param commandText raw command of user
     */
    public void parseUserCommand(String commandText) {
        String preamble = commandText.split(" ")[0];

        assert !(preamble.isEmpty());

        switch(preamble) {

        case "list":
            paneToRender = userViewMain.loadTasks();
            break;

        case "home":
            paneToRender = userViewMain.loadDashboard();
            break;

        default:
            paneToRender = userViewMain.loadDashboard();
        }
    }
}
