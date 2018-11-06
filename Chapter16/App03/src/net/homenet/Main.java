package net.homenet;

public class Main {
    public static void main(String[] args) {
        MagicButton button = new MagicButton();

        //# 1.
        //button.setListener(new MagicButtonListener());

        //# 2.
        //button.setListener(new EventListener() {
        //    @Override
        //    public void onClick() {
        //        System.out.println("Magic button clicked.");
        //    }
        //});

        //# 3.
        //EventListener listener = new EventListener() {
        //    @Override
        //    public void onClick() {
        //        System.out.println("Magic button clicked.");
        //    }
        //};
        //button.setListener(listener);

        //# 4.
        button.setListener(() -> System.out.println("Magic button clicked."));
        button.onClickProcess();
    }

    private static class MagicButtonListener implements EventListener {
        @Override
        public void onClick() {
            System.out.println("Magic button clicked.");
        }
    }
}
