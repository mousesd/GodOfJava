package net.homenet;

class MagicButton {
    private EventListener listener;

    void setListener(EventListener listener) {
        this.listener = listener;
    }

    void onClickProcess() {
        if (listener != null) {
            listener.onClick();
        }
    }
}
