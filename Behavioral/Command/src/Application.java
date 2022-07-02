import button.Button;
import command.ButtonClickCommand;
import command.ButtonPressCommand;
import receiver.ViewModel;

public class Application {

    public static void main(String[] args) {
        ViewModel viewModel = new ViewModel();

        ButtonClickCommand buttonClickCommand = new ButtonClickCommand(viewModel);
        ButtonPressCommand buttonPressCommand = new ButtonPressCommand(viewModel);

        Button button = new Button();
        button.setOnClickCommand(buttonClickCommand);
        button.setOnPressCommand(buttonPressCommand);

        button.click();
        button.press();
    }
}
