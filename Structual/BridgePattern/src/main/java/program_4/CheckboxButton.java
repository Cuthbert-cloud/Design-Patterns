package program_4;

public class CheckboxButton extends Button {

    ButtonSize buttonSize;

    public CheckboxButton(ButtonSize buttonSize) {
        this.buttonSize = buttonSize;
    }

    @Override
    void draw() {
        this.buttonSize.getSize();
        System.out.println("Drawing a radio button.\n");
    }
}
