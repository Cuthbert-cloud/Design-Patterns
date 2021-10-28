package program_4;

public class RadioButton extends Button {

    ButtonSize buttonSize;

    public RadioButton(ButtonSize buttonSize) {
        this.buttonSize = buttonSize;
    }

    @Override
    void draw() {
        buttonSize.getSize();
        System.out.println("Drawing a radio button.\n");
    }
}
