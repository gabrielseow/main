package seedu.pluswork.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.pluswork.model.Model.PREDICATE_SHOW_ALL_MEMBERS;

import seedu.pluswork.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
public class ListMemberCommand extends Command {

    public static final String COMMAND_WORD = "list-members";
    public static final String PREFIX_USAGE = "";

    public static final String MESSAGE_SUCCESS = "Listed all members";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredMembersList(PREDICATE_SHOW_ALL_MEMBERS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
