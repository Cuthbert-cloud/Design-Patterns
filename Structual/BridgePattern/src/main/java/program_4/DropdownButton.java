package program_4;

public class DropdownButton extends Button {

    ButtonSize buttonSize;

    public DropdownButton(ButtonSize buttonSize) {
        this.buttonSize = buttonSize;
    }

    @Override
    void draw() {
        this.buttonSize.getSize();
        System.out.println("Drawing a dropdown button.\n");
    }
}
